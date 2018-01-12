package io.citrine.jcc.search.analysis.result;

import io.citrine.jcc.util.ListUtil;
import io.citrine.jcc.util.SerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Base class for all results of analysis operations that produce buckets.
 *
 * @param <T> Type of the bucket.
 * @author Kyle Michel
 */
public abstract class AnalysisResultWithBuckets<T extends AnalysisResultWithBuckets.Bucket>
        extends AnalysisResult implements Serializable {

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

    /**
     * Write this object to the output output stream.
     *
     * @param out {@link ObjectOutputStream} to write to.
     * @throws IOException if this object cannot be written.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        SerializationUtil.write(out, this);
    }

    /**
     * Read into this object from the input stream.
     *
     * @param in {@link ObjectInputStream} to read from.
     * @throws IOException if thrown while reading the stream.
     * @throws ClassNotFoundException if thrown while reading the stream.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        SerializationUtil.read(in, this);
    }

    /**
     * Read an object with no data.
     *
     * @throws ObjectStreamException if thrown while reading the stream.
     */
    private void readObjectNoData() throws ObjectStreamException {}

    private static final long serialVersionUID = 4111298689802825707L;

    /** List of buckets. */
    private List<T> buckets;

    /**
     * A single bucket generated during an analysis.
     *
     * @author Kyle Michel
     */
    public abstract static class Bucket extends HasAnalysisResult implements Serializable {

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

        /**
         * Write this object to the output output stream.
         *
         * @param out {@link ObjectOutputStream} to write to.
         * @throws IOException if this object cannot be written.
         */
        private void writeObject(ObjectOutputStream out) throws IOException {
            SerializationUtil.write(out, this);
        }

        /**
         * Read into this object from the input stream.
         *
         * @param in {@link ObjectInputStream} to read from.
         * @throws IOException if thrown while reading the stream.
         * @throws ClassNotFoundException if thrown while reading the stream.
         */
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            SerializationUtil.read(in, this);
        }

        /**
         * Read an object with no data.
         *
         * @throws ObjectStreamException if thrown while reading the stream.
         */
        private void readObjectNoData() throws ObjectStreamException {}

        private static final long serialVersionUID = -626429106573519909L;

        /** The count of values in this bucket. */
        private Long count;
    }
}