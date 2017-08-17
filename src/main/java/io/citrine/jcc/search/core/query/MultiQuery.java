package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Base class for all multi-search requests.
 *
 * @param <T> Type of the query.
 * @author Kyle Michel
 */
public class MultiQuery<T> {

    /**
     * Set the list of queries. This overwrites any queries that are already saved.
     *
     * @param queries List of query objects.
     * @return This object.
     */
    public MultiQuery<T> setQueries(final List<T> queries) {
        this.queries = queries;
        return this;
    }

    /**
     * Add to the list of queries.
     *
     * @param queries List of queries to add.
     * @return This object.
     */

    public MultiQuery<T> addQueries(final List<T> queries) {
        this.queries = ListUtil.add(queries, this.queries);
        return this;
    }

    /**
     * Add a single query.
     *
     * @param query Query to add.
     * @return This object.
     */

    public MultiQuery<T> addQueries(final T query) {
        this.queries = ListUtil.add(query, this.queries);
        return this;
    }

    /**
     * Get the number of queries.
     *
     * @return Number of queries.
     */

    public int queriesLength() {
        return ListUtil.length(this.queries);
    }

    /**
     * Get an {@link Iterable} over the queries in this object.
     *
     * @return {@link Iterable} over the queries.
     */

    public Iterable<T> queries() {
        return ListUtil.iterable(this.queries);
    }

    /**
     * Get a query at the set index.
     *
     * @param index Index of the query to return.
     * @return Query at the input index.
     * @throws IllegalArgumentException if the index is out of bounds.
     */

    public T getQueries(final int index) {
        return ListUtil.get(this.queries, index);
    }

    /**
     * Get the list of queries.
     *
     * @return List of query objects.
     */
    public List<T> getQueries() {
        return this.queries;
    }

    /** List of queries that were generated. */
    private List<T> queries;
}