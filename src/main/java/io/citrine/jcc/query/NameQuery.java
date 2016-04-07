package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Query against a name.
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
    public NameQuery title(final String extractAs, final FilterGroup filterGroup) {
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
     * Set the list of given operations. This adds to any operations that are already saved.
     *
     * @param given List of {@link FieldOperation} objects.
     */
    @JsonSetter("given")
    private void given(final List<FieldOperation> given) {
        this.given = ListUtil.add(given, this.given);
    }

    /**
     * Add to the list of given operations.
     *
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery given(final String extractAs, final FilterGroup filterGroup) {
        this.given = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.given);
        return this;
    }

    /**
     * Add to the list of given operations.
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
     * Add to the list of given operations.
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
     * Get an iterable over given operations.
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
     * Set the list of family operations. This adds to any operations that are already saved.
     *
     * @param family List of {@link FieldOperation} objects.
     */
    @JsonSetter("family")
    private void family(final List<FieldOperation> family) {
        this.family = ListUtil.add(family, this.family);
    }

    /**
     * Add to the list of family operations.
     *
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery family(final String extractAs, final FilterGroup filterGroup) {
        this.family = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.family);
        return this;
    }

    /**
     * Add to the list of family operations.
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
     * Add to the list of family operations.
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
     * Get an iterable over family operations.
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
     * @param extractAs Alias to extract as.
     * @param filterGroup {@link FilterGroup} to apply.
     * @return This object.
     */
    @JsonIgnore
    public NameQuery suffix(final String extractAs, final FilterGroup filterGroup) {
        this.suffix = ListUtil.add(
                new FieldOperation().extractAs(extractAs).filterGroup(filterGroup),
                this.suffix);
        return this;
    }

    /**
     * Add to the list of suffix operations.
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

    /** Logic that applies to the entire query. */
    private Logic logic;

    /** Title of the person. */
    private List<FieldOperation> title = new ArrayList<>();

    /** Given name of the person. */
    private List<FieldOperation> given = new ArrayList<>();

    /** Family name of the person. */
    private List<FieldOperation> family = new ArrayList<>();

    /** Suffix of the person. */
    private List<FieldOperation> suffix = new ArrayList<>();
}