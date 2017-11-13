package io.citrine.jcc.search.core.result;

import io.citrine.jcc.util.ListUtil;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * Class for all multi-search results.
 *
 * @param <T> Type of the atomic search result.
 * @author Kyle Michel
 */
public class MultiSearchResult<T extends BaseSearchResult<?>> implements Iterable<MultiSearchResultElement<T>> {

    /**
     * Set the number of milliseconds that the query took to execute.
     *
     * @param took Number of milliseconds for the query to finish.
     * @return This object.
     */
    public MultiSearchResult<T> setTook(final Long took) {
        this.took = took;
        return this;
    }

    /**
     * Get the number of milliseconds that a query took to execute.
     *
     * @return Long with the number of milliseconds that the query took to finish or a null pointer if that has not
     * been set.
     */
    public Long getTook() {
        return this.took;
    }

    /**
     * Set the list of results that were returned. This overwrites any results that are already saved.
     *
     * @param results List of results objects.
     * @return This object.
     */
    public MultiSearchResult<T> setResults(final List<MultiSearchResultElement<T>> results) {
        this.results = results;
        return this;
    }

    /**
     * Add to the list of results.
     *
     * @param results List of {@link MultiSearchResultElement} objects to add.
     * @return This object.
     */
    public MultiSearchResult<T> addResults(final List<MultiSearchResultElement<T>> results) {
        this.results = ListUtil.add(results, this.results);
        return this;
    }

    /**
     * Add a single result that was returned.
     *
     * @param result Result to add to the results set.
     * @return This object.
     */
    public MultiSearchResult<T> addResults(final MultiSearchResultElement<T> result) {
        this.results = ListUtil.add(result, this.results);
        return this;
    }

    /**
     * Get the number of results that were returned.
     *
     * @return Number of results in the returned set.
     */
    public int resultsLength() {
        return ListUtil.length(this.results);
    }

    /**
     * Get a result at the set index.
     *
     * @param index Index of the result to return.
     * @return Result at the input index.
     * @throws IllegalArgumentException if the index is out of bounds.
     */
    public MultiSearchResultElement<T> getResults(final int index) {
        return ListUtil.get(this.results, index);
    }

    /**
     * Get the list of results that were returned.
     *
     * @return List of result objects.
     */
    public List<MultiSearchResultElement<T>> getResults() {
        return this.results;
    }

    @Override
    public Iterator<MultiSearchResultElement<T>> iterator() {
        return (this.results == null) ? Collections.emptyIterator() : this.results.iterator();
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof MultiSearchResult)) {
            return false;
        }
        final MultiSearchResult rhsResult = (MultiSearchResult) rhs;
        return Optional.ofNullable(this.took).equals(Optional.ofNullable(rhsResult.took))
                && Optional.ofNullable(this.results).equals(Optional.ofNullable(rhsResult.results));
    }

    /** Number of milliseconds that the query took to execute. */
    private Long took;

    /** List of results that were generated. */
    private List<MultiSearchResultElement<T>> results;
}