package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Filter that can be applied to any object.
 * 
 * @author Kyle Michel
 */
public class Filter implements HasLogic, HasFilter {

    @Override
    @JsonSetter("logic")
    public Filter logic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    @JsonGetter("logic")
    public Logic logic() {
        return this.logic;
    }

    /**
     * Set the string to match against.
     * 
     * @param equal String to match against.
     * @return This object.
     */
    @JsonSetter("equal")
    public Filter equal(final String equal) {
        this.equal = equal;
        return this;
    }

    /**
     * Get the string to match against.
     *
     * @return Match string or a null pointer if it has not been set.
     */
    @JsonGetter("equal")
    public String equal() {
        return this.equal;
    }

    /**
     * Set the minimum value that should match.
     * 
     * @param min Minimum value that should match.
     * @return This object.
     */
    @JsonSetter("min")
    public Filter min(final String min) {
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
    public Filter min(final Integer min) {
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
    public Filter min(final Long min) {
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
    public Filter min(final Float min) {
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
    public Filter min(final Double min) {
        this.min = Double.toString(min);
        return this;
    }

    /**
     * Get the minimum value that should match.
     *
     * @return String with the minimum value that should match or a null pointer if it has not been set.
     */
    @JsonGetter("min")
    public String min() {
        return this.min;
    }

    /**
     * Set the maximum value that should match.
     *
     * @param max Maximum value that should match.
     * @return This object.
     */
    @JsonSetter("max")
    public Filter max(final String max) {
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
    public Filter max(final Integer max) {
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
    public Filter max(final Long max) {
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
    public Filter max(final Float max) {
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
    public Filter max(final Double max) {
        this.max = Double.toString(max);
        return this;
    }

    /**
     * Get the maximum value that should match.
     *
     * @return String with the maximum value that should match or a null pointer if it as not been set.
     */
    @JsonGetter("max")
    public String max() {
        return this.max;
    }

    /**
     * Set whether matches should be exact. This only applies when using the {@link #equal()} field. Defaults to false.
     *
     * @param exact True if matches should be exact.
     * @return This object.
     */
    @JsonSetter("exact")
    public Filter exact(final Boolean exact) {
        this.exact = exact;
        return this;
    }

    /**
     * Get whether matches should be exact.
     *
     * @return True if matches should be exact or a null pointer if it has not been set.
     */
    @JsonGetter("exact")
    public Boolean exact() {
        return this.exact;
    }

    /**
     * Set the nested list of filters that apply to the field.
     *
     * @param filter List of {@link Filter} objects.
     * @return This object.
     */
    @JsonSetter("filter")
    private Filter filter(final List<Filter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    @JsonIgnore
    public Filter filter(final Filter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    @JsonGetter("filter")
    public Iterable<Filter> filter() {
        return ListUtil.iterable(this.filter);
    }

    @Override
    @JsonIgnore
    public boolean hasFilter() {
        return ListUtil.hasContent(this.filter);
    }

    /** Logic for applying the filters. */
    private Logic logic;
    
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