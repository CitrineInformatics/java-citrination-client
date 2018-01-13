package io.citrine.jcc.search.pif.query;

import io.citrine.jcc.search.core.query.SortOrder;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Optional;

/**
 * Definition of a sort operation on an extraction within a query.
 *
 * @author Kyle Michel
 */
public class ExtractionSort implements Serializable {

    /**
     * Set the key that will be sorted on.
     *
     * @param key String with the key that will be sorted on.
     * @return This object.
     */
    public ExtractionSort setKey(final String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the key that will be sorted on.
     *
     * @return String with the key that will be sorted on.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the sort order.
     *
     * @param order {@link SortOrder} to use.
     * @return This object.
     */
    public ExtractionSort setOrder(final SortOrder order) {
        this.order = order;
        return this;
    }

    /**
     * Get the sort order to use.
     *
     * @return {@link SortOrder} to use.
     */
    public SortOrder getOrder() {
        return this.order;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof ExtractionSort)) {
            return false;
        }
        final ExtractionSort rhsSort = (ExtractionSort) rhs;
        return Optional.ofNullable(this.key).equals(Optional.ofNullable(rhsSort.key))
                && Optional.ofNullable(this.order).equals(Optional.ofNullable(rhsSort.order));
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

    private static final long serialVersionUID = -3372153372009813162L;

    /** The extractAs key to sort on. */
    private String key;

    /** The order to sort. */
    private SortOrder order;
}