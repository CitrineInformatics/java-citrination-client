package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.search.core.HasLogic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Grouping of one or more filters that apply to a field.
 *
 * @author Kyle Michel
 */
public class FilterGroup implements HasLogic, HasFilter {

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
     */
    @JsonSetter("filter")
    private void filter(final List<Filter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
    }

    @Override
    @JsonIgnore
    public FilterGroup filter(final Filter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    @JsonGetter("filter")
    public Iterable<Filter> filter() {
        return ListUtil.iterable(this.filter);
    }

    @Override
    @JsonIgnore
    public boolean hasFilter() {
        return ListUtil.hasContent(this.filter);
    }

    /** Logic that the list of filters gets wrapped in. */
    private Logic logic;

    /** List of filters that apply to a field. */
    private List<Filter> filter;
}