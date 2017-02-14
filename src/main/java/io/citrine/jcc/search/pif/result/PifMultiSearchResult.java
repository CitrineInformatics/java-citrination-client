package io.citrine.jcc.search.pif.result;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.result.BaseAtomicSearchResult;
import io.citrine.jcc.search.core.result.BaseMultiSearchResult;

import java.util.List;

/**
 * Class to store all of the results that were returned from a multi-query. This class implements {@link Iterable} so
 * that users can iterate over results using:
 *
 * <pre>
 * {@code
 * PifMultiSearchResult searchResult = Query.execute();
 * for (PifSearchResult i : searchResult) {
 *     // do work on hit
 * }
 * }
 * </pre>
 *
 * @author Kyle Michel
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PifMultiSearchResult extends BaseMultiSearchResult<BaseAtomicSearchResult<PifSearchResult>> {

    @Override
    @JsonSetter("took")
    public PifMultiSearchResult setTook(final Long took) {
        super.setTook(took);
        return this;
    }

    @Override
    @JsonSetter("results")
    protected PifMultiSearchResult setResults(final List<BaseAtomicSearchResult<PifSearchResult>> results) {
        super.setResults(results);
        return this;
    }

    @Override
    @JsonIgnore
    public PifMultiSearchResult addResult(final BaseAtomicSearchResult<PifSearchResult> result) {
        super.addResult(result);
        return this;
    }
}