package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.HasLogic;
import io.citrine.jcc.search.core.query.HasSimple;
import io.citrine.jcc.search.core.query.HasWeight;
import io.citrine.jcc.search.core.query.Logic;
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
 * Base class for all PIF object queries.
 * 
 * @author Kyle Michel
 */
public abstract class BaseObjectQuery implements Serializable, HasLogic, HasWeight, HasSimple {

    @Override
    public BaseObjectQuery setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    @Override
    public BaseObjectQuery setWeight(final Double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public BaseObjectQuery setSimple(final String simple) {
        this.simple = simple;
        return this;
    }

    @Override
    public String getSimple() {
        return this.simple;
    }

    @Override
    public BaseObjectQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        this.simpleWeight = simpleWeight;
        return this;
    }

    @Override
    public BaseObjectQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        this.simpleWeight = MapUtil.add(simpleWeight, this.simpleWeight);
        return this;
    }

    @Override
    public BaseObjectQuery addSimpleWeight(final String field, final Double weight) {
        this.simpleWeight = MapUtil.add(field, weight, this.simpleWeight);
        return this;
    }

    @Override
    public Map<String, Double> getSimpleWeight() {
        return this.simpleWeight;
    }

    /**
     * Set the alias to save this field under.
     *
     * @param extractAs String with the alias to save this field under.
     * @return This object.
     */
    public BaseObjectQuery setExtractAs(final String extractAs) {
        this.extractAs = extractAs;
        return this;
    }

    /**
     * Get the alias to save this field under.
     *
     * @return String with the alias to save this field under or a null pointer if not set.
     */
    public String getExtractAs() {
        return this.extractAs;
    }

    /**
     * Set whether to extract all values in an array.
     *
     * @param extractAll True to extract all values from an array.
     * @return This object.
     */
    public BaseObjectQuery setExtractAll(final Boolean extractAll) {
        this.extractAll = extractAll;
        return this;
    }

    /**
     * Get whether to extract all values in an array.
     *
     * @return True if all values should be extracted from an array.
     */
    public Boolean getExtractAll() {
        return this.extractAll;
    }

    /**
     * Set the value to return when an extract value is not found. This value is only returned when an optional query
     * misses or when a SHOULD query misses but another query in that SHOULD block does hit.
     *
     * @param extractWhenMissing Object to return when the overall query is satisfied but the extract value is missing.
     * @return This object.
     */
    public BaseObjectQuery setExtractWhenMissing(final Object extractWhenMissing) {
        this.extractWhenMissing = extractWhenMissing;
        return this;
    }

    /**
     * Get the value to return whether an extracted value is missing.
     *
     * @return Object with the value to return when an extracted value is missing.
     */
    public Object getExtractWhenMissing() {
        return this.extractWhenMissing;
    }

    /**
     * Set the tags operations. This adds to any operations that are already saved.
     *
     * @param tags List of {@link FieldQuery} objects.
     * @return This object.
     */
    public BaseObjectQuery setTags(final List<FieldQuery> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Add to the list of tags operations.
     *
     * @param tags {@link FieldQuery} to add.
     * @return This object.
     */
    public BaseObjectQuery addTags(final List<FieldQuery> tags) {
        this.tags = ListUtil.add(tags, this.tags);
        return this;
    }

    /**
     * Add to the list of tags operations.
     *
     * @param tags {@link FieldQuery} to add.
     * @return This object.
     */
    public BaseObjectQuery addTags(final FieldQuery tags) {
        this.tags = ListUtil.add(tags, this.tags);
        return this;
    }

    /**
     * Get the length of the tags queries.
     *
     * @return Number of tags queries.
     */
    public int tagsLength() {
        return ListUtil.length(this.tags);
    }

    /**
     * Get an iterable over tags operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> tags() {
        return ListUtil.iterable(this.tags);
    }

    /**
     * Get the tags query at the input index.
     *
     * @param index Index of the tags query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getTags(final int index) {
        return ListUtil.get(this.tags, index);
    }

    /**
     * Get the tags field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getTags() {
        return this.tags;
    }

    /**
     * Set the length operations. This adds to any operations that are already saved.
     *
     * @param length List of {@link FieldQuery} objects.
     * @return This object.
     */
    public BaseObjectQuery setLength(final List<FieldQuery> length) {
        this.length = length;
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param length {@link FieldQuery} to add.
     * @return This object.
     */
    public BaseObjectQuery addLength(final List<FieldQuery> length) {
        this.length = ListUtil.add(length, this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param length {@link FieldQuery} to add.
     * @return This object.
     */
    public BaseObjectQuery addLength(final FieldQuery length) {
        this.length = ListUtil.add(length, this.length);
        return this;
    }

    /**
     * Get the length of the length queries.
     *
     * @return Number of length queries.
     */
    public int lengthLength() {
        return ListUtil.length(this.length);
    }

    /**
     * Get an iterable over length operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> length() {
        return ListUtil.iterable(this.length);
    }

    /**
     * Get the length query at the input index.
     *
     * @param index Index of the length query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getLength(final int index) {
        return ListUtil.get(this.length, index);
    }

    /**
     * Get the length field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getLength() {
        return this.length;
    }

    /**
     * Set the offset operations. This adds to any operations that are already saved.
     *
     * @param offset List of {@link FieldQuery} objects.
     * @return This object.
     */
    public BaseObjectQuery setOffset(final List<FieldQuery> offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param offset {@link FieldQuery} to add.
     * @return This object.
     */
    public BaseObjectQuery addOffset(final List<FieldQuery> offset) {
        this.offset = ListUtil.add(offset, this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param offset {@link FieldQuery} to add.
     * @return This object.
     */
    public BaseObjectQuery addOffset(final FieldQuery offset) {
        this.offset = ListUtil.add(offset, this.offset);
        return this;
    }

    /**
     * Get the length of the offset queries.
     *
     * @return Number of offset queries.
     */
    public int offsetLength() {
        return ListUtil.length(this.offset);
    }

    /**
     * Get an iterable over offset operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> offset() {
        return ListUtil.iterable(this.offset);
    }

    /**
     * Get the offset query at the input index.
     *
     * @param index Index of the offset query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getOffset(final int index) {
        return ListUtil.get(this.offset, index);
    }

    /**
     * Get the offset field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getOffset() {
        return this.offset;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof BaseObjectQuery)) {
            return false;
        }
        final BaseObjectQuery rhsQuery = (BaseObjectQuery) rhs;
        return Optional.ofNullable(this.logic).equals(Optional.ofNullable(rhsQuery.logic))
                && Optional.ofNullable(this.weight).equals(Optional.ofNullable(rhsQuery.weight))
                && Optional.ofNullable(this.simple).equals(Optional.ofNullable(rhsQuery.simple))
                && Optional.ofNullable(this.simpleWeight).equals(Optional.ofNullable(rhsQuery.simpleWeight))
                && Optional.ofNullable(this.extractAs).equals(Optional.ofNullable(rhsQuery.extractAs))
                && Optional.ofNullable(this.extractAll).equals(Optional.ofNullable(rhsQuery.extractAll))
                && Optional.ofNullable(this.extractWhenMissing).equals(Optional.ofNullable(rhsQuery.extractWhenMissing))
                && Optional.ofNullable(this.tags).equals(Optional.ofNullable(rhsQuery.tags))
                && Optional.ofNullable(this.length).equals(Optional.ofNullable(rhsQuery.length))
                && Optional.ofNullable(this.offset).equals(Optional.ofNullable(rhsQuery.offset));
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

    private static final long serialVersionUID = 4217002491151598217L;

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** Weight of the query. */
    private Double weight;

    /** String with the simple search to run against all fields. */
    private String simple;

    /** Map of field names to weights for the simple search string. */
    private Map<String, Double> simpleWeight;

    /** Alias to save this field under. */
    private String extractAs;

    /** Whether to extract all values in an array. */
    private Boolean extractAll;

    /** Default value to return if a field is missing and the query part is optional. */
    private Object extractWhenMissing;

    /** List of tag operations. */
    private List<FieldQuery> tags;

    /** Length of the array that this object appears in. */
    private List<FieldQuery> length;

    /** Offset for this object in the array that it appears in. */
    private List<FieldQuery> offset;
}