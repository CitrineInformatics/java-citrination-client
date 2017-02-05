package io.citrine.jcc.search.pif.query.chemical;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.pif.query.core.BaseObjectQuery;
import io.citrine.jcc.search.pif.query.core.FieldQuery;
import io.citrine.jcc.search.pif.query.core.Filter;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query against a composition object.
 *
 * @author Kyle Michel
 */
public class CompositionQuery extends BaseObjectQuery {

    /**
     * Set the list of element operations. This adds to any operations that are already saved.
     *
     * @param element List of {@link ChemicalFieldQuery} objects.
     */
    @JsonSetter("element")
    private void element(final List<ChemicalFieldQuery> element) {
        this.element = ListUtil.add(element, this.element);
    }

    /**
     * Add to the list of element operations.
     *
     * @param fieldQuery {@link ChemicalFieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery element(final ChemicalFieldQuery fieldQuery) {
        this.element = ListUtil.add(fieldQuery, this.element);
        return this;
    }

    /**
     * Add to the list of element operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery element(final String extractAs) {
        this.element = ListUtil.add(new ChemicalFieldQuery().extractAs(extractAs), this.element);
        return this;
    }

    /**
     * Add to the list of element operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery element(final ChemicalFilter filter) {
        this.element = ListUtil.add(new ChemicalFieldQuery().filter(filter), this.element);
        return this;
    }

    /**
     * Get an iterable over element operations.
     *
     * @return Iterable of {@link ChemicalFieldQuery} objects.
     */
    @JsonGetter("element")
    public Iterable<ChemicalFieldQuery> element() {
        return ListUtil.iterable(this.element);
    }

    /**
     * Return whether any element operations exist.
     *
     * @return True if any element operations exist.
     */
    @JsonIgnore
    public boolean hasElement() {
        return ListUtil.hasContent(this.element);
    }

    /**
     * Set the list of actual weight percent operations. This adds to any operations that are already saved.
     *
     * @param actualWeightPercent List of {@link FieldQuery} objects.
     */
    @JsonSetter("actualWeightPercent")
    private void actualWeightPercent(final List<FieldQuery> actualWeightPercent) {
        this.actualWeightPercent = ListUtil.add(actualWeightPercent, this.actualWeightPercent);
    }

    /**
     * Add to the list of actual weight percent operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualWeightPercent(final FieldQuery fieldQuery) {
        this.actualWeightPercent = ListUtil.add(fieldQuery, this.actualAtomicPercent);
        return this;
    }

    /**
     * Add to the list of actual weight percent operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualWeightPercent(final String extractAs) {
        this.actualWeightPercent = ListUtil.add(new FieldQuery().extractAs(extractAs), this.actualWeightPercent);
        return this;
    }

    /**
     * Add to the list of actual weight percent operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualWeightPercent(final Filter filter) {
        this.actualWeightPercent =
                ListUtil.add(new FieldQuery().filter(filter), this.actualWeightPercent);
        return this;
    }

    /**
     * Get an iterable over actual weight percent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("actualWeightPercent")
    public Iterable<FieldQuery> actualWeightPercent() {
        return ListUtil.iterable(this.actualWeightPercent);
    }

    /**
     * Return whether any actual weight percent operations exist.
     *
     * @return True if any actual weight percent operations exist.
     */
    @JsonIgnore
    public boolean hasActualWeightPercent() {
        return ListUtil.hasContent(this.actualWeightPercent);
    }

    /**
     * Set the list of actual atomic percent operations. This adds to any operations that are already saved.
     *
     * @param actualAtomicPercent List of {@link FieldQuery} objects.
     */
    @JsonSetter("actualAtomicPercent")
    private void actualAtomicPercent(final List<FieldQuery> actualAtomicPercent) {
        this.actualAtomicPercent = ListUtil.add(actualAtomicPercent, this.actualAtomicPercent);
    }

    /**
     * Add to the list of actual atomic percent operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualAtomicPercent(final FieldQuery fieldQuery) {
        this.actualAtomicPercent = ListUtil.add(fieldQuery, this.actualAtomicPercent);
        return this;
    }

    /**
     * Add to the list of actual atomic percent operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualAtomicPercent(final String extractAs) {
        this.actualAtomicPercent = ListUtil.add(new FieldQuery().extractAs(extractAs), this.actualAtomicPercent);
        return this;
    }

    /**
     * Add to the list of actual atomic percent operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualAtomicPercent(final Filter filter) {
        this.actualAtomicPercent = ListUtil.add(new FieldQuery().filter(filter), this.actualAtomicPercent);
        return this;
    }

    /**
     * Get an iterable over actual atomic percent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("actualAtomicPercent")
    public Iterable<FieldQuery> actualAtomicPercent() {
        return ListUtil.iterable(this.actualAtomicPercent);
    }

    /**
     * Return whether any actual atomic percent operations exist.
     *
     * @return True if any actual atomic percent operations exist.
     */
    @JsonIgnore
    public boolean hasActualAtomicPercent() {
        return ListUtil.hasContent(this.actualAtomicPercent);
    }

    /**
     * Set the list of ideal weight percent operations. This adds to any operations that are already saved.
     *
     * @param idealWeightPercent List of {@link FieldQuery} objects.
     */
    @JsonSetter("idealWeightPercent")
    private void idealWeightPercent(final List<FieldQuery> idealWeightPercent) {
        this.idealWeightPercent = ListUtil.add(idealWeightPercent, this.idealWeightPercent);
    }

    /**
     * Add to the list of ideal weight percent operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealWeightPercent(final FieldQuery fieldQuery) {
        this.idealWeightPercent = ListUtil.add(fieldQuery, this.idealWeightPercent);
        return this;
    }

    /**
     * Add to the list of ideal weight percent operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealWeightPercent(final String extractAs) {
        this.idealWeightPercent = ListUtil.add(new FieldQuery().extractAs(extractAs), this.idealWeightPercent);
        return this;
    }

    /**
     * Add to the list of ideal weight percent operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealWeightPercent(final Filter filter) {
        this.idealWeightPercent =
                ListUtil.add(new FieldQuery().filter(filter), this.idealWeightPercent);
        return this;
    }

    /**
     * Get an iterable over ideal weight percent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("idealWeightPercent")
    public Iterable<FieldQuery> idealWeightPercent() {
        return ListUtil.iterable(this.idealWeightPercent);
    }

    /**
     * Return whether any ideal weight percent operations exist.
     *
     * @return True if any ideal weight percent operations exist.
     */
    @JsonIgnore
    public boolean hasIdealWeightPercent() {
        return ListUtil.hasContent(this.idealWeightPercent);
    }

    /**
     * Set the list of ideal atomic percent operations. This adds to any operations that are already saved.
     *
     * @param idealAtomicPercent List of {@link FieldQuery} objects.
     */
    @JsonSetter("idealAtomicPercent")
    private void idealAtomicPercent(final List<FieldQuery> idealAtomicPercent) {
        this.idealAtomicPercent = ListUtil.add(idealAtomicPercent, this.idealAtomicPercent);
    }

    /**
     * Add to the list of ideal atomic percent operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealAtomicPercent(final FieldQuery fieldQuery) {
        this.idealAtomicPercent = ListUtil.add(fieldQuery, this.idealAtomicPercent);
        return this;
    }

    /**
     * Add to the list of ideal atomic percent operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealAtomicPercent(final String extractAs) {
        this.idealAtomicPercent = ListUtil.add(new FieldQuery().extractAs(extractAs), this.idealAtomicPercent);
        return this;
    }

    /**
     * Add to the list of ideal atomic percent operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealAtomicPercent(final Filter filter) {
        this.idealAtomicPercent = ListUtil.add(new FieldQuery().filter(filter), this.idealAtomicPercent);
        return this;
    }

    /**
     * Get an iterable over ideal atomic percent operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("idealAtomicPercent")
    public Iterable<FieldQuery> idealAtomicPercent() {
        return ListUtil.iterable(this.idealAtomicPercent);
    }

    /**
     * Return whether any ideal atomic percent operations exist.
     *
     * @return True if any ideal atomic percent operations exist.
     */
    @JsonIgnore
    public boolean hasIdealAtomicPercent() {
        return ListUtil.hasContent(this.idealAtomicPercent);
    }

    @Override
    @JsonSetter("logic")
    public CompositionQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonSetter("extractAs")
    public CompositionQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public CompositionQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public CompositionQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public CompositionQuery tags(final FieldQuery fieldQuery) {
        super.tags(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public CompositionQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public CompositionQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public CompositionQuery length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public CompositionQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public CompositionQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public CompositionQuery offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public CompositionQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public CompositionQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
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
}