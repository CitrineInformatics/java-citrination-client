package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class for all field queries.
 *
 * @author Kyle Michel
 */
public class FieldOperation {

    /**
     * Set the alias to save this field under.
     *
     * @param extractAs String with the alias to save this field under.
     * @return This object.
     */
    @JsonSetter("extractAs")
    public FieldOperation extractAs(final String extractAs) {
        this.extractAs = extractAs;
        return this;
    }

    /**
     * Get the alias to save this field under.
     *
     * @return String with the alias to save this field under or a null pointer if not set.
     */
    @JsonGetter("extractAs")
    public String extractAs() {
        return this.extractAs;
    }

    /**
     * Set whether top level filters should be floated. This is intended to be a private method since it should only
     * be used by templates.
     *
     * @param floatTopFilters True to float top level filters.
     */
    @JsonSetter("floatTopFilters")
    private void floatTopFilters(final Boolean floatTopFilters) {  // Private since only Jackson should use it
        this.floatTopFilters = floatTopFilters;
    }

    /**
     * Get whether top level filters should be floated.
     *
     * @return True if top level filters should be floated or a null pointer if it has not been set.
     */
    @JsonGetter("floatTopFilters")
    public Boolean floatTopFilters() {
        return this.floatTopFilters;
    }

    /**
     * Set the filters that apply to the field.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonSetter("filterGroup")
    public FieldOperation filterGroup(final FilterGroup filterGroup) {
        this.filterGroup = filterGroup;
        return this;
    }

    /**
     * Get the filters that apply to the field.
     *
     * @return {@link FilterGroup} object or a null pointer if one has not been set.
     */
    @JsonGetter("filterGroup")
    public FilterGroup filterGroup() {
        return this.filterGroup;
    }

    /**
     * Set the length operations. This adds to any operations that are already saved.
     *
     * @param length List of {@link FieldOperation} objects.
     */
    @JsonSetter("length")
    private void length(final List<FieldOperation> length) {
        this.length = ListUtil.add(length, this.length);
    }

    /**
     * Add to the list of length operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public FieldOperation length(final FieldOperation fieldOperation) {
        this.length = ListUtil.add(fieldOperation, this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public FieldOperation length(final String extractAs) {
        this.length = ListUtil.add(new FieldOperation().extractAs(extractAs), this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public FieldOperation length(final FilterGroup filterGroup) {
        this.length = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.length);
        return this;
    }

    /**
     * Get an iterable over length operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("length")
    public Iterable<FieldOperation> length() {
        return ListUtil.iterable(this.length);
    }

    /**
     * Return whether any length operations exist.
     *
     * @return True if any length operations exist.
     */
    @JsonIgnore
    public boolean hasLength() {
        return ListUtil.hasContent(this.length);
    }

    /**
     * Set the offset operations. This adds to any operations that are already saved.
     *
     * @param offset List of {@link FieldOperation} objects.
     */
    @JsonSetter("offset")
    private void offset(final List<FieldOperation> offset) {
        this.offset = ListUtil.add(offset, this.offset);
    }

    /**
     * Add to the list of offset operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public FieldOperation offset(final FieldOperation fieldOperation) {
        this.offset = ListUtil.add(fieldOperation, this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public FieldOperation offset(final String extractAs) {
        this.offset = ListUtil.add(new FieldOperation().extractAs(extractAs), this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public FieldOperation offset(final FilterGroup filterGroup) {
        this.offset = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.offset);
        return this;
    }

    /**
     * Get an iterable over offset operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("offset")
    public Iterable<FieldOperation> offset() {
        return ListUtil.iterable(this.offset);
    }

    /**
     * Return whether any offset operations exist.
     *
     * @return True if any offset operations exist.
     */
    @JsonIgnore
    public boolean hasOffset() {
        return ListUtil.hasContent(this.offset);
    }

    /** Alias to save this field under. */
    private String extractAs;

    /** Set whether top level filters should be floated out into their own objects. */
    private Boolean floatTopFilters;

    /** List of filters to apply to this field. */
    private FilterGroup filterGroup;

    /** Length of that array that this object appears in. */
    private List<FieldOperation> length;

    /** Offset of this object in the array that it appears in. */
    private List<FieldOperation> offset;
}