package io.citrine.jcc.search.core.result;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Class for all multi-search results.
 *
 * @param <T> Type of the atomic search result.
 * @author Kyle Michel
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class MultiSearchResult<T extends BaseSearchResult<?>>
        implements Iterable<MultiSearchResultElement<T>> {

    /**
     * Set the number of milliseconds that the query took to execute.
     *
     * @param took Number of milliseconds for the query to finish.
     * @return This object.
     */
    @JsonSetter("took")
    public MultiSearchResult<T> setTook(final Long took) {
        this.took = took;
        return this;
    }

    /**
     * Get the number of milliseconds that a query took to execute.
     *
     * @return Long with the number of milliseconds that the query took to finish or a null pointer if that has not
     *      been set.
     */
    @JsonGetter("took")
    public Long getTook() {
        return this.took;
    }

    /**
     * Set the list of results that were retuned. This overwrites any results that are already saved.
     *
     * @param results List of results objects.
     * @return This object.
     */
    @JsonSetter("results")
    protected MultiSearchResult<T> setResults(final List<MultiSearchResultElement<T>> results) {
        this.results = results;
        return this;
    }

    /**
     * Add a single result that was returned.
     *
     * @param result Result to add to the results set.
     * @return This object.
     */
    @JsonIgnore
    public MultiSearchResult<T> addResult(final MultiSearchResultElement<T> result) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(result);
        return this;
    }

    /**
     * Get the number of results that were returned.
     *
     * @return Number of results in the returned set.
     */
    @JsonIgnore
    public int getNumResults() {
        return (this.results == null) ? 0 : this.results.size();
    }

    /**
     * Get the list of results that were returned.
     *
     * @return List of result objects.
     */
    @JsonGetter("results")
    protected List<MultiSearchResultElement<T>> getResults() {
        return this.results;
    }

    /**
     * Get a result at the set index.
     *
     * @param index Index of the result to return.
     * @return Result at the input index.
     * @throws IllegalArgumentException if the index is out of bounds.
     */
    @JsonIgnore
    public MultiSearchResultElement<T> getResult(final int index) {
        if (this.results == null) {
            throw new IndexOutOfBoundsException("Index out of range: " + index + " of 0");
        }
        return this.results.get(index);
    }

    @Override
    @JsonIgnore
    public Iterator<MultiSearchResultElement<T>> iterator() {
        return (this.results == null) ? Collections.emptyIterator() : this.results.iterator();
    }

    /** Number of milliseconds that the query took to execute. */
    private Long took;

    /** List of results that were generated. */
    private List<MultiSearchResultElement<T>> results;
}