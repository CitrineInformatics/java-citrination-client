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
public class FilterGroup implements HasLogic {

    @Override
    @JsonSetter("logic")
    public FilterGroup logic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
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
    private FilterGroup filter(final List<Filter> filter) {
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
    public FilterGroup filter(final Filter filter) {
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

    /**
     * Set the list of filter groups.
     *
     * @param filterGroup List of {@link FilterGroup} objects to add.
     * @return This object.
     */
    @JsonSetter("filterGroup")
    private FilterGroup filterGroup(final List<FilterGroup> filterGroup) {
        this.filterGroup = ListUtil.add(filterGroup, this.filterGroup);
        return this;
    }

    /**
     * Add to the list of filter groups.
     *
     * @param filterGroup {@link FilterGroup} object to add.
     * @return This object.
     */
    @JsonIgnore
    public FilterGroup filterGroup(final FilterGroup filterGroup) {
        this.filterGroup = ListUtil.add(filterGroup, this.filterGroup);
        return this;
    }

    /**
     * Get an iterable over the list of filter groups.
     *
     * @return Iterable of {@link FilterGroup} objects.
     */
    @JsonGetter("filterGroup")
    public Iterable<FilterGroup> filterGroup() {
        return ListUtil.iterable(this.filterGroup);
    }

    /**
     * Return whether this object has any filter groups.
     *
     * @return True if this object has any filter groups.
     */
    @JsonIgnore
    public boolean hasFilterGroup() {
        return ListUtil.hasContent(this.filterGroup);
    }

    /** Logic that the list of filters gets wrapped in. */
    private Logic logic;

    /** List of filters that apply to a field. */
    private List<Filter> filter;

    /**
     * List of {@link FilterGroup} objects inside of this one.
     */
    private List<FilterGroup> filterGroup;
}