package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.search.dataset.query.DatasetQuery;
import io.citrine.jcc.search.pif.query.SystemQuery;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Base class for all queries against datasets and the items that they contain on Citrination.
 *
 * @author Kyle Michel
 */
public abstract class BaseDatasetQuery {

    /**
     * Index of the first hit that should be returned. This method is here just to be compatible with the python
     * client.
     *
     * @param fromIndex Index of the first hit (inclusive of zero) that should be returned.
     * @return This object.
     */
    public BaseDatasetQuery setFromIndex(final Integer fromIndex) {
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
    public BaseDatasetQuery setFrom(final Integer from) {
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
    public BaseDatasetQuery setSize(final Integer size) {
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
    public BaseDatasetQuery setRandomResults(final Boolean randomResults) {
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
    public BaseDatasetQuery setRandomSeed(final Integer randomSeed) {
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
    public BaseDatasetQuery setScoreRelevance(final Boolean scoreRelevance) {
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
     * Set the list of dataset ID queries. This replaces any filters that are already present.
     *
     * @param datasetId List of {@link Filter} objects.
     * @return This object.
     */
    public BaseDatasetQuery setDatasetId(final List<Filter> datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * Add to the list of dataset ID queries.
     *
     * @param datasetId List of {@link Filter} objects.
     * @return This object.
     */
    @JsonIgnore
    public BaseDatasetQuery addDatasetId(final List<Filter> datasetId) {
        this.datasetId = ListUtil.add(datasetId, this.datasetId);
        return this;
    }

    /**
     * Add to the list of dataset ID queries.
     *
     * @param datasetId {@link Filter} object to add.
     * @return This object.
     */
    @JsonIgnore
    public BaseDatasetQuery addDatasetId(final Filter datasetId) {
        this.datasetId = ListUtil.add(datasetId, this.datasetId);
        return this;
    }

    /**
     * Get the number of dataset ID queries.
     *
     * @return Number of queries against the datasetId field.
     */
    @JsonIgnore
    public int datasetIdLength() {
        return ListUtil.length(this.datasetId);
    }

    /**
     * Get an iterable over the dataset ID queries.
     *
     * @return {@link Iterable} of {@link Filter} objects.
     */
    @JsonIgnore
    public Iterable<Filter> datasetId() {
        return ListUtil.iterable(this.datasetId);
    }

    /**
     * Get the list of dataset ID queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getDatasetId() {
        return this.datasetId;
    }

    /**
     * Set the list of dataset queries. This replaces any filters that are already present.
     *
     * @param dataset List of {@link DatasetQuery} objects.
     * @return This object.
     */
    public BaseDatasetQuery setDataset(final List<DatasetQuery> dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Add to the list of dataset queries.
     *
     * @param dataset List of {@link DatasetQuery} objects.
     * @return This object.
     */
    @JsonIgnore
    public BaseDatasetQuery addDataset(final List<DatasetQuery> dataset) {
        this.dataset = ListUtil.add(dataset, this.dataset);
        return this;
    }

    /**
     * Add to the list of dataset queries.
     *
     * @param dataset {@link DatasetQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public BaseDatasetQuery addDataset(final DatasetQuery dataset) {
        this.dataset = ListUtil.add(dataset, this.dataset);
        return this;
    }

    /**
     * Get the number of dataset queries.
     *
     * @return Number of queries against the dataset field.
     */
    @JsonIgnore
    public int datasetLength() {
        return ListUtil.length(this.dataset);
    }

    /**
     * Get an iterable over the dataset queries.
     *
     * @return {@link Iterable} of {@link DatasetQuery} objects.
     */
    @JsonIgnore
    public Iterable<DatasetQuery> dataset() {
        return ListUtil.iterable(this.dataset);
    }

    /**
     * Get the list of dataset queries.
     *
     * @return List of {@link DatasetQuery} objects.
     */
    public List<DatasetQuery> getDataset() {
        return this.dataset;
    }

    /**
     * Set the list of PIF system ID queries. This replaces any filters that are already present.
     *
     * @param systemId List of {@link Filter} objects.
     * @return This object.
     */
    public BaseDatasetQuery setSystemId(final List<Filter> systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * Add to the list of PIF system ID queries.
     *
     * @param systemId List of {@link Filter} objects.
     * @return This object.
     */
    @JsonIgnore
    public BaseDatasetQuery addSystemId(final List<Filter> systemId) {
        this.systemId = ListUtil.add(systemId, this.systemId);
        return this;
    }

    /**
     * Add to the list of PIF system ID queries.
     *
     * @param systemId {@link Filter} object to add.
     * @return This object.
     */
    @JsonIgnore
    public BaseDatasetQuery addSystemId(final Filter systemId) {
        this.systemId = ListUtil.add(systemId, this.systemId);
        return this;
    }

    /**
     * Get the number of PIF system ID queries.
     *
     * @return Number of queries against the systemId field.
     */
    @JsonIgnore
    public int systemIdLength() {
        return ListUtil.length(this.systemId);
    }

    /**
     * Get an iterable over the PIF system ID queries.
     *
     * @return {@link Iterable} of {@link Filter} objects.
     */
    @JsonIgnore
    public Iterable<Filter> systemId() {
        return ListUtil.iterable(this.systemId);
    }

    /**
     * Get the list of PIF system ID queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getSystemId() {
        return this.systemId;
    }

    /**
     * Set the list of PIF system queries. This replaces any filters that are already present.
     *
     * @param system List of {@link SystemQuery} objects.
     * @return This object.
     */
    public BaseDatasetQuery setSystem(final List<SystemQuery> system) {
        this.system = system;
        return this;
    }

    /**
     * Add to the list of PIF system queries.
     *
     * @param system List of {@link SystemQuery} objects.
     * @return This object.
     */
    @JsonIgnore
    public BaseDatasetQuery addSystem(final List<SystemQuery> system) {
        this.system = ListUtil.add(system, this.system);
        return this;
    }

    /**
     * Add to the list of PIF system queries.
     *
     * @param system {@link SystemQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public BaseDatasetQuery addSystem(final SystemQuery system) {
        this.system = ListUtil.add(system, this.system);
        return this;
    }

    /**
     * Get the number of PIF system queries.
     *
     * @return Number of queries against the system field.
     */
    @JsonIgnore
    public int systemLength() {
        return ListUtil.length(this.system);
    }

    /**
     * Get an iterable over the PIF system queries.
     *
     * @return {@link Iterable} of {@link SystemQuery} objects.
     */
    @JsonIgnore
    public Iterable<SystemQuery> system() {
        return ListUtil.iterable(this.system);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link SystemQuery} objects.
     */
    public List<SystemQuery> getSystem() {
        return this.system;
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

    /** List of filters against the dataset ID. */
    private List<Filter> datasetId;

    /** List of queries against dataset metadata. */
    private List<DatasetQuery> dataset;

    /** List of filters against the PIF system ID. */
    private List<Filter> systemId;

    /** List of queries against PIF systems. */
    private List<SystemQuery> system;
}