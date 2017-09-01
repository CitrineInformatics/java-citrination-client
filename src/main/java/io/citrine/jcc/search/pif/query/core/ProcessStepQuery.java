package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query to match against process steps.
 *
 * @author Kyle Michel
 */
public class ProcessStepQuery extends BaseObjectQuery {

    @Override
    public ProcessStepQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public ProcessStepQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public ProcessStepQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public ProcessStepQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public ProcessStepQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public ProcessStepQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public ProcessStepQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public ProcessStepQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public ProcessStepQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public ProcessStepQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public ProcessStepQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public ProcessStepQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public ProcessStepQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public ProcessStepQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the name operations. This adds to any operations that are already saved.
     *
     * @param name List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ProcessStepQuery setName(final List<FieldQuery> name) {
        this.name = name;
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param name {@link FieldQuery} to add.
     * @return This object.
     */
    public ProcessStepQuery addName(final List<FieldQuery> name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param name {@link FieldQuery} to add.
     * @return This object.
     */
    public ProcessStepQuery addName(final FieldQuery name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Get the length of the name queries.
     *
     * @return Number of name queries.
     */
    public int nameLength() {
        return ListUtil.length(this.name);
    }

    /**
     * Get an iterable over name operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> name() {
        return ListUtil.iterable(this.name);
    }

    /**
     * Get the name query at the input index.
     *
     * @param index Index of the name query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getName(final int index) {
        return ListUtil.get(this.name, index);
    }

    /**
     * Get the name field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getName() {
        return this.name;
    }

    /**
     * Set the details operations. This adds to any operations that are already saved.
     *
     * @param details List of {@link ValueQuery} objects.
     * @return This object.
     */
    public ProcessStepQuery setDetails(final List<ValueQuery> details) {
        this.details = details;
        return this;
    }

    /**
     * Add to the list of details operations.
     *
     * @param details {@link ValueQuery} to add.
     * @return This object.
     */
    public ProcessStepQuery addDetails(final List<ValueQuery> details) {
        this.details = ListUtil.add(details, this.details);
        return this;
    }

    /**
     * Add to the list of details operations.
     *
     * @param details {@link ValueQuery} to add.
     * @return This object.
     */
    public ProcessStepQuery addDetails(final ValueQuery details) {
        this.details = ListUtil.add(details, this.details);
        return this;
    }

    /**
     * Get the length of the details queries.
     *
     * @return Number of details queries.
     */
    public int detailsLength() {
        return ListUtil.length(this.details);
    }

    /**
     * Get an iterable over details operations.
     *
     * @return Iterable of {@link ValueQuery} objects.
     */
    public Iterable<ValueQuery> details() {
        return ListUtil.iterable(this.details);
    }

    /**
     * Get the details query at the input index.
     *
     * @param index Index of the details query to get.
     * @return {@link ValueQuery} at the input index.
     */
    public ValueQuery getDetails(final int index) {
        return ListUtil.get(this.details, index);
    }

    /**
     * Get the details field queries.
     *
     * @return List of {@link ValueQuery} objects.
     */
    public List<ValueQuery> getDetails() {
        return this.details;
    }

    /** Name of the step. */
    private List<FieldQuery> name;

    /** Details of the step. */
    private List<ValueQuery> details;
}