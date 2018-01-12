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
 * Query against the source of a system.
 *
 * @author Kyle Michel
 */
public class SourceQuery extends BaseObjectQuery implements Serializable {

    @Override
    public SourceQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public SourceQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public SourceQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public SourceQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public SourceQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        super.addSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public SourceQuery addSimpleWeight(final String field, final Double weight) {
        super.addSimpleWeight(field, weight);
        return this;
    }

    @Override
    public SourceQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public SourceQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public SourceQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public SourceQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public SourceQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public SourceQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public SourceQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public SourceQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public SourceQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public SourceQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public SourceQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public SourceQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the producer operations. This adds to any operations that are already saved.
     *
     * @param producer List of {@link FieldQuery} objects.
     * @return This object.
     */
    public SourceQuery setProducer(final List<FieldQuery> producer) {
        this.producer = producer;
        return this;
    }

    /**
     * Add to the list of producer operations.
     *
     * @param producer {@link FieldQuery} to add.
     * @return This object.
     */
    public SourceQuery addProducer(final List<FieldQuery> producer) {
        this.producer = ListUtil.add(producer, this.producer);
        return this;
    }

    /**
     * Add to the list of producer operations.
     *
     * @param producer {@link FieldQuery} to add.
     * @return This object.
     */
    public SourceQuery addProducer(final FieldQuery producer) {
        this.producer = ListUtil.add(producer, this.producer);
        return this;
    }

    /**
     * Get the length of the producer queries.
     *
     * @return Number of producer queries.
     */
    public int producerLength() {
        return ListUtil.length(this.producer);
    }

    /**
     * Get an iterable over producer operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> producer() {
        return ListUtil.iterable(this.producer);
    }

    /**
     * Get the producer query at the input index.
     *
     * @param index Index of the producer query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getProducer(final int index) {
        return ListUtil.get(this.producer, index);
    }

    /**
     * Get the producer field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getProducer() {
        return this.producer;
    }

    /**
     * Set the url operations. This adds to any operations that are already saved.
     *
     * @param url List of {@link FieldQuery} objects.
     * @return This object.
     */
    public SourceQuery setUrl(final List<FieldQuery> url) {
        this.url = url;
        return this;
    }

    /**
     * Add to the list of url operations.
     *
     * @param url {@link FieldQuery} to add.
     * @return This object.
     */
    public SourceQuery addUrl(final List<FieldQuery> url) {
        this.url = ListUtil.add(url, this.url);
        return this;
    }

    /**
     * Add to the list of url operations.
     *
     * @param url {@link FieldQuery} to add.
     * @return This object.
     */
    public SourceQuery addUrl(final FieldQuery url) {
        this.url = ListUtil.add(url, this.url);
        return this;
    }

    /**
     * Get the length of the url queries.
     *
     * @return Number of url queries.
     */
    public int urlLength() {
        return ListUtil.length(this.url);
    }

    /**
     * Get an iterable over url operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> url() {
        return ListUtil.iterable(this.url);
    }

    /**
     * Get the url query at the input index.
     *
     * @param index Index of the url query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getUrl(final int index) {
        return ListUtil.get(this.url, index);
    }

    /**
     * Get the url field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getUrl() {
        return this.url;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link SourceQuery} objects.
     * @return This object.
     */
    public SourceQuery setQuery(final List<SourceQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link SourceQuery} objects.
     * @return This object.
     */
    public SourceQuery addQuery(final List<SourceQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link SourceQuery} object to add.
     * @return This object.
     */
    public SourceQuery addQuery(final SourceQuery query) {
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
     * @return {@link Iterable} of {@link SourceQuery} objects.
     */
    public Iterable<SourceQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link SourceQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link SourceQuery} at the input index.
     */
    public SourceQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link SourceQuery} objects.
     */
    public List<SourceQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof SourceQuery)) {
            return false;
        }
        final SourceQuery rhsQuery = (SourceQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.producer).equals(Optional.ofNullable(rhsQuery.producer))
                && Optional.ofNullable(this.url).equals(Optional.ofNullable(rhsQuery.url))
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

    private static final long serialVersionUID = -672187836693144364L;

    /** Producer of the system. */
    private List<FieldQuery> producer;

    /** URL to the source. */
    private List<FieldQuery> url;
    
    /** Nested list of queries. */
    private List<SourceQuery> query;
}