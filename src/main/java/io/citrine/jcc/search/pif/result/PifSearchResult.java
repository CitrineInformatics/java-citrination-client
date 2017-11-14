package io.citrine.jcc.search.pif.result;

import io.citrine.jcc.search.core.result.BaseSearchResult;

import java.util.List;

/**
 * Class to store all of the results that were returned from a query. This class implements {@link Iterable} so that
 * users can iterate over results using:
 *
 * <pre>
 * {@code
 * PifSearchResult searchResult = Query.execute();
 * for (PifSearchHit i : searchResult) {
 *     // do work on hit
 * }
 * }
 * </pre>
 *
 * @author Kyle Michel
 */
public class PifSearchResult extends BaseSearchResult<PifSearchHit> {

    @Override
    public PifSearchResult setTook(final Long took) {
        super.setTook(took);
        return this;
    }

    @Override
    public PifSearchResult setTotalNumHits(final Long totalNumHits) {
        super.setTotalNumHits(totalNumHits);
        return this;
    }

    @Override
    public PifSearchResult setMaxScore(final Double maxScore) {
        super.setMaxScore(maxScore);
        return this;
    }

    @Override
    public PifSearchResult setHits(final List<PifSearchHit> hits) {
        super.setHits(hits);
        return this;
    }

    @Override
    public PifSearchResult addHits(final List<PifSearchHit> hits) {
        super.addHits(hits);
        return this;
    }

    @Override
    public PifSearchResult addHits(final PifSearchHit hits) {
        super.addHits(hits);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        return super.equals(rhs);
    }
}