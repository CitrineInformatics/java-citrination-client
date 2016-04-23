package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.HasLogic;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class for querying against a single value.
 * 
 * @author Kyle Michel
 */
public class ValueQuery implements HasLogic {

    @Override
    @JsonSetter("logic")
    public ValueQuery logic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    @JsonGetter("logic")
    public Logic logic() {
        return this.logic;
    }

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
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery name(final FilterGroup filterGroup) {
        this.name = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.name);
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
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery value(final FilterGroup filterGroup) {
        this.value = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.value);
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
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery units(final FilterGroup filterGroup) {
        this.units = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.units);
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
     * Set the length operations. This adds to any operations that are already saved.
     *
     * @param length List of {@link FieldOperation} objects.
     */
    @JsonSetter("length")
    private void length(final List<FieldOperation> length) {
        this.length = ListUtil.add(length, this.length);
    }

    /**
     * Add to the list of length operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery length(final FieldOperation fieldOperation) {
        this.length = ListUtil.add(fieldOperation, this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery length(final String extractAs) {
        this.length = ListUtil.add(new FieldOperation().extractAs(extractAs), this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery length(final FilterGroup filterGroup) {
        this.length = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.length);
        return this;
    }

    /**
     * Get an iterable over length operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("length")
    public Iterable<FieldOperation> length() {
        return ListUtil.iterable(this.length);
    }

    /**
     * Return whether any length operations exist.
     *
     * @return True if any length operations exist.
     */
    @JsonIgnore
    public boolean hasLength() {
        return ListUtil.hasContent(this.length);
    }

    /**
     * Set the offset operations. This adds to any operations that are already saved.
     *
     * @param offset List of {@link FieldOperation} objects.
     */
    @JsonSetter("offset")
    private void offset(final List<FieldOperation> offset) {
        this.offset = ListUtil.add(offset, this.offset);
    }

    /**
     * Add to the list of offset operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery offset(final FieldOperation fieldOperation) {
        this.offset = ListUtil.add(fieldOperation, this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery offset(final String extractAs) {
        this.offset = ListUtil.add(new FieldOperation().extractAs(extractAs), this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ValueQuery offset(final FilterGroup filterGroup) {
        this.offset = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.offset);
        return this;
    }

    /**
     * Get an iterable over offset operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("offset")
    public Iterable<FieldOperation> offset() {
        return ListUtil.iterable(this.offset);
    }

    /**
     * Return whether any offset operations exist.
     *
     * @return True if any offset operations exist.
     */
    @JsonIgnore
    public boolean hasOffset() {
        return ListUtil.hasContent(this.offset);
    }

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** List of name operations. */
    private List<FieldOperation> name;

    /** List of value operations. */
    private List<FieldOperation> value;

    /** List of units operations. */
    private List<FieldOperation> units;

    /** Length of the array that this object appears in. */
    private List<FieldOperation> length;

    /** Offset of this object in the array that it appears in. */
    private List<FieldOperation> offset;
}