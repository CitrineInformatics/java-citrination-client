package io.citrine.jcc.search.dataset.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.BaseReturningQuery;
import io.citrine.jcc.search.core.query.DataQuery;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.pif.query.PifSystemQuery;

import java.util.List;

/**
 * Query used to return information about datasets. This class is meant to be backwards compatible for
 * deserialization from DatasetQuery objects generated in v1.x of this package.
 *
 * @author Kyle Michel
 */
public class DatasetReturningQuery extends BaseReturningQuery {

    @Override
    public DatasetReturningQuery setFromIndex(final Integer fromIndex) {
        super.setFrom(fromIndex);
        return this;
    }

    @Override
    public DatasetReturningQuery setFrom(final Integer from) {
        super.setFrom(from);
        return this;
    }

    @Override
    public DatasetReturningQuery setSize(final Integer size) {
        super.setSize(size);
        return this;
    }

    @Override
    public DatasetReturningQuery setRandomResults(final Boolean randomResults) {
        super.setRandomResults(randomResults);
        return this;
    }

    @Override
    public DatasetReturningQuery setRandomSeed(final Integer randomSeed) {
        super.setRandomSeed(randomSeed);
        return this;
    }

    @Override
    public DatasetReturningQuery setScoreRelevance(final Boolean scoreRelevance) {
        super.setScoreRelevance(scoreRelevance);
        return this;
    }

    @Override
    public DatasetReturningQuery setQuery(final List<DataQuery> query) {
        super.setQuery(query);
        return this;
    }

    @Override
    @JsonIgnore
    public DatasetReturningQuery addQuery(final List<DataQuery> query) {
        super.addQuery(query);
        return this;
    }

    @Override
    @JsonIgnore
    public DatasetReturningQuery addQuery(final DataQuery query) {
        super.addQuery(query);
        return this;
    }

    /**
     * Set whether the number of PIFs should be counted.
     *
     * @param countPifs True to return the number of PIFs.
     * @return This object.
     */
    public DatasetReturningQuery setCountPifs(final Boolean countPifs) {
        this.countPifs = countPifs;
        return this;
    }

    /**
     * Get whether to count the number of PIFs.
     *
     * @return True if the number of PIFs should be returned.
     */
    public Boolean getCountPifs() {
        return this.countPifs;
    }

    /**
     * Deserialization of the system field from old PifQuery objects.
     *
     * @param system List of {@link PifSystemQuery} objects for the query.
     */
    @JsonSetter
    private void setSystem(final List<PifSystemQuery> system) {  // Private since only Jackson should use it
        if (system != null) {
            final DataQuery query = new DataQuery().setLogic(Logic.MUST);
            system.forEach(query::addSystem);
            this.addQuery(query);
        }
    }

    /** Whether to get the count of PIFs in each dataset. */
    private Boolean countPifs;
}