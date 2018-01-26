package io.citrine.jcc.search.analysis.query;

import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Optional;

/**
 * Class for running a categorical analysis.
 *
 * @author Kyle Michel
 */
public class CategoricalAnalysis extends Analysis implements Serializable {

    /**
     * Set the maximum number of buckets to generate.
     *
     * @param size Long with the maximum number of buckets to generate.
     * @return This object.
     */
    public CategoricalAnalysis setSize(final Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the maximum number of buckets to generate.
     *
     * @return Long with the maximum number of buckets to generate.
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * Set the minimum count of values needed to create a bucket.
     *
     * @param minCount Long with the minimum count of values needed to create a bucket.
     * @return This object.
     */
    public CategoricalAnalysis setMinCount(final Long minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Get the minimum count of values needed to create a bucket.
     *
     * @return Long with the minimum count of values needed to create a bucket.
     */
    public Long getMinCount() {
        return this.minCount;
    }

    /**
     * Set the value to use when missing.
     *
     * @param missing String with the value to use when missing.
     * @return This object.
     */
    public CategoricalAnalysis setMissing(final String missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value to use when missing.
     *
     * @return String with the value to use when missing.
     */
    public String getMissing() {
        return this.missing;
    }

    @Override
    public CategoricalAnalysis setPath(final String path) {
        super.setPath(path);
        return this;
    }

    /**
     * Set the traversal mode.
     *
     * @param traversalMode {@link TraversalMode} to use.
     * @return This object.
     */
    public CategoricalAnalysis setTraversalMode(final TraversalMode traversalMode) {
        this.traversalMode = traversalMode;
        return this;
    }

    /**
     * Get the traversal mode.
     *
     * @return {@link TraversalMode} to use.
     */
    public TraversalMode getTraversalMode() {
        return this.traversalMode;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof CategoricalAnalysis)) {
            return false;
        }
        final CategoricalAnalysis rhsAnalysis = (CategoricalAnalysis) rhs;
        return super.equals(rhsAnalysis)
                && Optional.ofNullable(this.size).equals(Optional.ofNullable(rhsAnalysis.size))
                && Optional.ofNullable(this.minCount).equals(Optional.ofNullable(rhsAnalysis.minCount))
                && Optional.ofNullable(this.missing).equals(Optional.ofNullable(rhsAnalysis.missing))
                && Optional.ofNullable(this.traversalMode).equals(Optional.ofNullable(rhsAnalysis.traversalMode));
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

    private static final long serialVersionUID = 6285820138539599732L;

    /** The maximum number of buckets to generate. */
    private Long size;

    /** The minimum number of values needed to create a bucket. */
    private Long minCount;

    /** The value to use when missing. */
    private String missing;

    /** Traversal mode. */
    private TraversalMode traversalMode;
}