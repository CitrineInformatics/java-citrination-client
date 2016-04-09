package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

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
     * Set the offset to use when the extracted field is a list.
     *
     * @param extractOffset Offset to use when the extracted field is a list (inclusive of 0).
     * @return This object.
     */
    @JsonSetter("extractOffset")
    public FieldOperation extractOffset(final Integer extractOffset) {
        this.extractOffset = extractOffset;
        return this;
    }

    /**
     * Get the offset to use when the extracted field is a list.
     *
     * @return Offset to use when the extracted field is a list.
     */
    @JsonGetter("extractOffset")
    public Integer extractOffset() {
        return this.extractOffset;
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

    /** Alias to save this field under. */
    private String extractAs;

    /** Offset to use when the extracted field is a list. */
    private Integer extractOffset;

    /** List of filters to apply to this field. */
    private FilterGroup filterGroup;
}