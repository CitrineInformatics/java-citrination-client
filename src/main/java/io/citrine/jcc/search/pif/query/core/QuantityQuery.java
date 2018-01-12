package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;
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
 * Query against the quantity of a system.
 * 
 * @author Kyle Michel
 */
public class QuantityQuery extends BaseObjectQuery implements Serializable {

    @Override
    public QuantityQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public QuantityQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public QuantityQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public QuantityQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public QuantityQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        super.addSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public QuantityQuery addSimpleWeight(final String field, final Double weight) {
        super.addSimpleWeight(field, weight);
        return this;
    }

    @Override
    public QuantityQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public QuantityQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public QuantityQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public QuantityQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public QuantityQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public QuantityQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public QuantityQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public QuantityQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public QuantityQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public QuantityQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public QuantityQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public QuantityQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the actualMassPercent operations. This adds to any operations that are already saved.
     *
     * @param actualMassPercent List of {@link FieldQuery} objects.
     * @return This object.
     */
    public QuantityQuery setActualMassPercent(final List<FieldQuery> actualMassPercent) {
        this.actualMassPercent = actualMassPercent;
        return this;
    }

    /**
     * Add to the list of actualMassPercent operations.
     *
     * @param actualMassPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addActualMassPercent(final List<FieldQuery> actualMassPercent) {
        this.actualMassPercent = ListUtil.add(actualMassPercent, this.actualMassPercent);
        return this;
    }

    /**
     * Add to the list of actualMassPercent operations.
     *
     * @param actualMassPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addActualMassPercent(final FieldQuery actualMassPercent) {
        this.actualMassPercent = ListUtil.add(actualMassPercent, this.actualMassPercent);
        return this;
    }

    /**
     * Get the length of the actualMassPercent queries.
     *
     * @return Number of actualMassPercent queries.
     */
    public int actualMassPercentLength() {
        return ListUtil.length(this.actualMassPercent);
    }

    /**
     * Get an iterable over actualMassPercent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> actualMassPercent() {
        return ListUtil.iterable(this.actualMassPercent);
    }

    /**
     * Get the actualMassPercent query at the input index.
     *
     * @param index Index of the actualMassPercent query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getActualMassPercent(final int index) {
        return ListUtil.get(this.actualMassPercent, index);
    }

    /**
     * Get the actualMassPercent field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getActualMassPercent() {
        return this.actualMassPercent;
    }

    /**
     * Set the actualVolumePercent operations. This adds to any operations that are already saved.
     *
     * @param actualVolumePercent List of {@link FieldQuery} objects.
     * @return This object.
     */
    public QuantityQuery setActualVolumePercent(final List<FieldQuery> actualVolumePercent) {
        this.actualVolumePercent = actualVolumePercent;
        return this;
    }

    /**
     * Add to the list of actualVolumePercent operations.
     *
     * @param actualVolumePercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addActualVolumePercent(final List<FieldQuery> actualVolumePercent) {
        this.actualVolumePercent = ListUtil.add(actualVolumePercent, this.actualVolumePercent);
        return this;
    }

    /**
     * Add to the list of actualVolumePercent operations.
     *
     * @param actualVolumePercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addActualVolumePercent(final FieldQuery actualVolumePercent) {
        this.actualVolumePercent = ListUtil.add(actualVolumePercent, this.actualVolumePercent);
        return this;
    }

    /**
     * Get the length of the actualVolumePercent queries.
     *
     * @return Number of actualVolumePercent queries.
     */
    public int actualVolumePercentLength() {
        return ListUtil.length(this.actualVolumePercent);
    }

    /**
     * Get an iterable over actualVolumePercent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> actualVolumePercent() {
        return ListUtil.iterable(this.actualVolumePercent);
    }

    /**
     * Get the actualVolumePercent query at the input index.
     *
     * @param index Index of the actualVolumePercent query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getActualVolumePercent(final int index) {
        return ListUtil.get(this.actualVolumePercent, index);
    }

    /**
     * Get the actualVolumePercent field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getActualVolumePercent() {
        return this.actualVolumePercent;
    }

    /**
     * Set the actualNumberPercent operations. This adds to any operations that are already saved.
     *
     * @param actualNumberPercent List of {@link FieldQuery} objects.
     * @return This object.
     */
    public QuantityQuery setActualNumberPercent(final List<FieldQuery> actualNumberPercent) {
        this.actualNumberPercent = actualNumberPercent;
        return this;
    }

    /**
     * Add to the list of actualNumberPercent operations.
     *
     * @param actualNumberPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addActualNumberPercent(final List<FieldQuery> actualNumberPercent) {
        this.actualNumberPercent = ListUtil.add(actualNumberPercent, this.actualNumberPercent);
        return this;
    }

    /**
     * Add to the list of actualNumberPercent operations.
     *
     * @param actualNumberPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addActualNumberPercent(final FieldQuery actualNumberPercent) {
        this.actualNumberPercent = ListUtil.add(actualNumberPercent, this.actualNumberPercent);
        return this;
    }

    /**
     * Get the length of the actualNumberPercent queries.
     *
     * @return Number of actualNumberPercent queries.
     */
    public int actualNumberPercentLength() {
        return ListUtil.length(this.actualNumberPercent);
    }

    /**
     * Get an iterable over actualNumberPercent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> actualNumberPercent() {
        return ListUtil.iterable(this.actualNumberPercent);
    }

    /**
     * Get the actualNumberPercent query at the input index.
     *
     * @param index Index of the actualNumberPercent query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getActualNumberPercent(final int index) {
        return ListUtil.get(this.actualNumberPercent, index);
    }

    /**
     * Get the actualNumberPercent field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getActualNumberPercent() {
        return this.actualNumberPercent;
    }

    /**
     * Set the idealMassPercent operations. This adds to any operations that are already saved.
     *
     * @param idealMassPercent List of {@link FieldQuery} objects.
     * @return This object.
     */
    public QuantityQuery setIdealMassPercent(final List<FieldQuery> idealMassPercent) {
        this.idealMassPercent = idealMassPercent;
        return this;
    }

    /**
     * Add to the list of idealMassPercent operations.
     *
     * @param idealMassPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addIdealMassPercent(final List<FieldQuery> idealMassPercent) {
        this.idealMassPercent = ListUtil.add(idealMassPercent, this.idealMassPercent);
        return this;
    }

    /**
     * Add to the list of idealMassPercent operations.
     *
     * @param idealMassPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addIdealMassPercent(final FieldQuery idealMassPercent) {
        this.idealMassPercent = ListUtil.add(idealMassPercent, this.idealMassPercent);
        return this;
    }

    /**
     * Get the length of the idealMassPercent queries.
     *
     * @return Number of idealMassPercent queries.
     */
    public int idealMassPercentLength() {
        return ListUtil.length(this.idealMassPercent);
    }

    /**
     * Get an iterable over idealMassPercent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> idealMassPercent() {
        return ListUtil.iterable(this.idealMassPercent);
    }

    /**
     * Get the idealMassPercent query at the input index.
     *
     * @param index Index of the idealMassPercent query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getIdealMassPercent(final int index) {
        return ListUtil.get(this.idealMassPercent, index);
    }

    /**
     * Get the idealMassPercent field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getIdealMassPercent() {
        return this.idealMassPercent;
    }

    /**
     * Set the idealVolumePercent operations. This adds to any operations that are already saved.
     *
     * @param idealVolumePercent List of {@link FieldQuery} objects.
     * @return This object.
     */
    public QuantityQuery setIdealVolumePercent(final List<FieldQuery> idealVolumePercent) {
        this.idealVolumePercent = idealVolumePercent;
        return this;
    }

    /**
     * Add to the list of idealVolumePercent operations.
     *
     * @param idealVolumePercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addIdealVolumePercent(final List<FieldQuery> idealVolumePercent) {
        this.idealVolumePercent = ListUtil.add(idealVolumePercent, this.idealVolumePercent);
        return this;
    }

    /**
     * Add to the list of idealVolumePercent operations.
     *
     * @param idealVolumePercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addIdealVolumePercent(final FieldQuery idealVolumePercent) {
        this.idealVolumePercent = ListUtil.add(idealVolumePercent, this.idealVolumePercent);
        return this;
    }

    /**
     * Get the length of the idealVolumePercent queries.
     *
     * @return Number of idealVolumePercent queries.
     */
    public int idealVolumePercentLength() {
        return ListUtil.length(this.idealVolumePercent);
    }

    /**
     * Get an iterable over idealVolumePercent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> idealVolumePercent() {
        return ListUtil.iterable(this.idealVolumePercent);
    }

    /**
     * Get the idealVolumePercent query at the input index.
     *
     * @param index Index of the idealVolumePercent query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getIdealVolumePercent(final int index) {
        return ListUtil.get(this.idealVolumePercent, index);
    }

    /**
     * Get the idealVolumePercent field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getIdealVolumePercent() {
        return this.idealVolumePercent;
    }

    /**
     * Set the idealNumberPercent operations. This adds to any operations that are already saved.
     *
     * @param idealNumberPercent List of {@link FieldQuery} objects.
     * @return This object.
     */
    public QuantityQuery setIdealNumberPercent(final List<FieldQuery> idealNumberPercent) {
        this.idealNumberPercent = idealNumberPercent;
        return this;
    }

    /**
     * Add to the list of idealNumberPercent operations.
     *
     * @param idealNumberPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addIdealNumberPercent(final List<FieldQuery> idealNumberPercent) {
        this.idealNumberPercent = ListUtil.add(idealNumberPercent, this.idealNumberPercent);
        return this;
    }

    /**
     * Add to the list of idealNumberPercent operations.
     *
     * @param idealNumberPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public QuantityQuery addIdealNumberPercent(final FieldQuery idealNumberPercent) {
        this.idealNumberPercent = ListUtil.add(idealNumberPercent, this.idealNumberPercent);
        return this;
    }

    /**
     * Get the length of the idealNumberPercent queries.
     *
     * @return Number of idealNumberPercent queries.
     */
    public int idealNumberPercentLength() {
        return ListUtil.length(this.idealNumberPercent);
    }

    /**
     * Get an iterable over idealNumberPercent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> idealNumberPercent() {
        return ListUtil.iterable(this.idealNumberPercent);
    }

    /**
     * Get the idealNumberPercent query at the input index.
     *
     * @param index Index of the idealNumberPercent query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getIdealNumberPercent(final int index) {
        return ListUtil.get(this.idealNumberPercent, index);
    }

    /**
     * Get the idealNumberPercent field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getIdealNumberPercent() {
        return this.idealNumberPercent;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link QuantityQuery} objects.
     * @return This object.
     */
    public QuantityQuery setQuery(final List<QuantityQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link QuantityQuery} objects.
     * @return This object.
     */
    public QuantityQuery addQuery(final List<QuantityQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link QuantityQuery} object to add.
     * @return This object.
     */
    public QuantityQuery addQuery(final QuantityQuery query) {
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
     * @return {@link Iterable} of {@link QuantityQuery} objects.
     */
    public Iterable<QuantityQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link QuantityQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link QuantityQuery} at the input index.
     */
    public QuantityQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link QuantityQuery} objects.
     */
    public List<QuantityQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof QuantityQuery)) {
            return false;
        }
        final QuantityQuery rhsQuery = (QuantityQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.actualMassPercent)
                        .equals(Optional.ofNullable(rhsQuery.actualMassPercent))
                && Optional.ofNullable(this.actualVolumePercent)
                        .equals(Optional.ofNullable(rhsQuery.actualVolumePercent))
                && Optional.ofNullable(this.actualNumberPercent)
                        .equals(Optional.ofNullable(rhsQuery.actualNumberPercent))
                && Optional.ofNullable(this.idealMassPercent)
                        .equals(Optional.ofNullable(rhsQuery.idealMassPercent))
                && Optional.ofNullable(this.idealVolumePercent)
                        .equals(Optional.ofNullable(rhsQuery.idealVolumePercent))
                && Optional.ofNullable(this.idealNumberPercent)
                        .equals(Optional.ofNullable(rhsQuery.idealNumberPercent))
                && Optional.ofNullable(this.query).equals(Optional.ofNullable(rhsQuery.query));
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

    private static final long serialVersionUID = 1227806335899761628L;

    /** Actual percent of the total mass. */
    private List<FieldQuery> actualMassPercent;

    /** Actual percent of the total volume. */
    private List<FieldQuery> actualVolumePercent;

    /** Actual percent of the total number. */
    private List<FieldQuery> actualNumberPercent;

    /** Ideal percent of the total mass. */
    private List<FieldQuery> idealMassPercent;

    /** Ideal percent of the total volume. */
    private List<FieldQuery> idealVolumePercent;

    /** Ideal percent of the total number. */
    private List<FieldQuery> idealNumberPercent;

    /** Nested list of queries. */
    private List<QuantityQuery> query;
}