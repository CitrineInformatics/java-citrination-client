package io.citrine.jcc.search.analysis.query;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Mode used to determine type of search, ie exact vs exactish.
 *
 * @author Kevin Williams
 */
public enum MatchType {

    /** This mode converts text to ASCII first.  (Default) */
    Exactish,

    /** This mode compares text as-is. */
    Exact;

    /**
     * Get a {@link MatchType} object by its name.
     *
     * @param matchType String with the name of the match type.
     * @return {@link MatchType} object or a null pointer if the input name is not valid.
     */
    @JsonCreator
    public static MatchType get(final String matchType) {
        return NAME_TO_MATCH_TYPE_MAP.get(normalizeName(matchType));
    }

    @Override
    @JsonValue
    public String toString() {
        return this.name();
    }

    /**
     * Normalize an input string for lookup.
     *
     * @param matchType String with the name of the traversal mode type.
     * @return Normalized version of the input string.
     */
    private static String normalizeName(final String matchType) {
        return (matchType == null) ? null : matchType.toLowerCase();
    }

    /** Map of names to objects. */
    private static final Map<String, MatchType> NAME_TO_MATCH_TYPE_MAP = buildNameToMatchTypeMap();

    /**
     * Create the map of traversal mode names to objects.
     *
     * @return Map of traversal mode names to {@link TraversalMode} objects
     */
    private static Map<String, MatchType> buildNameToMatchTypeMap() {
        final Map<String, MatchType> res = new HashMap<>(MatchType.values().length);
        for (MatchType i : MatchType.values()) {
            res.put(normalizeName(i.name()), i);
        }
        return Collections.unmodifiableMap(res);
    }
}