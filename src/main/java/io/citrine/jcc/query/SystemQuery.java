package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

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
    public SystemQuery chemicalFormula(final List<FieldOperation> chemicalFormula) {
        if (chemicalFormula != null) {
            this.chemicalFormula.addAll(chemicalFormula);
        }
        return this;
    }

    /**
     * Add to the list of chemical formula operations.
     *
     * @param chemicalFormula {@link FieldOperation} object to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery chemicalFormula(final FieldOperation chemicalFormula) {
        if (chemicalFormula != null) {
            this.chemicalFormula.add(chemicalFormula);
        }
        return this;
    }

    /**
     * Get the list of chemical formula operations.
     *
     * @return List of {@link FieldOperation} objects.
     */
    @JsonGetter("chemicalFormula")
    public List<FieldOperation> chemicalFormula() {
        return this.chemicalFormula;
    }

    /**
     * Set the list of properties operations. This adds to any operations that are already saved.
     *
     * @param properties List of {@link PropertiesQuery} objects.
     * @return This object.
     */
    @JsonSetter("properties")
    public SystemQuery properties(final List<PropertiesQuery> properties) {
        if (properties != null) {
            this.properties.addAll(properties);
        }
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
        if (properties != null) {
            this.properties.add(properties);
        }
        return this;
    }

    /**
     * Get the list of properties operations.
     *
     * @return List of {@link PropertiesQuery} objects.
     */
    @JsonGetter("properties")
    public List<PropertiesQuery> properties() {
        return this.properties;
    }

    /** List of chemical formula operations. */
    private List<FieldOperation> chemicalFormula = new ArrayList<>();

    /** List of properties operations. */
    private List<PropertiesQuery> properties = new ArrayList<>();

/*
    conditions
    method
    datatype
    references
    contacts
    licenses*/
}