package io.citrine.jcc.search.pif.query.core;

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
    public PropertyQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public PropertyQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public PropertyQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public PropertyQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public PropertyQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public PropertyQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public PropertyQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public PropertyQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public PropertyQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public PropertyQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public PropertyQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public PropertyQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public PropertyQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public PropertyQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public PropertyQuery setName(final List<FieldQuery> name) {
        super.setName(name);
        return this;
    }

    @Override
    public PropertyQuery addName(final List<FieldQuery> name) {
        super.addName(name);
        return this;
    }

    @Override
    public PropertyQuery addName(final FieldQuery name) {
        super.addName(name);
        return this;
    }

    @Override
    public PropertyQuery setValue(final List<FieldQuery> value) {
        super.setValue(value);
        return this;
    }

    @Override
    public PropertyQuery addValue(final List<FieldQuery> value) {
        super.addValue(value);
        return this;
    }

    @Override
    public PropertyQuery addValue(final FieldQuery value) {
        super.addValue(value);
        return this;
    }

    @Override
    public PropertyQuery setFile(final List<FileReferenceQuery> file) {
        super.setFile(file);
        return this;
    }

    @Override
    public PropertyQuery addFile(final List<FileReferenceQuery> file) {
        super.addFile(file);
        return this;
    }

    @Override
    public PropertyQuery addFile(final FileReferenceQuery file) {
        super.addFile(file);
        return this;
    }

    @Override
    public PropertyQuery setUnits(final List<FieldQuery> units) {
        super.setUnits(units);
        return this;
    }

    @Override
    public PropertyQuery addUnits(final List<FieldQuery> units) {
        super.addUnits(units);
        return this;
    }

    @Override
    public PropertyQuery addUnits(final FieldQuery units) {
        super.addUnits(units);
        return this;
    }

    /**
     * Set the conditions operations. This adds to any operations that are already saved.
     *
     * @param conditions List of {@link ValueQuery} objects.
     * @return This object.
     */
    public PropertyQuery setConditions(final List<ValueQuery> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Add to the list of conditions operations.
     *
     * @param conditions {@link ValueQuery} to add.
     * @return This object.
     */
    public PropertyQuery addConditions(final List<ValueQuery> conditions) {
        this.conditions = ListUtil.add(conditions, this.conditions);
        return this;
    }

    /**
     * Add to the list of conditions operations.
     *
     * @param conditions {@link ValueQuery} to add.
     * @return This object.
     */
    public PropertyQuery addConditions(final ValueQuery conditions) {
        this.conditions = ListUtil.add(conditions, this.conditions);
        return this;
    }

    /**
     * Get the length of the conditions queries.
     *
     * @return Number of conditions queries.
     */
    public int conditionsLength() {
        return ListUtil.length(this.conditions);
    }

    /**
     * Get an iterable over conditions operations.
     *
     * @return Iterable of {@link ValueQuery} objects.
     */
    public Iterable<ValueQuery> conditions() {
        return ListUtil.iterable(this.conditions);
    }

    /**
     * Get the conditions query at the input index.
     *
     * @param index Index of the conditions query to get.
     * @return {@link ValueQuery} at the input index.
     */
    public ValueQuery getConditions(final int index) {
        return ListUtil.get(this.conditions, index);
    }

    /**
     * Get the conditions field queries.
     *
     * @return List of {@link ValueQuery} objects.
     */
    public List<ValueQuery> getConditions() {
        return this.conditions;
    }

    /**
     * Set the dataType operations. This adds to any operations that are already saved.
     *
     * @param dataType List of {@link FieldQuery} objects.
     * @return This object.
     */
    public PropertyQuery setDataType(final List<FieldQuery> dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Add to the list of dataType operations.
     *
     * @param dataType {@link FieldQuery} to add.
     * @return This object.
     */
    public PropertyQuery addDataType(final List<FieldQuery> dataType) {
        this.dataType = ListUtil.add(dataType, this.dataType);
        return this;
    }

    /**
     * Add to the list of dataType operations.
     *
     * @param dataType {@link FieldQuery} to add.
     * @return This object.
     */
    public PropertyQuery addDataType(final FieldQuery dataType) {
        this.dataType = ListUtil.add(dataType, this.dataType);
        return this;
    }

    /**
     * Get the length of the dataType queries.
     *
     * @return Number of dataType queries.
     */
    public int dataTypeLength() {
        return ListUtil.length(this.dataType);
    }

    /**
     * Get an iterable over dataType operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> dataType() {
        return ListUtil.iterable(this.dataType);
    }

    /**
     * Get the dataType query at the input index.
     *
     * @param index Index of the dataType query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getDataType(final int index) {
        return ListUtil.get(this.dataType, index);
    }

    /**
     * Get the dataType field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getDataType() {
        return this.dataType;
    }

    /** List of conditions queries. */
    private List<ValueQuery> conditions;

    /** List of data type queries. */
    private List<FieldQuery> dataType;
}