package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.BaseReturningQuery;
import io.citrine.jcc.search.core.query.DataQuery;
import io.citrine.jcc.search.core.query.Filter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.dataset.query.DatasetQuery;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * Class for defining queries against PIF records on Citrination. This class is meant to be backwards compatible for
 * deserialization from PifQuery objects generated in v1.x of this package. These methods are intentionally private
 * since they should only be used for deserialization.
 *
 * @author Kyle Michel
 */
public class PifSystemReturningQuery extends BaseReturningQuery implements Serializable {

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
    public PifSystemReturningQuery addQuery(final List<DataQuery> query) {
        super.addQuery(query);
        return this;
    }

    @Override
    public PifSystemReturningQuery addQuery(final DataQuery query) {
        super.addQuery(query);
        return this;
    }

    @Override
    public PifSystemReturningQuery setReturnAnalysis(final Boolean returnAnalysis) {
        super.setReturnAnalysis(returnAnalysis);
        return this;
    }

    @Override
    public PifSystemReturningQuery setTimeout(final Integer timeout) {
        super.setTimeout(timeout);
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
     * Set whether to run extractions.
     *
     * @param returnExtraction False to turn off extractions.
     * @return This object.
     */
    public PifSystemReturningQuery setReturnExtraction(final Boolean returnExtraction) {
        this.returnExtraction = returnExtraction;
        return this;
    }

    /**
     * Get whether to run extractions.
     *
     * @return False to turn off extractions.
     */
    public Boolean getReturnExtraction() {
        return this.returnExtraction;
    }

    /**
     * Set whether to return the paths to extracted values.
     *
     * @param returnExtractedPath True to return extracted value paths.
     * @return This object.
     */
    public PifSystemReturningQuery setReturnExtractedPath(final Boolean returnExtractedPath) {
        this.returnExtractedPath = returnExtractedPath;
        return this;
    }

    /**
     * Get whether to return the paths to extracted values.
     *
     * @return True to return extracted value paths.
     */
    public Boolean getReturnExtractedPath() {
        return this.returnExtractedPath;
    }

    /**
     * Set whether to unwrap single element extractions. This only applies when extractAll is true for an extraction
     * and the outermost array only contains a single element.
     *
     * @param unwrapSingleValueExtractions True to unwrap single element extractions.
     * @return This object.
     */
    public PifSystemReturningQuery setUnwrapSingleValueExtractions(final Boolean unwrapSingleValueExtractions) {
        this.unwrapSingleValueExtractions = unwrapSingleValueExtractions;
        return this;
    }

    /**
     * Get whether to unwrap single element extractions. This only applies when extractAll is true for an extraction
     * and the outermost array only contains a single element.
     *
     * @return True to unwrap single element extractions.
     */
    public Boolean getUnwrapSingleValueExtractions() {
        return this.unwrapSingleValueExtractions;
    }

    /**
     * Set whether to calculate the updatedAt timestamp.  This requires extra queries to run, so it must
     * be requested to lookup.
     *
     * @param calculateUpdatedAt True to calculate the updateAt timestamp.
     * @return This object.
     */
    public PifSystemReturningQuery setCalculateUpdateAt(final Boolean calculateUpdatedAt) {
        this.calculateUpdatedAt = calculateUpdatedAt;
        return this;
    }

    /**
     * Get whether to calculate the updatedAt timestamp.
     *
     * @return True to calculate the updateAt timestamp.
     */
    public Boolean getCalculateUpdateAt() {
        return this.calculateUpdatedAt;
    }

    /**
     * Sort to apply on an extracted field.
     *
     * @param extractionSort {@link ExtractionSort} to apply.
     * @return This object.
     */
    public PifSystemReturningQuery setExtractionSort(final ExtractionSort extractionSort) {
        this.extractionSort = extractionSort;
        return this;
    }

    /**
     * Get the sort order on an extracted field.
     *
     * @return {@link ExtractionSort} to use.
     */
    public ExtractionSort getExtractionSort() {
        return this.extractionSort;
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
        if ((includeDatasets != null) && !includeDatasets.isEmpty()) {
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
        if ((excludeDatasets != null)  && !excludeDatasets.isEmpty()) {
            final DatasetQuery datasetQuery = new DatasetQuery();
            excludeDatasets.forEach(i -> datasetQuery.addId(new Filter().setEqual(Long.toString(i))));
            this.addQuery(new DataQuery()
                    .setLogic(Logic.MUST_NOT)
                    .addDataset(datasetQuery));
        }
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof PifSystemReturningQuery)) {
            return false;
        }
        final PifSystemReturningQuery rhsQuery = (PifSystemReturningQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.returnSystem).equals(Optional.ofNullable(rhsQuery.returnSystem))
                && Optional.ofNullable(this.addLatex).equals(Optional.ofNullable(rhsQuery.addLatex))
                && Optional.ofNullable(this.returnExtraction).equals(Optional.ofNullable(rhsQuery.returnExtraction))
                && Optional.ofNullable(this.calculateUpdatedAt)
                        .equals(Optional.ofNullable(rhsQuery.calculateUpdatedAt))
                && Optional.ofNullable(this.returnExtractedPath)
                        .equals(Optional.ofNullable(rhsQuery.returnExtractedPath))
                && Optional.ofNullable(this.unwrapSingleValueExtractions)
                        .equals(Optional.ofNullable(rhsQuery.unwrapSingleValueExtractions))
                && Optional.ofNullable(this.extractionSort).equals(Optional.ofNullable(rhsQuery.extractionSort));
    }

    /**
     * Write this object to the output output stream.
     *
     * @param out {@link ObjectOutputStream} to write to.
     * @throws IOException if this object cannot be written.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        PifSerializationUtil.write(out, this);
    }

    /**
     * Read into this object from the input stream.
     *
     * @param in {@link ObjectInputStream} to read from.
     * @throws IOException if thrown while reading the stream.
     * @throws ClassNotFoundException if thrown while reading the stream.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        PifSerializationUtil.read(in, this);
    }

    /**
     * Read an object with no data.
     *
     * @throws ObjectStreamException if thrown while reading the stream.
     */
    private void readObjectNoData() throws ObjectStreamException {}

    private static final long serialVersionUID = 9073027729877907370L;

    /** Whether to include the system in the results. */
    private Boolean returnSystem;

    /** Whether to add latex formatting to results. */
    private Boolean addLatex;

    /** Whether to run extractions. */
    private Boolean returnExtraction;

    /** Whether to return the paths to extracted values. */
    private Boolean returnExtractedPath;

    /** Whether to unwrap single element arrays that are extracted. */
    private Boolean unwrapSingleValueExtractions;

    /** Whether to calculate the updatedAt field (this requires extra time to calculate). */
    private Boolean calculateUpdatedAt;

    /** Sort to apply on an extracted field. */
    private ExtractionSort extractionSort;
}