package io.citrine.jcc.search.pif.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.result.BaseSearchResult;

import java.util.List;

/**
 * Class to store all of the results that were returned from a query. This class implements {@link Iterable} so that
 * users can iterate over results using:
 *
 * <pre>
 * {@code
 * PifSearchResult searchResult = Query.execute();
 * for (SearchHit i : searchResult) {
 *     // do work on hit
 * }
 * }
 * </pre>
 *
 * @author Kyle Michel
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PifSearchResult extends BaseSearchResult<PifSearchHit> {

    @Override
    @JsonSetter("took")
    public PifSearchResult setTook(final Long took) {
        super.setTook(took);
        return this;
    }

    @Override
    @JsonSetter("totalNumHits")
    public PifSearchResult setTotalNumHits(final Long totalNumHits) {
        super.setTotalNumHits(totalNumHits);
        return this;
    }

    @Override
    @JsonSetter("hits")
    protected PifSearchResult setHits(final List<PifSearchHit> hits) {
        super.setHits(hits);
        return this;
    }

    @Override
    @JsonIgnore
    public PifSearchResult addHit(final PifSearchHit hit) {
        super.addHit(hit);
        return this;
    }
}