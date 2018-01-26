package io.citrine.jcc.search.analysis.query;

import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Optional;

/**
 * Class for running a statistics analysis.
 *
 * @author Kyle Michel
 */
public class StatisticsAnalysis extends Analysis implements Serializable {

    @Override
    public StatisticsAnalysis setPath(final String path) {
        super.setPath(path);
        return this;
    }

    @Override
    public StatisticsAnalysis setTraversalMode(final TraversalMode traversalMode) {
        super.setTraversalMode(traversalMode);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof StatisticsAnalysis)) {
            return false;
        }
        final StatisticsAnalysis rhsAnalysis = (StatisticsAnalysis) rhs;
        return super.equals(rhsAnalysis)
                && Optional.ofNullable(this.extended).equals(Optional.ofNullable(rhsAnalysis.extended))
                && Optional.ofNullable(this.missing).equals(Optional.ofNullable(rhsAnalysis.missing));
    }

    /**
     * Set whether to generate extended statistics.
     *
     * @param extended True to generate extended statistics.
     * @return This object.
     */
    public StatisticsAnalysis setExtended(final Boolean extended) {
        this.extended = extended;
        return this;
    }

    /**
     * Get whether to generate extended statistics.
     *
     * @return True to generate extended statistics.
     */
    public Boolean getExtended() {
        return this.extended;
    }

    /**
     * Set the value to use when missing.
     *
     * @param missing Double with the value to use when missing.
     * @return This object.
     */
    public StatisticsAnalysis setMissing(final Double missing) {
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

    private static final long serialVersionUID = -3092685422872015025L;

    /** Whether to get extended statistics. */
    private Boolean extended;

    /** The value to use when missing. */
    private Double missing;
}