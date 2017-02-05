package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query to execute against a file reference field.
 * 
 * @author Kyle Michel
 */
public class FileReferenceQuery extends BaseObjectQuery {

    @Override
    @JsonSetter("logic")
    public FileReferenceQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonSetter("extractAs")
    public FileReferenceQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public FileReferenceQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public FileReferenceQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    /**
     * Set the list of relative path operations. This adds to any operations that are already saved.
     *
     * @param relativePath List of {@link FieldQuery} objects.
     */
    @JsonSetter("relativePath")
    private void relativePath(final List<FieldQuery> relativePath) {
        this.relativePath = ListUtil.add(relativePath, this.relativePath);
    }

    /**
     * Add to the list of relative path operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery relativePath(final FieldQuery fieldQuery) {
        this.relativePath = ListUtil.add(fieldQuery, this.relativePath);
        return this;
    }

    /**
     * Add to the list of relative path operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery relativePath(final String extractAs) {
        this.relativePath = ListUtil.add(new FieldQuery().extractAs(extractAs), this.relativePath);
        return this;
    }

    /**
     * Add to the list of relative path operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery relativePath(final Filter filter) {
        this.relativePath = ListUtil.add(new FieldQuery().filter(filter), this.relativePath);
        return this;
    }

    /**
     * Get an iterable over relative path operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("relativePath")
    public Iterable<FieldQuery> relativePath() {
        return ListUtil.iterable(this.relativePath);
    }

    /**
     * Return whether any relative path operations exist.
     *
     * @return True if any relativePath operations exist.
     */
    @JsonIgnore
    public boolean hasRelativePath() {
        return ListUtil.hasContent(this.relativePath);
    }

    /**
     * Set the list of mime type operations. This adds to any operations that are already saved.
     *
     * @param mimeType List of {@link FieldQuery} objects.
     */
    @JsonSetter("mimeType")
    private void mimeType(final List<FieldQuery> mimeType) {
        this.mimeType = ListUtil.add(mimeType, this.mimeType);
    }

    /**
     * Add to the list of mime type operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery mimeType(final FieldQuery fieldQuery) {
        this.mimeType = ListUtil.add(fieldQuery, this.mimeType);
        return this;
    }

    /**
     * Add to the list of mime type operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery mimeType(final String extractAs) {
        this.mimeType = ListUtil.add(new FieldQuery().extractAs(extractAs), this.mimeType);
        return this;
    }

    /**
     * Add to the list of mime type operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery mimeType(final Filter filter) {
        this.mimeType = ListUtil.add(new FieldQuery().filter(filter), this.mimeType);
        return this;
    }

    /**
     * Get an iterable over mime type operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("mimeType")
    public Iterable<FieldQuery> mimeType() {
        return ListUtil.iterable(this.mimeType);
    }

    /**
     * Return whether any mime type operations exist.
     *
     * @return True if any mimeType operations exist.
     */
    @JsonIgnore
    public boolean hasMimeType() {
        return ListUtil.hasContent(this.mimeType);
    }

    /**
     * Set the list of sha256 hash operations. This adds to any operations that are already saved.
     *
     * @param sha256 List of {@link FieldQuery} objects.
     */
    @JsonSetter("sha256")
    private void sha256(final List<FieldQuery> sha256) {
        this.sha256 = ListUtil.add(sha256, this.sha256);
    }

    /**
     * Add to the list of sha256 hash operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery sha256(final FieldQuery fieldQuery) {
        this.sha256 = ListUtil.add(fieldQuery, this.sha256);
        return this;
    }

    /**
     * Add to the list of sha256 hash operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery sha256(final String extractAs) {
        this.sha256 = ListUtil.add(new FieldQuery().extractAs(extractAs), this.sha256);
        return this;
    }

    /**
     * Add to the list of sha256 hash operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery sha256(final Filter filter) {
        this.sha256 = ListUtil.add(new FieldQuery().filter(filter), this.sha256);
        return this;
    }

    /**
     * Get an iterable over sha256 hash operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("sha256")
    public Iterable<FieldQuery> sha256() {
        return ListUtil.iterable(this.sha256);
    }

    /**
     * Return whether any sha256 hash operations exist.
     *
     * @return True if any sha256 operations exist.
     */
    @JsonIgnore
    public boolean hasSha256() {
        return ListUtil.hasContent(this.sha256);
    }

    /**
     * Set the list of md5 sum operations. This adds to any operations that are already saved.
     *
     * @param md5 List of {@link FieldQuery} objects.
     */
    @JsonSetter("md5")
    private void md5(final List<FieldQuery> md5) {
        this.md5 = ListUtil.add(md5, this.md5);
    }

    /**
     * Add to the list of md5 sum operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery md5(final FieldQuery fieldQuery) {
        this.md5 = ListUtil.add(fieldQuery, this.md5);
        return this;
    }

    /**
     * Add to the list of md5 sum operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery md5(final String extractAs) {
        this.md5 = ListUtil.add(new FieldQuery().extractAs(extractAs), this.md5);
        return this;
    }

    /**
     * Add to the list of md5 sum operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery md5(final Filter filter) {
        this.md5 = ListUtil.add(new FieldQuery().filter(filter), this.md5);
        return this;
    }

    /**
     * Get an iterable over md5 sum operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("md5")
    public Iterable<FieldQuery> md5() {
        return ListUtil.iterable(this.md5);
    }

    /**
     * Return whether any md5 sum operations exist.
     *
     * @return True if any md5 operations exist.
     */
    @JsonIgnore
    public boolean hasMd5() {
        return ListUtil.hasContent(this.md5);
    }

    @Override
    @JsonIgnore
    public FileReferenceQuery tags(final FieldQuery fieldQuery) {
        super.tags(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public FileReferenceQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public FileReferenceQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public FileReferenceQuery length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public FileReferenceQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public FileReferenceQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public FileReferenceQuery offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public FileReferenceQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public FileReferenceQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** Operations against the relative path. */
    private List<FieldQuery> relativePath;

    /** Operation against the mimetype. */
    private List<FieldQuery> mimeType;

    /** Operation against the sha256 hash. */
    private List<FieldQuery> sha256;
    
    /** Operations against the md5 sum. */
    private List<FieldQuery> md5;
}