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
     * @param filters {@link Filters} to apply.
     * @return This object.
     */
    @JsonSetter("filters")
    public FieldOperation filters(final Filters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the filters that apply to the field.
     *
     * @return {@link Filters} object or a null pointer if one has not been set.
     */
    @JsonGetter("filters")
    public Filters filters() {
        return this.filters;
    }

    /** Alias to save this field under. */
    private String extractAs;

    /** List of filters to apply to this field. */
    private Filters filters;
}