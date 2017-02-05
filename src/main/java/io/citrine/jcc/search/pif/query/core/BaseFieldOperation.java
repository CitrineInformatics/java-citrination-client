package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * Base class for all field operations.
 *
 * @deprecated As of version 1.3.0, use {@link BaseFieldQuery} instead.
 * @author Kyle Michel
 */
@Deprecated
public abstract class BaseFieldOperation extends BaseFieldQuery {

    @Override
    public BaseFieldOperation extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    public BaseFieldOperation extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    public BaseFieldOperation extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public BaseFieldOperation length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public BaseFieldOperation length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public BaseFieldOperation length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public BaseFieldOperation offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public BaseFieldOperation offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public BaseFieldOperation offset(final Filter filter) {
        super.offset(filter);
        return this;
    }
}