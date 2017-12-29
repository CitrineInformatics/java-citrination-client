package io.citrine.jcc.search.analysis.result;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Results of a histogram analysis.
 *
 * @author Kyle Michel
 */
public class HistogramAnalysisResult extends AnalysisResultWithBuckets<HistogramAnalysisResult.Bucket> {

    @Override
    public HistogramAnalysisResult setBuckets(final List<HistogramAnalysisResult.Bucket> buckets) {
        super.setBuckets(buckets);
        return this;
    }

    @Override
    public HistogramAnalysisResult addBuckets(final List<HistogramAnalysisResult.Bucket> buckets) {
        super.addBuckets(buckets);
        return this;
    }

    @Override
    public HistogramAnalysisResult addBuckets(final HistogramAnalysisResult.Bucket buckets) {
        super.addBuckets(buckets);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof HistogramAnalysisResult)) {
            return false;
        }
        final HistogramAnalysisResult rhsResult = (HistogramAnalysisResult) rhs;
        return super.equals(rhsResult);
    }

    /**
     * Bucket to store information from a histogram.
     *
     * @author Kyle Michel
     */
    public static class Bucket extends AnalysisResultWithBuckets.Bucket {

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
         * Set the minimum value of the bucket.
         *
         * @param min The minimum value of the bucket.
         * @return This object.
         */
        public Bucket setMin(final Double min) {
            this.min = min;
            return this;
        }

        /**
         * Get the minimum value of the bucket.
         *
         * @return Double with the minimum value of the bucket.
         */
        public Double getMin() {
            return this.min;
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
                    && Optional.ofNullable(this.min).equals(Optional.ofNullable(rhsBucket.min));
        }

        /** The minimum value of this histogram bucket. */
        private Double min;
    }
}