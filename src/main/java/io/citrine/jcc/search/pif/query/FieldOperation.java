package io.citrine.jcc.search.pif.query;

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
     * Set the offset to use when the extracted field is a list. Note that this only applies to fields that contain
     * objects, not ones that contain simple lists of strings or numbers.
     *
     * @param offset Offset to use when the extracted field is a list (inclusive of 0).
     * @return This object.
     */
    @JsonSetter("offset")
    public FieldOperation offset(final Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the offset to use when the extracted field is a list.
     *
     * @return Offset to use when the extracted field is a list.
     */
    @JsonGetter("offset")
    public Integer offset() {
        return this.offset;
    }

    /**
     * Set whether top level filters should be floated. This is intended to be a private method since it should only
     * be used by templates.
     *
     * @param floatTopFilters True to float top level filters.
     */
    @JsonSetter("floatTopFilters")
    private void floatTopFilters(final Boolean floatTopFilters) {
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

    /** Alias to save this field under. */
    private String extractAs;

    /** Offset to use when the extracted field is a list. */
    private Integer offset;

    /** Set whether top level filters should be floated out into their own objects. */
    private Boolean floatTopFilters;

    /** List of filters to apply to this field. */
    private FilterGroup filterGroup;
}