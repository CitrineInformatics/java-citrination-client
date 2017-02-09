package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.BaseMultiQuery;

import java.util.List;

/**
 * Class for defining a multi-query against PIFs on Citrination.
 *
 * @author Kyle Michel
 */
public class MultiPifQuery extends BaseMultiQuery<PifQuery> {

    @Override
    @JsonSetter("queries")
    protected MultiPifQuery setQueries(final List<PifQuery> queries) {
        super.setQueries(queries);
        return this;
    }

    @Override
    @JsonIgnore
    public MultiPifQuery addQuery(final PifQuery query) {
        super.addQuery(query);
        return this;
    }
}