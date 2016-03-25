package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used to match against a system.
 *
 * @author Kyle Michel
 */
public class SystemQuery {

    /**
     * Set the list of chemical formula operations. This adds to any operations that are already saved.
     *
     * @param chemicalFormula List of {@link FieldOperation} objects.
     * @return This object.
     */
    @JsonSetter("chemicalFormula")
    private SystemQuery chemicalFormula(final List<FieldOperation> chemicalFormula) {
        this.chemicalFormula = ListUtil.add(chemicalFormula, this.chemicalFormula);
        return this;
    }

    /**
     * Add to the list of chemical formula operations.
     *
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery chemicalFormula(final String extractAs, final FilterGroup filterGroup) {
        this.chemicalFormula = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.chemicalFormula);
        return this;
    }

    /**
     * Add to the list of chemical formula operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery chemicalFormula(final String extractAs) {
        this.chemicalFormula = ListUtil.add(new FieldOperation().extractAs(extractAs), this.chemicalFormula);
        return this;
    }

    /**
     * Add to the list of chemical formula operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery chemicalFormula(final FilterGroup filterGroup) {
        this.chemicalFormula = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.chemicalFormula);
        return this;
    }

    /**
     * Get an iterable over chemical formula operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("chemicalFormula")
    public Iterable<FieldOperation> chemicalFormula() {
        return ListUtil.iterable(this.chemicalFormula);
    }

    /**
     * Return whether any chemical formula operations exist.
     *
     * @return True if any chemical formula operations exist.
     */
    @JsonIgnore
    public boolean hasChemicalFormula() {
        return ListUtil.hasContent(this.chemicalFormula);
    }

    /**
     * Set the list of properties operations. This adds to any operations that are already saved.
     *
     * @param properties List of {@link PropertiesQuery} objects.
     * @return This object.
     */
    @JsonSetter("properties")
    private SystemQuery properties(final List<PropertiesQuery> properties) {
        this.properties = ListUtil.add(properties, this.properties);
        return this;
    }

    /**
     * Add to the list of properties operations.
     *
     * @param properties {@link PropertiesQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery properties(final PropertiesQuery properties) {
        this.properties = ListUtil.add(properties, this.properties);
        return this;
    }

    /**
     * Get an iterable of properties operations.
     *
     * @return Iterable of {@link PropertiesQuery} objects.
     */
    @JsonGetter("properties")
    public Iterable<PropertiesQuery> properties() {
        return this.properties;
    }

    /**
     * Get whether an properties queries exist.
     *
     * @return True if any properties queries exist.
     */
    @JsonIgnore
    public boolean hasProperties() {
        return ListUtil.hasContent(this.properties);
    }

    /** List of chemical formula operations. */
    private List<FieldOperation> chemicalFormula = new ArrayList<>();

    /** List of properties operations. */
    private List<PropertiesQuery> properties = new ArrayList<>();
}