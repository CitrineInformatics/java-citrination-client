package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Filter that can be applied to any object.
 * 
 * @author Kyle Michel
 */
public class Filter implements HasLogic, HasFilter {

    @Override
    public Filter setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    @Override
    public Filter setFilter(final List<Filter> filter) {
        this.filter = filter;
        return this;
    }

    @Override
    @JsonIgnore
    public Filter addFilter(final List<Filter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    @JsonIgnore
    public Filter addFilter(final Filter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    @JsonIgnore
    public int filterLength() {
        return ListUtil.length(this.filter);
    }

    @Override
    @JsonIgnore
    public Iterable<Filter> filter() {
        return ListUtil.iterable(this.filter);
    }

    @Override
    @JsonIgnore
    public Filter getFilter(final int index) {
        return ListUtil.get(this.filter, index);
    }

    @Override
    public List<Filter> getFilter() {
        return this.filter;
    }

    /**
     * Set whether to check for existence.
     *
     * @param exists True if the field must exist.
     * @return This object.
     */
    public Filter setExists(final Boolean exists) {
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
     * Set the string to match against.
     * 
     * @param equal String to match against.
     * @return This object.
     */
    public Filter setEqual(final String equal) {
        this.equal = equal;
        return this;
    }

    /**
     * Get the string to match against.
     *
     * @return Match string or a null pointer if it has not been set.
     */
    public String getEqual() {
        return this.equal;
    }

    /**
     * Set the minimum value that should match.
     * 
     * @param min Minimum value that should match.
     * @return This object.
     */
    public Filter setMin(final String min) {
        this.min = min;
        return this;
    }

    /**
     * Set the minimum value that should match.
     *
     * @param min Minimum value that should match.
     * @return This object.
     */
    @JsonIgnore
    public Filter setMin(final Integer min) {
        this.min = Integer.toString(min);
        return this;
    }

    /**
     * Set the minimum value that should match.
     *
     * @param min Minimum value that should match.
     * @return This object.
     */
    @JsonIgnore
    public Filter setMin(final Long min) {
        this.min = Long.toString(min);
        return this;
    }

    /**
     * Set the minimum value that should match.
     *
     * @param min Minimum value that should match.
     * @return This object.
     */
    @JsonIgnore
    public Filter setMin(final Float min) {
        this.min = Float.toString(min);
        return this;
    }

    /**
     * Set the minimum value that should match.
     *
     * @param min Minimum value that should match.
     * @return This object.
     */
    @JsonIgnore
    public Filter setMin(final Double min) {
        this.min = Double.toString(min);
        return this;
    }

    /**
     * Get the minimum value that should match.
     *
     * @return String with the minimum value that should match or a null pointer if it has not been set.
     */
    public String getMin() {
        return this.min;
    }

    /**
     * Set the maximum value that should match.
     *
     * @param max Maximum value that should match.
     * @return This object.
     */
    public Filter setMax(final String max) {
        this.max = max;
        return this;
    }

    /**
     * Set the maximum value that should match.
     *
     * @param max Maximum value that should match.
     * @return This object.
     */
    @JsonIgnore
    public Filter setMax(final Integer max) {
        this.max = Integer.toString(max);
        return this;
    }

    /**
     * Set the maximum value that should match.
     *
     * @param max Maximum value that should match.
     * @return This object.
     */
    @JsonIgnore
    public Filter setMax(final Long max) {
        this.max = Long.toString(max);
        return this;
    }

    /**
     * Set the maximum value that should match.
     *
     * @param max Maximum value that should match.
     * @return This object.
     */
    @JsonIgnore
    public Filter setMax(final Float max) {
        this.max = Float.toString(max);
        return this;
    }

    /**
     * Set the maximum value that should match.
     *
     * @param max Maximum value that should match.
     * @return This object.
     */
    @JsonIgnore
    public Filter setMax(final Double max) {
        this.max = Double.toString(max);
        return this;
    }

    /**
     * Get the maximum value that should match.
     *
     * @return String with the maximum value that should match or a null pointer if it as not been set.
     */
    public String getMax() {
        return this.max;
    }

    /**
     * Set whether matches should be exact. This only applies when using the {@link #getEqual()} field.
     * Defaults to false.
     *
     * @param exact True if matches should be exact.
     * @return This object.
     */
    public Filter setExact(final Boolean exact) {
        this.exact = exact;
        return this;
    }

    /**
     * Get whether matches should be exact.
     *
     * @return True if matches should be exact or a null pointer if it has not been set.
     */
    public Boolean getExact() {
        return this.exact;
    }

    /** Logic for applying the filter. */
    private Logic logic;

    /** Just check for existence. */
    private Boolean exists;
    
    /** String to match against. */
    private String equal;
    
    /** Minimum value to match. */
    private String min;
    
    /** Maximum value to match. */
    private String max;

    /** Whether to match exactly. */
    private Boolean exact;

    /** List of sub-filters. */
    private List<Filter> filter;
}