package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.BaseReturningQuery;
import io.citrine.jcc.search.core.query.DataQuery;
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
public class PifSystemReturningQuery extends BaseReturningQuery {

    @Override
    public PifSystemReturningQuery setFromIndex(final Integer fromIndex) {
        super.setFrom(fromIndex);
        return this;
    }

    @Override
    public PifSystemReturningQuery setFrom(final Integer from) {
        super.setFrom(from);
        return this;
    }

    @Override
    public PifSystemReturningQuery setSize(final Integer size) {
        super.setSize(size);
        return this;
    }

    @Override
    public PifSystemReturningQuery setRandomResults(final Boolean randomResults) {
        super.setRandomResults(randomResults);
        return this;
    }

    @Override
    public PifSystemReturningQuery setRandomSeed(final Integer randomSeed) {
        super.setRandomSeed(randomSeed);
        return this;
    }

    @Override
    public PifSystemReturningQuery setScoreRelevance(final Boolean scoreRelevance) {
        super.setScoreRelevance(scoreRelevance);
        return this;
    }

    @Override
    public PifSystemReturningQuery setReturnMaxScore(final Boolean returnMaxScore) {
        super.setReturnMaxScore(returnMaxScore);
        return this;
    }

    @Override
    public PifSystemReturningQuery setQuery(final List<DataQuery> query) {
        super.setQuery(query);
        return this;
    }

    @Override
    @JsonIgnore
    public PifSystemReturningQuery addQuery(final List<DataQuery> query) {
        super.addQuery(query);
        return this;
    }

    @Override
    @JsonIgnore
    public PifSystemReturningQuery addQuery(final DataQuery query) {
        super.addQuery(query);
        return this;
    }

    /**
     * Whether to return the actual record that was matched. If extractions are being made in the query, then it may
     * not be necessary to actually return the system. Defaults to true.
     *
     * @param returnSystem True to return systems in the results.
     * @return This object.
     */
    public PifSystemReturningQuery setReturnSystem(final Boolean returnSystem) {
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
    public PifSystemReturningQuery setAddLatex(final Boolean addLatex) {
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

    /**
     * Deserialization of the includeDatasets field from old PifQuery objects.
     *
     * @param includeDatasets List of longs of the datasets to include.
     */
    @JsonSetter
    private void setIncludeDatasets(final List<Long> includeDatasets) {  // Private since only Jackson should use it
        if (includeDatasets != null) {
            final DatasetQuery datasetQuery = new DatasetQuery();
            includeDatasets.forEach(i -> datasetQuery.addId(new Filter().setEqual(Long.toString(i))));
            this.addQuery(new DataQuery()
                    .setLogic(Logic.MUST)
                    .addDataset(datasetQuery));
        }
    }

    /**
     * Deserialization of the excludeDatasets field from old PifQuery objects.
     *
     * @param excludeDatasets List of longs of the datasets to exclude.
     */
    @JsonSetter
    private void setExcludeDatasets(final List<Long> excludeDatasets) {  // Private since only Jackson should use it
        if (excludeDatasets != null) {
            final DatasetQuery datasetQuery = new DatasetQuery();
            excludeDatasets.forEach(i -> datasetQuery.addId(new Filter().setEqual(Long.toString(i))));
            this.addQuery(new DataQuery()
                    .setLogic(Logic.MUST_NOT)
                    .addDataset(datasetQuery));
        }
    }

    /** Whether to include the system in the results. */
    private Boolean returnSystem;

    /** Whether to add latex formatting to results. */
    private Boolean addLatex;
}