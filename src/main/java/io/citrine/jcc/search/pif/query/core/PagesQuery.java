package io.citrine.jcc.search.pif.query.core;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
    public PagesQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public PagesQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public PagesQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public PagesQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public PagesQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public PagesQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public PagesQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    @JsonIgnore
    public PagesQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the start operations. This adds to any operations that are already saved.
     *
     * @param start List of {@link FieldQuery} objects.
     * @return This object.
     */
    public PagesQuery setStart(final List<FieldQuery> start) {
        this.start = start;
        return this;
    }

    /**
     * Add to the list of start operations.
     *
     * @param start {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery addStart(final List<FieldQuery> start) {
        this.start = ListUtil.add(start, this.start);
        return this;
    }

    /**
     * Add to the list of start operations.
     *
     * @param start {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery addStart(final FieldQuery start) {
        this.start = ListUtil.add(start, this.start);
        return this;
    }

    /**
     * Get the length of the start queries.
     *
     * @return Number of start queries.
     */
    @JsonIgnore
    public int startLength() {
        return ListUtil.length(this.start);
    }

    /**
     * Get an iterable over start operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonIgnore
    public Iterable<FieldQuery> start() {
        return ListUtil.iterable(this.start);
    }

    /**
     * Get the start query at the input index.
     *
     * @param index Index of the start query to get.
     * @return {@link FieldQuery} at the input index.
     */
    @JsonIgnore
    public FieldQuery getStart(final int index) {
        return ListUtil.get(this.start, index);
    }

    /**
     * Get the start field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getStart() {
        return this.start;
    }

    /**
     * Set the end operations. This adds to any operations that are already saved.
     *
     * @param end List of {@link FieldQuery} objects.
     * @return This object.
     */
    public PagesQuery setEnd(final List<FieldQuery> end) {
        this.end = end;
        return this;
    }

    /**
     * Add to the list of end operations.
     *
     * @param end {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery addEnd(final List<FieldQuery> end) {
        this.end = ListUtil.add(end, this.end);
        return this;
    }

    /**
     * Add to the list of end operations.
     *
     * @param end {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public PagesQuery addEnd(final FieldQuery end) {
        this.end = ListUtil.add(end, this.end);
        return this;
    }

    /**
     * Get the length of the end queries.
     *
     * @return Number of end queries.
     */
    @JsonIgnore
    public int endLength() {
        return ListUtil.length(this.end);
    }

    /**
     * Get an iterable over end operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonIgnore
    public Iterable<FieldQuery> end() {
        return ListUtil.iterable(this.end);
    }

    /**
     * Get the end query at the input index.
     *
     * @param index Index of the end query to get.
     * @return {@link FieldQuery} at the input index.
     */
    @JsonIgnore
    public FieldQuery getEnd(final int index) {
        return ListUtil.get(this.end, index);
    }

    /**
     * Get the end field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getEnd() {
        return this.end;
    }

    /** Operations against the starting page. */
    private List<FieldQuery> start;

    /** Operation against the ending page. */
    private List<FieldQuery> end;
}