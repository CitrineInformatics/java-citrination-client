package io.citrine.jcc.search.core.query;

import io.citrine.jpif.util.PifObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Tests for {@link BasicFieldQuery}.
 *
 * @author Kyle Michel
 */
public class BasicFieldQueryTest {

    /**
     * Test that {@link BasicFieldQuery} objects are properly deserialized when they are serialized as that type.
     *
     * @throws IOException if thrown from within this test.
     */
    @Test
    public void testDeserializationFromBasicFieldQuery() throws IOException {
        final DataScope dataScope = PifObjectMapper.getInstance().readValue(
                this.getClass().getClassLoader().getResourceAsStream("basicFieldQuery.json"), DataScope.class);
        checkQuery(dataScope);
    }

    /**
     * Test that {@link BasicFieldQuery} objects are properly deserialized when they are serialized as {@link Filter}
     * objects.
     *
     * @throws IOException if thrown from within this test.
     */
    @Test
    public void testDeserializationFromBasicFieldQueryAsFilter() throws IOException {
        final DataScope dataScope = PifObjectMapper.getInstance().readValue(
                this.getClass().getClassLoader().getResourceAsStream("basicFieldQueryAsFilter.json"), DataScope.class);
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
        Assert.assertEquals(1, dataScope.getQuery(0).getDataset(0).idLength());
        Assert.assertEquals(1, dataScope.getQuery(0).getDataset(0).getId(0).filterLength());
        Assert.assertEquals("A", dataScope.getQuery(0).getDataset(0).getId(0).getFilter(0).getEqual());
    }
}