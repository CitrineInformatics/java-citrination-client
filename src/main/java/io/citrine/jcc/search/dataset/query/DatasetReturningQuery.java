package io.citrine.jcc.search.dataset.query;

import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.BaseReturningQuery;
import io.citrine.jcc.search.core.query.DataQuery;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.search.pif.query.PifSystemQuery;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * Query used to return information about datasets. This class is meant to be backwards compatible for
 * deserialization from DatasetQuery objects generated in v1.x of this package.
 *
 * @author Kyle Michel
 */
public class DatasetReturningQuery extends BaseReturningQuery implements Serializable {

    @Override
    public DatasetReturningQuery setFromIndex(final Integer fromIndex) {
        super.setFrom(fromIndex);
        return this;
    }

    @Override
    public DatasetReturningQuery setFrom(final Integer from) {
        super.setFrom(from);
        return this;
    }

    @Override
    public DatasetReturningQuery setSize(final Integer size) {
        super.setSize(size);
        return this;
    }

    @Override
    public DatasetReturningQuery setRandomResults(final Boolean randomResults) {
        super.setRandomResults(randomResults);
        return this;
    }

    @Override
    public DatasetReturningQuery setRandomSeed(final Integer randomSeed) {
        super.setRandomSeed(randomSeed);
        return this;
    }

    @Override
    public DatasetReturningQuery setScoreRelevance(final Boolean scoreRelevance) {
        super.setScoreRelevance(scoreRelevance);
        return this;
    }

    @Override
    public DatasetReturningQuery setReturnMaxScore(final Boolean returnMaxScore) {
        super.setReturnMaxScore(returnMaxScore);
        return this;
    }

    @Override
    public DatasetReturningQuery setQuery(final List<DataQuery> query) {
        super.setQuery(query);
        return this;
    }

    @Override
    public DatasetReturningQuery addQuery(final List<DataQuery> query) {
        super.addQuery(query);
        return this;
    }

    @Override
    public DatasetReturningQuery addQuery(final DataQuery query) {
        super.addQuery(query);
        return this;
    }

    @Override
    public DatasetReturningQuery setReturnAnalysis(final Boolean returnAnalysis) {
        super.setReturnAnalysis(returnAnalysis);
        return this;
    }

    @Override
    public DatasetReturningQuery setTimeout(final Integer timeout) {
        super.setTimeout(timeout);
        return this;
    }

    /**
     * Set whether the number of PIFs should be counted.
     *
     * @param countPifs True to return the number of PIFs.
     * @return This object.
     */
    public DatasetReturningQuery setCountPifs(final Boolean countPifs) {
        this.countPifs = countPifs;
        return this;
    }

    /**
     * Get whether to count the number of PIFs.
     *
     * @return True if the number of PIFs should be returned.
     */
    public Boolean getCountPifs() {
        return this.countPifs;
    }

    /**
     * Deserialization of the system field from old PifQuery objects.
     *
     * @param system List of {@link PifSystemQuery} objects for the query.
     */
    @JsonSetter
    private void setSystem(final List<PifSystemQuery> system) {  // Private since only Jackson should use it
        if (system != null) {
            final DataQuery query = new DataQuery().setLogic(Logic.MUST);
            system.forEach(query::addSystem);
            this.addQuery(query);
        }
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof DatasetReturningQuery)) {
            return false;
        }
        final DatasetReturningQuery rhsQuery = (DatasetReturningQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.countPifs).equals(Optional.ofNullable(rhsQuery.countPifs));
    }

    /**
     * Write this object to the output output stream.
     *
     * @param out {@link ObjectOutputStream} to write to.
     * @throws IOException if this object cannot be written.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        PifSerializationUtil.write(out, this);
    }

    /**
     * Read into this object from the input stream.
     *
     * @param in {@link ObjectInputStream} to read from.
     * @throws IOException if thrown while reading the stream.
     * @throws ClassNotFoundException if thrown while reading the stream.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        PifSerializationUtil.read(in, this);
    }

    /**
     * Read an object with no data.
     *
     * @throws ObjectStreamException if thrown while reading the stream.
     */
    private void readObjectNoData() throws ObjectStreamException {}

    private static final long serialVersionUID = 2920827950906251428L;

    /** Whether to get the count of PIFs in each dataset. */
    private Boolean countPifs;
}