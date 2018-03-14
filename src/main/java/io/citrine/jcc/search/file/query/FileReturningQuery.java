package io.citrine.jcc.search.file.query;

import io.citrine.jcc.search.core.query.BaseReturningQuery;
import io.citrine.jcc.search.core.query.DataQuery;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * Query to return files on Citrination.
 *
 * @author Kyle Michel
 */
public class FileReturningQuery extends BaseReturningQuery implements Serializable {

    @Override
    public FileReturningQuery setFromIndex(final Integer fromIndex) {
        super.setFrom(fromIndex);
        return this;
    }

    @Override
    public FileReturningQuery setFrom(final Integer from) {
        super.setFrom(from);
        return this;
    }

    @Override
    public FileReturningQuery setSize(final Integer size) {
        super.setSize(size);
        return this;
    }

    @Override
    public FileReturningQuery setRandomResults(final Boolean randomResults) {
        super.setRandomResults(randomResults);
        return this;
    }

    @Override
    public FileReturningQuery setRandomSeed(final Integer randomSeed) {
        super.setRandomSeed(randomSeed);
        return this;
    }

    @Override
    public FileReturningQuery setScoreRelevance(final Boolean scoreRelevance) {
        super.setScoreRelevance(scoreRelevance);
        return this;
    }

    @Override
    public FileReturningQuery setReturnMaxScore(final Boolean returnMaxScore) {
        super.setReturnMaxScore(returnMaxScore);
        return this;
    }

    @Override
    public FileReturningQuery setQuery(final List<DataQuery> query) {
        super.setQuery(query);
        return this;
    }

    @Override
    public FileReturningQuery addQuery(final List<DataQuery> query) {
        super.addQuery(query);
        return this;
    }

    @Override
    public FileReturningQuery addQuery(final DataQuery query) {
        super.addQuery(query);
        return this;
    }

    @Override
    public FileReturningQuery setReturnAnalysis(final Boolean returnAnalysis) {
        super.setReturnAnalysis(returnAnalysis);
        return this;
    }

    @Override
    public FileReturningQuery setTimeout(final Integer timeout) {
        super.setTimeout(timeout);
        return this;
    }

    /**
     * Set the maximum number of highlights to return.
     *
     * @param maxContentHighlights Integer with the maximum number of highlights to return.
     * @return This object.
     */
    public FileReturningQuery setMaxContentHighlights(final Integer maxContentHighlights) {
        this.maxContentHighlights = maxContentHighlights;
        return this;
    }

    /**
     * Get the maximum number of highlights to return.
     *
     * @return Integer with the maximum number of highlights to return.
     */
    public Integer getMaxContentHighlights() {
        return this.maxContentHighlights;
    }

    /**
     * Set the tag to use at the beginning of a highlight.
     *
     * @param highlightPreTag String with the tag to apply to the beginning of a highlight.
     * @return This object.
     */
    public FileReturningQuery setHighlightPreTag(final String highlightPreTag) {
        this.highlightPreTag = highlightPreTag;
        return this;
    }

    /**
     * Get the tag to use at the beginning of a highlight.
     *
     * @return String with the tag to use at the beginning of a highlight.
     */
    public String getHighlightPreTag() {
        return this.highlightPreTag;
    }

    /**
     * Set the tag to use at the end of highlights.
     *
     * @param highlightPostTag String with the tag to use at the end of highlighted sections.
     * @return This object.
     */
    public FileReturningQuery setHighlightPostTag(final String highlightPostTag) {
        this.highlightPostTag = highlightPostTag;
        return this;
    }

    /**
     * Get the tag to use at the end of highlights.
     *
     * @return String with the tag to use at the end of highlighted sections.
     */
    public String getHighlightPostTag() {
        return this.highlightPostTag;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof FileReturningQuery)) {
            return false;
        }
        final FileReturningQuery rhsQuery = (FileReturningQuery) rhs;
        return super.equals(rhs)
                && Optional.ofNullable(this.maxContentHighlights)
                        .equals(Optional.ofNullable(rhsQuery.maxContentHighlights))
                && Optional.ofNullable(this.highlightPreTag).equals(Optional.ofNullable(rhsQuery.highlightPreTag))
                && Optional.ofNullable(this.highlightPostTag).equals(Optional.ofNullable(rhsQuery.highlightPostTag));
    }

    /**
     * Write this object to the output output stream.
     *
     * @param out {@link ObjectOutputStream} to write to.
     * @throws IOException if this object cannot be written.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        PifSerializationUtil.write(out, this);
    }

    /**
     * Read into this object from the input stream.
     *
     * @param in {@link ObjectInputStream} to read from.
     * @throws IOException if thrown while reading the stream.
     * @throws ClassNotFoundException if thrown while reading the stream.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        PifSerializationUtil.read(in, this);
    }

    /**
     * Read an object with no data.
     *
     * @throws ObjectStreamException if thrown while reading the stream.
     */
    private void readObjectNoData() throws ObjectStreamException {}

    private static final long serialVersionUID = -9193007588381796629L;

    /** Maximum number of highlighted results to return. */
    private Integer maxContentHighlights;

    /** The tag to use at the beginning of a highlight. */
    private String highlightPreTag;

    /** The tag to use at the end of a highlight. */
    private String highlightPostTag;
}