package io.citrine.jcc.search.analysis.query;

import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Optional;

/**
 * Class for running a histogram analysis.
 *
 * @author Kyle Michel
 */
public class HistogramAnalysis extends Analysis implements Serializable {

    /**
     * Set the minimum count of values needed to create a bucket.
     *
     * @param minCount Long with the minimum count of values needed to create a bucket.
     * @return This object.
     */
    public HistogramAnalysis setMinCount(final Long minCount) {
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
     * Set the offset of the first bucket.
     *
     * @param offset Double with the offset of the first bucket.
     * @return This object.
     */
    public HistogramAnalysis setOffset(final Double offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the offset of the first bucket.
     *
     * @return Double with the offset of the first bucket.
     */
    public Double getOffset() {
        return this.offset;
    }

    /**
     * Set the interval for each bucket to cover.
     *
     * @param interval Double with the interval for each bucket to cover.
     * @return This object.
     */
    public HistogramAnalysis setInterval(final Double interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the interval for each bucket to cover.
     *
     * @return Double with the interval for each bucket to cover.
     */
    public Double getInterval() {
        return this.interval;
    }

    /**
     * Set the value to use when missing.
     *
     * @param missing Double with the value to use when missing.
     * @return This object.
     */
    public HistogramAnalysis setMissing(final Double missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value to use when missing.
     *
     * @return Double with the value to use when missing.
     */
    public Double getMissing() {
        return this.missing;
    }

    @Override
    public HistogramAnalysis setPath(final String path) {
        super.setPath(path);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof HistogramAnalysis)) {
            return false;
        }
        final HistogramAnalysis rhsAnalysis = (HistogramAnalysis) rhs;
        return super.equals(rhsAnalysis)
                && Optional.ofNullable(this.minCount).equals(Optional.ofNullable(rhsAnalysis.minCount))
                && Optional.ofNullable(this.offset).equals(Optional.ofNullable(rhsAnalysis.offset))
                && Optional.ofNullable(this.interval).equals(Optional.ofNullable(rhsAnalysis.interval))
                && Optional.ofNullable(this.missing).equals(Optional.ofNullable(rhsAnalysis.missing));
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

    private static final long serialVersionUID = 6698135201233530123L;

    /** The minimum number of values needed to create a bucket. */
    private Long minCount;

    /** The offset to apply to the buckets. */
    private Double offset;

    /** The interval for each bucket. */
    private Double interval;

    /** The value to use when missing. */
    private Double missing;
}