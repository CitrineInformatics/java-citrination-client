package io.citrine.jcc.search.pif.query.chemical;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.search.pif.query.core.FieldQuery;
import io.citrine.jcc.search.pif.query.core.Filter;

/**
 * Class for field operations against a chemical formula field.
 *
 * @deprecated As of version 1.3.0, use {@link ChemicalFieldQuery} instead.
 * @author Kyle Michel
 */
@Deprecated
public class ChemicalFieldOperation extends ChemicalFieldQuery {

    @Override
    @JsonIgnore
    public ChemicalFieldOperation filter(final ChemicalFilter filter) {
        super.filter(filter);
        return this;
    }

    @Override
    public ChemicalFieldOperation extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    public ChemicalFieldOperation extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    public ChemicalFieldOperation extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public ChemicalFieldOperation length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
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
    public ChemicalFieldOperation offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
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
}