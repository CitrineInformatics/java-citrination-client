package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class for querying against a single value.
 * 
 * @author Kyle Michel
 */
public class ValueQuery extends BaseObjectQuery {

    /**
     * Set the list of name operations. This adds to any operations that already exist.
     *
     * @param name List of {@link FieldOperation} objects.
     */
    @JsonSetter("name")
    private void name(final List<FieldOperation> name) {
        this.name = ListUtil.add(name, this.name);
    }

    /**
     * Add a single name operation.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery name(final FieldOperation fieldOperation) {
        this.name = ListUtil.add(fieldOperation, this.name);
        return this;
    }

    /**
     * Add a single name operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery name(final String extractAs) {
        this.name = ListUtil.add(new FieldOperation().extractAs(extractAs), this.name);
        return this;
    }

    /**
     * Add a single name operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery name(final Filter filter) {
        this.name = ListUtil.add(new FieldOperation().filter(filter), this.name);
        return this;
    }

    /**
     * Get an iterable object over the names fields.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("name")
    public Iterable<FieldOperation> name() {
        return ListUtil.iterable(this.name);
    }

    /**
     * Return whether any name operations exist.
     *
     * @return True if any name operations exist.
     */
    @JsonIgnore
    public boolean hasName() {
        return ListUtil.hasContent(this.name);
    }

    /**
     * Set the list of value operations. This adds to any operations that already exist.
     *
     * @param value List of {@link FieldOperation} objects.
     */
    @JsonSetter("value")
    private void value(final List<FieldOperation> value) {
        this.value = ListUtil.add(value, this.value);
    }

    /**
     * Add a single value operation.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery value(final FieldOperation fieldOperation) {
        this.value = ListUtil.add(fieldOperation, this.value);
        return this;
    }

    /**
     * Add a single value operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery value(final String extractAs) {
        this.value = ListUtil.add(new FieldOperation().extractAs(extractAs), this.value);
        return this;
    }

    /**
     * Add a single value operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery value(final Filter filter) {
        this.value = ListUtil.add(new FieldOperation().filter(filter), this.value);
        return this;
    }

    /**
     * Get an iterable over the list of name operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("value")
    public Iterable<FieldOperation> value() {
        return ListUtil.iterable(this.value);
    }

    /**
     * Return whether any value operations exist.
     *
     * @return True if any value operations exist.
     */
    @JsonIgnore
    public boolean hasValue() {
        return ListUtil.hasContent(this.value);
    }

    /**
     * Set the list of units operations. This adds to any operations that already exist.
     *
     * @param units List of {@link FieldOperation} objects.
     */
    @JsonSetter("units")
    private void units(final List<FieldOperation> units) {
        this.units = ListUtil.add(units, this.units);
    }

    /**
     * Add a single units operation.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery units(final FieldOperation fieldOperation) {
        this.units = ListUtil.add(fieldOperation, this.units);
        return this;
    }

    /**
     * Add a single units operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery units(final String extractAs) {
        this.units = ListUtil.add(new FieldOperation().extractAs(extractAs), this.units);
        return this;
    }

    /**
     * Add a single units operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery units(final Filter filter) {
        this.units = ListUtil.add(new FieldOperation().filter(filter), this.units);
        return this;
    }

    /**
     * Get the list of units operations.
     *
     * @return Iterator over {@link FieldOperation} objects.
     */
    @JsonGetter("units")
    public Iterable<FieldOperation> units() {
        return ListUtil.iterable(this.units);
    }

    /**
     * Return whether any units operations exists.
     *
     * @return True if any units operations exist.
     */
    @JsonIgnore
    public boolean hasUnits() {
        return ListUtil.hasContent(this.units);
    }

    /**
     * Set the normalization for units.
     *
     * @param unitsNormalization {@link UnitsNormalization} to use.
     * @return This object.
     */
    @JsonSetter("unitsNormalization")
    public ValueQuery unitsNormalization(final UnitsNormalization unitsNormalization) {
        this.unitsNormalization = unitsNormalization;
        return this;
    }

    /**
     * Get the units normalizations.
     *
     * @return {@link UnitsNormalization} object or a null pointer if it has not been set.
     */
    @JsonGetter("unitsNormalization")
    public UnitsNormalization unitsNormalization() {
        return this.unitsNormalization;
    }

    /**
     * Whether unit normalizations are set.
     *
     * @return True if unit normalization has been set.
     */
    @JsonIgnore
    public boolean hasUnitsNormalization() {
        return this.unitsNormalization != null;
    }

    @Override
    @JsonSetter("logic")
    public ValueQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery tags(final FieldOperation fieldOperation) {
        super.tags(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ValueQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** List of name operations. */
    private List<FieldOperation> name;

    /** List of value operations. */
    private List<FieldOperation> value;

    /** List of units operations. */
    private List<FieldOperation> units;

    /** Unit normalization. */
    private UnitsNormalization unitsNormalization;
}