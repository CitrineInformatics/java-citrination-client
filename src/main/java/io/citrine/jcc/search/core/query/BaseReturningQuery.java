package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

/**
 * Base class for all queries against datasets and the items that they contain on Citrination.
 *
 * @author Kyle Michel
 */
public abstract class BaseReturningQuery extends DataScope {

    @Override
    public BaseReturningQuery setQuery(final List<DataQuery> query) {
        super.setQuery(query);
        return this;
    }

    @Override
    public BaseReturningQuery addQuery(final List<DataQuery> query) {
        super.addQuery(query);
        return this;
    }

    @Override
    public BaseReturningQuery addQuery(final DataQuery query) {
        super.addQuery(query);
        return this;
    }

    @Override
    public BaseReturningQuery setExtractionSort(final ExtractionSort extractionSort) {
        super.setExtractionSort(extractionSort);
        return this;
    }

    /**
     * Index of the first hit that should be returned. This method is here just to be compatible with the python
     * client.
     *
     * @param fromIndex Index of the first hit (inclusive of zero) that should be returned.
     * @return This object.
     */
    public BaseReturningQuery setFromIndex(final Integer fromIndex) {
        return this.setFrom(fromIndex);
    }

    /**
     * Get the index of the first hit that should be returned.
     *
     * @return Index of the first hit that should be returned or a null pointer if not set.
     */
    public Integer getFromIndex() {
        return this.getFrom();
    }

    /**
     * Index of the first hit that should be returned. This is an alias for {@link #setFromIndex(Integer)}.
     *
     * @param from Index of the first hit (inclusive of zero) that should be returned.
     * @return This object.
     */
    @JsonSetter
    public BaseReturningQuery setFrom(final Integer from) {
        this.from = from;
        return this;
    }

    /**
     * Get the index of the first hit that should be returned. This is an alias for {@link #getFromIndex()}.
     *
     * @return Index of the first hit that should be returned or a null pointer if not set.
     */
    @JsonIgnore
    public Integer getFrom() {
        return this.from;
    }

    /**
     * Set the maximum number of records that should be returned. If set to 0, then no results are saved, but the
     * total number of hits will still be returned from the query. This can be used to count the number of records
     * that will match a query.
     *
     * @param size Maximum number of records to return.
     * @return This object.
     */
    public BaseReturningQuery setSize(final Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get the maximum number of records that should be returned.
     *
     * @return Maximum number of records that should be returned or a null pointer if not set.
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * Set whether a random assortment of results should be returned. This produces a different set of hits in a
     * different order with every query if set to true. There is not any kind of memory between queries.
     *
     * @param randomResults True to return random records.
     * @return This object.
     */
    public BaseReturningQuery setRandomResults(final Boolean randomResults) {
        this.randomResults = randomResults;
        return this;
    }

    /**
     * Get whether a random assortment of results should be returned.
     *
     * @return True to return random records.
     */
    public Boolean getRandomResults() {
        return this.randomResults;
    }

    /**
     * Set the random seed. This is only used if randomResults is set to true.
     *
     * @param randomSeed Integer with the random seed.
     * @return This object.
     */
    public BaseReturningQuery setRandomSeed(final Integer randomSeed) {
        this.randomSeed = randomSeed;
        return this;
    }

    /**
     * Get the random seed. This is only used if randomResults is set to true.
     *
     * @return Integer with the random seed or a null pointer if it has not been set.
     */
    public Integer getRandomSeed() {
        return this.randomSeed;
    }

    /**
     * Set whether relevancy should be used in results.
     *
     * @param scoreRelevance True to score relevance.
     * @return This object.
     */
    public BaseReturningQuery setScoreRelevance(final Boolean scoreRelevance) {
        this.scoreRelevance = scoreRelevance;
        return this;
    }

    /**
     * Get relevancy should be used in results.
     *
     * @return True if relevancy should be used in results.
     */
    public Boolean getScoreRelevance() {
        return this.scoreRelevance;
    }

    /**
     * Set whether to return the max score.
     *
     * @param returnMaxScore True to return the max score.
     * @return This object.
     */
    public BaseReturningQuery setReturnMaxScore(final Boolean returnMaxScore) {
        this.returnMaxScore = returnMaxScore;
        return this;
    }

    /**
     * Get whether to return the max score.
     *
     * @return True to return the max score.
     */
    public Boolean getReturnMaxScore() {
        return this.returnMaxScore;
    }

    /** Index of the first hit that should be returned. */
    private Integer from;

    /** Total number of hits the should be returned. */
    private Integer size;

    /** Whether to return a random set of records. */
    private Boolean randomResults;

    /** Random seed. */
    private Integer randomSeed;

    /** Whether to use relevance scoring. */
    private Boolean scoreRelevance;

    /** Whether to return the maximum score. */
    private Boolean returnMaxScore;
}