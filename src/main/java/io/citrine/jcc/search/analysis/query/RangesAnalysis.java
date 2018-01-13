package io.citrine.jcc.search.analysis.query;

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
 * Class for running a ranges analysis.
 *
 * @author Kyle Michel
 */
public class RangesAnalysis extends Analysis implements Serializable {

    /**
     * Set the list of ranges. This replaces any ranges that are already present.
     *
     * @param ranges List of {@link Range} objects.
     * @return This object.
     */
    public RangesAnalysis setRanges(final List<Range> ranges) {
        this.ranges = ranges;
        return this;
    }

    /**
     * Add to the list of ranges.
     *
     * @param ranges List of {@link Range} objects.
     * @return This object.
     */
    public RangesAnalysis addRanges(final List<Range> ranges) {
        this.ranges = ListUtil.add(ranges, this.ranges);
        return this;
    }

    /**
     * Add to the list of ranges.
     *
     * @param ranges {@link Range} object to add.
     * @return This object.
     */
    public RangesAnalysis addRanges(final Range ranges) {
        this.ranges = ListUtil.add(ranges, this.ranges);
        return this;
    }

    /**
     * Get the number of ranges.
     *
     * @return Number of ranges.
     */
    public int rangesLength() {
        return ListUtil.length(this.ranges);
    }

    /**
     * Get an iterable over the ranges.
     *
     * @return {@link Iterable} of {@link Range} objects.
     */
    public Iterable<Range> ranges() {
        return ListUtil.iterable(this.ranges);
    }

    /**
     * Get one in the list of ranges.
     *
     * @param index Index of the range to get.
     * @return {@link Range} object.
     */
    public Range getRanges(final int index) {
        return ListUtil.get(this.ranges, index);
    }

    /**
     * Get the list of ranges.
     *
     * @return List of {@link Range} objects.
     */
    public List<Range> getRanges() {
        return this.ranges;
    }

    /**
     * Set the value to use when missing.
     *
     * @param missing Double with the value to use when missing.
     * @return This object.
     */
    public RangesAnalysis setMissing(final Double missing) {
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
    public RangesAnalysis setPath(final String path) {
        super.setPath(path);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof RangesAnalysis)) {
            return false;
        }
        final RangesAnalysis rhsAnalysis = (RangesAnalysis) rhs;
        return super.equals(rhsAnalysis)
                && Optional.ofNullable(this.ranges).equals(Optional.ofNullable(rhsAnalysis.ranges))
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

    private static final long serialVersionUID = 144877536643249504L;

    /** The list of ranges. */
    private List<Range> ranges;

    /** The value to use when missing. */
    private Double missing;

    /**
     * Class to hold a single range.
     *
     * @author Kyle Michel
     */
    public static class Range implements Serializable {

        /**
         * Set the minimum value of the range.
         *
         * @param min Double with the minimum value of the range.
         * @return This object.
         */
        public Range setMin(final Double min) {
            this.min = min;
            return this;
        }

        /**
         * Get the minimum value of the range.
         *
         * @return Double with the minimum value of the range.
         */
        public Double getMin() {
            return this.min;
        }

        /**
         * Set the maximum value of the range.
         *
         * @param max Double with the maximum value of the range.
         * @return This object.
         */
        public Range setMax(final Double max) {
            this.max = max;
            return this;
        }

        /**
         * Get the maximum value of the range.
         *
         * @return Double with the maximum value of the range.
         */
        public Double getMax() {
            return this.max;
        }

        @Override
        public boolean equals(final Object rhs) {
            if (this == rhs) {
                return true;
            }
            if ((rhs == null) || !(rhs instanceof Range)) {
                return false;
            }
            final Range rhsRange = (Range) rhs;
            return super.equals(rhsRange);
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

        private static final long serialVersionUID = 3528543096207389776L;

        /** The inclusive minimum value of the range. */
        private Double min;

        /** The exclusive maximum value of the range. */
        private Double max;
    }
}