package io.citrine.jcc.search.dataset.result;

import io.citrine.jcc.search.core.result.BaseSearchResult;

import java.util.List;

/**
 * Class to store all of the results that were returned from a query. This class implements {@link Iterable} so that
 * users can iterate over results using:
 *
 * <pre>
 * {@code
 * SearchResult searchResult = Query.execute();
 * for (SearchHit i : searchResult) {
 *     // do work on hit
 * }
 * }
 * </pre>
 *
 * @author Kyle Michel
 */
public class DatasetSearchResult extends BaseSearchResult<DatasetSearchHit>  {

    @Override
    public DatasetSearchResult setTook(final Long took) {
        super.setTook(took);
        return this;
    }

    @Override
    public DatasetSearchResult setTotalNumHits(final Long totalNumHits) {
        super.setTotalNumHits(totalNumHits);
        return this;
    }

    @Override
    public DatasetSearchResult setMaxScore(final Double maxScore) {
        super.setMaxScore(maxScore);
        return this;
    }

    @Override
    public DatasetSearchResult setHits(final List<DatasetSearchHit> hits) {
        super.setHits(hits);
        return this;
    }

    @Override
    public DatasetSearchResult addHits(final List<DatasetSearchHit> hits) {
        super.addHits(hits);
        return this;
    }

    @Override
    public DatasetSearchResult addHits(final DatasetSearchHit hit) {
        super.addHits(hit);
        return this;
    }
}