package io.citrine.jcc.search.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Sorting information.
 *
 * @author Kyle Michel
 */
public enum Sort {

    /** Sort in ascending order. */
    ASCENDING,

    /** Sort in descending order. */
    DESCENDING;

    /**
     * Get a {@link Sort} object by its name.
     *
     * @param sort String with the name of the sort type.
     * @return {@link Sort} object or a null pointer if the input name is not valid.
     */
    @JsonCreator
    public static Sort get(final String sort) {
        return NAME_TO_SORT_MAP.get(normalizeName(sort));
    }

    @Override
    @JsonValue
    public String toString() {
        return this.name();
    }

    /**
     * Normalize an input string for lookup.
     *
     * @param sort String with the name of the sort type.
     * @return Normalized version of the input string.
     */
    private static String normalizeName(final String sort) {
        return (sort == null) ? null : sort.toLowerCase();
    }

    /** Map of sort names to values. */
    private static final Map<String, Sort> NAME_TO_SORT_MAP = buildNameToSortMap();

    /**
     * Build the map of sort names to values.
     *
     * @return Map of the names of sort types to their values.
     */
    private static Map<String, Sort> buildNameToSortMap() {
        final Map<String, Sort> res = new HashMap<>(Sort.values().length);
        for (Sort i : Sort.values()) {
            res.put(normalizeName(i.name()), i);
        }
        return Collections.unmodifiableMap(res);
    }
}