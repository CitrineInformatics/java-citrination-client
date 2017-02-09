package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for all multi-search requests.
 *
 * @param <T> Type of the query.
 * @author Kyle Michel
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseMultiQuery<T> {

    /**
     * Set the list of queries. This overwrites any queries that are already saved.
     *
     * @param queries List of query objects.
     * @return This object.
     */
    @JsonSetter("queries")
    protected BaseMultiQuery<T> setQueries(final List<T> queries) {
        this.queries = queries;
        return this;
    }

    /**
     * Add a single query.
     *
     * @param query Query to add.
     * @return This object.
     */
    @JsonIgnore
    public BaseMultiQuery<T> addQuery(final T query) {
        if (this.queries == null) {
            this.queries = new ArrayList<>();
        }
        this.queries.add(query);
        return this;
    }

    /**
     * Get the number of queries.
     *
     * @return Number of queries.
     */
    @JsonIgnore
    public int getNumQueries() {
        return (this.queries == null) ? 0 : this.queries.size();
    }

    /**
     * Get the list of queries.
     *
     * @return List of query objects.
     */
    @JsonGetter("queries")
    protected List<T> getQueries() {
        return this.queries;
    }

    /**
     * Get a query at the set index.
     *
     * @param index Index of the query to return.
     * @return Query at the input index.
     * @throws IllegalArgumentException if the index is out of bounds.
     */
    @JsonIgnore
    public T getQuery(final int index) {
        if (this.queries == null) {
            throw new IndexOutOfBoundsException("Index out of range: " + index + " of 0");
        }
        return this.queries.get(index);
    }

    /** List of queries that were generated. */
    private List<T> queries;
}