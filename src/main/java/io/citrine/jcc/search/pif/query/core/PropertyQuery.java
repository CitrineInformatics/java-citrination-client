package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class used to match against a property.
 *
 * @author Kyle Michel
 */
public class PropertyQuery extends ValueQuery {

    @Override
    @JsonSetter("logic")
    public PropertyQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery name(final FieldOperation fieldOperation) {
        super.name(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery name(final String extractAs) {
        super.name(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery name(final Filter filter) {
        super.name(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery value(final FieldOperation fieldOperation) {
        super.value(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery value(final String extractAs) {
        super.value(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery value(final Filter filter) {
        super.value(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery units(final FieldOperation fieldOperation) {
        super.units(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery units(final String extractAs) {
        super.units(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery units(final Filter filter) {
        super.units(filter);
        return this;
    }

    @Override
    @JsonSetter("unitsNormalization")
    public PropertyQuery unitsNormalization(final UnitsNormalization unitsNormalization) {
        super.unitsNormalization(unitsNormalization);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery tags(final FieldOperation fieldOperation) {
        super.tags(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public PropertyQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /**
     * Set the list of file reference operations. This adds to any operations that are already saved.
     *
     * @param file List of {@link FileReferenceQuery} objects.
     */
    @JsonSetter("file")
    private void file(final List<FileReferenceQuery> file) {
        this.file = ListUtil.add(file, this.file);
    }

    /**
     * Add to the list of file reference operations.
     *
     * @param file {@link FileReferenceQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public PropertyQuery file(final FileReferenceQuery file) {
        this.file = ListUtil.add(file, this.file);
        return this;
    }

    /**
     * Get an iterable of file reference operations.
     *
     * @return Iterable of {@link FileReferenceQuery} objects.
     */
    @JsonGetter("file")
    public Iterable<FileReferenceQuery> file() {
        return ListUtil.iterable(this.file);
    }

    /**
     * Get whether an file reference queries exist.
     *
     * @return True if any file reference queries exist.
     */
    @JsonIgnore
    public boolean hasFile() {
        return ListUtil.hasContent(this.file);
    }

    /**
     * Set the list of conditions operations. This adds to any operations that are already saved.
     *
     * @param conditions List of {@link ValueQuery} objects.
     */
    @JsonSetter("conditions")
    private void conditions(final List<ValueQuery> conditions) {
        this.conditions = ListUtil.add(conditions, this.conditions);
    }

    /**
     * Add to the list of conditions operations.
     *
     * @param conditions {@link ValueQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public PropertyQuery conditions(final ValueQuery conditions) {
        this.conditions = ListUtil.add(conditions, this.conditions);
        return this;
    }

    /**
     * Get an iterable of conditions operations.
     *
     * @return Iterable of {@link ValueQuery} objects.
     */
    @JsonGetter("conditions")
    public Iterable<ValueQuery> conditions() {
        return ListUtil.iterable(this.conditions);
    }

    /**
     * Get whether an conditions queries exist.
     *
     * @return True if any conditions queries exist.
     */
    @JsonIgnore
    public boolean hasConditions() {
        return ListUtil.hasContent(this.conditions);
    }

    /**
     * Set the list of data type operations. This adds to any operations that are already saved.
     *
     * @param dataType List of {@link FieldOperation} objects.
     */
    @JsonSetter("dataType")
    private void dataType(final List<FieldOperation> dataType) {
        this.dataType = ListUtil.add(dataType, this.dataType);
    }

    /**
     * Add to the list of data type operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public PropertyQuery dataType(final FieldOperation fieldOperation) {
        this.dataType = ListUtil.add(fieldOperation, this.dataType);
        return this;
    }

    /**
     * Add to the list of data type operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public PropertyQuery dataType(final String extractAs) {
        this.dataType = ListUtil.add(new FieldOperation().extractAs(extractAs), this.dataType);
        return this;
    }

    /**
     * Add to the list of data type operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public PropertyQuery dataType(final Filter filter) {
        this.dataType = ListUtil.add(new FieldOperation().filter(filter), this.dataType);
        return this;
    }

    /**
     * Get an iterable over data type operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("dataType")
    public Iterable<FieldOperation> dataType() {
        return ListUtil.iterable(this.dataType);
    }

    /**
     * Return whether any data type operations exist.
     *
     * @return True if any data type operations exist.
     */
    @JsonIgnore
    public boolean hasDataType() {
        return ListUtil.hasContent(this.dataType);
    }
    
    /** List of file reference queries. */
    private List<FileReferenceQuery> file;

    /** List of conditions queries. */
    private List<ValueQuery> conditions;

    /** List of data type queries. */
    private List<FieldOperation> dataType;
}