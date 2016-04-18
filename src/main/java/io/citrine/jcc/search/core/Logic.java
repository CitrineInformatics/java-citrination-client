package io.citrine.jcc.search.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Logic for a query.
 *
 * @author Kyle Michel
 */
public enum Logic {

    /** Must always match. Similar to an AND query. */
    MUST,

    /** Should match. Similar to an OR query in that at least one value marked SHOULD must match. */
    SHOULD,

    /**
     * Optional to match. This has the effect of marking all {@link #SHOULD} queries as satisfied.
     */
    OPTIONAL,

    /** Can never match. */
    MUST_NOT;

    /**
     * Get a {@link Logic} object by its name.
     *
     * @param logic String with the name of the logic type.
     * @return {@link Logic} object or a null pointer if the input name is not valid.
     */
    @JsonCreator
    public static Logic get(final String logic) {
        return NAME_TO_LOGIC_MAP.get(normalizeName(logic));
    }

    @Override
    @JsonValue
    public String toString() {
        return this.name();
    }

    /**
     * Normalize an input string for lookup.
     *
     * @param logic String with the name of the logic type.
     * @return Normalized version of the input string.
     */
    private static String normalizeName(final String logic) {
        return (logic == null) ? null : logic.toLowerCase();
    }

    /** Map of names to objects. */
    private static final Map<String, Logic> NAME_TO_LOGIC_MAP = buildNameToLogicMap();

    /**
     * Create the map of logic names to objects.
     *
     * @return Map of logic names to {@link Logic} objects
     */
    private static Map<String, Logic> buildNameToLogicMap() {
        final Map<String, Logic> res = new HashMap<>(Logic.values().length);
        for (Logic i : Logic.values()) {
            res.put(normalizeName(i.name()), i);
        }
        return Collections.unmodifiableMap(res);
    }
}