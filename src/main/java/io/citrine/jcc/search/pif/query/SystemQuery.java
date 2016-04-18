package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.HasLogic;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used to match against a system.
 *
 * @author Kyle Michel
 */
public class SystemQuery implements HasLogic {

    @Override
    @JsonSetter("logic")
    public SystemQuery logic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    @JsonGetter("logic")
    public Logic logic() {
        return this.logic;
    }

    /**
     * Set the list of chemical formula operations. This adds to any operations that are already saved.
     *
     * @param chemicalFormula List of {@link FieldOperation} objects.
     */
    @JsonSetter("chemicalFormula")
    private void chemicalFormula(final List<FieldOperation> chemicalFormula) {
        this.chemicalFormula = ListUtil.add(chemicalFormula, this.chemicalFormula);
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
     * Set the list of composition operations. This adds to any operations that are already saved.
     *
     * @param composition List of {@link CompositionQuery} objects.
     */
    @JsonSetter("composition")
    private void composition(final List<CompositionQuery> composition) {
        this.composition = ListUtil.add(composition, this.composition);
    }

    /**
     * Add to the list of composition operations.
     *
     * @param composition {@link CompositionQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery composition(final CompositionQuery composition) {
        this.composition = ListUtil.add(composition, this.composition);
        return this;
    }

    /**
     * Get an iterable of composition operations.
     *
     * @return Iterable of {@link CompositionQuery} objects.
     */
    @JsonGetter("composition")
    public Iterable<CompositionQuery> composition() {
        return this.composition;
    }

    /**
     * Get whether an composition queries exist.
     *
     * @return True if any composition queries exist.
     */
    @JsonIgnore
    public boolean hasComposition() {
        return ListUtil.hasContent(this.composition);
    }

    /**
     * Set the list of properties operations. This adds to any operations that are already saved.
     *
     * @param properties List of {@link PropertiesQuery} objects.
     */
    @JsonSetter("properties")
    private void properties(final List<PropertiesQuery> properties) {
        this.properties = ListUtil.add(properties, this.properties);
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

    /**
     * Set the list of preparation operations. This adds to any operations that are already saved.
     *
     * @param preparation List of {@link ProcessStepQuery} objects.
     */
    @JsonSetter("preparation")
    private void preparation(final List<ProcessStepQuery> preparation) {
        this.preparation = ListUtil.add(preparation, this.preparation);
    }

    /**
     * Add to the list of preparation operations.
     *
     * @param preparation {@link ProcessStepQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery preparation(final ProcessStepQuery preparation) {
        this.preparation = ListUtil.add(preparation, this.preparation);
        return this;
    }

    /**
     * Get an iterable of preparation operations.
     *
     * @return Iterable of {@link ProcessStepQuery} objects.
     */
    @JsonGetter("preparation")
    public Iterable<ProcessStepQuery> preparation() {
        return this.preparation;
    }

    /**
     * Get whether an preparation queries exist.
     *
     * @return True if any preparation queries exist.
     */
    @JsonIgnore
    public boolean hasPreparation() {
        return ListUtil.hasContent(this.preparation);
    }

    /**
     * Set the list of references operations. This adds to any operations that are already saved.
     *
     * @param references List of {@link ReferenceQuery} objects.
     */
    @JsonSetter("references")
    private void references(final List<ReferenceQuery> references) {
        this.references = ListUtil.add(references, this.references);
    }

    /**
     * Add to the list of references operations.
     *
     * @param references {@link ReferenceQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery references(final ReferenceQuery references) {
        this.references = ListUtil.add(references, this.references);
        return this;
    }

    /**
     * Get an iterable of references operations.
     *
     * @return Iterable of {@link ReferenceQuery} objects.
     */
    @JsonGetter("references")
    public Iterable<ReferenceQuery> references() {
        return this.references;
    }

    /**
     * Get whether an references queries exist.
     *
     * @return True if any references queries exist.
     */
    @JsonIgnore
    public boolean hasReferences() {
        return ListUtil.hasContent(this.references);
    }

    /**
     * Set the list of number of subsystem operations. This adds to any operations that are already saved.
     *
     * @param numSubSystems List of {@link FieldOperation} objects.
     */
    @JsonSetter("numSubSystems")
    private void numSubSystems(final List<FieldOperation> numSubSystems) {
        this.numSubSystems = ListUtil.add(numSubSystems, this.numSubSystems);
    }

    /**
     * Add to the list of number of subsystems operations.
     *
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery numSubSystems(final String extractAs, final FilterGroup filterGroup) {
        this.numSubSystems = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.numSubSystems);
        return this;
    }

    /**
     * Add to the list of number of subsystems operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery numSubSystems(final String extractAs) {
        this.numSubSystems = ListUtil.add(new FieldOperation().extractAs(extractAs), this.numSubSystems);
        return this;
    }

    /**
     * Add to the list of number of subystem operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery numSubSystems(final FilterGroup filterGroup) {
        this.numSubSystems = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.numSubSystems);
        return this;
    }

    /**
     * Get an iterable over number of subsystem operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("numSubSystems")
    public Iterable<FieldOperation> numSubSystems() {
        return ListUtil.iterable(this.numSubSystems);
    }

    /**
     * Return whether any number of subsystem operations exist.
     *
     * @return True if any number of subsystem operations exist.
     */
    @JsonIgnore
    public boolean hasNumSubSystems() {
        return ListUtil.hasContent(this.numSubSystems);
    }

    /**
     * Set the list of subsystem operations. This adds to any operations that are already saved.
     *
     * @param subSystems List of {@link SystemQuery} objects.
     */
    @JsonSetter("subSystems")
    private void subSystems(final List<SystemQuery> subSystems) {
        this.subSystems = ListUtil.add(subSystems, this.subSystems);
    }

    /**
     * Add to the list of subSystems operations.
     *
     * @param subSystems {@link SystemQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery subSystems(final SystemQuery subSystems) {
        this.subSystems = ListUtil.add(subSystems, this.subSystems);
        return this;
    }

    /**
     * Get an iterable of subSystems operations.
     *
     * @return Iterable of {@link SystemQuery} objects.
     */
    @JsonGetter("subSystems")
    public Iterable<SystemQuery> subSystems() {
        return this.subSystems;
    }

    /**
     * Get whether an subSystems queries exist.
     *
     * @return True if any subSystems queries exist.
     */
    @JsonIgnore
    public boolean hasSubSystems() {
        return ListUtil.hasContent(this.subSystems);
    }

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** List of chemical formula operations. */
    private List<FieldOperation> chemicalFormula = new ArrayList<>();

    /** List of composition operations. */
    private List<CompositionQuery> composition = new ArrayList<>();

    /** List of properties operations. */
    private List<PropertiesQuery> properties = new ArrayList<>();

    /** List of process step operations. */
    private List<ProcessStepQuery> preparation = new ArrayList<>();

    /** List of subsystems. */
    private List<FieldOperation> numSubSystems = new ArrayList<>();

    /** List of references. */
    private List<ReferenceQuery> references = new ArrayList<>();

    /** Subsystems. */
    private List<SystemQuery> subSystems = new ArrayList<>();
}