package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Query to match against process steps.
 *
 * @author Kyle Michel
 */
public class ProcessStepQuery extends BaseObjectQuery implements Serializable {

    @Override
    public ProcessStepQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public ProcessStepQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public ProcessStepQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public ProcessStepQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public ProcessStepQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        super.addSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public ProcessStepQuery addSimpleWeight(final String field, final Double weight) {
        super.addSimpleWeight(field, weight);
        return this;
    }

    @Override
    public ProcessStepQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public ProcessStepQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public ProcessStepQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public ProcessStepQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public ProcessStepQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public ProcessStepQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public ProcessStepQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public ProcessStepQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public ProcessStepQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public ProcessStepQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public ProcessStepQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public ProcessStepQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the name operations. This adds to any operations that are already saved.
     *
     * @param name List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ProcessStepQuery setName(final List<FieldQuery> name) {
        this.name = name;
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param name {@link FieldQuery} to add.
     * @return This object.
     */
    public ProcessStepQuery addName(final List<FieldQuery> name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param name {@link FieldQuery} to add.
     * @return This object.
     */
    public ProcessStepQuery addName(final FieldQuery name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Get the length of the name queries.
     *
     * @return Number of name queries.
     */
    public int nameLength() {
        return ListUtil.length(this.name);
    }

    /**
     * Get an iterable over name operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> name() {
        return ListUtil.iterable(this.name);
    }

    /**
     * Get the name query at the input index.
     *
     * @param index Index of the name query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getName(final int index) {
        return ListUtil.get(this.name, index);
    }

    /**
     * Get the name field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getName() {
        return this.name;
    }

    /**
     * Set the details operations. This adds to any operations that are already saved.
     *
     * @param details List of {@link ValueQuery} objects.
     * @return This object.
     */
    public ProcessStepQuery setDetails(final List<ValueQuery> details) {
        this.details = details;
        return this;
    }

    /**
     * Add to the list of details operations.
     *
     * @param details {@link ValueQuery} to add.
     * @return This object.
     */
    public ProcessStepQuery addDetails(final List<ValueQuery> details) {
        this.details = ListUtil.add(details, this.details);
        return this;
    }

    /**
     * Add to the list of details operations.
     *
     * @param details {@link ValueQuery} to add.
     * @return This object.
     */
    public ProcessStepQuery addDetails(final ValueQuery details) {
        this.details = ListUtil.add(details, this.details);
        return this;
    }

    /**
     * Get the length of the details queries.
     *
     * @return Number of details queries.
     */
    public int detailsLength() {
        return ListUtil.length(this.details);
    }

    /**
     * Get an iterable over details operations.
     *
     * @return Iterable of {@link ValueQuery} objects.
     */
    public Iterable<ValueQuery> details() {
        return ListUtil.iterable(this.details);
    }

    /**
     * Get the details query at the input index.
     *
     * @param index Index of the details query to get.
     * @return {@link ValueQuery} at the input index.
     */
    public ValueQuery getDetails(final int index) {
        return ListUtil.get(this.details, index);
    }

    /**
     * Get the details field queries.
     *
     * @return List of {@link ValueQuery} objects.
     */
    public List<ValueQuery> getDetails() {
        return this.details;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link ProcessStepQuery} objects.
     * @return This object.
     */
    public ProcessStepQuery setQuery(final List<ProcessStepQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link ProcessStepQuery} objects.
     * @return This object.
     */
    public ProcessStepQuery addQuery(final List<ProcessStepQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link ProcessStepQuery} object to add.
     * @return This object.
     */
    public ProcessStepQuery addQuery(final ProcessStepQuery query) {
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
     * @return {@link Iterable} of {@link ProcessStepQuery} objects.
     */
    public Iterable<ProcessStepQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link ProcessStepQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link ProcessStepQuery} at the input index.
     */
    public ProcessStepQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link ProcessStepQuery} objects.
     */
    public List<ProcessStepQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof ProcessStepQuery)) {
            return false;
        }
        final ProcessStepQuery rhsQuery = (ProcessStepQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.name).equals(Optional.ofNullable(rhsQuery.name))
                && Optional.ofNullable(this.details).equals(Optional.ofNullable(rhsQuery.details))
                && Optional.ofNullable(this.query).equals(Optional.ofNullable(rhsQuery.query));
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

    private static final long serialVersionUID = -4271848031986995735L;

    /** Name of the step. */
    private List<FieldQuery> name;

    /** Details of the step. */
    private List<ValueQuery> details;
    
    /** Nested list of queries. */
    private List<ProcessStepQuery> query;
}