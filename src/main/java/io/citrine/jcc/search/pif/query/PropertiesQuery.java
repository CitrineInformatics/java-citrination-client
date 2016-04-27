package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

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
    public PropertiesQuery name(final FieldOperation fieldOperation) {
        super.name(fieldOperation);
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
    public PropertiesQuery value(final FieldOperation fieldOperation) {
        super.value(fieldOperation);
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
    public PropertiesQuery units(final FieldOperation fieldOperation) {
        super.units(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery units(final String extractAs) {
        super.units(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery units(final FilterGroup filterGroup) {
        super.units(filterGroup);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery length(final FilterGroup filterGroup) {
        super.length(filterGroup);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertiesQuery offset(final FilterGroup filterGroup) {
        super.offset(filterGroup);
        return this;
    }

    /**
     * Set the list of conditions operations. This adds to any operations that are already saved.
     *
     * @param conditions List of {@link ValueQuery} objects.
     */
    @JsonSetter("conditions")
    private void conditions(final List<ValueQuery> conditions) {
        this.conditions = ListUtil.add(conditions, this.conditions);
    }

    /**
     * Add to the list of conditions operations.
     *
     * @param conditions {@link ValueQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public PropertiesQuery conditions(final ValueQuery conditions) {
        this.conditions = ListUtil.add(conditions, this.conditions);
        return this;
    }

    /**
     * Get an iterable of conditions operations.
     *
     * @return Iterable of {@link ValueQuery} objects.
     */
    @JsonGetter("conditions")
    public Iterable<ValueQuery> conditions() {
        return ListUtil.iterable(this.conditions);
    }

    /**
     * Get whether an conditions queries exist.
     *
     * @return True if any conditions queries exist.
     */
    @JsonIgnore
    public boolean hasConditions() {
        return ListUtil.hasContent(this.conditions);
    }

    /**
     * Set the list of data type operations. This adds to any operations that are already saved.
     *
     * @param dataType List of {@link FieldOperation} objects.
     */
    @JsonSetter("dataType")
    private void dataType(final List<FieldOperation> dataType) {
        this.dataType = ListUtil.add(dataType, this.dataType);
    }

    /**
     * Add to the list of data type operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public PropertiesQuery dataType(final FieldOperation fieldOperation) {
        this.dataType = ListUtil.add(fieldOperation, this.dataType);
        return this;
    }

    /**
     * Add to the list of data type operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public PropertiesQuery dataType(final String extractAs) {
        this.dataType = ListUtil.add(new FieldOperation().extractAs(extractAs), this.dataType);
        return this;
    }

    /**
     * Add to the list of data type operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public PropertiesQuery dataType(final FilterGroup filterGroup) {
        this.dataType = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.dataType);
        return this;
    }

    /**
     * Get an iterable over data type operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("dataType")
    public Iterable<FieldOperation> dataType() {
        return ListUtil.iterable(this.dataType);
    }

    /**
     * Return whether any data type operations exist.
     *
     * @return True if any data type operations exist.
     */
    @JsonIgnore
    public boolean hasDataType() {
        return ListUtil.hasContent(this.dataType);
    }

    /** List of conditions queries. */
    private List<ValueQuery> conditions;

    /** List of data type queries. */
    private List<FieldOperation> dataType;
}