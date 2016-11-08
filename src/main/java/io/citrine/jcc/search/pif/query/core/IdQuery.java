package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.Logic;
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

    /**
     * Set the list of id name operations. This adds to any operations that are already saved.
     *
     * @param name List of {@link FieldOperation} objects.
     */
    @JsonSetter("name")
    private void name(final List<FieldOperation> name) {
        this.name = ListUtil.add(name, this.name);
    }

    /**
     * Add to the list of id name operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public IdQuery name(final FieldOperation fieldOperation) {
        this.name = ListUtil.add(fieldOperation, this.name);
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
        this.name = ListUtil.add(new FieldOperation().extractAs(extractAs), this.name);
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
        this.name = ListUtil.add(new FieldOperation().filter(filter), this.name);
        return this;
    }

    /**
     * Get an iterable over id name operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("name")
    public Iterable<FieldOperation> name() {
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
     * @param value List of {@link FieldOperation} objects.
     */
    @JsonSetter("value")
    private void value(final List<FieldOperation> value) {
        this.value = ListUtil.add(value, this.value);
    }

    /**
     * Add to the list of id value operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public IdQuery value(final FieldOperation fieldOperation) {
        this.value = ListUtil.add(fieldOperation, this.value);
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
        this.value = ListUtil.add(new FieldOperation().extractAs(extractAs), this.value);
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
        this.value = ListUtil.add(new FieldOperation().filter(filter), this.value);
        return this;
    }

    /**
     * Get an iterable over id value operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("value")
    public Iterable<FieldOperation> value() {
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
    public IdQuery tags(final FieldOperation fieldOperation) {
        super.tags(fieldOperation);
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
    public IdQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
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
    public IdQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
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
    private List<FieldOperation> name;

    /** Value of the id. */
    private List<FieldOperation> value;
    
    
}