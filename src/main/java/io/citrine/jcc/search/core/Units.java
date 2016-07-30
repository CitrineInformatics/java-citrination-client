package io.citrine.jcc.search.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

/**
 * List of units that are supported in the query language.
 *
 * @author Kyle Michel
 */
public enum Units {

    /** Temperature units of Kelvin. */
    KELVIN,

    /** Temperature units of Celsius. */
    CELSIUS,

    /** Temperature units of Fahrenheit. */
    FAHRENHEIT;

    /**
     * Get the name of the units.
     *
     * @return String with the name of the units.
     */
    @JsonValue
    public String getName() {
        return this.name();
    }

    /**
     * Get a {@link Units} object from a lookup string.
     *
     * @param name String with the name of the units to get.
     * @return {@link Units} object.
     */
    @JsonCreator
    public Units get(final String name) {
        return (name == null)
                ? null
                : NAME_TO_UNITS_MAP.get(normalizeName(name));
    }

    /**
     * Normalize a string to a name.
     *
     * @param name String to normalize.
     * @return Normalized string.
     */
    private static String normalizeName(final String name) {
        return name.trim().toLowerCase();
    }

    /** Map of units names to objects. */
    private static final Map<String, Units> NAME_TO_UNITS_MAP = buildNameToUnitsMap();

    /**
     * Build the map of unit names to objects.
     *
     * @return Map of unit names to objects.
     */
    private static Map<String, Units> buildNameToUnitsMap() {
        final Map<String, Units> res = new HashMap<>(values().length);
        for (Units i : values()) {
            res.put(normalizeName(i.name()), i);
        }
        return res;
    }
}