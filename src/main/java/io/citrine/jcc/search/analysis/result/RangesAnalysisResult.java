package io.citrine.jcc.search.analysis.result;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Results of a ranges analysis.
 *
 * @author Kyle Michel
 */
public class RangesAnalysisResult extends AnalysisResultWithBuckets<RangesAnalysisResult.Bucket> {

    @Override
    public RangesAnalysisResult setBuckets(final List<RangesAnalysisResult.Bucket> buckets) {
        super.setBuckets(buckets);
        return this;
    }

    @Override
    public RangesAnalysisResult addBuckets(final List<RangesAnalysisResult.Bucket> buckets) {
        super.addBuckets(buckets);
        return this;
    }

    @Override
    public RangesAnalysisResult addBuckets(final RangesAnalysisResult.Bucket buckets) {
        super.addBuckets(buckets);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof RangesAnalysisResult)) {
            return false;
        }
        final RangesAnalysisResult rhsResult = (RangesAnalysisResult) rhs;
        return super.equals(rhsResult);
    }

    /**
     * Bucket to store information from a set of ranges.
     *
     * @author Kyle Michel
     */
    public class Bucket extends AnalysisResultWithBuckets.Bucket {

        @Override
        public Bucket setCount(final Long count) {
            super.setCount(count);
            return this;
        }

        @Override
        public Bucket setAnalysis(final Map<String, AnalysisResult> analysis) {
            super.setAnalysis(analysis);
            return this;
        }

        @Override
        public Bucket addAnalysis(final Map<String, AnalysisResult> analysis) {
            super.addAnalysis(analysis);
            return this;
        }

        @Override
        public Bucket addAnalysis(final String name, final AnalysisResult analysis) {
            super.addAnalysis(name, analysis);
            return this;
        }

        /**
         * Set the minimum value of the range.
         *
         * @param min Double with the minimum value of the range or a null pointer if unbounded.
         * @return This object.
         */
        public Bucket setMin(final Double min) {
            this.min = min;
            return this;
        }

        /**
         * Get the minimum value of the range.
         *
         * @return Double with the minimum value of the range or a null pointer if unbounded.
         */
        public Double getMin() {
            return this.min;
        }

        /**
         * Set the maximum value of the range.
         *
         * @param max Double with the maximum value of the range or a null pointer if unbounded.
         * @return This object.
         */
        public Bucket setMax(final Double max) {
            this.max = max;
            return this;
        }

        /**
         * Get the maximum value of the range.
         *
         * @return Double with the maximum value of the range or a null pointer if unbounded.
         */
        public Double getMax() {
            return this.max;
        }

        @Override
        public boolean equals(final Object rhs) {
            if (this == rhs) {
                return true;
            }
            if ((rhs == null) || !(rhs instanceof Bucket)) {
                return false;
            }
            final Bucket rhsBucket = (Bucket) rhs;
            return super.equals(rhsBucket)
                    && Optional.ofNullable(this.min).equals(Optional.ofNullable(rhsBucket.min))
                    && Optional.ofNullable(this.max).equals(Optional.ofNullable(rhsBucket.max));
        }

        /** The minimum value of the range. */
        public Double min;

        /** The maximum value of the range. */
        public Double max;
    }
}