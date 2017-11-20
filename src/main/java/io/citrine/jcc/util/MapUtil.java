package io.citrine.jcc.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility methods for working with maps.
 *
 * @author Kyle Michel
 */
public class MapUtil {

    /**
     * If the input key is non-null then add it to the map, otherwise do nothing. If the map is null and the key is
     * being added, then create a new map.
     *
     * @param key Key of the value to add.
     * @param value Value to add.
     * @param map Map to add to.
     * @param <T> Type of the key.
     * @param <U> Type of the value.
     * @return The input map if it was not null. Otherwise a new map with the input value.
     */
    public static <T, U> Map<T, U> add(final T key, final U value, Map<T, U> map) {
        if (key == null) {
            return map;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(key, value);
        return map;
    }

    /**
     * If the input map is non-null then add all entries to the output map, otherwise do nothing. If the output map
     * is null and values are being added, then create a new map.
     *
     * @param values Map of values to add.
     * @param map Map to add to.
     * @param <T> Type of the key.
     * @param <U> Type of the value.
     * @return The input map if it was not null. Otherwise a new map with the input value.
     */
    public static <T, U> Map<T, U> add(final Map<T, U> values, Map<T, U> map) {
        if (values == null) {
            return map;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.putAll(values);
        return map;
    }

    // Make sure that objects of this class cannot be instantiated
    private MapUtil() {}
}