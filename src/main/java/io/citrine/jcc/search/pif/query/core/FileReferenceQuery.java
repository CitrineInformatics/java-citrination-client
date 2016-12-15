package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.Logic;
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

    /**
     * Set the list of relative path operations. This adds to any operations that are already saved.
     *
     * @param relativePath List of {@link FieldOperation} objects.
     */
    @JsonSetter("relativePath")
    private void relativePath(final List<FieldOperation> relativePath) {
        this.relativePath = ListUtil.add(relativePath, this.relativePath);
    }

    /**
     * Add to the list of relative path operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery relativePath(final FieldOperation fieldOperation) {
        this.relativePath = ListUtil.add(fieldOperation, this.relativePath);
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
        this.relativePath = ListUtil.add(new FieldOperation().extractAs(extractAs), this.relativePath);
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
        this.relativePath = ListUtil.add(new FieldOperation().filter(filter), this.relativePath);
        return this;
    }

    /**
     * Get an iterable over relative path operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("relativePath")
    public Iterable<FieldOperation> relativePath() {
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
     * @param mimeType List of {@link FieldOperation} objects.
     */
    @JsonSetter("mimeType")
    private void mimeType(final List<FieldOperation> mimeType) {
        this.mimeType = ListUtil.add(mimeType, this.mimeType);
    }

    /**
     * Add to the list of mime type operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery mimeType(final FieldOperation fieldOperation) {
        this.mimeType = ListUtil.add(fieldOperation, this.mimeType);
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
        this.mimeType = ListUtil.add(new FieldOperation().extractAs(extractAs), this.mimeType);
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
        this.mimeType = ListUtil.add(new FieldOperation().filter(filter), this.mimeType);
        return this;
    }

    /**
     * Get an iterable over mime type operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("mimeType")
    public Iterable<FieldOperation> mimeType() {
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
     * @param sha256 List of {@link FieldOperation} objects.
     */
    @JsonSetter("sha256")
    private void sha256(final List<FieldOperation> sha256) {
        this.sha256 = ListUtil.add(sha256, this.sha256);
    }

    /**
     * Add to the list of sha256 hash operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery sha256(final FieldOperation fieldOperation) {
        this.sha256 = ListUtil.add(fieldOperation, this.sha256);
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
        this.sha256 = ListUtil.add(new FieldOperation().extractAs(extractAs), this.sha256);
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
        this.sha256 = ListUtil.add(new FieldOperation().filter(filter), this.sha256);
        return this;
    }

    /**
     * Get an iterable over sha256 hash operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("sha256")
    public Iterable<FieldOperation> sha256() {
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
     * @param md5 List of {@link FieldOperation} objects.
     */
    @JsonSetter("md5")
    private void md5(final List<FieldOperation> md5) {
        this.md5 = ListUtil.add(md5, this.md5);
    }

    /**
     * Add to the list of md5 sum operations.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public FileReferenceQuery md5(final FieldOperation fieldOperation) {
        this.md5 = ListUtil.add(fieldOperation, this.md5);
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
        this.md5 = ListUtil.add(new FieldOperation().extractAs(extractAs), this.md5);
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
        this.md5 = ListUtil.add(new FieldOperation().filter(filter), this.md5);
        return this;
    }

    /**
     * Get an iterable over md5 sum operations.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("md5")
    public Iterable<FieldOperation> md5() {
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
    public FileReferenceQuery tags(final FieldOperation fieldOperation) {
        super.tags(fieldOperation);
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
    public FileReferenceQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
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
    public FileReferenceQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
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
    private List<FieldOperation> relativePath;

    /** Operation against the mimetype. */
    private List<FieldOperation> mimeType;

    /** Operation against the sha256 hash. */
    private List<FieldOperation> sha256;
    
    /** Operations against the md5 sum. */
    private List<FieldOperation> md5;
}