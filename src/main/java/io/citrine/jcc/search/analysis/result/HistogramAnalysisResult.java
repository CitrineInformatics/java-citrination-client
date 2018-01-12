package io.citrine.jcc.search.analysis.result;

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
 * Results of a histogram analysis.
 *
 * @author Kyle Michel
 */
public class HistogramAnalysisResult extends AnalysisResultWithBuckets<HistogramAnalysisResult.Bucket>
        implements Serializable {

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

    private static final long serialVersionUID = -7984288962642787916L;

    /**
     * Bucket to store information from a histogram.
     *
     * @author Kyle Michel
     */
    public static class Bucket extends AnalysisResultWithBuckets.Bucket implements Serializable {

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

        private static final long serialVersionUID = -7188676964942878440L;

        /** The minimum value of this histogram bucket. */
        private Double min;
    }
}