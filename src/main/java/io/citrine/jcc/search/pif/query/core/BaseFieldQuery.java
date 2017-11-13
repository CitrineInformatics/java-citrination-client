package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.HasLogic;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.core.query.SortOrder;
import io.citrine.jcc.util.ListUtil;

import java.util.List;
import java.util.Optional;


/**
 * Base class for all field queries.
 *
 * @author Kyle Michel
 */
public abstract class BaseFieldQuery implements HasLogic {

    @Override
    public BaseFieldQuery setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    /**
     * Set the sort order to use.
     *
     * @param sort {@link SortOrder} to apply to the field.
     * @return This object.
     */
    public BaseFieldQuery setSort(final SortOrder sort) {
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
     * Set the query to run against all fields.
     *
     * @param simple String with the query to run against all fields.
     * @return This object.
     */
    public BaseFieldQuery setSimple(final String simple) {
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

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof BaseFieldQuery)) {
            return false;
        }
        final BaseFieldQuery rhsQuery = (BaseFieldQuery) rhs;
        return Optional.ofNullable(this.sort).equals(Optional.ofNullable(rhsQuery.sort))
                && Optional.ofNullable(this.logic).equals(Optional.ofNullable(rhsQuery.logic))
                && Optional.ofNullable(this.simple).equals(Optional.ofNullable(rhsQuery.simple))
                && Optional.ofNullable(this.extractAs).equals(Optional.ofNullable(rhsQuery.extractAs))
                && Optional.ofNullable(this.extractAll).equals(Optional.ofNullable(rhsQuery.extractAll))
                && Optional.ofNullable(this.extractWhenMissing).equals(Optional.ofNullable(rhsQuery.extractWhenMissing))
                && Optional.ofNullable(this.length).equals(Optional.ofNullable(rhsQuery.length))
                && Optional.ofNullable(this.offset).equals(Optional.ofNullable(rhsQuery.offset));
    }

    /** The sort order to apply to the field. */
    private SortOrder sort;

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** String with the simple search to run against all fields. */
    private String simple;

    /** Alias to save this field under. */
    private String extractAs;

    /** Whether to extract all values in an array. */
    private Boolean extractAll;

    /** Default value to return if a field is missing and the query part is optional. */
    private Object extractWhenMissing;

    /** Length of that array that this object appears in. */
    private List<FieldQuery> length;

    /** Offset of this object in the array that it appears in. */
    private List<FieldQuery> offset;
}