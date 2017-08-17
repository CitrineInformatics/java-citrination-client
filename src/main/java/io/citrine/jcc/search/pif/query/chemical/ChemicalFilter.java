package io.citrine.jcc.search.pif.query.chemical;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.search.core.query.HasLogic;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * ChemicalFilter that can be applied to any object.
 * 
 * @author Kyle Michel
 */
public class ChemicalFilter implements HasLogic, HasChemicalFilter {

    @Override
    public ChemicalFilter setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    @Override
    public ChemicalFilter setFilter(final List<ChemicalFilter> filter) {
        this.filter = filter;
        return this;
    }

    @Override

    public ChemicalFilter addFilter(final List<ChemicalFilter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override

    public ChemicalFilter addFilter(final ChemicalFilter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override

    public int filterLength() {
        return ListUtil.length(this.filter);
    }

    @Override

    public Iterable<ChemicalFilter> filter() {
        return ListUtil.iterable(this.filter);
    }

    @Override

    public ChemicalFilter getFilter(final int index) {
        return ListUtil.get(this.filter, index);
    }

    @Override
    public List<ChemicalFilter> getFilter() {
        return this.filter;
    }

    /**
     * Set whether to check for existence.
     *
     * @param exists True if the field must exist.
     * @return This object.
     */
    public ChemicalFilter setExists(final Boolean exists) {
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
    public ChemicalFilter setEqual(final String equal) {
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
     * Set whether matches should be an element. Defaults to false.
     *
     * @param element True if matches should be elements.
     * @return This object.
     */
    public ChemicalFilter setElement(final Boolean element) {
        this.element = element;
        return this;
    }

    /**
     * Get whether matches should be elements.
     *
     * @return True if matches should be elements or a null pointer if it has not been set.
     */
    public Boolean getElement() {
        return this.element;
    }

    /**
     * Set whether matches should be partial. Defaults to false.
     *
     * @param partial True if matches should be exact.
     * @return This object.
     */
    public ChemicalFilter setPartial(final Boolean partial) {
        this.partial = partial;
        return this;
    }

    /**
     * Get whether matches should be partial.
     *
     * @return True if matches should be partial or a null pointer if it has not been set.
     */
    public Boolean getPartial() {
        return this.partial;
    }

    /**
     * Set whether matches should be exact. This only applies when using the {@link #getEqual()} field.
     * Defaults to false.
     *
     * @param exact True if matches should be exact.
     * @return This object.
     */
    public ChemicalFilter setExact(final Boolean exact) {
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

    /** Logic for applying the filters. */
    private Logic logic;

    /** Just check for existence. */
    private Boolean exists;
    
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