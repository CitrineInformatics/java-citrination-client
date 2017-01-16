package io.citrine.jcc.search.dataset.result;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Class to store information about a single search hit with dataset information.
 *
 * @author Kyle Michel
 */
public class DatasetSearchHit {

    /**
     * Set the id of the dataset.
     *
     * @param id Long with the id of the dataset
     * @return This object.
     */
    @JsonSetter("id")
    public DatasetSearchHit setId(final Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get the id of the dataset.
     *
     * @return Long with the id of the dataset.
     */
    @JsonGetter("id")
    public Long getId() {
        return this.id;
    }

    /**
     * Set the score of the hit.
     *
     * @param score Double with the score of the hit.
     * @return This object.
     */
    @JsonSetter("score")
    public DatasetSearchHit setScore(final Double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the score of the hit.
     *
     * @return Double with the score of the hit.
     */
    @JsonGetter("score")
    public Double getScore() {
        return this.score;
    }

    /** ID of the dataset. */
    private Long id;

    /** Version of the dataset. */
    private Double score;
}