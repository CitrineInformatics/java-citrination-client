package io.citrine.jcc.query;

/**
 * Interface for classes that have a list of filters associated with them.
 *
 * @author Kyle Michel
 */
public interface HasFilter {

    /**
     * Add to the list of nested filters.
     *
     * @param filter {@link Filter} object to add.
     * @return This object.
     */
    HasFilter filter(final Filter filter);

    /**
     * Get an iterable over the list of nested filters.
     *
     * @return Iterable of {@link Filter} objects.
     */
    Iterable<Filter> filter();

    /**
     * Get whether any nested filters have been applied.
     *
     * @return True if there are any filters.
     */
    boolean hasFilter();
}