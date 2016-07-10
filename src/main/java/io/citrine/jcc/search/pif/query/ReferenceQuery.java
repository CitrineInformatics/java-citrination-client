package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.HasLogic;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

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
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery title(final FieldOperation fieldOperation) {
        this.title = ListUtil.add(fieldOperation, this.title);
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
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery title(final Filter filter) {
        this.title = ListUtil.add(new FieldOperation().filter(filter), this.title);
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
     * Set the list of author operations. This adds to any operations that are already saved.
     *
     * @param authors List of {@link NameQuery} objects.
     */
    @JsonSetter("authors")
    private void authors(final List<NameQuery> authors) {
        this.authors = ListUtil.add(authors, this.authors);
    }

    /**
     * Add to the list of author operations.
     *
     * @param author {@link NameQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery authors(final NameQuery author) {
        this.authors = ListUtil.add(author, this.authors);
        return this;
    }

    /**
     * Get an iterable of author operations.
     *
     * @return Iterable of {@link NameQuery} objects.
     */
    @JsonGetter("author")
    public Iterable<NameQuery> authors() {
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
     * Set the list of affiliations operations. This adds to any operations that are already saved.
     *
     * @param affiliations List of {@link FieldOperation} objects.
     */
    @JsonSetter("affiliations")
    private void affiliations(final List<FieldOperation> affiliations) {
        this.affiliations = ListUtil.add(affiliations, this.affiliations);
    }

    /**
     * Add to the list of affiliations operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery affiliations(final FieldOperation fieldOperation) {
        this.affiliations = ListUtil.add(fieldOperation, this.affiliations);
        return this;
    }

    /**
     * Add to the list of affiliations operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery affiliations(final String extractAs) {
        this.affiliations = ListUtil.add(new FieldOperation().extractAs(extractAs), this.affiliations);
        return this;
    }

    /**
     * Add to the list of affiliations operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery affiliations(final Filter filter) {
        this.affiliations = ListUtil.add(new FieldOperation().filter(filter), this.affiliations);
        return this;
    }

    /**
     * Get an iterable over affiliations operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("affiliations")
    public Iterable<FieldOperation> affiliations() {
        return ListUtil.iterable(this.affiliations);
    }

    /**
     * Return whether any affiliations operations exist.
     *
     * @return True if any affiliations operations exist.
     */
    @JsonIgnore
    public boolean hasAffiliations() {
        return ListUtil.hasContent(this.affiliations);
    }

    /**
     * Set the list of acknowledgements operations. This adds to any operations that are already saved.
     *
     * @param acknowledgements List of {@link FieldOperation} objects.
     */
    @JsonSetter("acknowledgements")
    private void acknowledgements(final List<FieldOperation> acknowledgements) {
        this.acknowledgements = ListUtil.add(acknowledgements, this.acknowledgements);
    }

    /**
     * Add to the list of acknowledgements operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery acknowledgements(final FieldOperation fieldOperation) {
        this.acknowledgements = ListUtil.add(fieldOperation, this.acknowledgements);
        return this;
    }

    /**
     * Add to the list of acknowledgements operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery acknowledgements(final String extractAs) {
        this.acknowledgements = ListUtil.add(new FieldOperation().extractAs(extractAs), this.acknowledgements);
        return this;
    }

    /**
     * Add to the list of acknowledgements operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery acknowledgements(final Filter filter) {
        this.acknowledgements = ListUtil.add(new FieldOperation().filter(filter), this.acknowledgements);
        return this;
    }

    /**
     * Get an iterable over acknowledgements operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("acknowledgements")
    public Iterable<FieldOperation> acknowledgements() {
        return ListUtil.iterable(this.acknowledgements);
    }

    /**
     * Return whether any acknowledgements operations exist.
     *
     * @return True if any acknowledgements operations exist.
     */
    @JsonIgnore
    public boolean hasAcknowledgements() {
        return ListUtil.hasContent(this.acknowledgements);
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
    public ReferenceQuery tags(final FieldOperation fieldOperation) {
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
    public ReferenceQuery tags(final String extractAs) {
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
    public ReferenceQuery tags(final Filter filter) {
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
    public ReferenceQuery length(final FieldOperation fieldOperation) {
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
    public ReferenceQuery length(final String extractAs) {
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
    public ReferenceQuery length(final Filter filter) {
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
    public ReferenceQuery offset(final FieldOperation fieldOperation) {
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
    public ReferenceQuery offset(final String extractAs) {
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
    public ReferenceQuery offset(final Filter filter) {
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

    /** Title of the reference. */
    private List<FieldOperation> title;

    /** Authors of the reference. */
    private List<NameQuery> authors;

    /** Affiliations of the authors. */
    private List<FieldOperation> affiliations;

    /** Acknowledgements. */
    private List<FieldOperation> acknowledgements;

    /** List of tag operations. */
    private List<FieldOperation> tags;

    /** Length of that array that this object appears in. */
    private List<FieldOperation> length;

    /** Offset of this object in the array that it appears in. */
    private List<FieldOperation> offset;
}