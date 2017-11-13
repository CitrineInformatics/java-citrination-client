package io.citrine.jcc.search.core;

import io.citrine.jcc.search.core.query.DataQuery;
import io.citrine.jcc.search.core.query.DataScope;
import io.citrine.jcc.search.core.query.Filter;
import io.citrine.jcc.search.dataset.query.DatasetQuery;
import io.citrine.jcc.search.pif.query.PifSystemQuery;
import io.citrine.jcc.search.pif.query.chemical.ChemicalFieldQuery;
import io.citrine.jcc.search.pif.query.chemical.ChemicalFilter;
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
}