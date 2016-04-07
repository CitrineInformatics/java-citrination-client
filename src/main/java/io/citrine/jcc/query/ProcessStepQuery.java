package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Query to match against process steps.
 *
 * @author Kyle Michel
 */
public class ProcessStepQuery implements HasLogic {

    @Override
    @JsonSetter("logic")
    public ProcessStepQuery logic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    @JsonGetter("logic")
    public Logic logic() {
        return this.logic;
    }

    /**
     * Set the list of step number operations. This adds to any operations that are already saved.
     *
     * @param step List of {@link FieldOperation} objects.
     */
    @JsonSetter("step")
    private void step(final List<FieldOperation> step) {
        this.step = ListUtil.add(step, this.step);
    }

    /**
     * Add to the list of step operations.
     *
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery step(final String extractAs, final FilterGroup filterGroup) {
        this.step = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.step);
        return this;
    }

    /**
     * Add to the list of step operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery step(final String extractAs) {
        this.step = ListUtil.add(new FieldOperation().extractAs(extractAs), this.step);
        return this;
    }

    /**
     * Add to the list of step operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery step(final FilterGroup filterGroup) {
        this.step = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.step);
        return this;
    }

    /**
     * Get an iterable over step operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("step")
    public Iterable<FieldOperation> step() {
        return ListUtil.iterable(this.step);
    }

    /**
     * Return whether any step operations exist.
     *
     * @return True if any step operations exist.
     */
    @JsonIgnore
    public boolean hasStep() {
        return ListUtil.hasContent(this.step);
    }

    /**
     * Set the list of name number operations. This adds to any operations that are already saved.
     *
     * @param name List of {@link FieldOperation} objects.
     */
    @JsonSetter("name")
    private void name(final List<FieldOperation> name) {
        this.name = ListUtil.add(name, this.name);
    }

    /**
     * Add to the list of name operations.
     *
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery name(final String extractAs, final FilterGroup filterGroup) {
        this.name = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.name);
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery name(final String extractAs) {
        this.name = ListUtil.add(new FieldOperation().extractAs(extractAs), this.name);
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery name(final FilterGroup filterGroup) {
        this.name = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.name);
        return this;
    }

    /**
     * Get an iterable over name operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("name")
    public Iterable<FieldOperation> name() {
        return ListUtil.iterable(this.name);
    }

    /**
     * Return whether any name operations exist.
     *
     * @return True if any name operations exist.
     */
    @JsonIgnore
    public boolean hasName() {
        return ListUtil.hasContent(this.name);
    }

    /**
     * Set the list of details operations. This adds to any operations that are already saved.
     *
     * @param details List of {@link ValueQuery} objects.
     */
    @JsonSetter("details")
    private void details(final List<ValueQuery> details) {
        this.details = ListUtil.add(details, this.details);
    }

    /**
     * Add to the list of details operations.
     *
     * @param details {@link ValueQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery details(final ValueQuery details) {
        this.details = ListUtil.add(details, this.details);
        return this;
    }

    /**
     * Get an iterable of details operations.
     *
     * @return Iterable of {@link ValueQuery} objects.
     */
    @JsonGetter("details")
    public Iterable<ValueQuery> details() {
        return this.details;
    }

    /**
     * Get whether an details queries exist.
     *
     * @return True if any details queries exist.
     */
    @JsonIgnore
    public boolean hasDetails() {
        return ListUtil.hasContent(this.details);
    }

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** Step number. */
    private List<FieldOperation> step = new ArrayList<>();

    /** Name of the step. */
    private List<FieldOperation> name = new ArrayList<>();

    /** Details of the step. */
    private List<ValueQuery> details = new ArrayList<>();
}