package io.citrine.jcc.search.pif.query;

import io.citrine.jcc.CitrinationClientITBase;
import io.citrine.jcc.search.core.query.DataQuery;
import io.citrine.jcc.search.core.query.Filter;
import io.citrine.jcc.search.core.query.MultiQuery;
import io.citrine.jcc.search.core.result.MultiSearchResult;
import io.citrine.jcc.search.pif.query.core.FieldQuery;
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
}