package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Filter;
import io.citrine.jcc.search.core.query.HasFilter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

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
    public FieldQuery setSimple(final String simple) {
        super.setSimple(simple);
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

    /** List of filters. */
    private List<Filter> filter;
}