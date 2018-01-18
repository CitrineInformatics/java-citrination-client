package io.citrine.jcc.search.core.query;

import java.util.List;

/**
 * Interface for classes that have a list of boolean filters associated with them.
 *
 * @author Kyle Michel
 */
public interface HasBooleanFilter {

    /**
     * Set the list of filters. This overrides any values that are already saved.
     *
     * @param filter List of {@link BooleanFilter} objects to save.
     * @return This object.
     */
    HasBooleanFilter setFilter(final List<BooleanFilter> filter);

    /**
     * Add each in a list of filters.
     *
     * @param filter List of {@link BooleanFilter} objects to save.
     * @return This object.
     */
    HasBooleanFilter addFilter(final List<BooleanFilter> filter);

    /**
     * Add to the list of nested filter.
     *
     * @param filter {@link BooleanFilter} object to add.
     * @return This object.
     */
    HasBooleanFilter addFilter(final BooleanFilter filter);

    /**
     * Get the number of nested filters have been applied.
     *
     * @return Number of filters.
     */
    int filterLength();

    /**
     * Get an iterable over the list of nested filter.
     *
     * @return Iterable of {@link BooleanFilter} objects.
     */
    Iterable<BooleanFilter> filter();

    /**
     * Get a single filter.
     *
     * @param index Index of the filter to get.
     * @return Filter at the input index.
     */
    BooleanFilter getFilter(final int index);

    /**
     * Get the list of filters.
     *
     * @return List of {@link BooleanFilter} objects or a null pointer if not set.
     */
    List<BooleanFilter> getFilter();
}