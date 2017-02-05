package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query to execute against a name field.
 *
 * @author Kyle Michel
 */
public class NameQuery extends BaseObjectQuery {

    @Override
    @JsonSetter("logic")
    public NameQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonSetter("extractAs")
    public NameQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public NameQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public NameQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    /**
     * Set the list of given name operations. This adds to any operations that are already saved.
     *
     * @param given List of {@link FieldQuery} objects.
     */
    @JsonSetter("given")
    private void given(final List<FieldQuery> given) {
        this.given = ListUtil.add(given, this.given);
    }

    /**
     * Add to the list of given name operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery given(final FieldQuery fieldQuery) {
        this.given = ListUtil.add(fieldQuery, this.given);
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
        this.given = ListUtil.add(new FieldQuery().extractAs(extractAs), this.given);
        return this;
    }

    /**
     * Add to the list of given name operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery given(final Filter filter) {
        this.given = ListUtil.add(new FieldQuery().filter(filter), this.given);
        return this;
    }

    /**
     * Get an iterable over given name operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("given")
    public Iterable<FieldQuery> given() {
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
     * @param family List of {@link FieldQuery} objects.
     */
    @JsonSetter("family")
    private void family(final List<FieldQuery> family) {
        this.family = ListUtil.add(family, this.family);
    }

    /**
     * Add to the list of family name operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery family(final FieldQuery fieldQuery) {
        this.family = ListUtil.add(fieldQuery, this.family);
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
        this.family = ListUtil.add(new FieldQuery().extractAs(extractAs), this.family);
        return this;
    }

    /**
     * Add to the list of family name operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery family(final Filter filter) {
        this.family = ListUtil.add(new FieldQuery().filter(filter), this.family);
        return this;
    }

    /**
     * Get an iterable over family name operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("family")
    public Iterable<FieldQuery> family() {
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
     * @param title List of {@link FieldQuery} objects.
     */
    @JsonSetter("title")
    private void title(final List<FieldQuery> title) {
        this.title = ListUtil.add(title, this.title);
    }

    /**
     * Add to the list of title operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery title(final FieldQuery fieldQuery) {
        this.title = ListUtil.add(fieldQuery, this.title);
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
        this.title = ListUtil.add(new FieldQuery().extractAs(extractAs), this.title);
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery title(final Filter filter) {
        this.title = ListUtil.add(new FieldQuery().filter(filter), this.title);
        return this;
    }

    /**
     * Get an iterable over title operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("title")
    public Iterable<FieldQuery> title() {
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
     * @param suffix List of {@link FieldQuery} objects.
     */
    @JsonSetter("suffix")
    private void suffix(final List<FieldQuery> suffix) {
        this.suffix = ListUtil.add(suffix, this.suffix);
    }

    /**
     * Add to the list of suffix operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery suffix(final FieldQuery fieldQuery) {
        this.suffix = ListUtil.add(fieldQuery, this.suffix);
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
        this.suffix = ListUtil.add(new FieldQuery().extractAs(extractAs), this.suffix);
        return this;
    }

    /**
     * Add to the list of suffix operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery suffix(final Filter filter) {
        this.suffix = ListUtil.add(new FieldQuery().filter(filter), this.suffix);
        return this;
    }

    /**
     * Get an iterable over suffix operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("suffix")
    public Iterable<FieldQuery> suffix() {
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

    @Override
    @JsonIgnore
    public NameQuery tags(final FieldQuery fieldQuery) {
        super.tags(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public NameQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public NameQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public NameQuery length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public NameQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public NameQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public NameQuery offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public NameQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public NameQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** Given name for the query. */
    private List<FieldQuery> given;

    /** Family name for the query. */
    private List<FieldQuery> family;

    /** Title of the person. */
    private List<FieldQuery> title;

    /** Suffix of the person. */
    private List<FieldQuery> suffix;
}