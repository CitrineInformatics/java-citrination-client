package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Grouping of one or more filters that apply to a field.
 *
 * @author Kyle Michel
 */
public class Filters {

    /**
     * Set the logic that applies to the filters.
     *
     * @param logic {@link Logic} to wrap around the filters.
     * @return This object.
     */
    @JsonSetter("logic")
    public Filters logic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    /**
     * Get the logic that applies to the filters.
     *
     * @return {@link Logic} object or a null pointer if it has not been set.
     */
    @JsonGetter("logic")
    public Logic logic() {
        return this.logic;
    }

    /**
     * Set the list of filters that apply to the field.
     *
     * @param filter List of {@link Filter} objects.
     * @return This object.
     */
    @JsonSetter("filter")
    private Filters filter(final List<Filter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    /**
     * Add to the list of filters.
     *
     * @param filter {@link Filter} object to add.
     * @return This object.
     */
    @JsonIgnore
    public Filters filter(final Filter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    /**
     * Get an iterable over the list of filters.
     *
     * @return Iterable of {@link Filter} objects.
     */
    @JsonGetter("filter")
    public Iterable<Filter> filter() {
        return ListUtil.iterable(this.filter);
    }

    /**
     * Get whether any filters have been applied.
     *
     * @return True if there are any filters.
     */
    @JsonIgnore
    public boolean hasFilter() {
        return ListUtil.hasContent(this.filter);
    }

    /** Logic that the list of filters gets wrapped in. */
    private Logic logic;

    /** List of filters that apply to a field. */
    private List<Filter> filter;
}