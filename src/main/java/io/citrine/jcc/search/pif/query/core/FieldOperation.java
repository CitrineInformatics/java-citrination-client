package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class for all field queries.
 *
 * @author Kyle Michel
 */
public class FieldOperation extends BaseFieldOperation implements HasFilter {

    /**
     * Set the filters that applies to the field.
     *
     * @param filter List of {@link Filter} objects to apply.
     */
    @JsonSetter("filterGroup")
    private void filterGroup(final List<Filter> filter) {  // Private since only Jackson should use it
        this.filter(filter);
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
    public FieldOperation filter(final Filter filter) {
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

    @Override
    @JsonSetter("extractAs")
    public FieldOperation extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public FieldOperation extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonIgnore
    public FieldOperation length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public FieldOperation length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public FieldOperation length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public FieldOperation offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public FieldOperation offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public FieldOperation offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** List of filters. */
    private List<Filter> filter;
}