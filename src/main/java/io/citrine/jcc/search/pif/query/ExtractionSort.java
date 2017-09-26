package io.citrine.jcc.search.pif.query;

import io.citrine.jcc.search.core.query.SortOrder;

/**
 * Definition of a sort operation on an extraction within a query.
 *
 * @author Kyle Michel
 */
public class ExtractionSort {

    /**
     * Set the key that will be sorted on.
     *
     * @param key String with the key that will be sorted on.
     * @return This object.
     */
    public ExtractionSort setKey(final String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the key that will be sorted on.
     *
     * @return String with the key that will be sorted on.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the sort order.
     *
     * @param order {@link SortOrder} to use.
     * @return This object.
     */
    public ExtractionSort setOrder(final SortOrder order) {
        this.order = order;
        return this;
    }

    /**
     * Get the sort order to use.
     *
     * @return {@link SortOrder} to use.
     */
    public SortOrder getOrder() {
        return this.order;
    }

    /** The extractAs key to sort on. */
    private String key;

    /** The order to sort. */
    private SortOrder order;
}