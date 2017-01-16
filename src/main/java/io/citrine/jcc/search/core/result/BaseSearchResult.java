package io.citrine.jcc.search.core.result;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Base class for all search results.
 *
 * @author Kyle Michel
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseSearchResult {

    /**
     * Set the number of milliseconds that the query took to execute.
     *
     * @param took Number of milliseconds for the query to finish.
     * @return This object.
     */
    @JsonSetter("took")
    public BaseSearchResult setTook(final Long took) {
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
    public BaseSearchResult setTotalNumHits(final Long totalNumHits) {
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

    /** Number of milliseconds that the query took to execute. */
    private Long took;

    /** Total number of hits. */
    private Long totalNumHits;
}