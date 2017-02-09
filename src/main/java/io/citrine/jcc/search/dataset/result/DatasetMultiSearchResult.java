package io.citrine.jcc.search.dataset.result;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.result.BaseMultiSearchResult;

import java.util.List;

/**
 * Class to store all of the results that were returned from a multi-query. This class implements {@link Iterable} so
 * that users can iterate over results using:
 *
 * <pre>
 * {@code
 * DatasetMultiSearchResult searchResult = Query.execute();
 * for (DatasetSearchResult i : searchResult) {
 *     // do work on hit
 * }
 * }
 * </pre>
 *
 * @author Kyle Michel
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetMultiSearchResult extends BaseMultiSearchResult<DatasetSearchResult> {

    @Override
    @JsonSetter("took")
    public DatasetMultiSearchResult setTook(final Long took) {
        super.setTook(took);
        return this;
    }

    @Override
    @JsonSetter("results")
    protected DatasetMultiSearchResult setResults(final List<DatasetSearchResult> results) {
        super.setResults(results);
        return this;
    }

    @Override
    @JsonIgnore
    public DatasetMultiSearchResult addResult(final DatasetSearchResult result) {
        super.addResult(result);
        return this;
    }
}