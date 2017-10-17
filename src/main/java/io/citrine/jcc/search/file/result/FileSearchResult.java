package io.citrine.jcc.search.file.result;

import io.citrine.jcc.search.core.result.BaseSearchResult;

import java.util.List;

/**
 * Class to store all of the results that were returned from a query. This class implements {@link Iterable} so that
 * users can iterate over results using:
 *
 * <pre>
 * {@code
 * FileSearchResult searchResult = Query.execute();
 * for (FileSearchHit i : searchResult) {
 *     // do work on hit
 * }
 * }
 * </pre>
 *
 * @author Kyle Michel
 */
public class FileSearchResult extends BaseSearchResult<FileSearchHit> {

    @Override
    public FileSearchResult setTook(final Long took) {
        super.setTook(took);
        return this;
    }

    @Override
    public FileSearchResult setTotalNumHits(final Long totalNumHits) {
        super.setTotalNumHits(totalNumHits);
        return this;
    }

    @Override
    public FileSearchResult setMaxScore(final Double maxScore) {
        super.setMaxScore(maxScore);
        return this;
    }

    @Override
    public FileSearchResult setHits(final List<FileSearchHit> hits) {
        super.setHits(hits);
        return this;
    }

    @Override
    public FileSearchResult addHits(final List<FileSearchHit> hits) {
        super.addHits(hits);
        return this;
    }

    @Override
    public FileSearchResult addHits(final FileSearchHit hits) {
        super.addHits(hits);
        return this;
    }
}