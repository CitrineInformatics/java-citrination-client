package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query to execute against a classification field.
 *
 * @author Kyle Michel
 */
public class ClassificationQuery extends BaseObjectQuery {

    @Override
    public ClassificationQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public ClassificationQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public ClassificationQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public ClassificationQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public ClassificationQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override

    public ClassificationQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override

    public ClassificationQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public ClassificationQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override

    public ClassificationQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override

    public ClassificationQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public ClassificationQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override

    public ClassificationQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override

    public ClassificationQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the name operations. This adds to any operations that are already saved.
     *
     * @param name List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ClassificationQuery setName(final List<FieldQuery> name) {
        this.name = name;
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param name {@link FieldQuery} to add.
     * @return This object.
     */

    public ClassificationQuery addName(final List<FieldQuery> name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Add to the list of name operations.
     *
     * @param name {@link FieldQuery} to add.
     * @return This object.
     */

    public ClassificationQuery addName(final FieldQuery name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Get the length of the name queries.
     *
     * @return Number of name queries.
     */

    public int nameLength() {
        return ListUtil.length(this.name);
    }

    /**
     * Get an iterable over name operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */

    public Iterable<FieldQuery> name() {
        return ListUtil.iterable(this.name);
    }

    /**
     * Get the name query at the input index.
     *
     * @param index Index of the name query to get.
     * @return {@link FieldQuery} at the input index.
     */

    public FieldQuery getName(final int index) {
        return ListUtil.get(this.name, index);
    }

    /**
     * Get the name field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getName() {
        return this.name;
    }

    /**
     * Set the value operations. This adds to any operations that are already saved.
     *
     * @param value List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ClassificationQuery setValue(final List<FieldQuery> value) {
        this.value = value;
        return this;
    }

    /**
     * Add to the list of value operations.
     *
     * @param value {@link FieldQuery} to add.
     * @return This object.
     */

    public ClassificationQuery addValue(final List<FieldQuery> value) {
        this.value = ListUtil.add(value, this.value);
        return this;
    }

    /**
     * Add to the list of value operations.
     *
     * @param value {@link FieldQuery} to add.
     * @return This object.
     */

    public ClassificationQuery addValue(final FieldQuery value) {
        this.value = ListUtil.add(value, this.value);
        return this;
    }

    /**
     * Get the length of the value queries.
     *
     * @return Number of value queries.
     */

    public int valueLength() {
        return ListUtil.length(this.value);
    }

    /**
     * Get an iterable over value operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */

    public Iterable<FieldQuery> value() {
        return ListUtil.iterable(this.value);
    }

    /**
     * Get the value query at the input index.
     *
     * @param index Index of the value query to get.
     * @return {@link FieldQuery} at the input index.
     */

    public FieldQuery getValue(final int index) {
        return ListUtil.get(this.value, index);
    }

    /**
     * Get the value field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getValue() {
        return this.value;
    }

    /** Name of the classification. */
    private List<FieldQuery> name;

    /** Value of the classification. */
    private List<FieldQuery> value;
    
    
}