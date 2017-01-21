package io.citrine.jcc.search.dataset.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.HasSystemsPaginatedQuery;
import io.citrine.jcc.search.pif.query.core.SystemQuery;

/**
 * Class for defining a query against datasets on Citrination.
 *
 * @author Kyle Michel
 */
public class DatasetQuery extends HasSystemsPaginatedQuery {

    @Override
    @JsonSetter("fromIndex")
    public DatasetQuery fromIndex(final Integer fromIndex) {
        super.fromIndex(fromIndex);
        return this;
    }

    @Override
    @JsonSetter("from")
    public DatasetQuery from(final Integer from) {
        super.from(from);
        return this;
    }

    @Override
    @JsonSetter("size")
    public DatasetQuery size(final Integer size) {
        super.size(size);
        return this;
    }

    @Override
    @JsonSetter("randomResults")
    public DatasetQuery randomResults(final Boolean randomResults) {
        super.randomResults(randomResults);
        return this;
    }

    @Override
    @JsonIgnore
    public DatasetQuery system(final SystemQuery system) {
        super.system(system);
        return this;
    }

    /**
     * Set whether relevancy should be used in results.
     *
     * @param scoreRelevance True to add latex.
     * @return This object.
     */
    @JsonSetter("scoreRelevance")
    public DatasetQuery scoreRelevance(final Boolean scoreRelevance) {
        this.scoreRelevance = scoreRelevance;
        return this;
    }

    /**
     * Get relevancy should be used in results.
     *
     * @return True if relevancy should be used in results.
     */
    @JsonGetter("scoreRelevance")
    public Boolean scoreRelevance() {
        return this.scoreRelevance;
    }

    /**
     * Set whether the number of PIFs should be counted.
     *
     * @param countPifs True to return the number of PIFs.
     * @return This object.
     */
    @JsonSetter("countPifs")
    public DatasetQuery setCountPifs(final Boolean countPifs) {
        this.countPifs = countPifs;
        return this;
    }

    /**
     * Get whether to count the number of PIFs.
     *
     * @return True if the number of PIFs should be returned.
     */
    @JsonGetter("countPifs")
    public Boolean getCountPifs() {
        return this.countPifs;
    }

    /** Whether to use relevance scoring. */
    private Boolean scoreRelevance;

    /** Whether to get the count of PIFs in each dataset. */
    private Boolean countPifs;
}