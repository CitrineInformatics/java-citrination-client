package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Query to execute against an ID field.
 *
 * @author Kyle Michel
 */
public class IdQuery extends BaseObjectQuery {

    @Override
    public IdQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public IdQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public IdQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public IdQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public IdQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        super.addSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public IdQuery addSimpleWeight(final String field, final Double weight) {
        super.addSimpleWeight(field, weight);
        return this;
    }

    @Override
    public IdQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public IdQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public IdQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public IdQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public IdQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public IdQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public IdQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public IdQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public IdQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public IdQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public IdQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public IdQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the name operations. This adds to any operations that are already saved.
     *
     * @param name List of {@link FieldQuery} objects.
     * @return This object.
     */
    public IdQuery setName(final List<FieldQuery> name) {
        this.name = name;
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param name {@link FieldQuery} to add.
     * @return This object.
     */
    public IdQuery addName(final List<FieldQuery> name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param name {@link FieldQuery} to add.
     * @return This object.
     */
    public IdQuery addName(final FieldQuery name) {
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
     * Set the value operations. This adds to any operations that are already saved.
     *
     * @param value List of {@link FieldQuery} objects.
     * @return This object.
     */
    public IdQuery setValue(final List<FieldQuery> value) {
        this.value = value;
        return this;
    }

    /**
     * Add to the list of value operations.
     *
     * @param value {@link FieldQuery} to add.
     * @return This object.
     */
    public IdQuery addValue(final List<FieldQuery> value) {
        this.value = ListUtil.add(value, this.value);
        return this;
    }

    /**
     * Add to the list of value operations.
     *
     * @param value {@link FieldQuery} to add.
     * @return This object.
     */
    public IdQuery addValue(final FieldQuery value) {
        this.value = ListUtil.add(value, this.value);
        return this;
    }

    /**
     * Get the length of the value queries.
     *
     * @return Number of value queries.
     */
    public int valueLength() {
        return ListUtil.length(this.value);
    }

    /**
     * Get an iterable over value operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> value() {
        return ListUtil.iterable(this.value);
    }

    /**
     * Get the value query at the input index.
     *
     * @param index Index of the value query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getValue(final int index) {
        return ListUtil.get(this.value, index);
    }

    /**
     * Get the value field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getValue() {
        return this.value;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link IdQuery} objects.
     * @return This object.
     */
    public IdQuery setQuery(final List<IdQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link IdQuery} objects.
     * @return This object.
     */
    public IdQuery addQuery(final List<IdQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link IdQuery} object to add.
     * @return This object.
     */
    public IdQuery addQuery(final IdQuery query) {
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
     * @return {@link Iterable} of {@link IdQuery} objects.
     */
    public Iterable<IdQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link IdQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link IdQuery} at the input index.
     */
    public IdQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link IdQuery} objects.
     */
    public List<IdQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof IdQuery)) {
            return false;
        }
        final IdQuery rhsQuery = (IdQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.name).equals(Optional.ofNullable(rhsQuery.name))
                && Optional.ofNullable(this.value).equals(Optional.ofNullable(rhsQuery.value))
                && Optional.ofNullable(this.query).equals(Optional.ofNullable(rhsQuery.query));
    }

    /** Name of the id. */
    private List<FieldQuery> name;

    /** Value of the id. */
    private List<FieldQuery> value;
    
    /** Nested list of queries. */
    private List<IdQuery> query;
    
    
}