package io.citrine.jcc.search.pif.query;

import io.citrine.jcc.CitrinationClientITBase;
import io.citrine.jcc.search.analysis.query.CategoricalAnalysis;
import io.citrine.jcc.search.analysis.result.CategoricalAnalysisResult;
import io.citrine.jcc.search.core.query.DataQuery;
import io.citrine.jcc.search.core.query.Filter;
import io.citrine.jcc.search.core.query.MultiQuery;
import io.citrine.jcc.search.core.result.MultiSearchResult;
import io.citrine.jcc.search.pif.query.core.FieldQuery;
import io.citrine.jcc.search.pif.query.core.PropertyQuery;
import io.citrine.jcc.search.pif.result.PifSearchHit;
import io.citrine.jcc.search.pif.result.PifSearchResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Integration tests for {@link PifSystemReturningQuery}.
 *
 * @author Kyle Michel
 */
public class PifSystemReturningQueryIT extends CitrinationClientITBase {

    /**
     * Test that weights are used to bias search results. This runs three queries. The first query just gets a record
     * so we can use it as a reference. The second two queries (executed as a multi-search request) search the record
     * with weighting off and on. The scores of those two queries are then compared to make sure that the weight was
     * used.
     *
     * @throws IOException if thrown while making search requests.
     */
    @Test
    public void testSearchWeight() throws IOException {

        // Run a query to get a record with a name
        final PifSearchHit referenceHit = this.client.search(new PifSystemReturningQuery()
                .setSize(1)
                .setReturnSystem(false)
                .addQuery(new DataQuery()
                        .addSystem(new PifSystemQuery()
                                .addNames(new FieldQuery()
                                        .addFilter(new Filter().setExists(true))))))
                .getHits(0);
        final String uid = referenceHit.getId().split("/")[2];

        // Run two queries where everything is the same except the weight on the name query
        final MultiSearchResult<PifSearchResult> searchResult =
                this.client.search(new MultiQuery<PifSystemReturningQuery>()
                        .addQueries(new PifSystemReturningQuery()
                                .setReturnSystem(false)
                                .setScoreRelevance(true)
                                .addQuery(new DataQuery()
                                        .addSystem(new PifSystemQuery()
                                                .addUid(new Filter().setEqual(uid))
                                                .addNames(new FieldQuery()
                                                        .addFilter(new Filter()
                                                                .setExists(true))))))
                        .addQueries(new PifSystemReturningQuery()
                                .setReturnSystem(false)
                                .setScoreRelevance(true)
                                .addQuery(new DataQuery()
                                        .addSystem(new PifSystemQuery()
                                                .addUid(new Filter().setEqual(uid))
                                                .addNames(new FieldQuery()
                                                        .addFilter(new Filter()
                                                                .setWeight(2.0)
                                                                .setExists(true)))))));

        // Make sure that the two scores are off by the correct weight
        final double unweightedScore = searchResult.getResults(0).getResult().getHits(0).getScore();
        final double weightedScore = searchResult.getResults(1).getResult().getHits(0).getScore();

        // Make sure that the score changed
        Assert.assertTrue(Math.abs(weightedScore - unweightedScore) > 0.01);
    }

    /**
     * Test that weights are used to bias simple search results. This runs three queries. The first query just gets a
     * record so we can use it as a reference. The second two queries (executed as a multi-search request) search
     * the record with weighting off and on. The scores of those two queries are then compared to make sure that the
     * weight was used.
     *
     * @throws IOException if thrown while making search requests.
     */
    @Test
    public void testSimpleSearchWeight() throws IOException {

        // Run a query to get a record with a name
        final PifSearchHit referenceHit = this.client.search(new PifSystemReturningQuery()
                .setSize(1)
                .setReturnSystem(true)
                .addQuery(new DataQuery()
                        .addSystem(new PifSystemQuery()
                                .addNames(new FieldQuery()
                                        .addFilter(new Filter().setExists(true))))))
                .getHits(0);
        final String uid = referenceHit.getId().split("/")[2];

        // Run two queries where everything is the same except the weight on the name field
        final MultiSearchResult<PifSearchResult> searchResult =
                this.client.search(new MultiQuery<PifSystemReturningQuery>()
                        .addQueries(new PifSystemReturningQuery()
                                .setReturnSystem(false)
                                .setScoreRelevance(true)
                                .addQuery(new DataQuery()
                                        .addSystem(new PifSystemQuery()
                                                .addUid(new Filter().setEqual(uid)))
                                        .setSimple(referenceHit.getSystem().getName(0))))
                        .addQueries(new PifSystemReturningQuery()
                                .setReturnSystem(false)
                                .setScoreRelevance(true)
                                .addQuery(new DataQuery()
                                        .addSystem(new PifSystemQuery()
                                                .addUid(new Filter().setEqual(uid)))
                                        .setSimple(referenceHit.getSystem().getName(0))
                                        .addSimpleWeight("system.names", 2.0))));

        // Make sure that the two scores are off by the correct weight
        final double unweightedScore = searchResult.getResults(0).getResult().getHits(0).getScore();
        final double weightedScore = searchResult.getResults(1).getResult().getHits(0).getScore();

        // Make sure that the score changed by the correct amount
        Assert.assertTrue(Math.abs(weightedScore - unweightedScore) > 0.01);
    }

    /**
     * Simple test that analysis requests are being sent.
     *
     * @throws IOException if thrown while making search requests.
     */
    @Test
    public void testAnalysis() throws IOException {

        // Run a query with an analysis
        final PifSearchResult pifSearchResult = this.client.search(new PifSystemReturningQuery()
                .setSize(0)
                .addQuery(new DataQuery()
                        .addSystem(new PifSystemQuery()
                                .addNames(new FieldQuery()
                                        .addAnalysis(new CategoricalAnalysis()
                                                .setSize(1L)
                                                .setPath("name"))))));

        // Make sure that an analysis came back
        Assert.assertNotNull(pifSearchResult.getAnalysis("name"));
        Assert.assertEquals(1, ((CategoricalAnalysisResult) pifSearchResult.getAnalysis("name")).bucketsLength());
    }

    /**
     * Test that the includeNumeric option is used when running an analysis.
     *
     * @throws IOException if thrown while making search requests.
     */
    @Test
    public void testIncludeNumeric() throws IOException {

        // To reduce the time that the query is going to run on the server, this test has two parts. First, query
        // for a PIF from any dataset.
        final PifSearchResult pifSearchResult = this.client.search(new PifSystemReturningQuery()
                .setSize(1)
                .addQuery(new DataQuery()
                        .addSystem(new PifSystemQuery()
                                .addUid(new Filter().setExists(true)))));
        final String uid = pifSearchResult.getHits(0).getId().split("/", 3)[2];

        // Filter on the UID of the PIF that was returned then run a categorical analysis on the length of the
        // system, which should always be 1. Since numeric values are not included in categorical analyses, this
        // should not return any buckets.
        final PifSearchResult withoutNumericResult = this.client.search(new PifSystemReturningQuery()
                .setSize(0)
                .addQuery(new DataQuery()
                        .addSystem(new PifSystemQuery()
                                .addUid(new Filter()
                                        .setEqual(uid))
                                .addLength(new FieldQuery()
                                        .addAnalysis(new CategoricalAnalysis()
                                                .setPath("len"))))));
        Assert.assertEquals(0, ((CategoricalAnalysisResult) withoutNumericResult.getAnalysis("len")).bucketsLength());

        // Run the same analysis but include numeric values and make sure that a bucket was returned
        final PifSearchResult withNumericResult = this.client.search(new PifSystemReturningQuery()
                .setSize(0)
                .addQuery(new DataQuery()
                        .addSystem(new PifSystemQuery()
                                .addUid(new Filter()
                                        .setEqual(uid))
                                .addLength(new FieldQuery()
                                        .addAnalysis(new CategoricalAnalysis()
                                                .setPath("len")
                                                .setIncludeNumeric(true))))));
        Assert.assertEquals(1, ((CategoricalAnalysisResult) withNumericResult.getAnalysis("len")).bucketsLength());
    }

    /**
     * Make sure that timeout requests are honored. By setting the timeout to 0 we guarantee that the server will
     * fail to finish the request.
     */
    @Test
    public void testTimeout() {
        try {
            this.client.search(new PifSystemReturningQuery().setTimeout(0));
            Assert.fail("Failed to cause timeout");
        }
        catch (Exception e) {
            Assert.assertTrue(e.getMessage().startsWith("Received 524 response"));
        }
    }

    /**
     * Run a query with a degree unicode character in it. This is a regression test to make sure that we are
     * serializing in a way that the server will respect.
     *
     * @throws IOException if thrown while making search requests. This should be thrown if the degree symbol is not
     * properly serialized when making the request.
     */
    @Test
    public void testDegreeSymbol() throws IOException {
        this.client.search(new PifSystemReturningQuery()
                .setSize(0)
                .addQuery(new DataQuery()
                        .addSystem(new PifSystemQuery()
                                .addProperties(new PropertyQuery()
                                        .addUnits(new FieldQuery()
                                                .addFilter(new Filter()
                                                        .setEqual("°")))))));
    }
}