package io.citrine.jcc.search.core.query;

/**
 * Interface for classes that have scoring weights associated with them.
 *
 * @author Kyle Michel
 */
public interface HasWeight {

    /**
     * Set the weight of the operation.
     *
     * @param weight Weight to apply.
     * @return This object.
     */
    HasWeight setWeight(final Double weight);

    /**
     * Get the weight of the operation.
     *
     * @return Double with the weight or a null pointer if it has not been set.
     */
    Double getWeight();
}