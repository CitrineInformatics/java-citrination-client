package io.citrine.jcc.search.core.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.util.ListUtil;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Base class for all search results.
 *
 * @param <T> Type of the hits.
 * @author Kyle Michel
 */
public abstract class BaseSearchResult<T> implements Iterable<T>  {

    /**
     * Set the number of milliseconds that the query took to execute.
     *
     * @param took Number of milliseconds for the query to finish.
     * @return This object.
     */
    public BaseSearchResult<T> setTook(final Long took) {
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
     * Set the total number of hits that were matched.
     *
     * @param totalNumHits Total number of hits that were matched.
     * @return This object.
     */
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
    public Long getTotalNumHits() {
        return this.totalNumHits;
    }

    /**
     * Set the max score.
     *
     * @param maxScore Double with the max score.
     * @return This object.
     */
    public BaseSearchResult<T> setMaxScore(final Double maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    /**
     * Get the max score.
     *
     * @return Double with the max score.
     */
    public Double getMaxScore() {
        return this.maxScore;
    }

    /**
     * Set the list of hits that were matched. This overwrites any hits that are already saved.
     *
     * @param hits List of hit objects.
     * @return This object.
     */
    public BaseSearchResult<T> setHits(final List<T> hits) {
        this.hits = hits;
        return this;
    }

    /**
     * Add all hits in a list.
     *
     * @param hits List of hits to add.
     * @return This object.
     */

    public BaseSearchResult<T> addHits(final List<T> hits) {
        this.hits = ListUtil.add(hits, this.hits);
        return this;
    }

    /**
     * Add a single hit that was matched.
     *
     * @param hit Hit to add to the results set.
     * @return This object.
     */

    public BaseSearchResult<T> addHits(final T hit) {
        this.hits = ListUtil.add(hit, this.hits);
        return this;
    }

    /**
     * Get the number of hits that were matched.
     *
     * @return Number of hits in the result set.
     */

    public int getNumHits() {
        return ListUtil.length(this.hits);
    }

    /**
     * Get a hit at the set index.
     *
     * @param index Index of the hit to return.
     * @return Hit at the input index.
     * @throws IllegalArgumentException if the index is out of bounds.
     */

    public T getHits(final int index) {
        return ListUtil.get(this.hits, index);
    }

    /**
     * Get the list of hits that were matched.
     *
     * @return List of hit objects.
     */
    public List<T> getHits() {
        return this.hits;
    }

    @Override

    public Iterator<T> iterator() {
        return (this.hits == null) ? Collections.emptyIterator() : this.hits.iterator();
    }

    /**
     * Combine the results in rhs with the content of this object. This method appends the data in rhs to the data
     * contained in this object.
     *
     * @param rhs Object to add to this object.
     * @return This object.
     */
    public BaseSearchResult<T> add(final BaseSearchResult<T> rhs) {

        // Sum the execution times
        if (this.took == null) {
            this.took = rhs.took;
        }
        if (rhs.took != null) {
            this.took += rhs.took;
        }

        // Assume the new total number of hits
        if (rhs.totalNumHits != null) {
            this.totalNumHits = rhs.totalNumHits;
        }

        // Append the list of hits
        this.addHits(rhs.getHits());
        return this;
    }

    /** Number of milliseconds that the query took to execute. */
    private Long took;

    /** Total number of hits. */
    private Long totalNumHits;

    /** The maximum score. */
    private Double maxScore;

    /** List of hits. */
    private List<T> hits;
}