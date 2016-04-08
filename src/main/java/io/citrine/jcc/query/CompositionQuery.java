package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Query against a composition object.
 *
 * @author Kyle Michel
 */
public class CompositionQuery implements HasLogic {

    @Override
    @JsonSetter("logic")
    public CompositionQuery logic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    @JsonGetter("logic")
    public Logic logic() {
        return this.logic;
    }

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
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery element(final String extractAs, final FilterGroup filterGroup) {
        this.element = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.element);
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
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery element(final FilterGroup filterGroup) {
        this.element = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.element);
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
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualWeightPercent(final String extractAs, final FilterGroup filterGroup) {
        this.actualWeightPercent = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.actualWeightPercent);
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
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualWeightPercent(final FilterGroup filterGroup) {
        this.actualWeightPercent =
                ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.actualWeightPercent);
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
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualAtomicPercent(final String extractAs, final FilterGroup filterGroup) {
        this.actualAtomicPercent = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.actualAtomicPercent);
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
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery actualAtomicPercent(final FilterGroup filterGroup) {
        this.actualAtomicPercent =
                ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.actualAtomicPercent);
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
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealWeightPercent(final String extractAs, final FilterGroup filterGroup) {
        this.idealWeightPercent = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.idealWeightPercent);
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
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealWeightPercent(final FilterGroup filterGroup) {
        this.idealWeightPercent =
                ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.idealWeightPercent);
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
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealAtomicPercent(final String extractAs, final FilterGroup filterGroup) {
        this.idealAtomicPercent = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.idealAtomicPercent);
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
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public CompositionQuery idealAtomicPercent(final FilterGroup filterGroup) {
        this.idealAtomicPercent =
                ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.idealAtomicPercent);
        return this;
    }

    /**
     * Get an iterable over ideal atomic percent operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("idealAtomicPercent")
    public Iterable<FieldOperation> idealAtomicPercent() {
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

    /** Element for the composition. */
    private List<FieldOperation> element = new ArrayList<>();

    /** Actual weight percent of the element. */
    private List<FieldOperation> actualWeightPercent = new ArrayList<>();

    /** Actual atomic percent of the element. */
    private List<FieldOperation> actualAtomicPercent = new ArrayList<>();

    /** Ideal weight percent of the element. */
    private List<FieldOperation> idealWeightPercent = new ArrayList<>();

    /** Ideal atomic percent of the element. */
    private List<FieldOperation> idealAtomicPercent = new ArrayList<>();

    /** Logic that applies to the entire query. */
    private Logic logic;
}