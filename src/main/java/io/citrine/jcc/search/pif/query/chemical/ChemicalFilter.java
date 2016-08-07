package io.citrine.jcc.search.pif.query.chemical;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.HasLogic;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Filter that can be applied to any object.
 * 
 * @author Kyle Michel
 */
public class ChemicalFilter implements HasLogic, HasChemicalFilter {

    @Override
    @JsonSetter("logic")
    public ChemicalFilter logic(final Logic logic) {
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
    public ChemicalFilter equal(final String equal) {
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
     * Set whether to match against the single element field. Defaults to false.
     *
     * @param element True to match against the single element field.
     * @return This object.
     */
    @JsonSetter("element")
    public ChemicalFilter element(final Boolean element) {
        this.element = element;
        return this;
    }

    /**
     * Get whether to match against the single element field.
     *
     * @return True to match against single element field or a null pointer if it has not been set.
     */
    @JsonGetter("element")
    public Boolean element() {
        return this.element;
    }

    /**
     * Set whether to match against the partial formula field. Defaults to false.
     *
     * @param partial True to match against the partial formula field.
     * @return This object.
     */
    @JsonSetter("partial")
    public ChemicalFilter partial(final Boolean partial) {
        this.partial = partial;
        return this;
    }

    /**
     * Get whether to match against the partial formula field.
     *
     * @return True to match against the partial formula field or a null pointer if it has not been set.
     */
    @JsonGetter("partial")
    public Boolean partial() {
        return this.partial;
    }

    /**
     * Set whether matches should be exact. This only applies when using the {@link #equal()} field. Defaults to false.
     *
     * @param exact True if matches should be exact.
     * @return This object.
     */
    @JsonSetter("exact")
    public ChemicalFilter exact(final Boolean exact) {
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
     * @param filter List of {@link ChemicalFilter} objects.
     */
    @JsonSetter("filter")
    private void filter(final List<ChemicalFilter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
    }

    @Override
    @JsonIgnore
    public ChemicalFilter filter(final ChemicalFilter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    @JsonGetter("filter")
    public Iterable<ChemicalFilter> filter() {
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

    /** Whether to match elements. */
    private Boolean element;

    /** Whether to match partial fields. */
    private Boolean partial;

    /** Whether to match exactly. */
    private Boolean exact;

    /** List of sub-filters. */
    private List<ChemicalFilter> filter;
}