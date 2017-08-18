package io.citrine.jcc.search.core.query;

import java.util.List;

/**
 * Interface for classes that have a list of filters associated with them.
 *
 * @author Kyle Michel
 */
public interface HasFilter {

    /**
     * Set the list of filters. This overrides any values that are already saved.
     *
     * @param filter List of {@link Filter} objects to save.
     * @return This object.
     */
    HasFilter setFilter(final List<Filter> filter);

    /**
     * Add each in a list of filters.
     *
     * @param filter List of {@link Filter} objects to save.
     * @return This object.
     */
    HasFilter addFilter(final List<Filter> filter);

    /**
     * Add to the list of nested filter.
     *
     * @param filter {@link Filter} object to add.
     * @return This object.
     */
    HasFilter addFilter(final Filter filter);

    /**
     * Get the number of nested filters have been applied.
     *
     * @return Number of filters.
     */
    int filterLength();

    /**
     * Get an iterable over the list of nested filter.
     *
     * @return Iterable of {@link Filter} objects.
     */
    Iterable<Filter> filter();

    /**
     * Get a single filter.
     *
     * @param index Index of the filter to get.
     * @return Filter at the input index.
     */
    Filter getFilter(final int index);

    /**
     * Get the list of filters.
     *
     * @return List of {@link Filter} objects or a null pointer if not set.
     */
    List<Filter> getFilter();
}