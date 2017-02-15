package io.citrine.jcc.search.pif.result;

import io.citrine.jcc.search.core.result.BaseMultiSearchResultElement;

/**
 * Class to store the information in a single search result as a part of a PIF multi-query.
 *
 * @author Kyle Michel
 */
public class PifMultiSearchResultElement extends BaseMultiSearchResultElement<PifSearchResult> {

    @Override
    public PifMultiSearchResultElement setResult(final PifSearchResult result) {
        super.setResult(result);
        return this;
    }

    @Override
    public PifMultiSearchResultElement setStatus(final Status status) {
        super.setStatus(status);
        return this;
    }
}
