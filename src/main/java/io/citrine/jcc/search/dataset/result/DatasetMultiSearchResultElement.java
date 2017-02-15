package io.citrine.jcc.search.dataset.result;

import io.citrine.jcc.search.core.result.BaseMultiSearchResultElement;

/**
 * Class to store the information in a single search result as a part of a dataset multi-query.
 *
 * @author Kyle Michel
 */
public class DatasetMultiSearchResultElement extends BaseMultiSearchResultElement<DatasetSearchResult> {

    @Override
    public DatasetMultiSearchResultElement setResult(final DatasetSearchResult result) {
        super.setResult(result);
        return this;
    }

    @Override
    public DatasetMultiSearchResultElement setStatus(final Status status) {
        super.setStatus(status);
        return this;
    }
}
