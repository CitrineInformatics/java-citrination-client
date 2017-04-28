package io.citrine.jcc.search.dataset.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.search.core.query.BaseDatasetQuery;
import io.citrine.jcc.search.core.query.Filter;
import io.citrine.jcc.search.pif.query.SystemQuery;

import java.util.List;

/**
 * Query used to return information about datasets. This class is meant to be backwards compatible for
 * deserialization from DatasetQuery objects generated in v1.x of this package.
 *
 * @author Kyle Michel
 */
public class DatasetReturningQuery extends BaseDatasetQuery {

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
    public DatasetReturningQuery setDatasetId(final List<Filter> datasetId) {
        super.setDatasetId(datasetId);
        return this;
    }

    @Override
    @JsonIgnore
    public DatasetReturningQuery addDatasetId(final List<Filter> datasetId) {
        super.addDatasetId(datasetId);
        return this;
    }

    @Override
    @JsonIgnore
    public DatasetReturningQuery addDatasetId(final Filter datasetId) {
        super.addDatasetId(datasetId);
        return this;
    }

    @Override
    public DatasetReturningQuery setDataset(final List<DatasetQuery> dataset) {
        super.setDataset(dataset);
        return this;
    }

    @Override
    @JsonIgnore
    public DatasetReturningQuery addDataset(final List<DatasetQuery> dataset) {
        super.addDataset(dataset);
        return this;
    }

    @Override
    @JsonIgnore
    public DatasetReturningQuery addDataset(final DatasetQuery dataset) {
        super.addDataset(dataset);
        return this;
    }

    @Override
    public BaseDatasetQuery setSystemId(final List<Filter> systemId) {
        super.setSystemId(systemId);
        return this;
    }

    @Override
    @JsonIgnore
    public BaseDatasetQuery addSystemId(final List<Filter> systemId) {
        super.setSystemId(systemId);
        return this;
    }

    @Override
    @JsonIgnore
    public BaseDatasetQuery addSystemId(final Filter systemId) {
        super.addSystemId(systemId);
        return this;
    }

    @Override
    public BaseDatasetQuery setSystem(final List<SystemQuery> system) {
        super.setSystem(system);
        return this;
    }

    @Override
    @JsonIgnore
    public BaseDatasetQuery addSystem(final List<SystemQuery> system) {
        super.addSystem(system);
        return this;
    }

    @Override
    @JsonIgnore
    public BaseDatasetQuery addSystem(final SystemQuery system) {
        super.addSystem(system);
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

    /** Whether to get the count of PIFs in each dataset. */
    private Boolean countPifs;
}