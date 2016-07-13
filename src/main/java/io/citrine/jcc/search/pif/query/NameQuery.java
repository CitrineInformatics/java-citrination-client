package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.Logic;
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
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery given(final Filter filter) {
        this.given = ListUtil.add(new FieldOperation().filter(filter), this.given);
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
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery family(final Filter filter) {
        this.family = ListUtil.add(new FieldOperation().filter(filter), this.family);
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
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery title(final Filter filter) {
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
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery suffix(final Filter filter) {
        this.suffix = ListUtil.add(new FieldOperation().filter(filter), this.suffix);
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

    @Override
    @JsonIgnore
    public NameQuery tags(final FieldOperation fieldOperation) {
        super.tags(fieldOperation);
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
    public NameQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
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
    public NameQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
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
    private List<FieldOperation> given;

    /** Family name for the query. */
    private List<FieldOperation> family;

    /** Title of the person. */
    private List<FieldOperation> title;

    /** Suffix of the person. */
    private List<FieldOperation> suffix;

    /** Alias to save this field under. */
    private String extractAs;
}