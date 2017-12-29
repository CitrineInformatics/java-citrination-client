package io.citrine.jcc.search.analysis.query;

import io.citrine.jcc.util.ListUtil;

import java.util.List;
import java.util.Optional;

/**
 * Class for running a ranges analysis.
 *
 * @author Kyle Michel
 */
public class RangesAnalysis extends Analysis {

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

    /** The list of ranges. */
    private List<Range> ranges;

    /** The value to use when missing. */
    private Double missing;

    /**
     * Class to hold a single range.
     *
     * @author Kyle Michel
     */
    public static class Range {

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

        /** The inclusive minimum value of the range. */
        private Double min;

        /** The exclusive maximum value of the range. */
        private Double max;
    }
}