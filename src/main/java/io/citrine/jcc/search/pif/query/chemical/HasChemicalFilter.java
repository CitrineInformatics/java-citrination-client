package io.citrine.jcc.search.pif.query.chemical;

import java.util.List;

/**
 * Interface for classes that have a list of chemical filters associated with them.
 *
 * @author Kyle Michel
 */
public interface HasChemicalFilter {

    /**
     * Set the list of filters. This overrides any values that are already saved.
     *
     * @param filter List of {@link ChemicalFilter} objects to save.
     * @return This object.
     */
    HasChemicalFilter setFilter(final List<ChemicalFilter> filter);

    /**
     * Add each in a list of filters.
     *
     * @param filter List of {@link ChemicalFilter} objects to save.
     * @return This object.
     */
    HasChemicalFilter addFilter(final List<ChemicalFilter> filter);

    /**
     * Add to the list of nested filter.
     *
     * @param filter {@link ChemicalFilter} object to add.
     * @return This object.
     */
    HasChemicalFilter addFilter(final ChemicalFilter filter);

    /**
     * Get the number of nested filters have been applied.
     *
     * @return Number of filters.
     */
    int filterLength();

    /**
     * Get an iterable over the list of nested filter.
     *
     * @return Iterable of {@link ChemicalFilter} objects.
     */
    Iterable<ChemicalFilter> filter();

    /**
     * Get a single filter.
     *
     * @param index Index of the filter to get.
     * @return Filter at the input index.
     */
    ChemicalFilter getFilter(final int index);

    /**
     * Get the list of filters.
     *
     * @return List of {@link ChemicalFilter} objects or a null pointer if not set.
     */
    List<ChemicalFilter> getFilter();
}