package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Class used to match against a property.
 *
 * @author Kyle Michel
 */
public class PropertiesQuery extends ValueQuery {

    @Override
    @JsonSetter("logic")
    public PropertiesQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery name(final String extractAs, final FilterGroup filterGroup) {
        super.name(extractAs, filterGroup);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery name(final String extractAs) {
        super.name(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery name(final FilterGroup filterGroup) {
        super.name(filterGroup);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery value(final String extractAs, final FilterGroup filterGroup) {
        super.value(extractAs, filterGroup);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery value(final String extractAs) {
        super.value(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery value(final FilterGroup filterGroup) {
        super.value(filterGroup);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery units(final String extractAs, final FilterGroup filterGroup) {
        super.units(extractAs, filterGroup);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery units(final String extractAs) {
        super.units(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery units(final FilterGroup filterGroup) {
        super.units(filterGroup);
        return this;
    }
}