package io.citrine.jcc.search.pif.query;

import io.citrine.jcc.search.core.query.Filter;
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
import java.util.Map;
import java.util.Optional;

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
    public PifSystemQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public PifSystemQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public PifSystemQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
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
    public PifSystemQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
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
    public PifSystemQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
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
    public PifSystemQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public PifSystemQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the list of PIF system UID queries. This replaces any filters that are already present.
     *
     * @param uid List of {@link Filter} objects.
     * @return This object.
     */
    public PifSystemQuery setUid(final List<Filter> uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Add to the list of PIF system UID queries.
     *
     * @param uid List of {@link Filter} objects.
     * @return This object.
     */
    public PifSystemQuery addUid(final List<Filter> uid) {
        this.uid = ListUtil.add(uid, this.uid);
        return this;
    }

    /**
     * Add to the list of PIF system UID queries.
     *
     * @param uid {@link Filter} object to add.
     * @return This object.
     */
    public PifSystemQuery addUid(final Filter uid) {
        this.uid = ListUtil.add(uid, this.uid);
        return this;
    }

    /**
     * Get the number of PIF system UID queries.
     *
     * @return Number of queries against the system UID field.
     */
    public int uidLength() {
        return ListUtil.length(this.uid);
    }

    /**
     * Get an iterable over the PIF system UID queries.
     *
     * @return {@link Iterable} of {@link Filter} objects.
     */
    public Iterable<Filter> uid() {
        return ListUtil.iterable(this.uid);
    }

    /**
     * Get the system UID filter object at the input index.
     *
     * @param index Index of the system UID filter to get.
     * @return {@link Filter} at the input index.
     */
    public Filter getUid(final int index) {
        return ListUtil.get(this.uid, index);
    }

    /**
     * Get the list of PIF system UID queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getUid() {
        return this.uid;
    }

    /**
     * Set the list of updatedAt queries. This replaces any filters that are already present.
     *
     * @param updatedAt List of {@link Filter} objects.
     * @return This object.
     */
    public PifSystemQuery setUpdatedAt(final List<Filter> updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Add to the list of updatedAt queries.
     *
     * @param updatedAt List of {@link Filter} objects.
     * @return This object.
     */
    public PifSystemQuery addUpdatedAt(final List<Filter> updatedAt) {
        this.updatedAt = ListUtil.add(updatedAt, this.updatedAt);
        return this;
    }

    /**
     * Add to the list of updatedAt queries.
     *
     * @param updatedAt {@link Filter} object to add.
     * @return This object.
     */
    public PifSystemQuery addUpdatedAt(final Filter updatedAt) {
        this.updatedAt = ListUtil.add(updatedAt, this.updatedAt);
        return this;
    }

    /**
     * Get the number of updatedAt queries.
     *
     * @return Number of queries against the updatedAt field.
     */
    public int updatedAtLength() {
        return ListUtil.length(this.updatedAt);
    }

    /**
     * Get an iterable over the updatedAt queries.
     *
     * @return {@link Iterable} of {@link Filter} objects.
     */
    public Iterable<Filter> updatedAt() {
        return ListUtil.iterable(this.updatedAt);
    }

    /**
     * Get one in the list of updatedAt queries.
     *
     * @param index Index of the updatedAt query to get.
     * @return {@link Filter} object.
     */
    public Filter getUpdatedAt(final int index) {
        return ListUtil.get(this.updatedAt, index);
    }

    /**
     * Get the list of updatedAt queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getUpdatedAt() {
        return this.updatedAt;
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
    public PifSystemQuery addNames(final FieldQuery names) {
        this.names = ListUtil.add(names, this.names);
        return this;
    }

    /**
     * Get the length of the names queries.
     *
     * @return Number of names queries.
     */
    public int namesLength() {
        return ListUtil.length(this.names);
    }

    /**
     * Get an iterable over names operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> names() {
        return ListUtil.iterable(this.names);
    }

    /**
     * Get the names query at the input index.
     *
     * @param index Index of the names query to get.
     * @return {@link FieldQuery} at the input index.
     */
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
    public PifSystemQuery addIds(final IdQuery ids) {
        this.ids = ListUtil.add(ids, this.ids);
        return this;
    }

    /**
     * Get the length of the ids queries.
     *
     * @return Number of ids queries.
     */
    public int idsLength() {
        return ListUtil.length(this.ids);
    }

    /**
     * Get an iterable over ids operations.
     *
     * @return Iterable of {@link IdQuery} objects.
     */
    public Iterable<IdQuery> ids() {
        return ListUtil.iterable(this.ids);
    }

    /**
     * Get the ids query at the input index.
     *
     * @param index Index of the ids query to get.
     * @return {@link IdQuery} at the input index.
     */
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
    public PifSystemQuery addClassifications(final ClassificationQuery classifications) {
        this.classifications = ListUtil.add(classifications, this.classifications);
        return this;
    }

    /**
     * Get the length of the classifications queries.
     *
     * @return Number of classifications queries.
     */
    public int classificationsLength() {
        return ListUtil.length(this.classifications);
    }

    /**
     * Get an iterable over classifications operations.
     *
     * @return Iterable of {@link ClassificationQuery} objects.
     */
    public Iterable<ClassificationQuery> classifications() {
        return ListUtil.iterable(this.classifications);
    }

    /**
     * Get the classifications query at the input index.
     *
     * @param index Index of the classifications query to get.
     * @return {@link ClassificationQuery} at the input index.
     */
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
    public PifSystemQuery addSource(final SourceQuery source) {
        this.source = ListUtil.add(source, this.source);
        return this;
    }

    /**
     * Get the length of the source queries.
     *
     * @return Number of source queries.
     */
    public int sourceLength() {
        return ListUtil.length(this.source);
    }

    /**
     * Get an iterable over source operations.
     *
     * @return Iterable of {@link SourceQuery} objects.
     */
    public Iterable<SourceQuery> source() {
        return ListUtil.iterable(this.source);
    }

    /**
     * Get the source query at the input index.
     *
     * @param index Index of the source query to get.
     * @return {@link SourceQuery} at the input index.
     */
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
    public PifSystemQuery addQuantity(final QuantityQuery quantity) {
        this.quantity = ListUtil.add(quantity, this.quantity);
        return this;
    }

    /**
     * Get the length of the quantity queries.
     *
     * @return Number of quantity queries.
     */
    public int quantityLength() {
        return ListUtil.length(this.quantity);
    }

    /**
     * Get an iterable over quantity operations.
     *
     * @return Iterable of {@link QuantityQuery} objects.
     */
    public Iterable<QuantityQuery> quantity() {
        return ListUtil.iterable(this.quantity);
    }

    /**
     * Get the quantity query at the input index.
     *
     * @param index Index of the quantity query to get.
     * @return {@link QuantityQuery} at the input index.
     */
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
    public PifSystemQuery addChemicalFormula(final ChemicalFieldQuery chemicalFormula) {
        this.chemicalFormula = ListUtil.add(chemicalFormula, this.chemicalFormula);
        return this;
    }

    /**
     * Get the length of the chemicalFormula queries.
     *
     * @return Number of chemicalFormula queries.
     */
    public int chemicalFormulaLength() {
        return ListUtil.length(this.chemicalFormula);
    }

    /**
     * Get an iterable over chemicalFormula operations.
     *
     * @return Iterable of {@link ChemicalFieldQuery} objects.
     */
    public Iterable<ChemicalFieldQuery> chemicalFormula() {
        return ListUtil.iterable(this.chemicalFormula);
    }

    /**
     * Get the chemicalFormula query at the input index.
     *
     * @param index Index of the chemicalFormula query to get.
     * @return {@link ChemicalFieldQuery} at the input index.
     */
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
    public PifSystemQuery addComposition(final CompositionQuery composition) {
        this.composition = ListUtil.add(composition, this.composition);
        return this;
    }

    /**
     * Get the length of the composition queries.
     *
     * @return Number of composition queries.
     */
    public int compositionLength() {
        return ListUtil.length(this.composition);
    }

    /**
     * Get an iterable over composition operations.
     *
     * @return Iterable of {@link CompositionQuery} objects.
     */
    public Iterable<CompositionQuery> composition() {
        return ListUtil.iterable(this.composition);
    }

    /**
     * Get the composition query at the input index.
     *
     * @param index Index of the composition query to get.
     * @return {@link CompositionQuery} at the input index.
     */
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
    public PifSystemQuery addProperties(final PropertyQuery properties) {
        this.properties = ListUtil.add(properties, this.properties);
        return this;
    }

    /**
     * Get the length of the properties queries.
     *
     * @return Number of properties queries.
     */
    public int propertiesLength() {
        return ListUtil.length(this.properties);
    }

    /**
     * Get an iterable over properties operations.
     *
     * @return Iterable of {@link PropertyQuery} objects.
     */
    public Iterable<PropertyQuery> properties() {
        return ListUtil.iterable(this.properties);
    }

    /**
     * Get the properties query at the input index.
     *
     * @param index Index of the properties query to get.
     * @return {@link PropertyQuery} at the input index.
     */
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
    public PifSystemQuery addPreparation(final ProcessStepQuery preparation) {
        this.preparation = ListUtil.add(preparation, this.preparation);
        return this;
    }

    /**
     * Get the length of the preparation queries.
     *
     * @return Number of preparation queries.
     */
    public int preparationLength() {
        return ListUtil.length(this.preparation);
    }

    /**
     * Get an iterable over preparation operations.
     *
     * @return Iterable of {@link ProcessStepQuery} objects.
     */
    public Iterable<ProcessStepQuery> preparation() {
        return ListUtil.iterable(this.preparation);
    }

    /**
     * Get the preparation query at the input index.
     *
     * @param index Index of the preparation query to get.
     * @return {@link ProcessStepQuery} at the input index.
     */
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
    public PifSystemQuery addReferences(final ReferenceQuery references) {
        this.references = ListUtil.add(references, this.references);
        return this;
    }

    /**
     * Get the length of the references queries.
     *
     * @return Number of references queries.
     */
    public int referencesLength() {
        return ListUtil.length(this.references);
    }

    /**
     * Get an iterable over references operations.
     *
     * @return Iterable of {@link ReferenceQuery} objects.
     */
    public Iterable<ReferenceQuery> references() {
        return ListUtil.iterable(this.references);
    }

    /**
     * Get the references query at the input index.
     *
     * @param index Index of the references query to get.
     * @return {@link ReferenceQuery} at the input index.
     */
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
    public PifSystemQuery addSubSystems(final PifSystemQuery subSystems) {
        this.subSystems = ListUtil.add(subSystems, this.subSystems);
        return this;
    }

    /**
     * Get the length of the subSystems queries.
     *
     * @return Number of subSystems queries.
     */
    public int subSystemsLength() {
        return ListUtil.length(this.subSystems);
    }

    /**
     * Get an iterable over subSystems operations.
     *
     * @return Iterable of {@link PifSystemQuery} objects.
     */
    public Iterable<PifSystemQuery> subSystems() {
        return ListUtil.iterable(this.subSystems);
    }

    /**
     * Get the subSystems query at the input index.
     *
     * @param index Index of the subSystems query to get.
     * @return {@link PifSystemQuery} at the input index.
     */
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

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link PifSystemQuery} objects.
     * @return This object.
     */
    public PifSystemQuery setQuery(final List<PifSystemQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link PifSystemQuery} objects.
     * @return This object.
     */
    public PifSystemQuery addQuery(final List<PifSystemQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link PifSystemQuery} object to add.
     * @return This object.
     */
    public PifSystemQuery addQuery(final PifSystemQuery query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Get the number of nested queries.
     *
     * @return Number of nested queries.
     */
    public int queryLength() {
        return ListUtil.length(this.query);
    }

    /**
     * Get an iterable over the nested queries.
     *
     * @return {@link Iterable} of {@link PifSystemQuery} objects.
     */
    public Iterable<PifSystemQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link PifSystemQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link PifSystemQuery} at the input index.
     */
    public PifSystemQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link PifSystemQuery} objects.
     */
    public List<PifSystemQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof PifSystemQuery)) {
            return false;
        }
        final PifSystemQuery rhsQuery = (PifSystemQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.uid).equals(Optional.ofNullable(rhsQuery.uid))
                && Optional.ofNullable(this.updatedAt).equals(Optional.ofNullable(rhsQuery.updatedAt))
                && Optional.ofNullable(this.names).equals(Optional.ofNullable(rhsQuery.names))
                && Optional.ofNullable(this.ids).equals(Optional.ofNullable(rhsQuery.ids))
                && Optional.ofNullable(this.classifications).equals(Optional.ofNullable(rhsQuery.classifications))
                && Optional.ofNullable(this.source).equals(Optional.ofNullable(rhsQuery.source))
                && Optional.ofNullable(this.quantity).equals(Optional.ofNullable(rhsQuery.quantity))
                && Optional.ofNullable(this.chemicalFormula).equals(Optional.ofNullable(rhsQuery.chemicalFormula))
                && Optional.ofNullable(this.composition).equals(Optional.ofNullable(rhsQuery.composition))
                && Optional.ofNullable(this.properties).equals(Optional.ofNullable(rhsQuery.properties))
                && Optional.ofNullable(this.preparation).equals(Optional.ofNullable(rhsQuery.preparation))
                && Optional.ofNullable(this.references).equals(Optional.ofNullable(rhsQuery.references))
                && Optional.ofNullable(this.subSystems).equals(Optional.ofNullable(rhsQuery.subSystems))
                && Optional.ofNullable(this.query).equals(Optional.ofNullable(rhsQuery.query));
    }

    /** List of filters against the PIF system UID. */
    private List<Filter> uid;
    
    /** List of filters against the last update time. */
    private List<Filter> updatedAt;

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
    
    /** Nested list of queries. */
    private List<PifSystemQuery> query;
}