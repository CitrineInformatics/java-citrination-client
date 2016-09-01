package io.citrine.jcc.search.pif.query.core;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query to execute against a pages field.
 * 
 * @author Kyle Michel
 */
public class PagesQuery extends BaseObjectQuery {

    @Override
    @JsonSetter("logic")
    public PagesQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    /**
     * Set the list of starting page operations. This adds to any operations that are already saved.
     *
     * @param start List of {@link FieldOperation} objects.
     */
    @JsonSetter("start")
    private void start(final List<FieldOperation> start) {
        this.start = ListUtil.add(start, this.start);
    }

    /**
     * Add to the list of starting page operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery start(final FieldOperation fieldOperation) {
        this.start = ListUtil.add(fieldOperation, this.start);
        return this;
    }

    /**
     * Add to the list of starting page operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery start(final String extractAs) {
        this.start = ListUtil.add(new FieldOperation().extractAs(extractAs), this.start);
        return this;
    }

    /**
     * Add to the list of starting page operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery start(final Filter filter) {
        this.start = ListUtil.add(new FieldOperation().filter(filter), this.start);
        return this;
    }

    /**
     * Get an iterable over starting page operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("start")
    public Iterable<FieldOperation> start() {
        return ListUtil.iterable(this.start);
    }

    /**
     * Return whether any start operations exist.
     *
     * @return True if any start operations exist.
     */
    @JsonIgnore
    public boolean hasStart() {
        return ListUtil.hasContent(this.start);
    }

    /**
     * Set the list of ending page operations. This adds to any operations that are already saved.
     *
     * @param end List of {@link FieldOperation} objects.
     */
    @JsonSetter("end")
    private void end(final List<FieldOperation> end) {
        this.end = ListUtil.add(end, this.end);
    }

    /**
     * Add to the list of ending page operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery end(final FieldOperation fieldOperation) {
        this.end = ListUtil.add(fieldOperation, this.end);
        return this;
    }

    /**
     * Add to the list of ending page operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery end(final String extractAs) {
        this.end = ListUtil.add(new FieldOperation().extractAs(extractAs), this.end);
        return this;
    }

    /**
     * Add to the list of ending page operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery end(final Filter filter) {
        this.end = ListUtil.add(new FieldOperation().filter(filter), this.end);
        return this;
    }

    /**
     * Get an iterable over ending page operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("end")
    public Iterable<FieldOperation> end() {
        return ListUtil.iterable(this.end);
    }

    /**
     * Return whether any end operations exist.
     *
     * @return True if any end operations exist.
     */
    @JsonIgnore
    public boolean hasEnd() {
        return ListUtil.hasContent(this.end);
    }

    @Override
    @JsonIgnore
    public PagesQuery tags(final FieldOperation fieldOperation) {
        super.tags(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** Operations against the starting page. */
    private List<FieldOperation> start;

    /** Operation against the ending page. */
    private List<FieldOperation> end;
}