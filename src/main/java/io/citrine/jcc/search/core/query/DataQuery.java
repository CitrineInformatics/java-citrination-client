package io.citrine.jcc.search.core.query;

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
     * Set the query to run against all fields.
     *
     * @param simple String with the query to run against all fields.
     * @return This object.
     */
    public DataQuery setSimple(final String simple) {
        this.simple = simple;
        return this;
    }

    /**
     * Get the query to run against all fields.
     *
     * @return String with the query to run against all fields.
     */
    public String getSimple() {
        return this.simple;
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
    public DataQuery addDataset(final DatasetQuery dataset) {
        this.dataset = ListUtil.add(dataset, this.dataset);
        return this;
    }

    /**
     * Get the number of dataset queries.
     *
     * @return Number of queries against the dataset field.
     */
    public int datasetLength() {
        return ListUtil.length(this.dataset);
    }

    /**
     * Get an iterable over the dataset queries.
     *
     * @return {@link Iterable} of {@link DatasetQuery} objects.
     */
    public Iterable<DatasetQuery> dataset() {
        return ListUtil.iterable(this.dataset);
    }

    /**
     * Get the {@link DatasetQuery} object at the input index.
     *
     * @param index Index of the dataset query to get.
     * @return {@link DatasetQuery} at the input index.
     */
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
    public DataQuery addSystem(final PifSystemQuery system) {
        this.system = ListUtil.add(system, this.system);
        return this;
    }

    /**
     * Get the number of PIF system queries.
     *
     * @return Number of queries against the system field.
     */
    public int systemLength() {
        return ListUtil.length(this.system);
    }

    /**
     * Get an iterable over the PIF system queries.
     *
     * @return {@link Iterable} of {@link PifSystemQuery} objects.
     */
    public Iterable<PifSystemQuery> system() {
        return ListUtil.iterable(this.system);
    }

    /**
     * Get the {@link PifSystemQuery} object at the input index.
     *
     * @param index Index of the system to get.
     * @return {@link PifSystemQuery} at the input index.
     */
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

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link DataQuery} objects.
     * @return This object.
     */
    public DataQuery setQuery(final List<DataQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link DataQuery} objects.
     * @return This object.
     */
    public DataQuery addQuery(final List<DataQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link DataQuery} object to add.
     * @return This object.
     */
    public DataQuery addQuery(final DataQuery query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Get the number of nested queries.
     *
     * @return Number of nested queries.
     */
    public int queryLength() {
        return ListUtil.length(this.query);
    }

    /**
     * Get an iterable over the nested queries.
     *
     * @return {@link Iterable} of {@link DataQuery} objects.
     */
    public Iterable<DataQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link DataQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link DataQuery} at the input index.
     */
    public DataQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link DataQuery} objects.
     */
    public List<DataQuery> getQuery() {
        return this.query;
    }

    /** Logic for the query. */
    private Logic logic;

    /** String with the simple search to run against all fields. */
    private String simple;

    /** List of queries against dataset metadata. */
    private List<DatasetQuery> dataset;

    /** List of queries against PIF systems. */
    private List<PifSystemQuery> system;
    
    /** Nested list of queries. */
    private List<DataQuery> query;
}