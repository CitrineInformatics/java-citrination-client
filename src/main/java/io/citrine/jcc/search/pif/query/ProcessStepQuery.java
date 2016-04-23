package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.HasLogic;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

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
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery name(final FieldOperation fieldOperation) {
        this.name = ListUtil.add(fieldOperation, this.name);
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
        return ListUtil.iterable(this.details);
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

    /**
     * Set the length operations. This adds to any operations that are already saved.
     *
     * @param length List of {@link FieldOperation} objects.
     */
    @JsonSetter("length")
    private void length(final List<FieldOperation> length) {
        this.length = ListUtil.add(length, this.length);
    }

    /**
     * Add to the list of length operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery length(final FieldOperation fieldOperation) {
        this.length = ListUtil.add(fieldOperation, this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery length(final String extractAs) {
        this.length = ListUtil.add(new FieldOperation().extractAs(extractAs), this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery length(final FilterGroup filterGroup) {
        this.length = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.length);
        return this;
    }

    /**
     * Get an iterable over length operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("length")
    public Iterable<FieldOperation> length() {
        return ListUtil.iterable(this.length);
    }

    /**
     * Return whether any length operations exist.
     *
     * @return True if any length operations exist.
     */
    @JsonIgnore
    public boolean hasLength() {
        return ListUtil.hasContent(this.length);
    }

    /**
     * Set the offset operations. This adds to any operations that are already saved.
     *
     * @param offset List of {@link FieldOperation} objects.
     */
    @JsonSetter("offset")
    private void offset(final List<FieldOperation> offset) {
        this.offset = ListUtil.add(offset, this.offset);
    }

    /**
     * Add to the list of offset operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery offset(final FieldOperation fieldOperation) {
        this.offset = ListUtil.add(fieldOperation, this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery offset(final String extractAs) {
        this.offset = ListUtil.add(new FieldOperation().extractAs(extractAs), this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery offset(final FilterGroup filterGroup) {
        this.offset = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.offset);
        return this;
    }

    /**
     * Get an iterable over offset operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("offset")
    public Iterable<FieldOperation> offset() {
        return ListUtil.iterable(this.offset);
    }

    /**
     * Return whether any offset operations exist.
     *
     * @return True if any offset operations exist.
     */
    @JsonIgnore
    public boolean hasOffset() {
        return ListUtil.hasContent(this.offset);
    }

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** Name of the step. */
    private List<FieldOperation> name;

    /** Details of the step. */
    private List<ValueQuery> details;

    /** Length of the array that this object appears in. */
    private List<FieldOperation> length;

    /** Offset of this object in the array that it appears in. */
    private List<FieldOperation> offset;
}