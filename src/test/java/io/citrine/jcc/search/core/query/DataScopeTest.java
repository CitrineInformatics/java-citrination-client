package io.citrine.jcc.search.core.query;

import io.citrine.jcc.search.dataset.query.DatasetQuery;
import io.citrine.jcc.search.pif.query.PifSystemQuery;
import io.citrine.jcc.search.pif.query.chemical.ChemicalFieldQuery;
import io.citrine.jcc.search.pif.query.chemical.ChemicalFilter;
import org.apache.commons.lang.SerializationUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests against the {@link DataScope} class.
 *
 * @author Kyle Michel
 */
public class DataScopeTest {

    /**
     * Test the equality operation for {@link DataScope} objects.
     */
    @Test
    public void testEquals() {

        // Test that lhs != null and lhs == lhs
        final DataScope lhs = new DataScope()
                .addQuery(new DataQuery()
                        .addSystem(new PifSystemQuery()
                                .addChemicalFormula(new ChemicalFieldQuery()
                                        .setExtractAs("Chemical formula")
                                        .setExtractAll(true)
                                        .addFilter(new ChemicalFilter()
                                                .setEqual("Pb")
                                                .setPartial(true)))))
                .addQuery(new DataQuery()
                        .addDataset(new DatasetQuery()
                                .addId(new Filter()
                                        .setEqual("1"))));
        Assert.assertNotEquals(null, lhs);
        Assert.assertEquals(lhs, lhs);

        // Test that lhs != rhs
        final DataScope rhs = new DataScope()
                .addQuery(new DataQuery()
                        .addSystem(new PifSystemQuery()
                                .addChemicalFormula(new ChemicalFieldQuery()
                                        .setExtractAs("Chemical formula")
                                        .setExtractAll(true)
                                        .addFilter(new ChemicalFilter()
                                                .setEqual("Pb")
                                                .setPartial(true)))));
        Assert.assertNotEquals(lhs, rhs);

        // Test that lhs == rhs
        rhs.addQuery(new DataQuery()
                .addDataset(new DatasetQuery()
                        .addId(new Filter()
                                .setEqual("1"))));
        Assert.assertEquals(lhs, rhs);
    }

    /**
     * Test java serialization.
     *
     * @throws Exception if thrown while serializing or deserializing.
     */
    @Test
    public void testSerialization() throws Exception {

        // Create the object to test
        final DataScope original = new DataScope()
                .addQuery(new DataQuery()
                        .addDataset(new DatasetQuery()
                                .addName(new Filter().setEqual("A"))))
                .addQuery(new DataQuery()
                        .addSystem(new PifSystemQuery()
                                .addChemicalFormula(new ChemicalFieldQuery()
                                        .addFilter(new ChemicalFilter()
                                                .setEqual("B")
                                                .setPartial(true)))));

        // Make a deep copy of the object. This uses java serialization under the hood.
        final DataScope copy = (DataScope) SerializationUtils.clone(original);

        // Check that the results are equal (relies on .equals of all of the objects)
        Assert.assertEquals(original, copy);
    }
}