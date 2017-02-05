package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Class for all field queries.
 *
 * @deprecated As of version 1.3.0, use {@link FieldQuery} instead.
 * @author Kyle Michel
 */
@Deprecated
public class FieldOperation extends FieldQuery {

    @Override
    @JsonIgnore
    public FieldOperation filter(final Filter filter) {
        super.filter(filter);
        return this;
    }

    @Override
    public FieldOperation extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    public FieldOperation extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    public FieldOperation extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public FieldOperation length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
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
    public FieldOperation offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
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
}