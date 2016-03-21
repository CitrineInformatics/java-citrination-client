package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;
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
    public PropertiesQuery name(final List<FieldOperation> name) {
        if (name != null) {
            this.name.addAll(name);
        }
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
        if (name != null) {
            this.name.add(name);
        }
        return this;
    }

    /**
     * Get the list of field operations.
     *
     * @return List of {@link FieldOperation} objects.
     */
    @JsonGetter("name")
    public List<FieldOperation> name() {
        return this.name;
    }

    /**
     * Set the list of value operations. This adds to any operations that already exist.
     *
     * @param value List of {@link FieldOperation} objects.
     * @return This object.
     */
    @JsonSetter("value")
    public PropertiesQuery value(final List<FieldOperation> value) {
        if (value != null) {
            this.value.addAll(value);
        }
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
        if (value != null) {
            this.value.add(value);
        }
        return this;
    }

    /**
     * Get the list of name operations.
     *
     * @return List of {@link FieldOperation} objects.
     */
    @JsonGetter("value")
    public List<FieldOperation> value() {
        return this.value;
    }

    /**
     * Set the list of units operations. This adds to any operations that already exist.
     *
     * @param units List of {@link FieldOperation} objects.
     * @return This object.
     */
    @JsonSetter("units")
    public PropertiesQuery units(final List<FieldOperation> units) {
        if (units != null) {
            this.units.addAll(units);
        }
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
        if (units != null) {
            this.units.add(units);
        }
        return this;
    }

    /**
     * Get the list of units operations.
     *
     * @return List of {@link FieldOperation} objects.
     */
    @JsonGetter("units")
    public List<FieldOperation> units() {
        return this.units;
    }

    /** List of name operations. */
    private List<FieldOperation> name = new ArrayList<>();

    /** List of value operations. */
    private List<FieldOperation> value = new ArrayList<>();

    /** List of units operations. */
    private List<FieldOperation> units = new ArrayList<>();
}