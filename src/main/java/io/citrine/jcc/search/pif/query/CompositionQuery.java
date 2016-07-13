package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.Logic;
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
     * @param element List of {@link FieldOperation} objects.
     */
    @JsonSetter("element")
    private void element(final List<FieldOperation> element) {
        this.element = ListUtil.add(element, this.element);
    }

    /**
     * Add to the list of element operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery element(final FieldOperation fieldOperation) {
        this.element = ListUtil.add(fieldOperation, this.element);
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
        this.element = ListUtil.add(new FieldOperation().extractAs(extractAs), this.element);
        return this;
    }

    /**
     * Add to the list of element operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery element(final Filter filter) {
        this.element = ListUtil.add(new FieldOperation().filter(filter), this.element);
        return this;
    }

    /**
     * Get an iterable over element operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("element")
    public Iterable<FieldOperation> element() {
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
     * @param actualWeightPercent List of {@link FieldOperation} objects.
     */
    @JsonSetter("actualWeightPercent")
    private void actualWeightPercent(final List<FieldOperation> actualWeightPercent) {
        this.actualWeightPercent = ListUtil.add(actualWeightPercent, this.actualWeightPercent);
    }

    /**
     * Add to the list of actual weight percent operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualWeightPercent(final FieldOperation fieldOperation) {
        this.actualWeightPercent = ListUtil.add(fieldOperation, this.actualAtomicPercent);
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
        this.actualWeightPercent = ListUtil.add(new FieldOperation().extractAs(extractAs), this.actualWeightPercent);
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
                ListUtil.add(new FieldOperation().filter(filter), this.actualWeightPercent);
        return this;
    }

    /**
     * Get an iterable over actual weight percent operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("actualWeightPercent")
    public Iterable<FieldOperation> actualWeightPercent() {
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
     * @param actualAtomicPercent List of {@link FieldOperation} objects.
     */
    @JsonSetter("actualAtomicPercent")
    private void actualAtomicPercent(final List<FieldOperation> actualAtomicPercent) {
        this.actualAtomicPercent = ListUtil.add(actualAtomicPercent, this.actualAtomicPercent);
    }

    /**
     * Add to the list of actual atomic percent operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualAtomicPercent(final FieldOperation fieldOperation) {
        this.actualAtomicPercent = ListUtil.add(fieldOperation, this.actualAtomicPercent);
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
        this.actualAtomicPercent = ListUtil.add(new FieldOperation().extractAs(extractAs), this.actualAtomicPercent);
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
        this.actualAtomicPercent = ListUtil.add(new FieldOperation().filter(filter), this.actualAtomicPercent);
        return this;
    }

    /**
     * Get an iterable over actual atomic percent operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("actualAtomicPercent")
    public Iterable<FieldOperation> actualAtomicPercent() {
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
     * @param idealWeightPercent List of {@link FieldOperation} objects.
     */
    @JsonSetter("idealWeightPercent")
    private void idealWeightPercent(final List<FieldOperation> idealWeightPercent) {
        this.idealWeightPercent = ListUtil.add(idealWeightPercent, this.idealWeightPercent);
    }

    /**
     * Add to the list of ideal weight percent operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealWeightPercent(final FieldOperation fieldOperation) {
        this.idealWeightPercent = ListUtil.add(fieldOperation, this.idealWeightPercent);
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
        this.idealWeightPercent = ListUtil.add(new FieldOperation().extractAs(extractAs), this.idealWeightPercent);
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
                ListUtil.add(new FieldOperation().filter(filter), this.idealWeightPercent);
        return this;
    }

    /**
     * Get an iterable over ideal weight percent operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("idealWeightPercent")
    public Iterable<FieldOperation> idealWeightPercent() {
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
     * @param idealAtomicPercent List of {@link FieldOperation} objects.
     */
    @JsonSetter("idealAtomicPercent")
    private void idealAtomicPercent(final List<FieldOperation> idealAtomicPercent) {
        this.idealAtomicPercent = ListUtil.add(idealAtomicPercent, this.idealAtomicPercent);
    }

    /**
     * Add to the list of ideal atomic percent operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealAtomicPercent(final FieldOperation fieldOperation) {
        this.idealAtomicPercent = ListUtil.add(fieldOperation, this.idealAtomicPercent);
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
        this.idealAtomicPercent = ListUtil.add(new FieldOperation().extractAs(extractAs), this.idealAtomicPercent);
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
        this.idealAtomicPercent = ListUtil.add(new FieldOperation().filter(filter), this.idealAtomicPercent);
        return this;
    }

    @Override
    @JsonSetter("logic")
    public CompositionQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonIgnore
    public CompositionQuery tags(final FieldOperation fieldOperation) {
        super.tags(fieldOperation);
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
    public CompositionQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
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
    public CompositionQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
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
    private List<FieldOperation> element;

    /** Actual weight percent of the element. */
    private List<FieldOperation> actualWeightPercent;

    /** Actual atomic percent of the element. */
    private List<FieldOperation> actualAtomicPercent;

    /** Ideal weight percent of the element. */
    private List<FieldOperation> idealWeightPercent;

    /** Ideal atomic percent of the element. */
    private List<FieldOperation> idealAtomicPercent;
}