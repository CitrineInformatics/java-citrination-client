package io.citrine.jcc.search.core.query;

import io.citrine.jcc.util.MapUtil;

import java.util.Map;
import java.util.Optional;

/**
 * Base class for all queries against simple fields.
 *
 * @author Kyle Michel
 */
public abstract class AbstractFieldQuery implements HasLogic, HasWeight, HasSimple {

    @Override
    public AbstractFieldQuery setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    @Override
    public AbstractFieldQuery setWeight(final Double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public AbstractFieldQuery setSimple(final String simple) {
        this.simple = simple;
        return this;
    }

    @Override
    public String getSimple() {
        return this.simple;
    }

    @Override
    public AbstractFieldQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        this.simpleWeight = simpleWeight;
        return this;
    }

    @Override
    public AbstractFieldQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        this.simpleWeight = MapUtil.add(simpleWeight, this.simpleWeight);
        return this;
    }

    @Override
    public AbstractFieldQuery addSimpleWeight(final String field, final Double weight) {
        this.simpleWeight = MapUtil.add(field, weight, this.simpleWeight);
        return this;
    }

    @Override
    public Map<String, Double> getSimpleWeight() {
        return this.simpleWeight;
    }

    /**
     * Set the sort order to use.
     *
     * @param sort {@link SortOrder} to apply to the field.
     * @return This object.
     */
    public AbstractFieldQuery setSort(final SortOrder sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Get the sort order to use.
     *
     * @return {@link SortOrder} to use.
     */
    public SortOrder getSort() {
        return this.sort;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof AbstractFieldQuery)) {
            return false;
        }
        final AbstractFieldQuery rhsQuery = (AbstractFieldQuery) rhs;
        return Optional.ofNullable(this.sort).equals(Optional.ofNullable(rhsQuery.sort))
                && Optional.ofNullable(this.logic).equals(Optional.ofNullable(rhsQuery.logic))
                && Optional.ofNullable(this.weight).equals(Optional.ofNullable(rhsQuery.weight))
                && Optional.ofNullable(this.simple).equals(Optional.ofNullable(rhsQuery.simple))
                && Optional.ofNullable(this.simpleWeight).equals(Optional.ofNullable(rhsQuery.simpleWeight));
    }

    /** The sort order to apply to the field. */
    private SortOrder sort;

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** Weight of the query. */
    private Double weight;

    /** String with the simple search to run against all fields. */
    private String simple;

    /** Map of field names to weights for the simple search string. */
    private Map<String, Double> simpleWeight;
}