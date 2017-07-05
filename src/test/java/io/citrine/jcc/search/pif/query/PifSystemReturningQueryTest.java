package io.citrine.jcc.search.pif.query;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jpif.util.PifObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Tests for {@link PifSystemReturningQuery}.
 */
public class PifSystemReturningQueryTest {

    /**
     * Test backwards compatibility in deserializing PifQuery objects from v1.x to {@link PifSystemReturningQuery}
     * objects.
     *
     * @throws IOException if thrown in this test.
     */
    @Test
    public void testPifQueryDeserialization() throws IOException {

        // Deserialize a PifQuery object into a PifSystemReturningQuery object
        final PifSystemReturningQuery pifSystemReturningQuery = PifObjectMapper.getInstance().readValue(
                this.getClass().getClassLoader().getResourceAsStream("pifQuery.json"), PifSystemReturningQuery.class);

        // Check that all values were parsed. This section is very fragile as it relies on queries being deserialized
        // in a certain order (specifically queries at pifSystemReturningQuery.getQuery(1|2|3)). If the
        // deserialization order changes at some point then the indexes will need to be changed in this test.
        Assert.assertEquals(10, (long) pifSystemReturningQuery.getFrom());
        Assert.assertEquals(10, (long) pifSystemReturningQuery.getFromIndex());
        Assert.assertEquals(100, (long) pifSystemReturningQuery.getSize());
        Assert.assertTrue(pifSystemReturningQuery.getRandomResults());
        Assert.assertEquals(0, (int) pifSystemReturningQuery.getRandomSeed());
        Assert.assertTrue(pifSystemReturningQuery.getScoreRelevance());
        Assert.assertFalse(pifSystemReturningQuery.getReturnSystem());
        Assert.assertTrue(pifSystemReturningQuery.getAddLatex());
        Assert.assertEquals(3, pifSystemReturningQuery.queryLength());
        Assert.assertEquals(1, pifSystemReturningQuery.getQuery(0).datasetIdLength());
        Assert.assertEquals("1", pifSystemReturningQuery.getQuery(0).getDatasetId(0).getEqual());
        Assert.assertNull(pifSystemReturningQuery.getQuery(0).getDatasetId(0).getLogic());
        Assert.assertEquals(1, pifSystemReturningQuery.getQuery(1).datasetIdLength());
        Assert.assertEquals("2", pifSystemReturningQuery.getQuery(1).getDatasetId(0).getEqual());
        Assert.assertEquals(Logic.MUST_NOT, pifSystemReturningQuery.getQuery(1).getDatasetId(0).getLogic());
        Assert.assertEquals(2, pifSystemReturningQuery.getQuery(2).systemLength());
        Assert.assertEquals("lithium",
                pifSystemReturningQuery.getQuery(2).getSystem(0).getNames(0).getFilter(0).getEqual());
        Assert.assertEquals("Li",
                pifSystemReturningQuery.getQuery(2).getSystem(1).getChemicalFormula(0).getFilter(0).getEqual());
    }
}