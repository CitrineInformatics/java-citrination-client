package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;
import io.citrine.jpif.obj.common.DisplayItem;

import java.util.List;

/**
 * Query against a {@link DisplayItem} object.
 */
public class DisplayItemQuery extends BaseObjectQuery {


    @Override
    public DisplayItemQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public DisplayItemQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public DisplayItemQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public DisplayItemQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public DisplayItemQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    @JsonIgnore
    public DisplayItemQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    @JsonIgnore
    public DisplayItemQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public DisplayItemQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    @JsonIgnore
    public DisplayItemQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    @JsonIgnore
    public DisplayItemQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public DisplayItemQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    @JsonIgnore
    public DisplayItemQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    @JsonIgnore
    public DisplayItemQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the number operations. This adds to any operations that are already saved.
     *
     * @param number List of {@link FieldQuery} objects.
     * @return This object.
     */
    public DisplayItemQuery setNumber(final List<FieldQuery> number) {
        this.number = number;
        return this;
    }

    /**
     * Add to the list of number operations.
     *
     * @param number {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public DisplayItemQuery addNumber(final List<FieldQuery> number) {
        this.number = ListUtil.add(number, this.number);
        return this;
    }

    /**
     * Add to the list of number operations.
     *
     * @param number {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public DisplayItemQuery addNumber(final FieldQuery number) {
        this.number = ListUtil.add(number, this.number);
        return this;
    }

    /**
     * Get the length of the number queries.
     *
     * @return Number of number queries.
     */
    @JsonIgnore
    public int numberLength() {
        return ListUtil.length(this.number);
    }

    /**
     * Get an iterable over number operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonIgnore
    public Iterable<FieldQuery> number() {
        return ListUtil.iterable(this.number);
    }

    /**
     * Get the number query at the input index.
     *
     * @param index Index of the number query to get.
     * @return {@link FieldQuery} at the input index.
     */
    @JsonIgnore
    public FieldQuery getNumber(final int index) {
        return ListUtil.get(this.number, index);
    }

    /**
     * Get the number field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getNumber() {
        return this.number;
    }

    /**
     * Set the title operations. This adds to any operations that are already saved.
     *
     * @param title List of {@link FieldQuery} objects.
     * @return This object.
     */
    public DisplayItemQuery setTitle(final List<FieldQuery> title) {
        this.title = title;
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param title {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public DisplayItemQuery addTitle(final List<FieldQuery> title) {
        this.title = ListUtil.add(title, this.title);
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param title {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public DisplayItemQuery addTitle(final FieldQuery title) {
        this.title = ListUtil.add(title, this.title);
        return this;
    }

    /**
     * Get the length of the title queries.
     *
     * @return Title of title queries.
     */
    @JsonIgnore
    public int titleLength() {
        return ListUtil.length(this.title);
    }

    /**
     * Get an iterable over title operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonIgnore
    public Iterable<FieldQuery> title() {
        return ListUtil.iterable(this.title);
    }

    /**
     * Get the title query at the input index.
     *
     * @param index Index of the title query to get.
     * @return {@link FieldQuery} at the input index.
     */
    @JsonIgnore
    public FieldQuery getTitle(final int index) {
        return ListUtil.get(this.title, index);
    }

    /**
     * Get the title field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getTitle() {
        return this.title;
    }

    /**
     * Set the caption operations. This adds to any operations that are already saved.
     *
     * @param caption List of {@link FieldQuery} objects.
     * @return This object.
     */
    public DisplayItemQuery setCaption(final List<FieldQuery> caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Add to the list of caption operations.
     *
     * @param caption {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public DisplayItemQuery addCaption(final List<FieldQuery> caption) {
        this.caption = ListUtil.add(caption, this.caption);
        return this;
    }

    /**
     * Add to the list of caption operations.
     *
     * @param caption {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public DisplayItemQuery addCaption(final FieldQuery caption) {
        this.caption = ListUtil.add(caption, this.caption);
        return this;
    }

    /**
     * Get the length of the caption queries.
     *
     * @return Caption of caption queries.
     */
    @JsonIgnore
    public int captionLength() {
        return ListUtil.length(this.caption);
    }

    /**
     * Get an iterable over caption operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonIgnore
    public Iterable<FieldQuery> caption() {
        return ListUtil.iterable(this.caption);
    }

    /**
     * Get the caption query at the input index.
     *
     * @param index Index of the caption query to get.
     * @return {@link FieldQuery} at the input index.
     */
    @JsonIgnore
    public FieldQuery getCaption(final int index) {
        return ListUtil.get(this.caption, index);
    }

    /**
     * Get the caption field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getCaption() {
        return this.caption;
    }

    /** Number of the display item. */
    private List<FieldQuery> number;

    /** Title of the display item.. */
    private List<FieldQuery> title;

    /** Caption of the display item. */
    private List<FieldQuery> caption;
}