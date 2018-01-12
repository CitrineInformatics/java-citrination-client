package io.citrine.jcc.search.dataset.result;

import io.citrine.jcc.search.analysis.result.AnalysisResult;
import io.citrine.jcc.search.core.result.BaseSearchResult;
import io.citrine.jcc.util.SerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Class to store all of the results that were returned from a query. This class implements {@link Iterable} so that
 * users can iterate over results using:
 *
 * <pre>
 * {@code
 * DatasetSearchResult searchResult = Query.execute();
 * for (DatasetSearchHit i : searchResult) {
 *     // do work on hit
 * }
 * }
 * </pre>
 *
 * @author Kyle Michel
 */
public class DatasetSearchResult extends BaseSearchResult<DatasetSearchHit> implements Serializable {

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

    @Override
    public DatasetSearchResult setAnalysis(final Map<String, AnalysisResult> analysis) {
        super.setAnalysis(analysis);
        return this;
    }

    @Override
    public DatasetSearchResult addAnalysis(final Map<String, AnalysisResult> analysis) {
        super.addAnalysis(analysis);
        return this;
    }

    @Override
    public DatasetSearchResult addAnalysis(final String name, final AnalysisResult analysis) {
        super.addAnalysis(name, analysis);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        return super.equals(rhs);
    }

    /**
     * Write this object to the output output stream.
     *
     * @param out {@link ObjectOutputStream} to write to.
     * @throws IOException if this object cannot be written.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        SerializationUtil.write(out, this);
    }

    /**
     * Read into this object from the input stream.
     *
     * @param in {@link ObjectInputStream} to read from.
     * @throws IOException if thrown while reading the stream.
     * @throws ClassNotFoundException if thrown while reading the stream.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        SerializationUtil.read(in, this);
    }

    /**
     * Read an object with no data.
     *
     * @throws ObjectStreamException if thrown while reading the stream.
     */
    private void readObjectNoData() throws ObjectStreamException {}

    private static final long serialVersionUID = -3695237787852249886L;
}