package io.citrine.jcc.search.pif.query.chemical;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.pif.query.core.BaseFieldQuery;
import io.citrine.jcc.search.pif.query.core.FieldQuery;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class for field operations against a chemical formula field.
 *
 * @author Kyle Michel
 */
public class ChemicalFieldQuery extends BaseFieldQuery implements HasChemicalFilter {

    @Override
    public ChemicalFieldQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public ChemicalFieldQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public ChemicalFieldQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public ChemicalFieldQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public ChemicalFieldQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public ChemicalFieldQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public ChemicalFieldQuery setFilter(final List<ChemicalFilter> filter) {
        this.filter = filter;
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery addFilter(final List<ChemicalFilter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldQuery addFilter(final ChemicalFilter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    @JsonIgnore
    public int filterLength() {
        return ListUtil.length(this.filter);
    }

    @Override
    @JsonIgnore
    public Iterable<ChemicalFilter> filter() {
        return ListUtil.iterable(this.filter);
    }

    @Override
    @JsonIgnore
    public ChemicalFilter getFilter(final int index) {
        return ListUtil.get(this.filter, index);
    }

    @Override
    public List<ChemicalFilter> getFilter() {
        return this.filter;
    }

    /** List of filters. */
    private List<ChemicalFilter> filter;
}