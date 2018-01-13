package io.citrine.jcc.search.core.query;

import io.citrine.jcc.util.ListUtil;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * Base class for all multi-search requests.
 *
 * @param <T> Type of the query.
 * @author Kyle Michel
 */
public class MultiQuery<T> implements Serializable {

    /**
     * Set the list of queries. This overwrites any queries that are already saved.
     *
     * @param queries List of query objects.
     * @return This object.
     */
    public MultiQuery<T> setQueries(final List<T> queries) {
        this.queries = queries;
        return this;
    }

    /**
     * Add to the list of queries.
     *
     * @param queries List of queries to add.
     * @return This object.
     */
    public MultiQuery<T> addQueries(final List<T> queries) {
        this.queries = ListUtil.add(queries, this.queries);
        return this;
    }

    /**
     * Add a single query.
     *
     * @param query Query to add.
     * @return This object.
     */
    public MultiQuery<T> addQueries(final T query) {
        this.queries = ListUtil.add(query, this.queries);
        return this;
    }

    /**
     * Get the number of queries.
     *
     * @return Number of queries.
     */
    public int queriesLength() {
        return ListUtil.length(this.queries);
    }

    /**
     * Get an {@link Iterable} over the queries in this object.
     *
     * @return {@link Iterable} over the queries.
     */
    public Iterable<T> queries() {
        return ListUtil.iterable(this.queries);
    }

    /**
     * Get a query at the set index.
     *
     * @param index Index of the query to return.
     * @return Query at the input index.
     * @throws IllegalArgumentException if the index is out of bounds.
     */
    public T getQueries(final int index) {
        return ListUtil.get(this.queries, index);
    }

    /**
     * Get the list of queries.
     *
     * @return List of query objects.
     */
    public List<T> getQueries() {
        return this.queries;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof MultiQuery)) {
            return false;
        }
        final MultiQuery rhsQuery = (MultiQuery) rhs;
        return Optional.ofNullable(this.queries).equals(Optional.ofNullable(rhsQuery.queries));
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

    private static final long serialVersionUID = -1219224930354310715L;

    /** List of queries that were generated. */
    private List<T> queries;
}