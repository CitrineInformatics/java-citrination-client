package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.Sort;

/**
 * Information about sorting on an extracted field.
 *
 * @author Kyle Michel
 */
public class SortExtracted {

    /**
     * Set the name of the extracted field to sort by.
     *
     * @param extractAs String with the name of the extracted field.
     * @return This object.
     */
    @JsonSetter("extractAs")
    public SortExtracted extractAs(final String extractAs) {
        this.extractAs = extractAs;
        return this;
    }

    /**
     * Get the name of the extracted field to sort by.
     *
     * @return Name of the extracted field to sort by or a null pointer if it has not been set.
     */
    @JsonGetter("extractAs")
    public String extractAs() {
        return this.extractAs;
    }

    /**
     * Set the sort order.
     *
     * @param sort {@link Sort} order.
     * @return This object.
     */
    @JsonSetter("sort")
    public SortExtracted sort(final Sort sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Get the sort order.
     *
     * @return {@link Sort} order or a null pointer if it has not been set.
     */
    @JsonGetter("sort")
    public Sort sort() {
        return this.sort;
    }

    /** Name of the extracted field. */
    private String extractAs;

    /** Sort order. */
    private Sort sort;
}