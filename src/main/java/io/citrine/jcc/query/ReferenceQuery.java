package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
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
     * @param authors List of {@link NameQuery} objects.
     */
    @JsonSetter("authors")
    private void authors(final List<NameQuery> authors) {
        this.authors = ListUtil.add(authors, this.authors);
    }

    /**
     * Add to the list of authors operations.
     *
     * @param authors {@link NameQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery authors(final NameQuery authors) {
        this.authors = ListUtil.add(authors, this.authors);
        return this;
    }

    /**
     * Get an iterable of authors operations.
     *
     * @return Iterable of {@link NameQuery} objects.
     */
    @JsonGetter("authors")
    public Iterable<NameQuery> authors() {
        return this.authors;
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

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** Title of the reference. */
    private List<FieldOperation> title = new ArrayList<>();

    /** Authors of the reference. */
    private List<NameQuery> authors = new ArrayList<>();
}