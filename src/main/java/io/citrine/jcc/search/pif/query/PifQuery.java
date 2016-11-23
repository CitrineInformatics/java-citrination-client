package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.pif.query.core.SortExtracted;
import io.citrine.jcc.search.pif.query.core.SystemQuery;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class for defining queries against PIF records on Citrination.
 *
 * @author Kyle Michel
 */
public class PifQuery {

    /**
     * Index of the first hit that should be returned. This method is here just to be compatible with the python
     * client.
     *
     * @param fromIndex Index of the first hit (inclusive of zero) that should be returned.
     * @return This object.
     */
    @JsonSetter("fromIndex")
    public PifQuery fromIndex(final Integer fromIndex) {
        this.fromIndex = fromIndex;
        return this;
    }

    /**
     * Get the index of the first hit that should be returned.
     *
     * @return Index of the first hit that should be returned or a null pointer if not set.
     */
    @JsonGetter("fromIndex")
    public Integer fromIndex() {
        return this.fromIndex;
    }

    /**
     * Index of the first hit that should be returned. This is an alias for {@link #fromIndex(Integer)}.
     *
     * @param from Index of the first hit (inclusive of zero) that should be returned.
     * @return This object.
     */
    @JsonSetter("from")
    public PifQuery from(final Integer from) {
        return fromIndex(from);
    }

    /**
     * Get the index of the first hit that should be returned. This is an alias for {@link #fromIndex()}.
     *
     * @return Index of the first hit that should be returned or a null pointer if not set.
     */
    @JsonIgnore
    public Integer from() {
        return fromIndex();
    }

    /**
     * Set the maximum number of records that should be returned. If set to 0, then no results are saved, but the
     * total number of hits will still be returned from the query. This can be used to count the number of records
     * that will match a query.
     *
     * @param size Maximum number of records to return.
     * @return This object.
     */
    @JsonSetter("size")
    public PifQuery size(final Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get the maximum number of records that should be returned.
     *
     * @return Maximum number of records that should be returned or a null pointer if not set.
     */
    @JsonGetter("size")
    public Integer size() {
        return this.size;
    }

    /**
     * Whether to return the actual record that was matched. If extractions are being made in the query, then it may
     * not be necessary to actually return the system. Defaults to true.
     *
     * @param returnSystem True to return systems in the results.
     * @return This object.
     */
    @JsonSetter("returnSystem")
    public PifQuery returnSystem(final Boolean returnSystem) {
        this.returnSystem = returnSystem;
        return this;
    }

    /**
     * Get whether systems should be return in the results set.
     *
     * @return True if systems should be returned in the results or a null pointer if it is not set.
     */
    @JsonGetter("returnSystem")
    public Boolean returnSystem() {
        return this.returnSystem;
    }

    /**
     * Set whether Latex formatting should be added.
     *
     * @param addLatex True to add latex.
     * @return This object.
     */
    @JsonSetter("addLatex")
    public PifQuery addLatex(final Boolean addLatex) {
        this.addLatex = addLatex;
        return this;
    }

    /**
     * Get whether latex formatting should be added to results.
     *
     * @return True if Latex should be added to results.
     */
    @JsonGetter("addLatex")
    public Boolean addLatex() {
        return this.addLatex;
    }

    /**
     * Set whether relevancy should be used in results.
     *
     * @param scoreRelevance True to add latex.
     * @return This object.
     */
    @JsonSetter("scoreRelevance")
    public PifQuery scoreRelevance(final Boolean scoreRelevance) {
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
     * Set information about all of the fields to sort on.
     *
     * @param sortExtracted List of {@link SortExtracted} objects to sort on.
     */
    @JsonSetter("sortExtracted")
    private void sortExtracted(final List<SortExtracted> sortExtracted) {  // Private since only Jackson should use it
        this.sortExtracted = ListUtil.add(sortExtracted, this.sortExtracted);
    }

    /**
     * Set information about a field to sort on. This works on fields that have been marked with an extractAs value.
     *
     * @param sortExtracted {@link SortExtracted} with information about the extracted field to sort on.
     * @return This object.
     */
    @JsonIgnore
    public PifQuery sortExtracted(final SortExtracted sortExtracted) {
        this.sortExtracted = ListUtil.add(sortExtracted, this.sortExtracted);
        return this;
    }

    /**
     * Get information about an extracted field to sort on.
     *
     * @return {@link SortExtracted} object or a null pointer if it has not been set.
     */
    @JsonGetter("sortExtracted")
    public Iterable<SortExtracted> sortExtracted() {
        return ListUtil.iterable(this.sortExtracted);
    }

    /**
     * Return whether this object contains any sorts.
     *
     * @return True if this object contains any sorts.
     */
    @JsonIgnore
    public boolean hasSortExtracted() {
        return ListUtil.hasContent(this.sortExtracted);
    }

    /**
     * Set the system queries.
     *
     * @param system List of {@link SystemQuery} objects to search on.
     */
    @JsonSetter("system")
    private void system(final List<SystemQuery> system) {  // Private since only Jackson should use it
        this.system = ListUtil.add(system, this.system);
    }

    /**
     * Add to the list of system queries.
     *
     * @param system {@link SystemQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifQuery system(final SystemQuery system) {
        this.system = ListUtil.add(system, this.system);
        return this;
    }

    /**
     * Get the system queries.
     *
     * @return Iterable over {@link SystemQuery} object.
     */
    @JsonGetter("system")
    public Iterable<SystemQuery> system() {
        return ListUtil.iterable(this.system);
    }

    /**
     * Return whether this object contains any system queries.
     *
     * @return True if this object contains any system queries.
     */
    @JsonIgnore
    public boolean hasSystem() {
        return ListUtil.hasContent(this.system);
    }

    /**
     * Add to the list of datasets to include.
     *
     * @param includeDataset Long with the dataset to include.
     * @return This object.
     */
    @JsonIgnore
    public PifQuery includeDataset(final Long includeDataset) {
        this.includeDatasets = ListUtil.add(includeDataset, this.includeDatasets);
        return this;
    }

    /**
     * Set information about all datasets to include.
     *
     * @param includeDatasets List of longs with datasets to include.
     */
    @JsonSetter("includeDatasets")
    private void includeDatasets(final List<Long> includeDatasets) {  // Private since only Jackson should use it
        this.includeDatasets = ListUtil.add(includeDatasets, this.includeDatasets);
    }

    /**
     * Get an iterable over datasets to include.
     *
     * @return Iterable over longs with the datasets to include.
     */
    @JsonGetter("includeDatasets")
    public Iterable<Long> includeDatasets() {
        return ListUtil.iterable(this.includeDatasets);
    }

    /**
     * Return whether this object contains any datasets to include.
     *
     * @return True if this object contains any datasets to include.
     */
    @JsonIgnore
    public boolean hasIncludeDatasets() {
        return ListUtil.hasContent(this.includeDatasets);
    }

    /**
     * Add to the list of datasets to exclude.
     *
     * @param excludeDataset Long with the dataset to exclude.
     * @return This object.
     */
    @JsonIgnore
    public PifQuery excludeDataset(final Long excludeDataset) {
        this.excludeDatasets = ListUtil.add(excludeDataset, this.excludeDatasets);
        return this;
    }

    /**
     * Set information about all datasets to exclude.
     *
     * @param excludeDatasets List of longs with datasets to exclude.
     */
    @JsonSetter("excludeDatasets")
    private void excludeDatasets(final List<Long> excludeDatasets) {  // Private since only Jackson should use it
        this.excludeDatasets = ListUtil.add(excludeDatasets, this.excludeDatasets);
    }

    /**
     * Get an iterable over datasets to exclude.
     *
     * @return Iterable over longs with the datasets to exclude.
     */
    @JsonGetter("excludeDatasets")
    public Iterable<Long> excludeDatasets() {
        return ListUtil.iterable(this.excludeDatasets);
    }

    /**
     * Return whether this object contains any datasets to exclude.
     *
     * @return True if this object contains any datasets to exclude.
     */
    @JsonIgnore
    public boolean hasExcludeDatasets() {
        return ListUtil.hasContent(this.excludeDatasets);
    }

    /** Index of the first hit that should be returned. */
    private Integer fromIndex;

    /** Total number of hits the should be returned. */
    private Integer size;

    /** Whether to include the system in the results. */
    private Boolean returnSystem;

    /** Whether to add latex formatting to results. */
    private Boolean addLatex;

    /** Whether to use relevance scoring. */
    private Boolean scoreRelevance;

    /** Information about an extracted field to sort on. */
    private List<SortExtracted> sortExtracted;

    /** System queries to apply. */
    private List<SystemQuery> system;

    /** List of datasets to include. */
    private List<Long> includeDatasets;

    /** List of datasets to exclude. */
    private List<Long> excludeDatasets;
}