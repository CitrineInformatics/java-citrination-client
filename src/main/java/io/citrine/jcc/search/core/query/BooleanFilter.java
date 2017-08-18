package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Filter that can be applied to boolean-valued fields.
 * 
 * @author Kyle Michel
 */
public class BooleanFilter implements HasLogic {

    @Override
    public BooleanFilter setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    /**
     * Set whether to check for existence.
     *
     * @param exist True if the field must exist.
     */
    @JsonSetter
    private void setExist(final Boolean exist) {  // Private since only Jackson should use it
        this.setExists(exist);
    }

    /**
     * Set whether to check for existence.
     *
     * @param exists True if the field must exist.
     * @return This object.
     */
    public BooleanFilter setExists(final Boolean exists) {
        this.exists = exists;
        return this;
    }

    /**
     * Get whether to check for existence.
     *
     * @return True if the field must exist or a null pointer if it has not been set.
     */
    public Boolean getExists() {
        return this.exists;
    }

    /**
     * Set the state to match against.
     * 
     * @param equal Boolean value to match against.
     * @return This object.
     */
    public BooleanFilter setEqual(final Boolean equal) {
        this.equal = equal;
        return this;
    }

    /**
     * Get the boolean value to match against.
     *
     * @return Match state or a null pointer if it has not been set.
     */
    public Boolean getEqual() {
        return this.equal;
    }

    /**
     * Set the list of filters. This overrides any values that are already saved.
     *
     * @param filter List of {@link BooleanFilter} objects to save.
     * @return This object.
     */
    public BooleanFilter setFilter(final List<BooleanFilter> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Add each in a list of filters.
     *
     * @param filter List of {@link BooleanFilter} objects to save.
     * @return This object.
     */
    public BooleanFilter addFilter(final List<BooleanFilter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    /**
     * Add to the list of nested filter.
     *
     * @param filter {@link Filter} object to add.
     * @return This object.
     */
    public BooleanFilter addFilter(final BooleanFilter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    /**
     * Get the number of nested filters have been applied.
     *
     * @return Number of filters.
     */
    public int filterLength() {
        return ListUtil.length(this.filter);
    }

    /**
     * Get an iterable over the list of nested filter.
     *
     * @return Iterable of {@link Filter} objects.
     */
    public Iterable<BooleanFilter> filter() {
        return ListUtil.iterable(this.filter);
    }

    /**
     * Get a single filter.
     *
     * @param index Index of the filter to get.
     * @return Filter at the input index.
     */
    public BooleanFilter getFilter(final int index) {
        return ListUtil.get(this.filter, index);
    }

    /**
     * Get the list of filters.
     *
     * @return List of {@link BooleanFilter} objects or a null pointer if not set.
     */
    public List<BooleanFilter> getFilter() {
        return this.filter;
    }

    /** Logic for applying the filters. */
    private Logic logic;

    /** Just check for existence. */
    private Boolean exists;
    
    /** State to match against. */
    private Boolean equal;

    /** List of sub-filters. */
    private List<BooleanFilter> filter;
}