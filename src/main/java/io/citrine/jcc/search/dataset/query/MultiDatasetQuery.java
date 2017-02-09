package io.citrine.jcc.search.dataset.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.BaseMultiQuery;

import java.util.List;

/**
 * Class for defining a multi-query against datasets on Citrination.
 *
 * @author Kyle Michel
 */
public class MultiDatasetQuery extends BaseMultiQuery<DatasetQuery> {

    @Override
    @JsonSetter("queries")
    protected MultiDatasetQuery setQueries(final List<DatasetQuery> queries) {
        super.setQueries(queries);
        return this;
    }

    @Override
    @JsonIgnore
    public MultiDatasetQuery addQuery(final DatasetQuery query) {
        super.addQuery(query);
        return this;
    }
}