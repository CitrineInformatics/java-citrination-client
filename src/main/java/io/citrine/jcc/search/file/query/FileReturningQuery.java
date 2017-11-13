package io.citrine.jcc.search.file.query;

import io.citrine.jcc.search.core.query.BaseReturningQuery;
import io.citrine.jcc.search.core.query.DataQuery;

import java.util.List;
import java.util.Optional;

/**
 * Query to return files on Citrination.
 *
 * @author Kyle Michel
 */
public class FileReturningQuery extends BaseReturningQuery {

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
                && Optional.ofNullable(this.maxContentHighlights).equals(Optional.ofNullable(rhsQuery.maxContentHighlights))
                && Optional.ofNullable(this.highlightPreTag).equals(Optional.ofNullable(rhsQuery.highlightPreTag))
                && Optional.ofNullable(this.highlightPostTag).equals(Optional.ofNullable(rhsQuery.highlightPostTag));
    }

    /** Maximum number of highlighted results to return. */
    private Integer maxContentHighlights;

    /** The tag to use at the beginning of a highlight. */
    private String highlightPreTag;

    /** The tag to use at the end of a highlight. */
    private String highlightPostTag;
}