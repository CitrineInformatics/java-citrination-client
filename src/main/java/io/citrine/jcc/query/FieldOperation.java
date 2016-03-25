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

    /** List of filters to apply to this field. */
    private FilterGroup filterGroup;
}