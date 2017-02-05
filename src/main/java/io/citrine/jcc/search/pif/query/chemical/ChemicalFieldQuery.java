package io.citrine.jcc.search.pif.query.chemical;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.pif.query.core.BaseFieldQuery;

import io.citrine.jcc.search.pif.query.core.FieldQuery;
import io.citrine.jcc.search.pif.query.core.Filter;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class for field operations against a chemical formula field.
 *
 * @author Kyle Michel
 */
public class ChemicalFieldQuery extends BaseFieldQuery implements HasChemicalFilter {

    @Override
    @JsonSetter("logic")
    public ChemicalFieldQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    /**
     * Set the chemical filter that applies to the field.
     *
     * @param chemicalFilter List of {@link ChemicalFilter} objects to apply.
     */
    @JsonSetter("filterGroup")
    private void filterGroup(final List<ChemicalFilter> chemicalFilter) {  // Private since only Jackson should use it
        this.filter(chemicalFilter);
    }

    /**
     * Set the list of chemical filters that apply to the field.
     *
     * @param filter List of {@link ChemicalFilter} objects.
     */
    @JsonSetter("filter")
    private void filter(final List<ChemicalFilter> filter) {  // Private since only Jackson should use it
        this.filter = ListUtil.add(filter, this.filter);
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery filter(final ChemicalFilter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    @JsonGetter("filter")
    public Iterable<ChemicalFilter> filter() {
        return ListUtil.iterable(this.filter);
    }

    @Override
    @JsonIgnore
    public boolean hasFilter() {
        return ListUtil.hasContent(this.filter);
    }

    @Override
    @JsonSetter("extractAs")
    public ChemicalFieldQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public ChemicalFieldQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public ChemicalFieldQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** List of filters. */
    private List<ChemicalFilter> filter;
}