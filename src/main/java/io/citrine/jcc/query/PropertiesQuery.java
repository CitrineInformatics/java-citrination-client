package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class used to match against a property.
 *
 * @author Kyle Michel
 */
public class PropertiesQuery {

    /**
     * Set the list of name operations. This adds to any operations that already exist.
     *
     * @param name List of {@link FieldOperation} objects.
     * @return This object.
     */
    @JsonSetter("name")
    private PropertiesQuery name(final List<FieldOperation> name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Add a single name operation.
     *
     * @param name {@link FieldOperation} object.
     * @return This object.
     */
    @JsonIgnore
    public PropertiesQuery name(final FieldOperation name) {
        this.name = ListUtil.add(name, this.name);
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
     * @return This object.
     */
    @JsonSetter("value")
    private PropertiesQuery value(final List<FieldOperation> value) {
        this.value = ListUtil.add(value, this.value);
        return this;
    }

    /**
     * Add a single value operation.
     *
     * @param value {@link FieldOperation} object.
     * @return This object.
     */
    @JsonIgnore
    public PropertiesQuery value(final FieldOperation value) {
        this.value = ListUtil.add(value, this.value);
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
     * @return This object.
     */
    @JsonSetter("units")
    private PropertiesQuery units(final List<FieldOperation> units) {
        this.units = ListUtil.add(units, this.units);
        return this;
    }

    /**
     * Add a single units operation.
     *
     * @param units {@link FieldOperation} object.
     * @return This object.
     */
    @JsonIgnore
    public PropertiesQuery units(final FieldOperation units) {
        this.units = ListUtil.add(units, this.units);
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

    /** List of name operations. */
    private List<FieldOperation> name;

    /** List of value operations. */
    private List<FieldOperation> value;

    /** List of units operations. */
    private List<FieldOperation> units;
}