package io.citrine.jcc.search.pif.query.chemical;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.pif.query.core.BaseObjectQuery;
import io.citrine.jcc.search.pif.query.core.FieldQuery;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query against a composition object.
 *
 * @author Kyle Michel
 */
public class CompositionQuery extends BaseObjectQuery {

    @Override
    public CompositionQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public CompositionQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public CompositionQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public CompositionQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public CompositionQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public CompositionQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public CompositionQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public CompositionQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public CompositionQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public CompositionQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public CompositionQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public CompositionQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public CompositionQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public CompositionQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the element operations. This adds to any operations that are already saved.
     *
     * @param element List of {@link ChemicalFieldQuery} objects.
     * @return This object.
     */
    public CompositionQuery setElement(final List<ChemicalFieldQuery> element) {
        this.element = element;
        return this;
    }

    /**
     * Add to the list of element operations.
     *
     * @param element {@link ChemicalFieldQuery} to add.
     * @return This object.
     */
    public CompositionQuery addElement(final List<ChemicalFieldQuery> element) {
        this.element = ListUtil.add(element, this.element);
        return this;
    }

    /**
     * Add to the list of element operations.
     *
     * @param element {@link ChemicalFieldQuery} to add.
     * @return This object.
     */
    public CompositionQuery addElement(final ChemicalFieldQuery element) {
        this.element = ListUtil.add(element, this.element);
        return this;
    }

    /**
     * Get the length of the element queries.
     *
     * @return Number of element queries.
     */
    public int elementLength() {
        return ListUtil.length(this.element);
    }

    /**
     * Get an iterable over element operations.
     *
     * @return Iterable of {@link ChemicalFieldQuery} objects.
     */
    public Iterable<ChemicalFieldQuery> element() {
        return ListUtil.iterable(this.element);
    }

    /**
     * Get the element query at the input index.
     *
     * @param index Index of the element query to get.
     * @return {@link ChemicalFieldQuery} at the input index.
     */
    public ChemicalFieldQuery getElement(final int index) {
        return ListUtil.get(this.element, index);
    }

    /**
     * Get the element field queries.
     *
     * @return List of {@link ChemicalFieldQuery} objects.
     */
    public List<ChemicalFieldQuery> getElement() {
        return this.element;
    }

    /**
     * Set the actualWeightPercent operations. This adds to any operations that are already saved.
     *
     * @param actualWeightPercent List of {@link FieldQuery} objects.
     * @return This object.
     */
    public CompositionQuery setActualWeightPercent(final List<FieldQuery> actualWeightPercent) {
        this.actualWeightPercent = actualWeightPercent;
        return this;
    }

    /**
     * Add to the list of actualWeightPercent operations.
     *
     * @param actualWeightPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public CompositionQuery addActualWeightPercent(final List<FieldQuery> actualWeightPercent) {
        this.actualWeightPercent = ListUtil.add(actualWeightPercent, this.actualWeightPercent);
        return this;
    }

    /**
     * Add to the list of actualWeightPercent operations.
     *
     * @param actualWeightPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public CompositionQuery addActualWeightPercent(final FieldQuery actualWeightPercent) {
        this.actualWeightPercent = ListUtil.add(actualWeightPercent, this.actualWeightPercent);
        return this;
    }

    /**
     * Get the length of the actualWeightPercent queries.
     *
     * @return Number of actualWeightPercent queries.
     */
    public int actualWeightPercentLength() {
        return ListUtil.length(this.actualWeightPercent);
    }

    /**
     * Get an iterable over actualWeightPercent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> actualWeightPercent() {
        return ListUtil.iterable(this.actualWeightPercent);
    }

    /**
     * Get the actualWeightPercent query at the input index.
     *
     * @param index Index of the actualWeightPercent query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getActualWeightPercent(final int index) {
        return ListUtil.get(this.actualWeightPercent, index);
    }

    /**
     * Get the actualWeightPercent field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getActualWeightPercent() {
        return this.actualWeightPercent;
    }

    /**
     * Set the actualAtomicPercent operations. This adds to any operations that are already saved.
     *
     * @param actualAtomicPercent List of {@link FieldQuery} objects.
     * @return This object.
     */
    public CompositionQuery setActualAtomicPercent(final List<FieldQuery> actualAtomicPercent) {
        this.actualAtomicPercent = actualAtomicPercent;
        return this;
    }

    /**
     * Add to the list of actualAtomicPercent operations.
     *
     * @param actualAtomicPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public CompositionQuery addActualAtomicPercent(final List<FieldQuery> actualAtomicPercent) {
        this.actualAtomicPercent = ListUtil.add(actualAtomicPercent, this.actualAtomicPercent);
        return this;
    }

    /**
     * Add to the list of actualAtomicPercent operations.
     *
     * @param actualAtomicPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public CompositionQuery addActualAtomicPercent(final FieldQuery actualAtomicPercent) {
        this.actualAtomicPercent = ListUtil.add(actualAtomicPercent, this.actualAtomicPercent);
        return this;
    }

    /**
     * Get the length of the actualAtomicPercent queries.
     *
     * @return Number of actualAtomicPercent queries.
     */
    public int actualAtomicPercentLength() {
        return ListUtil.length(this.actualAtomicPercent);
    }

    /**
     * Get an iterable over actualAtomicPercent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> actualAtomicPercent() {
        return ListUtil.iterable(this.actualAtomicPercent);
    }

    /**
     * Get the actualAtomicPercent query at the input index.
     *
     * @param index Index of the actualAtomicPercent query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getActualAtomicPercent(final int index) {
        return ListUtil.get(this.actualAtomicPercent, index);
    }

    /**
     * Get the actualAtomicPercent field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getActualAtomicPercent() {
        return this.actualAtomicPercent;
    }

    /**
     * Set the idealWeightPercent operations. This adds to any operations that are already saved.
     *
     * @param idealWeightPercent List of {@link FieldQuery} objects.
     * @return This object.
     */
    public CompositionQuery setIdealWeightPercent(final List<FieldQuery> idealWeightPercent) {
        this.idealWeightPercent = idealWeightPercent;
        return this;
    }

    /**
     * Add to the list of idealWeightPercent operations.
     *
     * @param idealWeightPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public CompositionQuery addIdealWeightPercent(final List<FieldQuery> idealWeightPercent) {
        this.idealWeightPercent = ListUtil.add(idealWeightPercent, this.idealWeightPercent);
        return this;
    }

    /**
     * Add to the list of idealWeightPercent operations.
     *
     * @param idealWeightPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public CompositionQuery addIdealWeightPercent(final FieldQuery idealWeightPercent) {
        this.idealWeightPercent = ListUtil.add(idealWeightPercent, this.idealWeightPercent);
        return this;
    }

    /**
     * Get the length of the idealWeightPercent queries.
     *
     * @return Number of idealWeightPercent queries.
     */
    public int idealWeightPercentLength() {
        return ListUtil.length(this.idealWeightPercent);
    }

    /**
     * Get an iterable over idealWeightPercent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> idealWeightPercent() {
        return ListUtil.iterable(this.idealWeightPercent);
    }

    /**
     * Get the idealWeightPercent query at the input index.
     *
     * @param index Index of the idealWeightPercent query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getIdealWeightPercent(final int index) {
        return ListUtil.get(this.idealWeightPercent, index);
    }

    /**
     * Get the idealWeightPercent field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getIdealWeightPercent() {
        return this.idealWeightPercent;
    }

    /**
     * Set the idealAtomicPercent operations. This adds to any operations that are already saved.
     *
     * @param idealAtomicPercent List of {@link FieldQuery} objects.
     * @return This object.
     */
    public CompositionQuery setIdealAtomicPercent(final List<FieldQuery> idealAtomicPercent) {
        this.idealAtomicPercent = idealAtomicPercent;
        return this;
    }

    /**
     * Add to the list of idealAtomicPercent operations.
     *
     * @param idealAtomicPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public CompositionQuery addIdealAtomicPercent(final List<FieldQuery> idealAtomicPercent) {
        this.idealAtomicPercent = ListUtil.add(idealAtomicPercent, this.idealAtomicPercent);
        return this;
    }

    /**
     * Add to the list of idealAtomicPercent operations.
     *
     * @param idealAtomicPercent {@link FieldQuery} to add.
     * @return This object.
     */
    public CompositionQuery addIdealAtomicPercent(final FieldQuery idealAtomicPercent) {
        this.idealAtomicPercent = ListUtil.add(idealAtomicPercent, this.idealAtomicPercent);
        return this;
    }

    /**
     * Get the length of the idealAtomicPercent queries.
     *
     * @return Number of idealAtomicPercent queries.
     */
    public int idealAtomicPercentLength() {
        return ListUtil.length(this.idealAtomicPercent);
    }

    /**
     * Get an iterable over idealAtomicPercent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> idealAtomicPercent() {
        return ListUtil.iterable(this.idealAtomicPercent);
    }

    /**
     * Get the idealAtomicPercent query at the input index.
     *
     * @param index Index of the idealAtomicPercent query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getIdealAtomicPercent(final int index) {
        return ListUtil.get(this.idealAtomicPercent, index);
    }

    /**
     * Get the idealAtomicPercent field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getIdealAtomicPercent() {
        return this.idealAtomicPercent;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link CompositionQuery} objects.
     * @return This object.
     */
    public CompositionQuery setQuery(final List<CompositionQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link CompositionQuery} objects.
     * @return This object.
     */
    public CompositionQuery addQuery(final List<CompositionQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link CompositionQuery} object to add.
     * @return This object.
     */
    public CompositionQuery addQuery(final CompositionQuery query) {
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
     * @return {@link Iterable} of {@link CompositionQuery} objects.
     */
    public Iterable<CompositionQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link CompositionQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link CompositionQuery} at the input index.
     */
    public CompositionQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link CompositionQuery} objects.
     */
    public List<CompositionQuery> getQuery() {
        return this.query;
    }

    /** Element for the composition. */
    private List<ChemicalFieldQuery> element;

    /** Actual weight percent of the element. */
    private List<FieldQuery> actualWeightPercent;

    /** Actual atomic percent of the element. */
    private List<FieldQuery> actualAtomicPercent;

    /** Ideal weight percent of the element. */
    private List<FieldQuery> idealWeightPercent;

    /** Ideal atomic percent of the element. */
    private List<FieldQuery> idealAtomicPercent;
    
    /** Nested list of queries. */
    private List<CompositionQuery> query;
}