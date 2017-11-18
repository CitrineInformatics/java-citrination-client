package io.citrine.jcc.search.core.query;

import java.util.Map;

/**
 * Interface for classes that have simple queries and weights for those queries.
 *
 * @author Kyle Michel
 */
public interface HasSimple {

    /**
     * Set the query to run against all fields.
     *
     * @param simple String with the query to run against all fields.
     * @return This object.
     */
    HasSimple setSimple(final String simple);

    /**
     * Get the query to run against all fields.
     *
     * @return String with the query to run against all fields.
     */
    String getSimple();

    /**
     * Set the map of relative field paths to their weights for simple queries.
     *
     * @param simpleWeight Map of field paths to weights.
     * @return This object.
     */
    HasSimple setSimpleWeight(final Map<String, Double> simpleWeight);

    /**
     * Add a single weight to simple queries.
     *
     * @param field Name of the field.
     * @param weight Weight for the query on the field.
     * @return This object.
     */
    HasSimple addSimpleWeight(final String field, final Double weight);

    /**
     * Add all in a map of weights for simple queries.
     *
     * @param simpleWeight Map of field names to weights.
     * @return This object.
     */
    HasSimple addSimpleWeight(final Map<String, Double> simpleWeight);

    /**
     * Get the map of relative field paths to their weights for simple queries.
     *
     * @return Map of field paths to weights.
     */
    Map<String, Double> getSimpleWeight();
}