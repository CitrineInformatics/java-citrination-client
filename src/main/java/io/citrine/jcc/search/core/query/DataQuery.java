package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.search.dataset.query.DatasetQuery;
import io.citrine.jcc.search.pif.query.PifSystemQuery;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query against dataset metadata, PIF content, file content, or some combination of those types.
 *
 * @author Kyle Michel
 */
public class DataQuery implements HasLogic {

    @Override
    public DataQuery setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    /**
     * Set the list of dataset ID queries. This replaces any filters that are already present.
     *
     * @param datasetId List of {@link Filter} objects.
     * @return This object.
     */
    public DataQuery setDatasetId(final List<Filter> datasetId) {
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
    public DataQuery addDatasetId(final List<Filter> datasetId) {
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
    public DataQuery addDatasetId(final Filter datasetId) {
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
     * Get the dataset ID filter object at the input index.
     *
     * @param index Index of the dataset ID filter to get.
     * @return {@link Filter} at the input index.
     */
    @JsonIgnore
    public Filter getDatasetId(final int index) {
        return ListUtil.get(this.datasetId, index);
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
    public DataQuery setDataset(final List<DatasetQuery> dataset) {
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
    public DataQuery addDataset(final List<DatasetQuery> dataset) {
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
    public DataQuery addDataset(final DatasetQuery dataset) {
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
     * Get the {@link DatasetQuery} object at the input index.
     *
     * @param index Index of the dataset query to get.
     * @return {@link DatasetQuery} at the input index.
     */
    @JsonIgnore
    public DatasetQuery getDataset(final int index) {
        return ListUtil.get(this.dataset, index);
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
     * Set the list of PIF system UID queries. This replaces any filters that are already present.
     *
     * @param systemUid List of {@link Filter} objects.
     * @return This object.
     */
    public DataQuery setSystemUid(final List<Filter> systemUid) {
        this.systemUid = systemUid;
        return this;
    }

    /**
     * Add to the list of PIF system UID queries.
     *
     * @param systemUid List of {@link Filter} objects.
     * @return This object.
     */
    @JsonIgnore
    public DataQuery addSystemUid(final List<Filter> systemUid) {
        this.systemUid = ListUtil.add(systemUid, this.systemUid);
        return this;
    }

    /**
     * Add to the list of PIF system UID queries.
     *
     * @param systemUid {@link Filter} object to add.
     * @return This object.
     */
    @JsonIgnore
    public DataQuery addSystemUid(final Filter systemUid) {
        this.systemUid = ListUtil.add(systemUid, this.systemUid);
        return this;
    }

    /**
     * Get the number of PIF system UID queries.
     *
     * @return Number of queries against the system UID field.
     */
    @JsonIgnore
    public int systemUidLength() {
        return ListUtil.length(this.systemUid);
    }

    /**
     * Get an iterable over the PIF system UID queries.
     *
     * @return {@link Iterable} of {@link Filter} objects.
     */
    @JsonIgnore
    public Iterable<Filter> systemUid() {
        return ListUtil.iterable(this.systemUid);
    }

    /**
     * Get the system UID filter object at the input index.
     *
     * @param index Index of the system UID filter to get.
     * @return {@link Filter} at the input index.
     */
    @JsonIgnore
    public Filter getSystemUid(final int index) {
        return ListUtil.get(this.systemUid, index);
    }

    /**
     * Get the list of PIF system UID queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getSystemUid() {
        return this.systemUid;
    }

    /**
     * Set the list of PIF system queries. This replaces any filters that are already present.
     *
     * @param system List of {@link PifSystemQuery} objects.
     * @return This object.
     */
    public DataQuery setSystem(final List<PifSystemQuery> system) {
        this.system = system;
        return this;
    }

    /**
     * Add to the list of PIF system queries.
     *
     * @param system List of {@link PifSystemQuery} objects.
     * @return This object.
     */
    @JsonIgnore
    public DataQuery addSystem(final List<PifSystemQuery> system) {
        this.system = ListUtil.add(system, this.system);
        return this;
    }

    /**
     * Add to the list of PIF system queries.
     *
     * @param system {@link PifSystemQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public DataQuery addSystem(final PifSystemQuery system) {
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
     * @return {@link Iterable} of {@link PifSystemQuery} objects.
     */
    @JsonIgnore
    public Iterable<PifSystemQuery> system() {
        return ListUtil.iterable(this.system);
    }

    /**
     * Get the {@link PifSystemQuery} object at the input index.
     *
     * @param index Index of the system to get.
     * @return {@link PifSystemQuery} at the input index.
     */
    @JsonIgnore
    public PifSystemQuery getSystem(final int index) {
        return ListUtil.get(this.system, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link PifSystemQuery} objects.
     */
    public List<PifSystemQuery> getSystem() {
        return this.system;
    }

    /** Logic for the query. */
    private Logic logic;

    /** List of filters against the dataset ID. */
    private List<Filter> datasetId;

    /** List of queries against dataset metadata. */
    private List<DatasetQuery> dataset;

    /** List of filters against the PIF system UID. */
    private List<Filter> systemUid;

    /** List of queries against PIF systems. */
    private List<PifSystemQuery> system;
}