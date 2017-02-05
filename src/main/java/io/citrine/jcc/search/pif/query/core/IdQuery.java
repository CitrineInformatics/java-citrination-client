package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query to execute against an ID field.
 *
 * @author Kyle Michel
 */
public class IdQuery extends BaseObjectQuery {

    @Override
    @JsonSetter("logic")
    public IdQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonSetter("extractAs")
    public IdQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public IdQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public IdQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    /**
     * Set the list of id name operations. This adds to any operations that are already saved.
     *
     * @param name List of {@link FieldQuery} objects.
     */
    @JsonSetter("name")
    private void name(final List<FieldQuery> name) {
        this.name = ListUtil.add(name, this.name);
    }

    /**
     * Add to the list of id name operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public IdQuery name(final FieldQuery fieldQuery) {
        this.name = ListUtil.add(fieldQuery, this.name);
        return this;
    }

    /**
     * Add to the list of id name operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public IdQuery name(final String extractAs) {
        this.name = ListUtil.add(new FieldQuery().extractAs(extractAs), this.name);
        return this;
    }

    /**
     * Add to the list of id name operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public IdQuery name(final Filter filter) {
        this.name = ListUtil.add(new FieldQuery().filter(filter), this.name);
        return this;
    }

    /**
     * Get an iterable over id name operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("name")
    public Iterable<FieldQuery> name() {
        return ListUtil.iterable(this.name);
    }

    /**
     * Return whether any name operations exist.
     *
     * @return True if any name operations exist.
     */
    @JsonIgnore
    public boolean hasName() {
        return ListUtil.hasContent(this.name);
    }

    /**
     * Set the list of id value operations. This adds to any operations that are already saved.
     *
     * @param value List of {@link FieldQuery} objects.
     */
    @JsonSetter("value")
    private void value(final List<FieldQuery> value) {
        this.value = ListUtil.add(value, this.value);
    }

    /**
     * Add to the list of id value operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public IdQuery value(final FieldQuery fieldQuery) {
        this.value = ListUtil.add(fieldQuery, this.value);
        return this;
    }

    /**
     * Add to the list of id value operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public IdQuery value(final String extractAs) {
        this.value = ListUtil.add(new FieldQuery().extractAs(extractAs), this.value);
        return this;
    }

    /**
     * Add to the list of id value operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public IdQuery value(final Filter filter) {
        this.value = ListUtil.add(new FieldQuery().filter(filter), this.value);
        return this;
    }

    /**
     * Get an iterable over id value operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("value")
    public Iterable<FieldQuery> value() {
        return ListUtil.iterable(this.value);
    }

    /**
     * Return whether any value operations exist.
     *
     * @return True if any value operations exist.
     */
    @JsonIgnore
    public boolean hasValue() {
        return ListUtil.hasContent(this.value);
    }
    
    @Override
    @JsonIgnore
    public IdQuery tags(final FieldQuery fieldQuery) {
        super.tags(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public IdQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public IdQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public IdQuery length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public IdQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public IdQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public IdQuery offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public IdQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public IdQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** Name of the id. */
    private List<FieldQuery> name;

    /** Value of the id. */
    private List<FieldQuery> value;
    
    
}