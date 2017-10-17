package io.citrine.jcc.search.file.query;

import io.citrine.jcc.search.core.query.Filter;
import io.citrine.jcc.search.core.query.HasLogic;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query against the content or metadata of a file on Citrination.
 *
 * @author Kyle Michel
 */
public class FileQuery implements HasLogic {

    @Override
    public FileQuery setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    /**
     * Set the query to run against all fields.
     *
     * @param simple String with the query to run against all fields.
     * @return This object.
     */
    public FileQuery setSimple(final String simple) {
        this.simple = simple;
        return this;
    }

    /**
     * Get the query to run against all fields.
     *
     * @return String with the query to run against all fields.
     */
    public String getSimple() {
        return this.simple;
    }

    /**
     * Set the list of file ID queries. This replaces any filters that are already present.
     *
     * @param id List of {@link Filter} objects.
     * @return This object.
     */
    public FileQuery setId(final List<Filter> id) {
        this.id = id;
        return this;
    }

    /**
     * Add to the list of file ID queries.
     *
     * @param id List of {@link Filter} objects.
     * @return This object.
     */
    public FileQuery addId(final List<Filter> id) {
        this.id = ListUtil.add(id, this.id);
        return this;
    }

    /**
     * Add to the list of file ID queries.
     *
     * @param id {@link Filter} object to add.
     * @return This object.
     */
    public FileQuery addId(final Filter id) {
        this.id = ListUtil.add(id, this.id);
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
     * @return {@link Iterable} of {@link Filter} objects.
     */
    public Iterable<Filter> id() {
        return ListUtil.iterable(this.id);
    }

    /**
     * Get the file ID filter object at the input index.
     *
     * @param index Index of the file ID filter to get.
     * @return {@link Filter} at the input index.
     */
    public Filter getId(final int index) {
        return ListUtil.get(this.id, index);
    }

    /**
     * Get the list of file ID queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getId() {
        return this.id;
    }

    /**
     * Set the list of name queries. This replaces any filters that are already present.
     *
     * @param name List of {@link Filter} objects.
     * @return This object.
     */
    public FileQuery setName(final List<Filter> name) {
        this.name = name;
        return this;
    }

    /**
     * Add to the list of name queries.
     *
     * @param name List of {@link Filter} objects.
     * @return This object.
     */
    public FileQuery addName(final List<Filter> name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Add to the list of name queries.
     *
     * @param name {@link Filter} object to add.
     * @return This object.
     */
    public FileQuery addName(final Filter name) {
        this.name = ListUtil.add(name, this.name);
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
     * @return {@link Iterable} of {@link Filter} objects.
     */
    public Iterable<Filter> name() {
        return ListUtil.iterable(this.name);
    }

    /**
     * Get one in the list of name queries.
     *
     * @param index Index of the filter to get.
     * @return {@link Filter} object.
     */
    public Filter getName(final int index) {
        return ListUtil.get(this.name, index);
    }

    /**
     * Get the list of name queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getName() {
        return this.name;
    }

    /**
     * Set the list of content queries. This replaces any filters that are already present.
     *
     * @param content List of {@link Filter} objects.
     * @return This object.
     */
    public FileQuery setContent(final List<Filter> content) {
        this.content = content;
        return this;
    }

    /**
     * Add to the list of content queries.
     *
     * @param content List of {@link Filter} objects.
     * @return This object.
     */
    public FileQuery addContent(final List<Filter> content) {
        this.content = ListUtil.add(content, this.content);
        return this;
    }

    /**
     * Add to the list of content queries.
     *
     * @param content {@link Filter} object to add.
     * @return This object.
     */
    public FileQuery addContent(final Filter content) {
        this.content = ListUtil.add(content, this.content);
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
     * @return {@link Iterable} of {@link Filter} objects.
     */
    public Iterable<Filter> content() {
        return ListUtil.iterable(this.content);
    }

    /**
     * Get one in the list of content queries.
     *
     * @param index Index of the filter to get.
     * @return {@link Filter} object.
     */
    public Filter getContent(final int index) {
        return ListUtil.get(this.content, index);
    }

    /**
     * Get the list of content queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getContent() {
        return this.content;
    }

    /**
     * Set the list of updatedAt queries. This replaces any filters that are already present.
     *
     * @param updatedAt List of {@link Filter} objects.
     * @return This object.
     */
    public FileQuery setUpdatedAt(final List<Filter> updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Add to the list of updatedAt queries.
     *
     * @param updatedAt List of {@link Filter} objects.
     * @return This object.
     */
    public FileQuery addUpdatedAt(final List<Filter> updatedAt) {
        this.updatedAt = ListUtil.add(updatedAt, this.updatedAt);
        return this;
    }

    /**
     * Add to the list of updatedAt queries.
     *
     * @param updatedAt {@link Filter} object to add.
     * @return This object.
     */
    public FileQuery addUpdatedAt(final Filter updatedAt) {
        this.updatedAt = ListUtil.add(updatedAt, this.updatedAt);
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
     * @return {@link Iterable} of {@link Filter} objects.
     */
    public Iterable<Filter> updatedAt() {
        return ListUtil.iterable(this.updatedAt);
    }

    /**
     * Get one in the list of updatedAt queries.
     *
     * @param index Index of the updatedAt query to get.
     * @return {@link Filter} object.
     */
    public Filter getUpdatedAt(final int index) {
        return ListUtil.get(this.updatedAt, index);
    }

    /**
     * Get the list of updatedAt queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getUpdatedAt() {
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

    /** Logic for the query. */
    private Logic logic;

    /** String with the simple search to run against all fields. */
    private String simple;

    /** List of filters against the file ID. */
    private List<Filter> id;

    /** List of filters against the file name. */
    private List<Filter> name;

    /** List of filters against the file content. */
    private List<Filter> content;

    /** List of filters against the last update time. */
    private List<Filter> updatedAt;

    /** Nested list of queries. */
    private List<FileQuery> query;
}