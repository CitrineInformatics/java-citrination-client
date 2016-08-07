package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Class to query against a field that contains a value.
 *
 * @author Kyle Michel
 */
public class ValueFieldOperation extends FieldOperation {

    @Override
    @JsonSetter("extractAs")
    public ValueFieldOperation extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueFieldOperation filter(final Filter filter) {
        super.filter(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueFieldOperation length(final FieldOperation fieldOperation) {
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
}