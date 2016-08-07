package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.HasLogic;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Base class for all PIF object queries.
 * 
 * @author Kyle Michel
 */
public abstract class BaseObjectQuery implements HasLogic {

    @Override
    @JsonSetter("logic")
    public BaseObjectQuery logic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    @JsonGetter("logic")
    public Logic logic() {
        return this.logic;
    }

    /**
     * Set the list of tags operations. This adds to any operations that are already saved.
     *
     * @param tags List of {@link FieldOperation} objects.
     */
    @JsonSetter("tags")
    private void tags(final List<FieldOperation> tags) {
        this.tags = ListUtil.add(tags, this.tags);
    }

    /**
     * Add to the list of tags operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public BaseObjectQuery tags(final FieldOperation fieldOperation) {
        this.tags = ListUtil.add(fieldOperation, this.tags);
        return this;
    }

    /**
     * Add to the list of tags operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public BaseObjectQuery tags(final String extractAs) {
        this.tags = ListUtil.add(new FieldOperation().extractAs(extractAs), this.tags);
        return this;
    }

    /**
     * Add to the list of tags operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public BaseObjectQuery tags(final Filter filter) {
        this.tags = ListUtil.add(new FieldOperation().filter(filter), this.tags);
        return this;
    }

    /**
     * Get an iterable over tags operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("tags")
    public Iterable<FieldOperation> tags() {
        return ListUtil.iterable(this.tags);
    }

    /**
     * Return whether any tags operations exist.
     *
     * @return True if any tags operations exist.
     */
    @JsonIgnore
    public boolean hasTags() {
        return ListUtil.hasContent(this.tags);
    }

    /**
     * Set the length operations. This adds to any operations that are already saved.
     *
     * @param length List of {@link FieldOperation} objects.
     */
    @JsonSetter("length")
    private void length(final List<FieldOperation> length) {
        this.length = ListUtil.add(length, this.length);
    }

    /**
     * Add to the list of length operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public BaseObjectQuery length(final FieldOperation fieldOperation) {
        this.length = ListUtil.add(fieldOperation, this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public BaseObjectQuery length(final String extractAs) {
        this.length = ListUtil.add(new FieldOperation().extractAs(extractAs), this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public BaseObjectQuery length(final Filter filter) {
        this.length = ListUtil.add(new FieldOperation().filter(filter), this.length);
        return this;
    }

    /**
     * Get an iterable over length operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("length")
    public Iterable<FieldOperation> length() {
        return ListUtil.iterable(this.length);
    }

    /**
     * Return whether any length operations exist.
     *
     * @return True if any length operations exist.
     */
    @JsonIgnore
    public boolean hasLength() {
        return ListUtil.hasContent(this.length);
    }

    /**
     * Set the offset operations. This adds to any operations that are already saved.
     *
     * @param offset List of {@link FieldOperation} objects.
     */
    @JsonSetter("offset")
    private void offset(final List<FieldOperation> offset) {
        this.offset = ListUtil.add(offset, this.offset);
    }

    /**
     * Add to the list of offset operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public BaseObjectQuery offset(final FieldOperation fieldOperation) {
        this.offset = ListUtil.add(fieldOperation, this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public BaseObjectQuery offset(final String extractAs) {
        this.offset = ListUtil.add(new FieldOperation().extractAs(extractAs), this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public BaseObjectQuery offset(final Filter filter) {
        this.offset = ListUtil.add(new FieldOperation().filter(filter), this.offset);
        return this;
    }

    /**
     * Get an iterable over offset operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("offset")
    public Iterable<FieldOperation> offset() {
        return ListUtil.iterable(this.offset);
    }

    /**
     * Return whether any offset operations exist.
     *
     * @return True if any offset operations exist.
     */
    @JsonIgnore
    public boolean hasOffset() {
        return ListUtil.hasContent(this.offset);
    }

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** List of tag operations. */
    private List<FieldOperation> tags;

    /** Length of the array that this object appears in. */
    private List<FieldOperation> length;

    /** Offset for this object in the array that it appears in. */
    private List<FieldOperation> offset;
}