package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query against the source of a system.
 *
 * @author Kyle Michel
 */
public class SourceQuery extends BaseObjectQuery {

    /**
     * Set the list of producer operations. This adds to any operations that already exist.
     *
     * @param producer List of {@link FieldQuery} objects.
     */
    @JsonSetter("producer")
    private void producer(final List<FieldQuery> producer) {
        this.producer = ListUtil.add(producer, this.producer);
    }

    /**
     * Add a single producer operation.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public SourceQuery producer(final FieldQuery fieldQuery) {
        this.producer = ListUtil.add(fieldQuery, this.producer);
        return this;
    }

    /**
     * Add a single producer operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public SourceQuery producer(final String extractAs) {
        this.producer = ListUtil.add(new FieldQuery().extractAs(extractAs), this.producer);
        return this;
    }

    /**
     * Add a single producer operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public SourceQuery producer(final Filter filter) {
        this.producer = ListUtil.add(new FieldQuery().filter(filter), this.producer);
        return this;
    }

    /**
     * Get an iterable object over the producers fields.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("producer")
    public Iterable<FieldQuery> producer() {
        return ListUtil.iterable(this.producer);
    }

    /**
     * Return whether any producer operations exist.
     *
     * @return True if any producer operations exist.
     */
    @JsonIgnore
    public boolean hasProducer() {
        return ListUtil.hasContent(this.producer);
    }

    /**
     * Set the list of url operations. This adds to any operations that already exist.
     *
     * @param url List of {@link FieldQuery} objects.
     */
    @JsonSetter("url")
    private void url(final List<FieldQuery> url) {
        this.url = ListUtil.add(url, this.url);
    }

    /**
     * Add a single url operation.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public SourceQuery url(final FieldQuery fieldQuery) {
        this.url = ListUtil.add(fieldQuery, this.url);
        return this;
    }

    /**
     * Add a single url operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public SourceQuery url(final String extractAs) {
        this.url = ListUtil.add(new FieldQuery().extractAs(extractAs), this.url);
        return this;
    }

    /**
     * Add a single url operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public SourceQuery url(final Filter filter) {
        this.url = ListUtil.add(new FieldQuery().filter(filter), this.url);
        return this;
    }

    /**
     * Get an iterable object over the urls fields.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("url")
    public Iterable<FieldQuery> url() {
        return ListUtil.iterable(this.url);
    }

    /**
     * Return whether any url operations exist.
     *
     * @return True if any url operations exist.
     */
    @JsonIgnore
    public boolean hasUrl() {
        return ListUtil.hasContent(this.url);
    }

    @Override
    @JsonSetter("logic")
    public SourceQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonSetter("extractAs")
    public SourceQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public SourceQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public SourceQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public SourceQuery tags(final FieldQuery fieldQuery) {
        super.tags(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public SourceQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public SourceQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public SourceQuery length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public SourceQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public SourceQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public SourceQuery offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public SourceQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public SourceQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** Producer of the system. */
    private List<FieldQuery> producer;

    /** URL to the source. */
    private List<FieldQuery> url;
}