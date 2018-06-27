package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.analysis.query.Analysis;
import io.citrine.jcc.search.core.query.AbstractFieldQuery;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.core.query.SortOrder;
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
 * Base class for all field queries.
 *
 * @author Kyle Michel
 */
public abstract class BaseFieldQuery extends AbstractFieldQuery implements Serializable {

    @Override
    public BaseFieldQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public BaseFieldQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public BaseFieldQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public BaseFieldQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public BaseFieldQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        super.addSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public BaseFieldQuery addSimpleWeight(final String field, final Double weight) {
        super.addSimpleWeight(field, weight);
        return this;
    }

    @Override
    public BaseFieldQuery setSort(final SortOrder sort) {
        super.setSort(sort);
        return this;
    }

    @Override
    public BaseFieldQuery setAnalysis(final List<Analysis> analysis) {
        super.setAnalysis(analysis);
        return this;
    }

    @Override
    public BaseFieldQuery addAnalysis(final List<Analysis> analysis) {
        super.addAnalysis(analysis);
        return this;
    }

    @Override
    public BaseFieldQuery addAnalysis(final Analysis analysis) {
        super.addAnalysis(analysis);
        return this;
    }

    /**
     * Set the alias to save this field under.
     *
     * @param extractAs String with the alias to save this field under.
     * @return This object.
     */
    public BaseFieldQuery setExtractAs(final String extractAs) {
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
    public BaseFieldQuery setExtractAll(final Boolean extractAll) {
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
    public BaseFieldQuery setExtractWhenMissing(final Object extractWhenMissing) {
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
     * Set the length operations. This adds to any operations that are already saved.
     *
     * @param length List of {@link FieldQuery} objects.
     * @return This object.
     */
    public BaseFieldQuery setLength(final List<FieldQuery> length) {
        this.length = length;
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param length {@link FieldQuery} to add.
     * @return This object.
     */
    public BaseFieldQuery addLength(final List<FieldQuery> length) {
        this.length = ListUtil.add(length, this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param length {@link FieldQuery} to add.
     * @return This object.
     */
    public BaseFieldQuery addLength(final FieldQuery length) {
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
    public BaseFieldQuery setOffset(final List<FieldQuery> offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param offset {@link FieldQuery} to add.
     * @return This object.
     */
    public BaseFieldQuery addOffset(final List<FieldQuery> offset) {
        this.offset = ListUtil.add(offset, this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param offset {@link FieldQuery} to add.
     * @return This object.
     */
    public BaseFieldQuery addOffset(final FieldQuery offset) {
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

    /**
     * Set whether identity unit conversions should execute or not.  Identity conversions
     * will cause floating point normalizations (ie .10 becomes .1).
     *
     * @return This object.
     */
    public BaseFieldQuery setBypassIdentityConversion(final Boolean bypassFlag) {
        this.bypassIdentityConversion = bypassFlag;
        return this;
    }

    /**
     * Get flag indicating whether to bypass identity conversions.
     *
     * @return True if identity conversions are bypassed.
     */
    public Boolean getBypassIdentityConversion() {
        return this.bypassIdentityConversion;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof BaseFieldQuery)) {
            return false;
        }
        final BaseFieldQuery rhsQuery = (BaseFieldQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.extractAs).equals(Optional.ofNullable(rhsQuery.extractAs))
                && Optional.ofNullable(this.extractAll).equals(Optional.ofNullable(rhsQuery.extractAll))
                && Optional.ofNullable(this.extractWhenMissing).equals(Optional.ofNullable(rhsQuery.extractWhenMissing))
                && Optional.ofNullable(this.length).equals(Optional.ofNullable(rhsQuery.length))
                && Optional.ofNullable(this.offset).equals(Optional.ofNullable(rhsQuery.offset))
                && Optional.ofNullable(this.bypassIdentityConversion).equals(Optional.ofNullable(
                        rhsQuery.bypassIdentityConversion));
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

    private static final long serialVersionUID = -2871528127048887493L;

    /** Alias to save this field under. */
    private String extractAs;

    /** Whether to extract all values in an array. */
    private Boolean extractAll;

    /** Default value to return if a field is missing and the query part is optional. */
    private Object extractWhenMissing;

    /** Whether to bypass identity conversions. */
    private Boolean bypassIdentityConversion;

    /** Length of that array that this object appears in. */
    private List<FieldQuery> length;

    /** Offset of this object in the array that it appears in. */
    private List<FieldQuery> offset;
}