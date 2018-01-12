package io.citrine.jcc.search.core.query;

import io.citrine.jcc.search.analysis.query.Analysis;
import io.citrine.jcc.util.ListUtil;
import io.citrine.jcc.util.MapUtil;
import io.citrine.jcc.util.SerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Base class for all queries against simple fields.
 *
 * @author Kyle Michel
 */
public abstract class AbstractFieldQuery implements Serializable, HasLogic, HasWeight, HasSimple {

    @Override
    public AbstractFieldQuery setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    @Override
    public AbstractFieldQuery setWeight(final Double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public AbstractFieldQuery setSimple(final String simple) {
        this.simple = simple;
        return this;
    }

    @Override
    public String getSimple() {
        return this.simple;
    }

    @Override
    public AbstractFieldQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        this.simpleWeight = simpleWeight;
        return this;
    }

    @Override
    public AbstractFieldQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        this.simpleWeight = MapUtil.add(simpleWeight, this.simpleWeight);
        return this;
    }

    @Override
    public AbstractFieldQuery addSimpleWeight(final String field, final Double weight) {
        this.simpleWeight = MapUtil.add(field, weight, this.simpleWeight);
        return this;
    }

    @Override
    public Map<String, Double> getSimpleWeight() {
        return this.simpleWeight;
    }

    /**
     * Set the sort order to use.
     *
     * @param sort {@link SortOrder} to apply to the field.
     * @return This object.
     */
    public AbstractFieldQuery setSort(final SortOrder sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Get the sort order to use.
     *
     * @return {@link SortOrder} to use.
     */
    public SortOrder getSort() {
        return this.sort;
    }

    /**
     * Set the list of analyses. This replaces any analyses that are already present.
     *
     * @param analysis List of {@link Analysis} objects.
     * @return This object.
     */
    public AbstractFieldQuery setAnalysis(final List<Analysis> analysis) {
        this.analysis = analysis;
        return this;
    }

    /**
     * Add to the list of analyses.
     *
     * @param analysis List of {@link Analysis} objects.
     * @return This object.
     */
    public AbstractFieldQuery addAnalysis(final List<Analysis> analysis) {
        this.analysis = ListUtil.add(analysis, this.analysis);
        return this;
    }

    /**
     * Add to the list of analyses.
     *
     * @param analysis {@link Analysis} object to add.
     * @return This object.
     */
    public AbstractFieldQuery addAnalysis(final Analysis analysis) {
        this.analysis = ListUtil.add(analysis, this.analysis);
        return this;
    }

    /**
     * Get the number of analyses.
     *
     * @return Number of analyses.
     */
    public int analysisLength() {
        return ListUtil.length(this.analysis);
    }

    /**
     * Get an iterable over the analyses.
     *
     * @return {@link Iterable} of {@link Analysis} objects.
     */
    public Iterable<Analysis> analysis() {
        return ListUtil.iterable(this.analysis);
    }

    /**
     * Get the nested {@link Analysis} object at the input index.
     *
     * @param index Index of the nested analysis to get.
     * @return {@link Analysis} at the input index.
     */
    public Analysis getAnalysis(final int index) {
        return ListUtil.get(this.analysis, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link Analysis} objects.
     */
    public List<Analysis> getAnalysis() {
        return this.analysis;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof AbstractFieldQuery)) {
            return false;
        }
        final AbstractFieldQuery rhsQuery = (AbstractFieldQuery) rhs;
        return Optional.ofNullable(this.sort).equals(Optional.ofNullable(rhsQuery.sort))
                && Optional.ofNullable(this.logic).equals(Optional.ofNullable(rhsQuery.logic))
                && Optional.ofNullable(this.weight).equals(Optional.ofNullable(rhsQuery.weight))
                && Optional.ofNullable(this.simple).equals(Optional.ofNullable(rhsQuery.simple))
                && Optional.ofNullable(this.simpleWeight).equals(Optional.ofNullable(rhsQuery.simpleWeight))
                && Optional.ofNullable(this.analysis).equals(Optional.ofNullable(rhsQuery.analysis));
    }

    /**
     * Write this object to the output output stream.
     *
     * @param out {@link ObjectOutputStream} to write to.
     * @throws IOException if this object cannot be written.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        SerializationUtil.write(out, this);
    }

    /**
     * Read into this object from the input stream.
     *
     * @param in {@link ObjectInputStream} to read from.
     * @throws IOException if thrown while reading the stream.
     * @throws ClassNotFoundException if thrown while reading the stream.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        SerializationUtil.read(in, this);
    }

    /**
     * Read an object with no data.
     *
     * @throws ObjectStreamException if thrown while reading the stream.
     */
    private void readObjectNoData() throws ObjectStreamException {}

    private static final long serialVersionUID = -1108502649141143623L;

    /** The sort order to apply to the field. */
    private SortOrder sort;

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** Weight of the query. */
    private Double weight;

    /** String with the simple search to run against all fields. */
    private String simple;

    /** Map of field names to weights for the simple search string. */
    private Map<String, Double> simpleWeight;

    /** List of analysis operations to perform. */
    private List<Analysis> analysis;
}