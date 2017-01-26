package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query to match against process steps.
 *
 * @author Kyle Michel
 */
public class ProcessStepQuery extends BaseObjectQuery {

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
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ProcessStepQuery name(final Filter filter) {
        this.name = ListUtil.add(new FieldOperation().filter(filter), this.name);
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

    @Override
    @JsonSetter("logic")
    public ProcessStepQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonSetter("extractAs")
    public ProcessStepQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public ProcessStepQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public ProcessStepQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public ProcessStepQuery tags(final FieldOperation fieldOperation) {
        super.tags(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public ProcessStepQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ProcessStepQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public ProcessStepQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public ProcessStepQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ProcessStepQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public ProcessStepQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public ProcessStepQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ProcessStepQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** Name of the step. */
    private List<FieldOperation> name;

    /** Details of the step. */
    private List<ValueQuery> details;
}