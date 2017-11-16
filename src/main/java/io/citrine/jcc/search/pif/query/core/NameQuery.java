package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Query to execute against a name field.
 *
 * @author Kyle Michel
 */
public class NameQuery extends BaseObjectQuery {

    @Override
    public NameQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public NameQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public NameQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public NameQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public NameQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public NameQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public NameQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public NameQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public NameQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public NameQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public NameQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public NameQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public NameQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public NameQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public NameQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public NameQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the given operations. This adds to any operations that are already saved.
     *
     * @param given List of {@link FieldQuery} objects.
     * @return This object.
     */
    public NameQuery setGiven(final List<FieldQuery> given) {
        this.given = given;
        return this;
    }

    /**
     * Add to the list of given operations.
     *
     * @param given {@link FieldQuery} to add.
     * @return This object.
     */
    public NameQuery addGiven(final List<FieldQuery> given) {
        this.given = ListUtil.add(given, this.given);
        return this;
    }

    /**
     * Add to the list of given operations.
     *
     * @param given {@link FieldQuery} to add.
     * @return This object.
     */
    public NameQuery addGiven(final FieldQuery given) {
        this.given = ListUtil.add(given, this.given);
        return this;
    }

    /**
     * Get the length of the given queries.
     *
     * @return Number of given queries.
     */
    public int givenLength() {
        return ListUtil.length(this.given);
    }

    /**
     * Get an iterable over given operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> given() {
        return ListUtil.iterable(this.given);
    }

    /**
     * Get the given query at the input index.
     *
     * @param index Index of the given query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getGiven(final int index) {
        return ListUtil.get(this.given, index);
    }

    /**
     * Get the given field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getGiven() {
        return this.given;
    }

    /**
     * Set the family operations. This adds to any operations that are already saved.
     *
     * @param family List of {@link FieldQuery} objects.
     * @return This object.
     */
    public NameQuery setFamily(final List<FieldQuery> family) {
        this.family = family;
        return this;
    }

    /**
     * Add to the list of family operations.
     *
     * @param family {@link FieldQuery} to add.
     * @return This object.
     */
    public NameQuery addFamily(final List<FieldQuery> family) {
        this.family = ListUtil.add(family, this.family);
        return this;
    }

    /**
     * Add to the list of family operations.
     *
     * @param family {@link FieldQuery} to add.
     * @return This object.
     */
    public NameQuery addFamily(final FieldQuery family) {
        this.family = ListUtil.add(family, this.family);
        return this;
    }

    /**
     * Get the length of the family queries.
     *
     * @return Number of family queries.
     */
    public int familyLength() {
        return ListUtil.length(this.family);
    }

    /**
     * Get an iterable over family operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> family() {
        return ListUtil.iterable(this.family);
    }

    /**
     * Get the family query at the input index.
     *
     * @param index Index of the family query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getFamily(final int index) {
        return ListUtil.get(this.family, index);
    }

    /**
     * Get the family field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getFamily() {
        return this.family;
    }

    /**
     * Set the title operations. This adds to any operations that are already saved.
     *
     * @param title List of {@link FieldQuery} objects.
     * @return This object.
     */
    public NameQuery setTitle(final List<FieldQuery> title) {
        this.title = title;
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param title {@link FieldQuery} to add.
     * @return This object.
     */
    public NameQuery addTitle(final List<FieldQuery> title) {
        this.title = ListUtil.add(title, this.title);
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param title {@link FieldQuery} to add.
     * @return This object.
     */
    public NameQuery addTitle(final FieldQuery title) {
        this.title = ListUtil.add(title, this.title);
        return this;
    }

    /**
     * Get the length of the title queries.
     *
     * @return Number of title queries.
     */
    public int titleLength() {
        return ListUtil.length(this.title);
    }

    /**
     * Get an iterable over title operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> title() {
        return ListUtil.iterable(this.title);
    }

    /**
     * Get the title query at the input index.
     *
     * @param index Index of the title query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getTitle(final int index) {
        return ListUtil.get(this.title, index);
    }

    /**
     * Get the title field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getTitle() {
        return this.title;
    }

    /**
     * Set the suffix operations. This adds to any operations that are already saved.
     *
     * @param suffix List of {@link FieldQuery} objects.
     * @return This object.
     */
    public NameQuery setSuffix(final List<FieldQuery> suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Add to the list of suffix operations.
     *
     * @param suffix {@link FieldQuery} to add.
     * @return This object.
     */
    public NameQuery addSuffix(final List<FieldQuery> suffix) {
        this.suffix = ListUtil.add(suffix, this.suffix);
        return this;
    }

    /**
     * Add to the list of suffix operations.
     *
     * @param suffix {@link FieldQuery} to add.
     * @return This object.
     */
    public NameQuery addSuffix(final FieldQuery suffix) {
        this.suffix = ListUtil.add(suffix, this.suffix);
        return this;
    }

    /**
     * Get the length of the suffix queries.
     *
     * @return Number of suffix queries.
     */
    public int suffixLength() {
        return ListUtil.length(this.suffix);
    }

    /**
     * Get an iterable over suffix operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> suffix() {
        return ListUtil.iterable(this.suffix);
    }

    /**
     * Get the suffix query at the input index.
     *
     * @param index Index of the suffix query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getSuffix(final int index) {
        return ListUtil.get(this.suffix, index);
    }

    /**
     * Get the suffix field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getSuffix() {
        return this.suffix;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link NameQuery} objects.
     * @return This object.
     */
    public NameQuery setQuery(final List<NameQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link NameQuery} objects.
     * @return This object.
     */
    public NameQuery addQuery(final List<NameQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link NameQuery} object to add.
     * @return This object.
     */
    public NameQuery addQuery(final NameQuery query) {
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
     * @return {@link Iterable} of {@link NameQuery} objects.
     */
    public Iterable<NameQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link NameQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link NameQuery} at the input index.
     */
    public NameQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link NameQuery} objects.
     */
    public List<NameQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof NameQuery)) {
            return false;
        }
        final NameQuery rhsQuery = (NameQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.given).equals(Optional.ofNullable(rhsQuery.given))
                && Optional.ofNullable(this.family).equals(Optional.ofNullable(rhsQuery.family))
                && Optional.ofNullable(this.title).equals(Optional.ofNullable(rhsQuery.title))
                && Optional.ofNullable(this.suffix).equals(Optional.ofNullable(rhsQuery.suffix))
                && Optional.ofNullable(this.query).equals(Optional.ofNullable(rhsQuery.query));
    }

    /** Given name for the query. */
    private List<FieldQuery> given;

    /** Family name for the query. */
    private List<FieldQuery> family;

    /** Title of the person. */
    private List<FieldQuery> title;

    /** Suffix of the person. */
    private List<FieldQuery> suffix;
    
    /** Nested list of queries. */
    private List<NameQuery> query;
}