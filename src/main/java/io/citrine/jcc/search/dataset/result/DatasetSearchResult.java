package io.citrine.jcc.search.dataset.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
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
    @JsonSetter("took")
    public DatasetSearchResult setTook(final Long took) {
        super.setTook(took);
        return this;
    }

    @Override
    @JsonSetter("totalNumHits")
    public DatasetSearchResult setTotalNumHits(final Long totalNumHits) {
        super.setTotalNumHits(totalNumHits);
        return this;
    }

    @Override
    @JsonSetter("hits")
    protected DatasetSearchResult setHits(final List<DatasetSearchHit> hits) {
        super.setHits(hits);
        return this;
    }

    @Override
    @JsonIgnore
    public DatasetSearchResult addHit(final DatasetSearchHit hit) {
        super.addHit(hit);
        return this;
    }
}