package io.citrine.jcc.search.pif.query.core;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
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

    @Override
    @JsonSetter("extractAs")
    public PagesQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public PagesQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public PagesQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    /**
     * Set the list of starting page operations. This adds to any operations that are already saved.
     *
     * @param start List of {@link FieldQuery} objects.
     */
    @JsonSetter("start")
    private void start(final List<FieldQuery> start) {
        this.start = ListUtil.add(start, this.start);
    }

    /**
     * Add to the list of starting page operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery start(final FieldQuery fieldQuery) {
        this.start = ListUtil.add(fieldQuery, this.start);
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
        this.start = ListUtil.add(new FieldQuery().extractAs(extractAs), this.start);
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
        this.start = ListUtil.add(new FieldQuery().filter(filter), this.start);
        return this;
    }

    /**
     * Get an iterable over starting page operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("start")
    public Iterable<FieldQuery> start() {
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
     * @param end List of {@link FieldQuery} objects.
     */
    @JsonSetter("end")
    private void end(final List<FieldQuery> end) {
        this.end = ListUtil.add(end, this.end);
    }

    /**
     * Add to the list of ending page operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery end(final FieldQuery fieldQuery) {
        this.end = ListUtil.add(fieldQuery, this.end);
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
        this.end = ListUtil.add(new FieldQuery().extractAs(extractAs), this.end);
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
        this.end = ListUtil.add(new FieldQuery().filter(filter), this.end);
        return this;
    }

    /**
     * Get an iterable over ending page operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("end")
    public Iterable<FieldQuery> end() {
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
    public PagesQuery tags(final FieldQuery fieldQuery) {
        super.tags(fieldQuery);
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
    public PagesQuery length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
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
    public PagesQuery offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
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
    private List<FieldQuery> start;

    /** Operation against the ending page. */
    private List<FieldQuery> end;
}