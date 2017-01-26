package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.pif.query.chemical.ChemicalFieldOperation;
import io.citrine.jcc.search.pif.query.chemical.ChemicalFilter;
import io.citrine.jcc.search.pif.query.chemical.CompositionQuery;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class used to match against a system.
 *
 * @author Kyle Michel
 */
public class SystemQuery extends BaseObjectQuery {

    /**
     * Set the list of names operations. This adds to any operations that are already saved.
     *
     * @param names List of {@link FieldOperation} objects.
     */
    @JsonSetter("names")
    private void names(final List<FieldOperation> names) {
        this.names = ListUtil.add(names, this.names);
    }

    /**
     * Add to the list of names operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery names(final FieldOperation fieldOperation) {
        this.names = ListUtil.add(fieldOperation, this.names);
        return this;
    }

    /**
     * Add to the list of names operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery names(final String extractAs) {
        this.names = ListUtil.add(new FieldOperation().extractAs(extractAs), this.names);
        return this;
    }

    /**
     * Add to the list of names operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery names(final Filter filter) {
        this.names = ListUtil.add(new FieldOperation().filter(filter), this.names);
        return this;
    }

    /**
     * Get an iterable over names operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("names")
    public Iterable<FieldOperation> names() {
        return ListUtil.iterable(this.names);
    }

    /**
     * Return whether any names operations exist.
     *
     * @return True if any names operations exist.
     */
    @JsonIgnore
    public boolean hasNames() {
        return ListUtil.hasContent(this.names);
    }

    /**
     * Set the list of ids operations. This adds to any operations that are already saved.
     *
     * @param ids List of {@link IdQuery} objects.
     */
    @JsonSetter("ids")
    private void ids(final List<IdQuery> ids) {
        this.ids = ListUtil.add(ids, this.ids);
    }

    /**
     * Add to the list of ids operations.
     *
     * @param ids {@link IdQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery ids(final IdQuery ids) {
        this.ids = ListUtil.add(ids, this.ids);
        return this;
    }

    /**
     * Get an iterable of ids operations.
     *
     * @return Iterable of {@link IdQuery} objects.
     */
    @JsonGetter("ids")
    public Iterable<IdQuery> ids() {
        return ListUtil.iterable(this.ids);
    }

    /**
     * Get whether an ids queries exist.
     *
     * @return True if any ids queries exist.
     */
    @JsonIgnore
    public boolean hasIds() {
        return ListUtil.hasContent(this.ids);
    }

    /**
     * Set the list of source operations. This adds to any operations that are already saved.
     *
     * @param source List of {@link SourceQuery} objects.
     */
    @JsonSetter("source")
    private void source(final List<SourceQuery> source) {
        this.source = ListUtil.add(source, this.source);
    }

    /**
     * Add to the list of source operations.
     *
     * @param source {@link SourceQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery source(final SourceQuery source) {
        this.source = ListUtil.add(source, this.source);
        return this;
    }

    /**
     * Get an iterable of source operations.
     *
     * @return Iterable of {@link SourceQuery} objects.
     */
    @JsonGetter("source")
    public Iterable<SourceQuery> source() {
        return ListUtil.iterable(this.source);
    }

    /**
     * Get whether an source queries exist.
     *
     * @return True if any source queries exist.
     */
    @JsonIgnore
    public boolean hasSource() {
        return ListUtil.hasContent(this.source);
    }

    /**
     * Set the list of quantity operations. This adds to any operations that are already saved.
     *
     * @param quantity List of {@link QuantityQuery} objects.
     */
    @JsonSetter("quantity")
    private void quantity(final List<QuantityQuery> quantity) {
        this.quantity = ListUtil.add(quantity, this.quantity);
    }

    /**
     * Add to the list of quantity operations.
     *
     * @param quantity {@link QuantityQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery quantity(final QuantityQuery quantity) {
        this.quantity = ListUtil.add(quantity, this.quantity);
        return this;
    }

    /**
     * Get an iterable of quantity operations.
     *
     * @return Iterable of {@link QuantityQuery} objects.
     */
    @JsonGetter("quantity")
    public Iterable<QuantityQuery> quantity() {
        return ListUtil.iterable(this.quantity);
    }

    /**
     * Get whether an quantity queries exist.
     *
     * @return True if any quantity queries exist.
     */
    @JsonIgnore
    public boolean hasQuantity() {
        return ListUtil.hasContent(this.quantity);
    }

    /**
     * Set the list of chemical formula operations. This adds to any operations that are already saved.
     *
     * @param chemicalFormula List of {@link ChemicalFieldOperation} objects.
     */
    @JsonSetter("chemicalFormula")
    private void chemicalFormula(final List<ChemicalFieldOperation> chemicalFormula) {
        this.chemicalFormula = ListUtil.add(chemicalFormula, this.chemicalFormula);
    }

    /**
     * Add to the list of chemical formula operations.
     *
     * @param fieldOperation {@link ChemicalFieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery chemicalFormula(final ChemicalFieldOperation fieldOperation) {
        this.chemicalFormula = ListUtil.add(fieldOperation, this.chemicalFormula);
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
        this.chemicalFormula = ListUtil.add(new ChemicalFieldOperation().extractAs(extractAs), this.chemicalFormula);
        return this;
    }

    /**
     * Add to the list of chemical formula operations.
     *
     * @param filter {@link ChemicalFilter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery chemicalFormula(final ChemicalFilter filter) {
        this.chemicalFormula = ListUtil.add(new ChemicalFieldOperation().filter(filter), this.chemicalFormula);
        return this;
    }

    /**
     * Get an iterable over chemical formula operations.
     *
     * @return Iterable of {@link ChemicalFieldOperation} objects.
     */
    @JsonGetter("chemicalFormula")
    public Iterable<ChemicalFieldOperation> chemicalFormula() {
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
        return ListUtil.iterable(this.composition);
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
     * @param properties List of {@link PropertyQuery} objects.
     */
    @JsonSetter("properties")
    private void properties(final List<PropertyQuery> properties) {
        this.properties = ListUtil.add(properties, this.properties);
    }

    /**
     * Add to the list of properties operations.
     *
     * @param properties {@link PropertyQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public SystemQuery properties(final PropertyQuery properties) {
        this.properties = ListUtil.add(properties, this.properties);
        return this;
    }

    /**
     * Get an iterable of properties operations.
     *
     * @return Iterable of {@link PropertyQuery} objects.
     */
    @JsonGetter("properties")
    public Iterable<PropertyQuery> properties() {
        return ListUtil.iterable(this.properties);
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
        return ListUtil.iterable(this.preparation);
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
        return ListUtil.iterable(this.references);
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
        return ListUtil.iterable(this.subSystems);
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

    @Override
    @JsonSetter("logic")
    public SystemQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonSetter("extractAs")
    public SystemQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public SystemQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public SystemQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public SystemQuery tags(final FieldOperation fieldOperation) {
        super.tags(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public SystemQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public SystemQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public SystemQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public SystemQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public SystemQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public SystemQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public SystemQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public SystemQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** List of names operations. */
    private List<FieldOperation> names;
    
    /** List of id operations. */
    private List<IdQuery> ids;
    
    /** List of source operations. */
    private List<SourceQuery> source;
    
    /** List of quantity operations. */
    private List<QuantityQuery> quantity;
    
    /** List of chemical formula operations. */
    private List<ChemicalFieldOperation> chemicalFormula;

    /** List of composition operations. */
    private List<CompositionQuery> composition;

    /** List of properties operations. */
    private List<PropertyQuery> properties;

    /** List of process step operations. */
    private List<ProcessStepQuery> preparation;

    /** List of references. */
    private List<ReferenceQuery> references;

    /** Subsystems. */
    private List<SystemQuery> subSystems;
}