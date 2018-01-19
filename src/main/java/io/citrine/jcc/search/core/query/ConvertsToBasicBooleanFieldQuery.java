package io.citrine.jcc.search.core.query;

/**
 * Interface that defines that an object can be converted to a {@link BasicBooleanFieldQuery} object.
 *
 * @author Kyle Michel
 */
public interface ConvertsToBasicBooleanFieldQuery {

    /**
     * Convert this object to a {@link BasicBooleanFieldQuery} object.
     *
     * @return This object as a {@link BasicBooleanFieldQuery} object.
     */
    BasicBooleanFieldQuery toBasicBooleanFieldQuery();
}