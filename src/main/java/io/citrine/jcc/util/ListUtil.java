package io.citrine.jcc.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Utility methods for working with lists.
 *
 * @author Kyle Michel
 */
public abstract class ListUtil {

    /**
     * If the input element is not null, then add it to the list, otherwise do nothing. If the list is null and the
     * element is being added, then create a new one.
     *
     * @param value Value to add to the list.
     * @param list List to add the value to.
     * @param <T> Type of the value to add.
     * @return Either the input list or a newly created one if that list was a null pointer.
     */
    public static <T> List<T> add(final T value, List<T> list) {
        if (value == null) {
            return list;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(value);
        return list;
    }

    /**
     * If the input list is not null, then add all elements that it contains to the output list, otherwise do nothing.
     * If the output list is null and values are being added, then create a new one.
     *
     * @param values Values to add to the list.
     * @param list List to add the value to.
     * @param <T> Type of the values to add.
     * @return Either the input list or a newly created one if that list was a null pointer.
     */
    public static <T> List<T> add(final List<T> values, List<T> list) {
        if (values == null) {
            return list;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        list.addAll(values);
        return list;
    }

    /**
     * Get an iterable over a single object. If the input object is a null pointer, then return an iterable over
     * an empty list.
     *
     * @param obj Object to get an iterable on.
     * @param <T> Type of the object to get the
     */
    public static <T> Iterable<T> singletonIterable(final T obj) {
        return (obj == null) ? Collections.emptyList() : Collections.singletonList(obj);
    }

    /**
     * Return whether the object is not null.
     *
     * @param obj Object to check as a null pointer.
     * @param <T> Type of the input object.
     * @return True if the input object is not a null pointer.
     */
    public static <T> boolean singletonHasContent(final T obj) {
        return !(obj == null);
    }

    /**
     * Get an iterable object from the input list. If the input list is a null pointer, then return an iterable over
     * an empty list.
     *
     * @param list List to iterate over.
     * @param <T> Type of the values in the list.
     * @return {@link Iterable} for the input list or over an empty list.
     */
    public static <T> Iterable<T> iterable(final List<T> list) {
        return (list == null) ? Collections.emptyList() : list;
    }

    /**
     * Return whether the input list has any length.
     *
     * @param list List to check for any elements.
     * @param <T> Type of the values in the list.
     * @return True if the input list has at least one element.
     */
    public static <T> boolean hasContent(final List<T> list) {
        return (list != null) && (list.size() > 0);
    }

    /**
     * Get the length of a list.
     *
     * @return Number of elements in a list.
     */
    public static int length(final List<?> list) {
        return (list == null) ? 0 : list.size();
    }

    // Make sure that objects of this class cannot be instantiated
    private ListUtil() {}
}