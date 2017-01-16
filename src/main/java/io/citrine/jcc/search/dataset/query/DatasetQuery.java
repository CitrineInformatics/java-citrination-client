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

    /** Whether to use relevance scoring. */
    private Boolean scoreRelevance;
}