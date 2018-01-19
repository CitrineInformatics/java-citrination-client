package io.citrine.jcc.search.core.query;

import io.citrine.jpif.util.PifObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Tests for {@link BasicBooleanFieldQuery}.
 *
 * @author Kyle Michel
 */
public class BasicBooleanFieldQueryTest {

    /**
     * Test that {@link BasicBooleanFieldQuery} objects are properly deserialized when they are serialized as that type.
     *
     * @throws IOException if thrown from within this test.
     */
    @Test
    public void testDeserializationFromBasicFieldQuery() throws IOException {
        final DataScope dataScope = PifObjectMapper.getInstance().readValue(
                this.getClass().getClassLoader().getResourceAsStream("basicBooleanFieldQuery.json"), DataScope.class);
        checkQuery(dataScope);
    }

    /**
     * Test that {@link BasicBooleanFieldQuery} objects are properly deserialized when they are serialized as
     * {@link BooleanFilter} objects.
     *
     * @throws IOException if thrown from within this test.
     */
    @Test
    public void testDeserializationFromBasicFieldQueryAsFilter() throws IOException {
        final DataScope dataScope = PifObjectMapper.getInstance().readValue(
                this.getClass().getClassLoader().getResourceAsStream("basicBooleanFieldQueryAsFilter.json"),
                DataScope.class);
        checkQuery(dataScope);
    }

    /**
     * Check that the input query matches the expected structure.
     *
     * @param dataScope {@link DataScope} to test.
     */
    private void checkQuery(final DataScope dataScope) {
        Assert.assertEquals(1, dataScope.queryLength());
        Assert.assertEquals(1, dataScope.getQuery(0).datasetLength());
        Assert.assertEquals(1, dataScope.getQuery(0).getDataset(0).isFeaturedLength());
        Assert.assertEquals(1, dataScope.getQuery(0).getDataset(0).getIsFeatured(0).filterLength());
        Assert.assertEquals(Boolean.TRUE, dataScope.getQuery(0).getDataset(0).getIsFeatured(0).getFilter(0).getEqual());
    }
}