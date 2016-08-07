package io.citrine.jcc.search.pif.query.chemical;

/**
 * Interface for classes that have a list of chemical filters associated with them.
 *
 * @author Kyle Michel
 */
public interface HasChemicalFilter {

    /**
     * Add to the list of nested filters.
     *
     * @param filter {@link ChemicalFilter} object to add.
     * @return This object.
     */
    HasChemicalFilter filter(final ChemicalFilter filter);

    /**
     * Get an iterable over the list of nested filters.
     *
     * @return Iterable of {@link ChemicalFilter} objects.
     */
    Iterable<ChemicalFilter> filter();

    /**
     * Get whether any nested filters have been applied.
     *
     * @return True if there are any filters.
     */
    boolean hasFilter();
}