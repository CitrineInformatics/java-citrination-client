package io.citrine.jcc.search.core.query;

/**
 * Interface that defines that an object can be converted to a {@link BasicFieldQuery} object.
 *
 * @author Kyle Michel
 */
public interface ConvertsToBasicFieldQuery {

    /**
     * Convert this object to a {@link BasicFieldQuery} object.
     *
     * @return This object as a {@link BasicFieldQuery} object.
     */
    BasicFieldQuery toBasicFieldQuery();
}