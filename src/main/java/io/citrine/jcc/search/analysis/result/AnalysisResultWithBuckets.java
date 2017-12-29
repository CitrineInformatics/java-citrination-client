package io.citrine.jcc.search.analysis.result;

import io.citrine.jcc.util.ListUtil;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Base class for all results of analysis operations that produce buckets.
 *
 * @param <T> Type of the bucket.
 * @author Kyle Michel
 */
public abstract class AnalysisResultWithBuckets<T extends AnalysisResultWithBuckets.Bucket> extends AnalysisResult {

    /**
     * Set the list of buckets. This replaces any buckets that are already present.
     *
     * @param buckets List of bucket objects.
     * @return This object.
     */
    public AnalysisResultWithBuckets<T> setBuckets(final List<T> buckets) {
        this.buckets = buckets;
        return this;
    }

    /**
     * Add to the list of buckets.
     *
     * @param buckets List of bucket objects.
     * @return This object.
     */
    public AnalysisResultWithBuckets<T> addBuckets(final List<T> buckets) {
        this.buckets = ListUtil.add(buckets, this.buckets);
        return this;
    }

    /**
     * Add to the list of buckets.
     *
     * @param buckets Bucket object to add.
     * @return This object.
     */
    public AnalysisResultWithBuckets<T> addBuckets(final T buckets) {
        this.buckets = ListUtil.add(buckets, this.buckets);
        return this;
    }

    /**
     * Get the number of buckets.
     *
     * @return Number of buckets.
     */
    public int bucketsLength() {
        return ListUtil.length(this.buckets);
    }

    /**
     * Get an iterable over the buckets.
     *
     * @return {@link Iterable} of bucket objects.
     */
    public Iterable<T> buckets() {
        return ListUtil.iterable(this.buckets);
    }

    /**
     * Get one in the list of buckets.
     *
     * @param index Index of the bucket to get.
     * @return Bucket object.
     */
    public T getBuckets(final int index) {
        return ListUtil.get(this.buckets, index);
    }

    /**
     * Get the list of buckets.
     *
     * @return List of bucket objects.
     */
    public List<T> getBuckets() {
        return this.buckets;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof AnalysisResultWithBuckets)) {
            return false;
        }
        final AnalysisResultWithBuckets rhsResult = (AnalysisResultWithBuckets) rhs;
        return super.equals(rhsResult)
                && Optional.ofNullable(this.buckets).equals(Optional.ofNullable(rhsResult.buckets));
    }

    /** List of buckets. */
    private List<T> buckets;

    /**
     * A single bucket generated during an analysis.
     *
     * @author Kyle Michel
     */
    public static abstract class Bucket extends HasAnalysisResult {

        /**
         * Set the count of values in this bucket.
         *
         * @param count The count of values in this bucket.
         * @return This object.
         */
        public Bucket setCount(final Long count) {
            this.count = count;
            return this;
        }

        /**
         * Get the count of values in this bucket.
         *
         * @return The count of values in this bucket.
         */
        public Long getCount() {
            return this.count;
        }

        @Override
        public HasAnalysisResult setAnalysis(final Map<String, AnalysisResult> analysis) {
            super.setAnalysis(analysis);
            return this;
        }

        @Override
        public HasAnalysisResult addAnalysis(final Map<String, AnalysisResult> analysis) {
            super.addAnalysis(analysis);
            return this;
        }

        @Override
        public HasAnalysisResult addAnalysis(final String name, final AnalysisResult analysis) {
            super.addAnalysis(name, analysis);
            return this;
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
                    && Optional.ofNullable(this.count).equals(Optional.ofNullable(rhsBucket.count));
        }

        /** The count of values in this bucket. */
        private Long count;
    }
}