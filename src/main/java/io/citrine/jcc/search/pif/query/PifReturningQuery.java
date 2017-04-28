package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.BaseDatasetQuery;
import io.citrine.jcc.search.core.query.Filter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.dataset.query.DatasetQuery;

import java.util.List;

/**
 * Class for defining queries against PIF records on Citrination. This class is meant to be backwards compatible for
 * deserialization from PifQuery objects generated in v1.x of this package. These methods are intentionally private
 * since they should only be used for deserialization.
 *
 * @author Kyle Michel
 */
// The order here is necessary for deserialization. It ensures that values are not overwritten.
@JsonPropertyOrder({"datasetId", "includeDatasets", "excludeDatasets"})
public class PifReturningQuery extends BaseDatasetQuery {

    @Override
    public PifReturningQuery setFromIndex(final Integer fromIndex) {
        super.setFrom(fromIndex);
        return this;
    }

    @Override
    public PifReturningQuery setFrom(final Integer from) {
        super.setFrom(from);
        return this;
    }

    @Override
    public PifReturningQuery setSize(final Integer size) {
        super.setSize(size);
        return this;
    }

    @Override
    public PifReturningQuery setRandomResults(final Boolean randomResults) {
        super.setRandomResults(randomResults);
        return this;
    }

    @Override
    public PifReturningQuery setRandomSeed(final Integer randomSeed) {
        super.setRandomSeed(randomSeed);
        return this;
    }

    @Override
    public PifReturningQuery setScoreRelevance(final Boolean scoreRelevance) {
        super.setScoreRelevance(scoreRelevance);
        return this;
    }

    @Override
    public PifReturningQuery setDatasetId(final List<Filter> datasetId) {
        super.setDatasetId(datasetId);
        return this;
    }

    @Override
    @JsonIgnore
    public PifReturningQuery addDatasetId(final List<Filter> datasetId) {
        super.addDatasetId(datasetId);
        return this;
    }

    @Override
    @JsonIgnore
    public PifReturningQuery addDatasetId(final Filter datasetId) {
        super.addDatasetId(datasetId);
        return this;
    }

    @Override
    public PifReturningQuery setDataset(final List<DatasetQuery> dataset) {
        super.setDataset(dataset);
        return this;
    }

    @Override
    @JsonIgnore
    public PifReturningQuery addDataset(final List<DatasetQuery> dataset) {
        super.addDataset(dataset);
        return this;
    }

    @Override
    @JsonIgnore
    public PifReturningQuery addDataset(final DatasetQuery dataset) {
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
     * Whether to return the actual record that was matched. If extractions are being made in the query, then it may
     * not be necessary to actually return the system. Defaults to true.
     *
     * @param returnSystem True to return systems in the results.
     * @return This object.
     */
    public PifReturningQuery setReturnSystem(final Boolean returnSystem) {
        this.returnSystem = returnSystem;
        return this;
    }

    /**
     * Get whether systems should be return in the results set.
     *
     * @return True if systems should be returned in the results or a null pointer if it is not set.
     */
    public Boolean getReturnSystem() {
        return this.returnSystem;
    }

    /**
     * Set whether Latex formatting should be added.
     *
     * @param addLatex True to add latex.
     * @return This object.
     */
    public PifReturningQuery setAddLatex(final Boolean addLatex) {
        this.addLatex = addLatex;
        return this;
    }

    /**
     * Get whether latex formatting should be added to results.
     *
     * @return True if Latex should be added to results.
     */
    public Boolean getAddLatex() {
        return this.addLatex;
    }

    /**
     * Deserialization the includeDatasets field from old PifQuery objects.
     *
     * @param includeDatasets List of longs of the datasets to include.
     */
    @JsonSetter
    private void setIncludeDatasets(final List<Long> includeDatasets) {  // Private since only Jackson should use it
        if (includeDatasets != null) {
            includeDatasets.forEach(i -> this.addDatasetId(
                    new Filter().setEqual(Long.toString(i))));
        }
    }

    /**
     * Deserialization the excludeDatasets field from old PifQuery objects.
     *
     * @param excludeDatasets List of longs of the datasets to exclude.
     */
    @JsonSetter
    private void setExcludeDatasets(final List<Long> excludeDatasets) {  // Private since only Jackson should use it
        if (excludeDatasets != null) {
            excludeDatasets.forEach(i -> this.addDatasetId(
                    new Filter().setLogic(Logic.MUST_NOT).setEqual(Long.toString(i))));
        }
    }

    /** Whether to include the system in the results. */
    private Boolean returnSystem;

    /** Whether to add latex formatting to results. */
    private Boolean addLatex;
}