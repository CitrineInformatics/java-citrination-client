package io.citrine.jcc.search.pif.query;

import io.citrine.jcc.search.core.query.SortOrder;

import java.util.Optional;

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

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof ExtractionSort)) {
            return false;
        }
        final ExtractionSort rhsSort = (ExtractionSort) rhs;
        return Optional.ofNullable(this.key).equals(Optional.ofNullable(rhsSort.key))
                && Optional.ofNullable(this.order).equals(Optional.ofNullable(rhsSort.order));
    }

    /** The extractAs key to sort on. */
    private String key;

    /** The order to sort. */
    private SortOrder order;
}