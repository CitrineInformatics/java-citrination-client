package io.citrine.jcc.search.pif.query.chemical;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.pif.query.core.BaseFieldOperation;
import io.citrine.jcc.search.pif.query.core.FieldOperation;
import io.citrine.jcc.search.pif.query.core.Filter;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class for field operations against a chemical formula field.
 *
 * @author Kyle Michel
 */
public class ChemicalFieldOperation extends BaseFieldOperation implements HasChemicalFilter {

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
    private void filter(final List<ChemicalFilter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
    }

    @Override
    @JsonIgnore
    public ChemicalFieldOperation filter(final ChemicalFilter filter) {
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
    public ChemicalFieldOperation extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public ChemicalFieldOperation extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public ChemicalFieldOperation extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldOperation length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldOperation length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldOperation length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldOperation offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldOperation offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldOperation offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** List of filters. */
    private List<ChemicalFilter> filter;
}