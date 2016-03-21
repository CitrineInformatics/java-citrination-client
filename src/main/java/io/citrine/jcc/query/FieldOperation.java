package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for all field queries.
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
     * Set the list of filters to apply to the field. This adds to any filters that are already stored.
     *
     * @param filter List of {@link Filter} objects to apply.
     * @return This object.
     */
    @JsonSetter("filter")
    public FieldOperation filter(final List<Filter> filter) {
        if (filter != null) {
            this.filter.addAll(filter);
        }
        return this;
    }

    /**
     * Add a single filter to the field.
     *
     * @param filter {@link Filter} object to apply.
     * @return This object.
     */
    @JsonIgnore
    public FieldOperation filter(final Filter filter) {
        if (filter != null) {
            this.filter.add(filter);
        }
        return this;
    }

    /**
     * Get the list of filters that apply to this object.
     *
     * @return List of {@link Filter} objects to apply.
     */
    @JsonGetter("filter")
    public List<Filter> filter() {
        return this.filter;
    }

    /** Alias to save this field under. */
    private String extractAs;

    /** List of filters to apply to this field. */
    private List<Filter> filter = new ArrayList<>();
}