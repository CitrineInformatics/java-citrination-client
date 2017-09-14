package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class for querying against a single value.
 * 
 * @author Kyle Michel
 */
public class ValueQuery extends BaseObjectQuery {

    @Override
    public ValueQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public ValueQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public ValueQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public ValueQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public ValueQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public ValueQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public ValueQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public ValueQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public ValueQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public ValueQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public ValueQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public ValueQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public ValueQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public ValueQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the name operations. This adds to any operations that are already saved.
     *
     * @param name List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ValueQuery setName(final List<FieldQuery> name) {
        this.name = name;
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param name {@link FieldQuery} to add.
     * @return This object.
     */
    public ValueQuery addName(final List<FieldQuery> name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param name {@link FieldQuery} to add.
     * @return This object.
     */
    public ValueQuery addName(final FieldQuery name) {
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
    public ValueQuery setValue(final List<FieldQuery> value) {
        this.value = value;
        return this;
    }

    /**
     * Add to the list of value operations.
     *
     * @param value {@link FieldQuery} to add.
     * @return This object.
     */
    public ValueQuery addValue(final List<FieldQuery> value) {
        this.value = ListUtil.add(value, this.value);
        return this;
    }

    /**
     * Add to the list of value operations.
     *
     * @param value {@link FieldQuery} to add.
     * @return This object.
     */
    public ValueQuery addValue(final FieldQuery value) {
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
     * Set the file operations. This adds to any operations that are already saved.
     *
     * @param file List of {@link FileReferenceQuery} objects.
     * @return This object.
     */
    public ValueQuery setFile(final List<FileReferenceQuery> file) {
        this.file = file;
        return this;
    }

    /**
     * Add to the list of file operations.
     *
     * @param file {@link FileReferenceQuery} to add.
     * @return This object.
     */
    public ValueQuery addFile(final List<FileReferenceQuery> file) {
        this.file = ListUtil.add(file, this.file);
        return this;
    }

    /**
     * Add to the list of file operations.
     *
     * @param file {@link FileReferenceQuery} to add.
     * @return This object.
     */
    public ValueQuery addFile(final FileReferenceQuery file) {
        this.file = ListUtil.add(file, this.file);
        return this;
    }

    /**
     * Get the length of the file queries.
     *
     * @return Number of file queries.
     */
    public int fileLength() {
        return ListUtil.length(this.file);
    }

    /**
     * Get an iterable over file operations.
     *
     * @return Iterable of {@link FileReferenceQuery} objects.
     */
    public Iterable<FileReferenceQuery> file() {
        return ListUtil.iterable(this.file);
    }

    /**
     * Get the file query at the input index.
     *
     * @param index Index of the file query to get.
     * @return {@link FileReferenceQuery} at the input index.
     */
    public FileReferenceQuery getFile(final int index) {
        return ListUtil.get(this.file, index);
    }

    /**
     * Get the file field queries.
     *
     * @return List of {@link FileReferenceQuery} objects.
     */
    public List<FileReferenceQuery> getFile() {
        return this.file;
    }

    /**
     * Set the units operations. This adds to any operations that are already saved.
     *
     * @param units List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ValueQuery setUnits(final List<FieldQuery> units) {
        this.units = units;
        return this;
    }

    /**
     * Add to the list of units operations.
     *
     * @param units {@link FieldQuery} to add.
     * @return This object.
     */
    public ValueQuery addUnits(final List<FieldQuery> units) {
        this.units = ListUtil.add(units, this.units);
        return this;
    }

    /**
     * Add to the list of units operations.
     *
     * @param units {@link FieldQuery} to add.
     * @return This object.
     */
    public ValueQuery addUnits(final FieldQuery units) {
        this.units = ListUtil.add(units, this.units);
        return this;
    }

    /**
     * Get the length of the units queries.
     *
     * @return Number of units queries.
     */
    public int unitsLength() {
        return ListUtil.length(this.units);
    }

    /**
     * Get an iterable over units operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> units() {
        return ListUtil.iterable(this.units);
    }

    /**
     * Get the units query at the input index.
     *
     * @param index Index of the units query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getUnits(final int index) {
        return ListUtil.get(this.units, index);
    }

    /**
     * Get the units field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getUnits() {
        return this.units;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link ValueQuery} objects.
     * @return This object.
     */
    public ValueQuery setQuery(final List<ValueQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link ValueQuery} objects.
     * @return This object.
     */
    public ValueQuery addQuery(final List<ValueQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link ValueQuery} object to add.
     * @return This object.
     */
    public ValueQuery addQuery(final ValueQuery query) {
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
     * @param <T> Type of the query.
     * @return {@link Iterable} of {@link ValueQuery} objects.
     */
    @SuppressWarnings("unchecked")
    public <T extends ValueQuery> Iterable<T> query() {
        return (Iterable<T>) ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link ValueQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link ValueQuery} at the input index.
     */
    public ValueQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @param <T> Type of the query.
     * @return List of {@link ValueQuery} objects.
     */
    @SuppressWarnings("unchecked")
    public <T extends ValueQuery> List<T> getQuery() {
        return (List<T>) this.query;
    }

    /** List of name operations. */
    private List<FieldQuery> name;

    /** List of value operations. */
    private List<FieldQuery> value;

    /** List of file reference queries. */
    private List<FileReferenceQuery> file;

    /** List of units operations. */
    private List<FieldQuery> units;
    
    /** Nested list of queries. */
    private List<ValueQuery> query;
}