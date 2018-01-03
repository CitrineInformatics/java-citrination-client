package io.citrine.jcc.search.file.query;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.citrine.jcc.search.core.query.BasicFieldQuery;
import io.citrine.jcc.search.core.query.ConvertsToBasicFieldQuery;
import io.citrine.jcc.search.core.query.HasLogic;
import io.citrine.jcc.search.core.query.HasSimple;
import io.citrine.jcc.search.core.query.HasWeight;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;
import io.citrine.jcc.util.MapUtil;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Query against the content or metadata of a file on Citrination.
 *
 * @author Kyle Michel
 */
public class FileQuery implements HasLogic, HasWeight, HasSimple {

    @Override
    public FileQuery setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    @Override
    public FileQuery setWeight(final Double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public FileQuery setSimple(final String simple) {
        this.simple = simple;
        return this;
    }

    @Override
    public String getSimple() {
        return this.simple;
    }

    @Override
    public FileQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        this.simpleWeight = simpleWeight;
        return this;
    }

    @Override
    public FileQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        this.simpleWeight = MapUtil.add(simpleWeight, this.simpleWeight);
        return this;
    }

    @Override
    public FileQuery addSimpleWeight(final String field, final Double weight) {
        this.simpleWeight = MapUtil.add(field, weight, this.simpleWeight);
        return this;
    }

    @Override
    public Map<String, Double> getSimpleWeight() {
        return this.simpleWeight;
    }

    /**
     * Set the list of file ID queries. This replaces any queries that are already present.
     *
     * @param id List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicFieldQuery.Deserializer.class)
    public FileQuery setId(final List<? extends ConvertsToBasicFieldQuery> id) {
        this.id = BasicFieldQuery.fromList(id);
        return this;
    }

    /**
     * Add to the list of file ID queries.
     *
     * @param id List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    public FileQuery addId(final List<? extends ConvertsToBasicFieldQuery> id) {
        this.id = ListUtil.add(BasicFieldQuery.fromList(id), this.id);
        return this;
    }

    /**
     * Add to the list of file ID queries.
     *
     * @param id {@link ConvertsToBasicFieldQuery} object to add.
     * @return This object.
     */
    public FileQuery addId(final ConvertsToBasicFieldQuery id) {
        this.id = ListUtil.add(BasicFieldQuery.fromObject(id), this.id);
        return this;
    }

    /**
     * Get the number of file ID queries.
     *
     * @return Number of queries against the file id field.
     */
    public int idLength() {
        return ListUtil.length(this.id);
    }

    /**
     * Get an iterable over the file ID queries.
     *
     * @return {@link Iterable} of {@link BasicFieldQuery} objects.
     */
    public Iterable<BasicFieldQuery> id() {
        return ListUtil.iterable(this.id);
    }

    /**
     * Get the file ID filter object at the input index.
     *
     * @param index Index of the file ID filter to get.
     * @return {@link BasicFieldQuery} at the input index.
     */
    public BasicFieldQuery getId(final int index) {
        return ListUtil.get(this.id, index);
    }

    /**
     * Get the list of file ID queries.
     *
     * @return List of {@link BasicFieldQuery} objects.
     */
    public List<BasicFieldQuery> getId() {
        return this.id;
    }

    /**
     * Set the list of name queries. This replaces any queries that are already present.
     *
     * @param name List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicFieldQuery.Deserializer.class)
    public FileQuery setName(final List<? extends ConvertsToBasicFieldQuery> name) {
        this.name = BasicFieldQuery.fromList(name);
        return this;
    }

    /**
     * Add to the list of name queries.
     *
     * @param name List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    public FileQuery addName(final List<? extends ConvertsToBasicFieldQuery> name) {
        this.name = ListUtil.add(BasicFieldQuery.fromList(name), this.name);
        return this;
    }

    /**
     * Add to the list of name queries.
     *
     * @param name {@link ConvertsToBasicFieldQuery} object to add.
     * @return This object.
     */
    public FileQuery addName(final ConvertsToBasicFieldQuery name) {
        this.name = ListUtil.add(BasicFieldQuery.fromObject(name), this.name);
        return this;
    }

    /**
     * Get the number of name queries.
     *
     * @return Number of queries against the name field.
     */
    public int nameLength() {
        return ListUtil.length(this.name);
    }

    /**
     * Get an iterable over the name queries.
     *
     * @return {@link Iterable} of {@link BasicFieldQuery} objects.
     */
    public Iterable<BasicFieldQuery> name() {
        return ListUtil.iterable(this.name);
    }

    /**
     * Get one in the list of name queries.
     *
     * @param index Index of the filter to get.
     * @return {@link BasicFieldQuery} object.
     */
    public BasicFieldQuery getName(final int index) {
        return ListUtil.get(this.name, index);
    }

    /**
     * Get the list of name queries.
     *
     * @return List of {@link BasicFieldQuery} objects.
     */
    public List<BasicFieldQuery> getName() {
        return this.name;
    }

    /**
     * Set the list of content queries. This replaces any queries that are already present.
     *
     * @param content List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicFieldQuery.Deserializer.class)
    public FileQuery setContent(final List<? extends ConvertsToBasicFieldQuery> content) {
        this.content = BasicFieldQuery.fromList(content);
        return this;
    }

    /**
     * Add to the list of content queries.
     *
     * @param content List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    public FileQuery addContent(final List<? extends ConvertsToBasicFieldQuery> content) {
        this.content = ListUtil.add(BasicFieldQuery.fromList(content), this.content);
        return this;
    }

    /**
     * Add to the list of content queries.
     *
     * @param content {@link ConvertsToBasicFieldQuery} object to add.
     * @return This object.
     */
    public FileQuery addContent(final ConvertsToBasicFieldQuery content) {
        this.content = ListUtil.add(BasicFieldQuery.fromObject(content), this.content);
        return this;
    }

    /**
     * Get the number of content queries.
     *
     * @return Number of queries against the content field.
     */
    public int contentLength() {
        return ListUtil.length(this.content);
    }

    /**
     * Get an iterable over the content queries.
     *
     * @return {@link Iterable} of {@link BasicFieldQuery} objects.
     */
    public Iterable<BasicFieldQuery> content() {
        return ListUtil.iterable(this.content);
    }

    /**
     * Get one in the list of content queries.
     *
     * @param index Index of the filter to get.
     * @return {@link BasicFieldQuery} object.
     */
    public BasicFieldQuery getContent(final int index) {
        return ListUtil.get(this.content, index);
    }

    /**
     * Get the list of content queries.
     *
     * @return List of {@link BasicFieldQuery} objects.
     */
    public List<BasicFieldQuery> getContent() {
        return this.content;
    }

    /**
     * Set the list of updatedAt queries. This replaces any queries that are already present.
     *
     * @param updatedAt List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicFieldQuery.Deserializer.class)
    public FileQuery setUpdatedAt(final List<? extends ConvertsToBasicFieldQuery> updatedAt) {
        this.updatedAt = BasicFieldQuery.fromList(updatedAt);
        return this;
    }

    /**
     * Add to the list of updatedAt queries.
     *
     * @param updatedAt List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    public FileQuery addUpdatedAt(final List<? extends ConvertsToBasicFieldQuery> updatedAt) {
        this.updatedAt = ListUtil.add(BasicFieldQuery.fromList(updatedAt), this.updatedAt);
        return this;
    }

    /**
     * Add to the list of updatedAt queries.
     *
     * @param updatedAt {@link ConvertsToBasicFieldQuery} object to add.
     * @return This object.
     */
    public FileQuery addUpdatedAt(final ConvertsToBasicFieldQuery updatedAt) {
        this.updatedAt = ListUtil.add(BasicFieldQuery.fromObject(updatedAt), this.updatedAt);
        return this;
    }

    /**
     * Get the number of updatedAt queries.
     *
     * @return Number of queries against the updatedAt field.
     */
    public int updatedAtLength() {
        return ListUtil.length(this.updatedAt);
    }

    /**
     * Get an iterable over the updatedAt queries.
     *
     * @return {@link Iterable} of {@link BasicFieldQuery} objects.
     */
    public Iterable<BasicFieldQuery> updatedAt() {
        return ListUtil.iterable(this.updatedAt);
    }

    /**
     * Get one in the list of updatedAt queries.
     *
     * @param index Index of the updatedAt query to get.
     * @return {@link BasicFieldQuery} object.
     */
    public BasicFieldQuery getUpdatedAt(final int index) {
        return ListUtil.get(this.updatedAt, index);
    }

    /**
     * Get the list of updatedAt queries.
     *
     * @return List of {@link BasicFieldQuery} objects.
     */
    public List<BasicFieldQuery> getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link FileQuery} objects.
     * @return This object.
     */
    public FileQuery setQuery(final List<FileQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link FileQuery} objects.
     * @return This object.
     */
    public FileQuery addQuery(final List<FileQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link FileQuery} object to add.
     * @return This object.
     */
    public FileQuery addQuery(final FileQuery query) {
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
     * @return {@link Iterable} of {@link FileQuery} objects.
     */
    public Iterable<FileQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link FileQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link FileQuery} at the input index.
     */
    public FileQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link FileQuery} objects.
     */
    public List<FileQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof FileQuery)) {
            return false;
        }
        final FileQuery rhsQuery = (FileQuery) rhs;
        return Optional.ofNullable(this.logic).equals(Optional.ofNullable(rhsQuery.logic))
                && Optional.ofNullable(this.weight).equals(Optional.ofNullable(rhsQuery.weight))
                && Optional.ofNullable(this.simple).equals(Optional.ofNullable(rhsQuery.simple))
                && Optional.ofNullable(this.simpleWeight).equals(Optional.ofNullable(rhsQuery.simpleWeight))
                && Optional.ofNullable(this.id).equals(Optional.ofNullable(rhsQuery.id))
                && Optional.ofNullable(this.name).equals(Optional.ofNullable(rhsQuery.name))
                && Optional.ofNullable(this.content).equals(Optional.ofNullable(rhsQuery.content))
                && Optional.ofNullable(this.updatedAt).equals(Optional.ofNullable(rhsQuery.updatedAt))
                && Optional.ofNullable(this.query).equals(Optional.ofNullable(rhsQuery.query));
    }

    /** Logic for the query. */
    private Logic logic;

    /** Weight of the query. */
    private Double weight;

    /** String with the simple search to run against all fields. */
    private String simple;

    /** Map of field names to weights for the simple search string. */
    private Map<String, Double> simpleWeight;

    /** List of filters against the file ID. */
    private List<BasicFieldQuery> id;

    /** List of filters against the file name. */
    private List<BasicFieldQuery> name;

    /** List of filters against the file content. */
    private List<BasicFieldQuery> content;

    /** List of filters against the last update time. */
    private List<BasicFieldQuery> updatedAt;

    /** Nested list of queries. */
    private List<FileQuery> query;
}