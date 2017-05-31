package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.pif.query.chemical.ChemicalFieldQuery;
import io.citrine.jcc.search.pif.query.chemical.CompositionQuery;
import io.citrine.jcc.search.pif.query.core.BaseObjectQuery;
import io.citrine.jcc.search.pif.query.core.ClassificationQuery;
import io.citrine.jcc.search.pif.query.core.FieldQuery;
import io.citrine.jcc.search.pif.query.core.IdQuery;
import io.citrine.jcc.search.pif.query.core.ProcessStepQuery;
import io.citrine.jcc.search.pif.query.core.PropertyQuery;
import io.citrine.jcc.search.pif.query.core.QuantityQuery;
import io.citrine.jcc.search.pif.query.core.ReferenceQuery;
import io.citrine.jcc.search.pif.query.core.SourceQuery;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class used to match against a system.
 *
 * @author Kyle Michel
 */
public class PifSystemQuery extends BaseObjectQuery {

    @Override
    public PifSystemQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public PifSystemQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public PifSystemQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public PifSystemQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public PifSystemQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    @JsonIgnore
    public PifSystemQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    @JsonIgnore
    public PifSystemQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public PifSystemQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    @JsonIgnore
    public PifSystemQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    @JsonIgnore
    public PifSystemQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public PifSystemQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    @JsonIgnore
    public PifSystemQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    @JsonIgnore
    public PifSystemQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the names operations. This adds to any operations that are already saved.
     *
     * @param names List of {@link FieldQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setNames(final List<FieldQuery> names) {
        this.names = names;
        return this;
    }

    /**
     * Add to the list of names operations.
     *
     * @param names {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addNames(final List<FieldQuery> names) {
        this.names = ListUtil.add(names, this.names);
        return this;
    }

    /**
     * Add to the list of names operations.
     *
     * @param names {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addNames(final FieldQuery names) {
        this.names = ListUtil.add(names, this.names);
        return this;
    }

    /**
     * Get the length of the names queries.
     *
     * @return Number of names queries.
     */
    @JsonIgnore
    public int namesLength() {
        return ListUtil.length(this.names);
    }

    /**
     * Get an iterable over names operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonIgnore
    public Iterable<FieldQuery> names() {
        return ListUtil.iterable(this.names);
    }

    /**
     * Get the names query at the input index.
     *
     * @param index Index of the names query to get.
     * @return {@link FieldQuery} at the input index.
     */
    @JsonIgnore
    public FieldQuery getNames(final int index) {
        return ListUtil.get(this.names, index);
    }

    /**
     * Get the names field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getNames() {
        return this.names;
    }

    /**
     * Set the ids operations. This adds to any operations that are already saved.
     *
     * @param ids List of {@link IdQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setIds(final List<IdQuery> ids) {
        this.ids = ids;
        return this;
    }

    /**
     * Add to the list of ids operations.
     *
     * @param ids {@link IdQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addIds(final List<IdQuery> ids) {
        this.ids = ListUtil.add(ids, this.ids);
        return this;
    }

    /**
     * Add to the list of ids operations.
     *
     * @param ids {@link IdQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addIds(final IdQuery ids) {
        this.ids = ListUtil.add(ids, this.ids);
        return this;
    }

    /**
     * Get the length of the ids queries.
     *
     * @return Number of ids queries.
     */
    @JsonIgnore
    public int idsLength() {
        return ListUtil.length(this.ids);
    }

    /**
     * Get an iterable over ids operations.
     *
     * @return Iterable of {@link IdQuery} objects.
     */
    @JsonIgnore
    public Iterable<IdQuery> ids() {
        return ListUtil.iterable(this.ids);
    }

    /**
     * Get the ids query at the input index.
     *
     * @param index Index of the ids query to get.
     * @return {@link IdQuery} at the input index.
     */
    @JsonIgnore
    public IdQuery getIds(final int index) {
        return ListUtil.get(this.ids, index);
    }

    /**
     * Get the ids field queries.
     *
     * @return List of {@link IdQuery} objects.
     */
    public List<IdQuery> getIds() {
        return this.ids;
    }

    /**
     * Set the classifications operations. This adds to any operations that are already saved.
     *
     * @param classifications List of {@link ClassificationQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setClassifications(final List<ClassificationQuery> classifications) {
        this.classifications = classifications;
        return this;
    }

    /**
     * Add to the list of classifications operations.
     *
     * @param classifications {@link ClassificationQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addClassifications(final List<ClassificationQuery> classifications) {
        this.classifications = ListUtil.add(classifications, this.classifications);
        return this;
    }

    /**
     * Add to the list of classifications operations.
     *
     * @param classifications {@link ClassificationQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addClassifications(final ClassificationQuery classifications) {
        this.classifications = ListUtil.add(classifications, this.classifications);
        return this;
    }

    /**
     * Get the length of the classifications queries.
     *
     * @return Number of classifications queries.
     */
    @JsonIgnore
    public int classificationsLength() {
        return ListUtil.length(this.classifications);
    }

    /**
     * Get an iterable over classifications operations.
     *
     * @return Iterable of {@link ClassificationQuery} objects.
     */
    @JsonIgnore
    public Iterable<ClassificationQuery> classifications() {
        return ListUtil.iterable(this.classifications);
    }

    /**
     * Get the classifications query at the input index.
     *
     * @param index Index of the classifications query to get.
     * @return {@link ClassificationQuery} at the input index.
     */
    @JsonIgnore
    public ClassificationQuery getClassifications(final int index) {
        return ListUtil.get(this.classifications, index);
    }

    /**
     * Get the classifications field queries.
     *
     * @return List of {@link ClassificationQuery} objects.
     */
    public List<ClassificationQuery> getClassifications() {
        return this.classifications;
    }

    /**
     * Set the source operations. This adds to any operations that are already saved.
     *
     * @param source List of {@link SourceQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setSource(final List<SourceQuery> source) {
        this.source = source;
        return this;
    }

    /**
     * Add to the list of source operations.
     *
     * @param source {@link SourceQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addSource(final List<SourceQuery> source) {
        this.source = ListUtil.add(source, this.source);
        return this;
    }

    /**
     * Add to the list of source operations.
     *
     * @param source {@link SourceQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addSource(final SourceQuery source) {
        this.source = ListUtil.add(source, this.source);
        return this;
    }

    /**
     * Get the length of the source queries.
     *
     * @return Number of source queries.
     */
    @JsonIgnore
    public int sourceLength() {
        return ListUtil.length(this.source);
    }

    /**
     * Get an iterable over source operations.
     *
     * @return Iterable of {@link SourceQuery} objects.
     */
    @JsonIgnore
    public Iterable<SourceQuery> source() {
        return ListUtil.iterable(this.source);
    }

    /**
     * Get the source query at the input index.
     *
     * @param index Index of the source query to get.
     * @return {@link SourceQuery} at the input index.
     */
    @JsonIgnore
    public SourceQuery getSource(final int index) {
        return ListUtil.get(this.source, index);
    }

    /**
     * Get the source field queries.
     *
     * @return List of {@link SourceQuery} objects.
     */
    public List<SourceQuery> getSource() {
        return this.source;
    }

    /**
     * Set the quantity operations. This adds to any operations that are already saved.
     *
     * @param quantity List of {@link QuantityQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setQuantity(final List<QuantityQuery> quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Add to the list of quantity operations.
     *
     * @param quantity {@link QuantityQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addQuantity(final List<QuantityQuery> quantity) {
        this.quantity = ListUtil.add(quantity, this.quantity);
        return this;
    }

    /**
     * Add to the list of quantity operations.
     *
     * @param quantity {@link QuantityQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addQuantity(final QuantityQuery quantity) {
        this.quantity = ListUtil.add(quantity, this.quantity);
        return this;
    }

    /**
     * Get the length of the quantity queries.
     *
     * @return Number of quantity queries.
     */
    @JsonIgnore
    public int quantityLength() {
        return ListUtil.length(this.quantity);
    }

    /**
     * Get an iterable over quantity operations.
     *
     * @return Iterable of {@link QuantityQuery} objects.
     */
    @JsonIgnore
    public Iterable<QuantityQuery> quantity() {
        return ListUtil.iterable(this.quantity);
    }

    /**
     * Get the quantity query at the input index.
     *
     * @param index Index of the quantity query to get.
     * @return {@link QuantityQuery} at the input index.
     */
    @JsonIgnore
    public QuantityQuery getQuantity(final int index) {
        return ListUtil.get(this.quantity, index);
    }

    /**
     * Get the quantity field queries.
     *
     * @return List of {@link QuantityQuery} objects.
     */
    public List<QuantityQuery> getQuantity() {
        return this.quantity;
    }

    /**
     * Set the chemicalFormula operations. This adds to any operations that are already saved.
     *
     * @param chemicalFormula List of {@link ChemicalFieldQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setChemicalFormula(final List<ChemicalFieldQuery> chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
        return this;
    }

    /**
     * Add to the list of chemicalFormula operations.
     *
     * @param chemicalFormula {@link ChemicalFieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addChemicalFormula(final List<ChemicalFieldQuery> chemicalFormula) {
        this.chemicalFormula = ListUtil.add(chemicalFormula, this.chemicalFormula);
        return this;
    }

    /**
     * Add to the list of chemicalFormula operations.
     *
     * @param chemicalFormula {@link ChemicalFieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addChemicalFormula(final ChemicalFieldQuery chemicalFormula) {
        this.chemicalFormula = ListUtil.add(chemicalFormula, this.chemicalFormula);
        return this;
    }

    /**
     * Get the length of the chemicalFormula queries.
     *
     * @return Number of chemicalFormula queries.
     */
    @JsonIgnore
    public int chemicalFormulaLength() {
        return ListUtil.length(this.chemicalFormula);
    }

    /**
     * Get an iterable over chemicalFormula operations.
     *
     * @return Iterable of {@link ChemicalFieldQuery} objects.
     */
    @JsonIgnore
    public Iterable<ChemicalFieldQuery> chemicalFormula() {
        return ListUtil.iterable(this.chemicalFormula);
    }

    /**
     * Get the chemicalFormula query at the input index.
     *
     * @param index Index of the chemicalFormula query to get.
     * @return {@link ChemicalFieldQuery} at the input index.
     */
    @JsonIgnore
    public ChemicalFieldQuery getChemicalFormula(final int index) {
        return ListUtil.get(this.chemicalFormula, index);
    }

    /**
     * Get the chemicalFormula field queries.
     *
     * @return List of {@link ChemicalFieldQuery} objects.
     */
    public List<ChemicalFieldQuery> getChemicalFormula() {
        return this.chemicalFormula;
    }

    /**
     * Set the composition operations. This adds to any operations that are already saved.
     *
     * @param composition List of {@link CompositionQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setComposition(final List<CompositionQuery> composition) {
        this.composition = composition;
        return this;
    }

    /**
     * Add to the list of composition operations.
     *
     * @param composition {@link CompositionQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addComposition(final List<CompositionQuery> composition) {
        this.composition = ListUtil.add(composition, this.composition);
        return this;
    }

    /**
     * Add to the list of composition operations.
     *
     * @param composition {@link CompositionQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addComposition(final CompositionQuery composition) {
        this.composition = ListUtil.add(composition, this.composition);
        return this;
    }

    /**
     * Get the length of the composition queries.
     *
     * @return Number of composition queries.
     */
    @JsonIgnore
    public int compositionLength() {
        return ListUtil.length(this.composition);
    }

    /**
     * Get an iterable over composition operations.
     *
     * @return Iterable of {@link CompositionQuery} objects.
     */
    @JsonIgnore
    public Iterable<CompositionQuery> composition() {
        return ListUtil.iterable(this.composition);
    }

    /**
     * Get the composition query at the input index.
     *
     * @param index Index of the composition query to get.
     * @return {@link CompositionQuery} at the input index.
     */
    @JsonIgnore
    public CompositionQuery getComposition(final int index) {
        return ListUtil.get(this.composition, index);
    }

    /**
     * Get the composition field queries.
     *
     * @return List of {@link CompositionQuery} objects.
     */
    public List<CompositionQuery> getComposition() {
        return this.composition;
    }

    /**
     * Set the properties operations. This adds to any operations that are already saved.
     *
     * @param properties List of {@link PropertyQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setProperties(final List<PropertyQuery> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Add to the list of properties operations.
     *
     * @param properties {@link PropertyQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addProperties(final List<PropertyQuery> properties) {
        this.properties = ListUtil.add(properties, this.properties);
        return this;
    }

    /**
     * Add to the list of properties operations.
     *
     * @param properties {@link PropertyQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addProperties(final PropertyQuery properties) {
        this.properties = ListUtil.add(properties, this.properties);
        return this;
    }

    /**
     * Get the length of the properties queries.
     *
     * @return Number of properties queries.
     */
    @JsonIgnore
    public int propertiesLength() {
        return ListUtil.length(this.properties);
    }

    /**
     * Get an iterable over properties operations.
     *
     * @return Iterable of {@link PropertyQuery} objects.
     */
    @JsonIgnore
    public Iterable<PropertyQuery> properties() {
        return ListUtil.iterable(this.properties);
    }

    /**
     * Get the properties query at the input index.
     *
     * @param index Index of the properties query to get.
     * @return {@link PropertyQuery} at the input index.
     */
    @JsonIgnore
    public PropertyQuery getProperties(final int index) {
        return ListUtil.get(this.properties, index);
    }

    /**
     * Get the properties field queries.
     *
     * @return List of {@link PropertyQuery} objects.
     */
    public List<PropertyQuery> getProperties() {
        return this.properties;
    }

    /**
     * Set the preparation operations. This adds to any operations that are already saved.
     *
     * @param preparation List of {@link ProcessStepQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setPreparation(final List<ProcessStepQuery> preparation) {
        this.preparation = preparation;
        return this;
    }

    /**
     * Add to the list of preparation operations.
     *
     * @param preparation {@link ProcessStepQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addPreparation(final List<ProcessStepQuery> preparation) {
        this.preparation = ListUtil.add(preparation, this.preparation);
        return this;
    }

    /**
     * Add to the list of preparation operations.
     *
     * @param preparation {@link ProcessStepQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addPreparation(final ProcessStepQuery preparation) {
        this.preparation = ListUtil.add(preparation, this.preparation);
        return this;
    }

    /**
     * Get the length of the preparation queries.
     *
     * @return Number of preparation queries.
     */
    @JsonIgnore
    public int preparationLength() {
        return ListUtil.length(this.preparation);
    }

    /**
     * Get an iterable over preparation operations.
     *
     * @return Iterable of {@link ProcessStepQuery} objects.
     */
    @JsonIgnore
    public Iterable<ProcessStepQuery> preparation() {
        return ListUtil.iterable(this.preparation);
    }

    /**
     * Get the preparation query at the input index.
     *
     * @param index Index of the preparation query to get.
     * @return {@link ProcessStepQuery} at the input index.
     */
    @JsonIgnore
    public ProcessStepQuery getPreparation(final int index) {
        return ListUtil.get(this.preparation, index);
    }

    /**
     * Get the preparation field queries.
     *
     * @return List of {@link ProcessStepQuery} objects.
     */
    public List<ProcessStepQuery> getPreparation() {
        return this.preparation;
    }

    /**
     * Set the references operations. This adds to any operations that are already saved.
     *
     * @param references List of {@link ReferenceQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setReferences(final List<ReferenceQuery> references) {
        this.references = references;
        return this;
    }

    /**
     * Add to the list of references operations.
     *
     * @param references {@link ReferenceQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addReferences(final List<ReferenceQuery> references) {
        this.references = ListUtil.add(references, this.references);
        return this;
    }

    /**
     * Add to the list of references operations.
     *
     * @param references {@link ReferenceQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addReferences(final ReferenceQuery references) {
        this.references = ListUtil.add(references, this.references);
        return this;
    }

    /**
     * Get the length of the references queries.
     *
     * @return Number of references queries.
     */
    @JsonIgnore
    public int referencesLength() {
        return ListUtil.length(this.references);
    }

    /**
     * Get an iterable over references operations.
     *
     * @return Iterable of {@link ReferenceQuery} objects.
     */
    @JsonIgnore
    public Iterable<ReferenceQuery> references() {
        return ListUtil.iterable(this.references);
    }

    /**
     * Get the references query at the input index.
     *
     * @param index Index of the references query to get.
     * @return {@link ReferenceQuery} at the input index.
     */
    @JsonIgnore
    public ReferenceQuery getReferences(final int index) {
        return ListUtil.get(this.references, index);
    }

    /**
     * Get the references field queries.
     *
     * @return List of {@link ReferenceQuery} objects.
     */
    public List<ReferenceQuery> getReferences() {
        return this.references;
    }

    /**
     * Set the subSystems operations. This adds to any operations that are already saved.
     *
     * @param subSystems List of {@link PifSystemQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setSubSystems(final List<PifSystemQuery> subSystems) {
        this.subSystems = subSystems;
        return this;
    }

    /**
     * Add to the list of subSystems operations.
     *
     * @param subSystems {@link PifSystemQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addSubSystems(final List<PifSystemQuery> subSystems) {
        this.subSystems = ListUtil.add(subSystems, this.subSystems);
        return this;
    }

    /**
     * Add to the list of subSystems operations.
     *
     * @param subSystems {@link PifSystemQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PifSystemQuery addSubSystems(final PifSystemQuery subSystems) {
        this.subSystems = ListUtil.add(subSystems, this.subSystems);
        return this;
    }

    /**
     * Get the length of the subSystems queries.
     *
     * @return Number of subSystems queries.
     */
    @JsonIgnore
    public int subSystemsLength() {
        return ListUtil.length(this.subSystems);
    }

    /**
     * Get an iterable over subSystems operations.
     *
     * @return Iterable of {@link PifSystemQuery} objects.
     */
    @JsonIgnore
    public Iterable<PifSystemQuery> subSystems() {
        return ListUtil.iterable(this.subSystems);
    }

    /**
     * Get the subSystems query at the input index.
     *
     * @param index Index of the subSystems query to get.
     * @return {@link PifSystemQuery} at the input index.
     */
    @JsonIgnore
    public PifSystemQuery getSubSystems(final int index) {
        return ListUtil.get(this.subSystems, index);
    }

    /**
     * Get the subSystems field queries.
     *
     * @return List of {@link PifSystemQuery} objects.
     */
    public List<PifSystemQuery> getSubSystems() {
        return this.subSystems;
    }

    /** List of names operations. */
    private List<FieldQuery> names;
    
    /** List of id operations. */
    private List<IdQuery> ids;

    /** List of classification operations. */
    private List<ClassificationQuery> classifications;
    
    /** List of source operations. */
    private List<SourceQuery> source;
    
    /** List of quantity operations. */
    private List<QuantityQuery> quantity;
    
    /** List of chemical formula operations. */
    private List<ChemicalFieldQuery> chemicalFormula;

    /** List of composition operations. */
    private List<CompositionQuery> composition;

    /** List of properties operations. */
    private List<PropertyQuery> properties;

    /** List of process step operations. */
    private List<ProcessStepQuery> preparation;

    /** List of references. */
    private List<ReferenceQuery> references;

    /** Subsystems. */
    private List<PifSystemQuery> subSystems;
}