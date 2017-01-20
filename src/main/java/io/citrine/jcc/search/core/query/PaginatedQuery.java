package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Base class for all queries that support pagination.
 *
 * @author Kyle Michel
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class PaginatedQuery {

    /**
     * Index of the first hit that should be returned. This method is here just to be compatible with the python
     * client.
     *
     * @param fromIndex Index of the first hit (inclusive of zero) that should be returned.
     * @return This object.
     */
    @JsonSetter("fromIndex")
    public PaginatedQuery fromIndex(final Integer fromIndex) {
        this.fromIndex = fromIndex;
        return this;
    }

    /**
     * Get the index of the first hit that should be returned.
     *
     * @return Index of the first hit that should be returned or a null pointer if not set.
     */
    @JsonGetter("fromIndex")
    public Integer fromIndex() {
        return this.fromIndex;
    }

    /**
     * Index of the first hit that should be returned. This is an alias for {@link #fromIndex(Integer)}.
     *
     * @param from Index of the first hit (inclusive of zero) that should be returned.
     * @return This object.
     */
    @JsonSetter("from")
    public PaginatedQuery from(final Integer from) {
        return fromIndex(from);
    }

    /**
     * Get the index of the first hit that should be returned. This is an alias for {@link #fromIndex()}.
     *
     * @return Index of the first hit that should be returned or a null pointer if not set.
     */
    @JsonIgnore
    public Integer from() {
        return fromIndex();
    }

    /**
     * Set the maximum number of records that should be returned. If set to 0, then no results are saved, but the
     * total number of hits will still be returned from the query. This can be used to count the number of records
     * that will match a query.
     *
     * @param size Maximum number of records to return.
     * @return This object.
     */
    @JsonSetter("size")
    public PaginatedQuery size(final Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get the maximum number of records that should be returned.
     *
     * @return Maximum number of records that should be returned or a null pointer if not set.
     */
    @JsonGetter("size")
    public Integer size() {
        return this.size;
    }

    /**
     * Set whether a random assortment of results should be returned. This produces a different set of hits in a
     * different order with every query if set to true. There is not any kind of memory between queries.
     *
     * @param randomResults True to return random records.
     * @return This object.
     */
    @JsonSetter("randomResults")
    public PaginatedQuery randomResults(final Boolean randomResults) {
        this.randomResults = randomResults;
        return this;
    }

    /**
     * Get whether a random assortment of results should be returned.
     *
     * @return True to return random records.
     */
    @JsonGetter("randomResults")
    public Boolean randomResults() {
        return this.randomResults;
    }

    /** Index of the first hit that should be returned. */
    private Integer fromIndex;

    /** Total number of hits the should be returned. */
    private Integer size;

    /** Whether to return a random set of records. */
    private Boolean randomResults;
}