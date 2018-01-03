package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.analysis.query.Analysis;
import io.citrine.jcc.search.core.query.Filter;
import io.citrine.jcc.search.core.query.HasFilter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.core.query.SortOrder;
import io.citrine.jcc.util.ListUtil;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Class for all field queries.
 *
 * @author Kyle Michel
 */
public class FieldQuery extends BaseFieldQuery implements HasFilter {

    @Override
    public FieldQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public FieldQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public FieldQuery setSort(final SortOrder sort) {
        super.setSort(sort);
        return this;
    }

    @Override
    public FieldQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public FieldQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public FieldQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        super.addSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public FieldQuery addSimpleWeight(final String field, final Double weight) {
        super.addSimpleWeight(field, weight);
        return this;
    }

    @Override
    public FieldQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public FieldQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public FieldQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public FieldQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public FieldQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public FieldQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public FieldQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public FieldQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public FieldQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public FieldQuery setFilter(final List<Filter> filter) {
        this.filter = filter;
        return this;
    }

    @Override
    public FieldQuery addFilter(final List<Filter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    public FieldQuery addFilter(final Filter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    public int filterLength() {
        return ListUtil.length(this.filter);
    }

    @Override
    public Iterable<Filter> filter() {
        return ListUtil.iterable(this.filter);
    }

    @Override
    public Filter getFilter(final int index) {
        return ListUtil.get(this.filter, index);
    }

    @Override
    public List<Filter> getFilter() {
        return this.filter;
    }

    /**
     * Add to the list of filters using a filterGroup tag. This method exists only to deserialize from deprecated
     * FilterGroup objects.
     *
     * @param filter List of {@link Filter} objects to add.
     */
    @JsonSetter("filterGroup")
    protected void filterGroup(final List<Filter> filter) {
        this.addFilter(filter);
    }

    @Override
    public FieldQuery setAnalysis(final List<Analysis> analysis) {
        super.setAnalysis(analysis);
        return this;
    }

    @Override
    public FieldQuery addAnalysis(final List<Analysis> analysis) {
        super.addAnalysis(analysis);
        return this;
    }

    @Override
    public FieldQuery addAnalysis(final Analysis analysis) {
        super.addAnalysis(analysis);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof FieldQuery)) {
            return false;
        }
        final FieldQuery rhsQuery = (FieldQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.filter).equals(Optional.ofNullable(rhsQuery.filter));
    }

    /** List of filters. */
    private List<Filter> filter;
}