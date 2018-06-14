package io.citrine.jcc.search.core.query;

import io.citrine.jcc.search.analysis.query.Analysis;
import io.citrine.jcc.search.analysis.query.CategoricalAnalysis;
import io.citrine.jcc.search.analysis.query.MatchType;
import io.citrine.jcc.search.analysis.query.TraversalMode;
import io.citrine.jpif.util.PifObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

public class CategoricalObjectTest {

    /**
     * Simple test validating equality check of CategoricalAnalysis
     *
     * @throws IOException if thrown while making search requests.
     */
    @Test
    public void testCategoricalAnalysisEquality() throws IOException {

        final CategoricalAnalysis cat1= new CategoricalAnalysis();
        final CategoricalAnalysis cat2= new CategoricalAnalysis();

        cat1.setIncludeNumeric(true);
        cat2.setIncludeNumeric(true);
        cat1.setPath("names");
        cat2.setPath("names");
        cat1.setTraversalMode(TraversalMode.DEPTH_FIRST);
        cat2.setTraversalMode(TraversalMode.DEPTH_FIRST);
        cat1.setMatchType(MatchType.Exact);
        cat2.setMatchType(MatchType.Exactish);
        Assert.assertFalse(cat1.equals(cat2));
        cat1.setMatchType(MatchType.Exact);
        cat2.setMatchType(MatchType.Exact);
        Assert.assertTrue(cat1.equals(cat2));
    }

    /**
     * Verify deserialization picks up the matchtype field.
     *
     * @throws IOException if thrown while making search requests.
     */
    @Test
    public void testCategoricalAnalysisMatchTypeDeserialize() throws IOException {
        final DataScope dataScope = PifObjectMapper.getInstance().readValue(
                this.getClass().getClassLoader().getResourceAsStream("categoryQuery.json"), DataScope.class);
        final Iterable<Analysis> analysisArray = dataScope.getQuery(0).getSystem(0).getNames(0).analysis();
        final CategoricalAnalysis categoricalAnalysis = (CategoricalAnalysis)analysisArray.iterator().next();
        Assert.assertEquals(MatchType.Exact, categoricalAnalysis.getMatchType());
    }
}