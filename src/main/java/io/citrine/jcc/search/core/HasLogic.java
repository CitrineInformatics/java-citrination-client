package io.citrine.jcc.search.core;

/**
 * Interface for classes that have boolean logic associated with them.
 *
 * @author Kyle Michel
 */
public interface HasLogic {

    /**
     * Set the logic of the operation.
     *
     * @param logic {@link Logic} to apply.
     * @return This object.
     */
    HasLogic logic(final Logic logic);

    /**
     * Get the logic of the operation.
     *
     * @return {@link Logic} object or a null pointer if one has not been set.
     */
    Logic logic();
}