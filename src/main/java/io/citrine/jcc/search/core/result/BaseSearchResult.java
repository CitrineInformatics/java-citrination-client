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
 * Base class for all search results.
 *
 * @param <T> Type of the hits.
 * @author Kyle Michel
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseSearchResult<T> implements Iterable<T>  {

    /**
     * Set the number of milliseconds that the query took to execute.
     *
     * @param took Number of milliseconds for the query to finish.
     * @return This object.
     */
    @JsonSetter("took")
    public BaseSearchResult<T> setTook(final Long took) {
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
     * Set the total number of hits that were matched.
     *
     * @param totalNumHits Total number of hits that were matched.
     * @return This object.
     */
    @JsonSetter("totalNumHits")
    public BaseSearchResult<T> setTotalNumHits(final Long totalNumHits) {
        this.totalNumHits = totalNumHits;
        return this;
    }

    /**
     * Get the total number of hits that were matched. This number includes every record that was matched, not just
     * those that were returned.
     *
     * @return Total number of records that were matched.
     */
    @JsonGetter("totalNumHits")
    public Long getTotalNumHits() {
        return this.totalNumHits;
    }

    /**
     * Set the list of hits that were matched. This overwrites any hits that are already saved.
     *
     * @param hits List of hit objects.
     * @return This object.
     */
    @JsonSetter("hits")
    protected BaseSearchResult<T> setHits(final List<T> hits) {
        this.hits = hits;
        return this;
    }

    /**
     * Add a single hit that was matched.
     *
     * @param hit Hit to add to the results set.
     * @return This object.
     */
    @JsonIgnore
    public BaseSearchResult<T> addHit(final T hit) {
        if (this.hits == null) {
            this.hits = new ArrayList<>();
        }
        this.hits.add(hit);
        return this;
    }

    /**
     * Get the number of hits that were matched.
     *
     * @return Number of hits in the result set.
     */
    @JsonIgnore
    public int getNumHits() {
        return (this.hits == null) ? 0 : this.hits.size();
    }

    /**
     * Get the list of hits that were matched.
     *
     * @return List of hit objects.
     */
    @JsonGetter("hits")
    protected List<T> getHits() {
        return this.hits;
    }

    /**
     * Get a hit at the set index.
     *
     * @param index Index of the hit to return.
     * @return Hit at the input index.
     * @throws IllegalArgumentException if the index is out of bounds.
     */
    @JsonIgnore
    public T getHit(final int index) {
        if (this.hits == null) {
            throw new IndexOutOfBoundsException("Index out of range: " + index + " of 0");
        }
        return this.hits.get(index);
    }

    @Override
    @JsonIgnore
    public Iterator<T> iterator() {
        return (this.hits == null) ? Collections.emptyIterator() : this.hits.iterator();
    }

    /** Number of milliseconds that the query took to execute. */
    private Long took;

    /** Total number of hits. */
    private Long totalNumHits;

    /** List of hits. */
    private List<T> hits;
}