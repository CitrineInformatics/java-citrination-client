package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.HasLogic;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Query against a reference.
 *
 * @author Kyle Michel
 */
public class ReferenceQuery implements HasLogic {

    @Override
    @JsonSetter("logic")
    public ReferenceQuery logic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    @JsonGetter("logic")
    public Logic logic() {
        return this.logic;
    }

    /**
     * Set the list of title operations. This adds to any operations that are already saved.
     *
     * @param title List of {@link FieldOperation} objects.
     */
    @JsonSetter("title")
    private void title(final List<FieldOperation> title) {
        this.title = ListUtil.add(title, this.title);
    }

    /**
     * Add to the list of title operations.
     *
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery title(final String extractAs, final FilterGroup filterGroup) {
        this.title = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.title);
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery title(final String extractAs) {
        this.title = ListUtil.add(new FieldOperation().extractAs(extractAs), this.title);
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery title(final FilterGroup filterGroup) {
        this.title = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.title);
        return this;
    }

    /**
     * Get an iterable over title operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("title")
    public Iterable<FieldOperation> title() {
        return ListUtil.iterable(this.title);
    }

    /**
     * Return whether any title operations exist.
     *
     * @return True if any title operations exist.
     */
    @JsonIgnore
    public boolean hasTitle() {
        return ListUtil.hasContent(this.title);
    }

    /**
     * Set the list of authors operations. This adds to any operations that are already saved.
     *
     * @param authors List of {@link FieldOperation} objects.
     */
    @JsonSetter("authors")
    private void authors(final List<FieldOperation> authors) {
        this.authors = ListUtil.add(authors, this.authors);
    }

    /**
     * Add to the list of authors operations.
     *
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery authors(final String extractAs, final FilterGroup filterGroup) {
        this.authors = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.authors);
        return this;
    }

    /**
     * Add to the list of authors operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery authors(final String extractAs) {
        this.authors = ListUtil.add(new FieldOperation().extractAs(extractAs), this.authors);
        return this;
    }

    /**
     * Add to the list of authors operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery authors(final FilterGroup filterGroup) {
        this.authors = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.authors);
        return this;
    }

    /**
     * Get an iterable over authors operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("authors")
    public Iterable<FieldOperation> authors() {
        return ListUtil.iterable(this.authors);
    }

    /**
     * Get whether an authors queries exist.
     *
     * @return True if any authors queries exist.
     */
    @JsonIgnore
    public boolean hasAuthors() {
        return ListUtil.hasContent(this.authors);
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
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery length(final String extractAs, final FilterGroup filterGroup) {
        this.length = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery length(final String extractAs) {
        this.length = ListUtil.add(new FieldOperation().extractAs(extractAs), this.length);
        return this;
    }

    /**
     * Add to the list of length operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery length(final FilterGroup filterGroup) {
        this.length = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.length);
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
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery offset(final String extractAs, final FilterGroup filterGroup) {
        this.offset = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery offset(final String extractAs) {
        this.offset = ListUtil.add(new FieldOperation().extractAs(extractAs), this.offset);
        return this;
    }

    /**
     * Add to the list of offset operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery offset(final FilterGroup filterGroup) {
        this.offset = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.offset);
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

    /** Title of the reference. */
    private List<FieldOperation> title;

    /** Authors of the reference. */
    private List<FieldOperation> authors;

    /** Length of that array that this object appears in. */
    private List<FieldOperation> length;

    /** Offset of this object in the array that it appears in. */
    private List<FieldOperation> offset;
}