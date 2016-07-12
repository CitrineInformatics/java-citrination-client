package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.HasLogic;
import io.citrine.jcc.search.core.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query to execute against a name field.
 *
 * @author Kyle Michel
 */
public class NameQuery implements HasLogic {

    @Override
    @JsonSetter("logic")
    public NameQuery logic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    @JsonGetter("logic")
    public Logic logic() {
        return this.logic;
    }

    /**
     * Set the alias to save this field under.
     *
     * @param extractAs String with the alias to save this field under.
     * @return This object.
     */
    @JsonSetter("extractAs")
    public NameQuery extractAs(final String extractAs) {
        this.extractAs = extractAs;
        return this;
    }

    /**
     * Get the alias to save this field under.
     *
     * @return String with the alias to save this field under or a null pointer if not set.
     */
    @JsonGetter("extractAs")
    public String extractAs() {
        return this.extractAs;
    }

    /**
     * Set the list of given name operations. This adds to any operations that are already saved.
     *
     * @param given List of {@link FieldOperation} objects.
     */
    @JsonSetter("given")
    private void given(final List<FieldOperation> given) {
        this.given = ListUtil.add(given, this.given);
    }

    /**
     * Add to the list of given name operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery given(final FieldOperation fieldOperation) {
        this.given = ListUtil.add(fieldOperation, this.given);
        return this;
    }

    /**
     * Add to the list of given name operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery given(final String extractAs) {
        this.given = ListUtil.add(new FieldOperation().extractAs(extractAs), this.given);
        return this;
    }

    /**
     * Add to the list of given name operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery given(final FilterGroup filterGroup) {
        this.given = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.given);
        return this;
    }

    /**
     * Get an iterable over given name operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("given")
    public Iterable<FieldOperation> given() {
        return ListUtil.iterable(this.given);
    }

    /**
     * Return whether any given operations exist.
     *
     * @return True if any given operations exist.
     */
    @JsonIgnore
    public boolean hasGiven() {
        return ListUtil.hasContent(this.given);
    }

    /**
     * Set the list of family name operations. This adds to any operations that are already saved.
     *
     * @param family List of {@link FieldOperation} objects.
     */
    @JsonSetter("family")
    private void family(final List<FieldOperation> family) {
        this.family = ListUtil.add(family, this.family);
    }

    /**
     * Add to the list of family name operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery family(final FieldOperation fieldOperation) {
        this.family = ListUtil.add(fieldOperation, this.family);
        return this;
    }

    /**
     * Add to the list of family name operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery family(final String extractAs) {
        this.family = ListUtil.add(new FieldOperation().extractAs(extractAs), this.family);
        return this;
    }

    /**
     * Add to the list of family name operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery family(final FilterGroup filterGroup) {
        this.family = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.family);
        return this;
    }

    /**
     * Get an iterable over family name operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("family")
    public Iterable<FieldOperation> family() {
        return ListUtil.iterable(this.family);
    }

    /**
     * Return whether any family operations exist.
     *
     * @return True if any family operations exist.
     */
    @JsonIgnore
    public boolean hasFamily() {
        return ListUtil.hasContent(this.family);
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
    public NameQuery title(final FieldOperation fieldOperation) {
        this.title = ListUtil.add(fieldOperation, this.title);
        return this;
    }

    /**
     * Add to the list of title name operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery title(final String extractAs) {
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
    public NameQuery title(final FilterGroup filterGroup) {
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
     * Set the list of suffix operations. This adds to any operations that are already saved.
     *
     * @param suffix List of {@link FieldOperation} objects.
     */
    @JsonSetter("suffix")
    private void suffix(final List<FieldOperation> suffix) {
        this.suffix = ListUtil.add(suffix, this.suffix);
    }

    /**
     * Add to the list of suffix operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery suffix(final FieldOperation fieldOperation) {
        this.suffix = ListUtil.add(fieldOperation, this.suffix);
        return this;
    }

    /**
     * Add to the list of suffix name operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery suffix(final String extractAs) {
        this.suffix = ListUtil.add(new FieldOperation().extractAs(extractAs), this.suffix);
        return this;
    }

    /**
     * Add to the list of suffix operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery suffix(final FilterGroup filterGroup) {
        this.suffix = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.suffix);
        return this;
    }

    /**
     * Get an iterable over suffix operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("suffix")
    public Iterable<FieldOperation> suffix() {
        return ListUtil.iterable(this.suffix);
    }

    /**
     * Return whether any suffix operations exist.
     *
     * @return True if any suffix operations exist.
     */
    @JsonIgnore
    public boolean hasSuffix() {
        return ListUtil.hasContent(this.suffix);
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
    public NameQuery tags(final FieldOperation fieldOperation) {
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
    public NameQuery tags(final String extractAs) {
        this.tags = ListUtil.add(new FieldOperation().extractAs(extractAs), this.tags);
        return this;
    }

    /**
     * Add to the list of tags operations.
     *
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery tags(final FilterGroup filterGroup) {
        this.tags = ListUtil.add(new FieldOperation().filterGroup(filterGroup), this.tags);
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
    public NameQuery length(final FieldOperation fieldOperation) {
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
    public NameQuery length(final String extractAs) {
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
    public NameQuery length(final FilterGroup filterGroup) {
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
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery offset(final FieldOperation fieldOperation) {
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
    public NameQuery offset(final String extractAs) {
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
    public NameQuery offset(final FilterGroup filterGroup) {
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

    /** Given name for the query. */
    private List<FieldOperation> given;

    /** Family name for the query. */
    private List<FieldOperation> family;

    /** Title of the person. */
    private List<FieldOperation> title;

    /** Suffix of the person. */
    private List<FieldOperation> suffix;

    /** List of tag operations. */
    private List<FieldOperation> tags;

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** Alias to save this field under. */
    private String extractAs;

    /** Length of the array that this object appears in. */
    private List<FieldOperation> length;

    /** Offset for this object in the array that it appears in. */
    private List<FieldOperation> offset;
}