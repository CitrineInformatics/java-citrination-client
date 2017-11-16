package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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
    public PagesQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public PagesQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public PagesQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
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
    public PagesQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
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
    public PagesQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
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
    public PagesQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
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
    public PagesQuery addStart(final FieldQuery start) {
        this.start = ListUtil.add(start, this.start);
        return this;
    }

    /**
     * Get the length of the start queries.
     *
     * @return Number of start queries.
     */
    public int startLength() {
        return ListUtil.length(this.start);
    }

    /**
     * Get an iterable over start operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> start() {
        return ListUtil.iterable(this.start);
    }

    /**
     * Get the start query at the input index.
     *
     * @param index Index of the start query to get.
     * @return {@link FieldQuery} at the input index.
     */
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
    public PagesQuery addEnd(final FieldQuery end) {
        this.end = ListUtil.add(end, this.end);
        return this;
    }

    /**
     * Get the length of the end queries.
     *
     * @return Number of end queries.
     */
    public int endLength() {
        return ListUtil.length(this.end);
    }

    /**
     * Get an iterable over end operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> end() {
        return ListUtil.iterable(this.end);
    }

    /**
     * Get the end query at the input index.
     *
     * @param index Index of the end query to get.
     * @return {@link FieldQuery} at the input index.
     */
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

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link PagesQuery} objects.
     * @return This object.
     */
    public PagesQuery setQuery(final List<PagesQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link PagesQuery} objects.
     * @return This object.
     */
    public PagesQuery addQuery(final List<PagesQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link PagesQuery} object to add.
     * @return This object.
     */
    public PagesQuery addQuery(final PagesQuery query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Get the number of nested queries.
     *
     * @return Number of nested queries.
     */
    public int queryLength() {
        return ListUtil.length(this.query);
    }

    /**
     * Get an iterable over the nested queries.
     *
     * @return {@link Iterable} of {@link PagesQuery} objects.
     */
    public Iterable<PagesQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link PagesQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link PagesQuery} at the input index.
     */
    public PagesQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link PagesQuery} objects.
     */
    public List<PagesQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof PagesQuery)) {
            return false;
        }
        final PagesQuery rhsQuery = (PagesQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.start).equals(Optional.ofNullable(rhsQuery.start))
                && Optional.ofNullable(this.end).equals(Optional.ofNullable(rhsQuery.end))
                && Optional.ofNullable(this.query).equals(Optional.ofNullable(rhsQuery.query));
    }

    /** Operations against the starting page. */
    private List<FieldQuery> start;

    /** Operation against the ending page. */
    private List<FieldQuery> end;
    
    /** Nested list of queries. */
    private List<PagesQuery> query;
}