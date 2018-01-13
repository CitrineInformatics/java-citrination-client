package io.citrine.jcc.search.analysis.result;

import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Results of a values analysis.
 *
 * @author Kyle Michel
 */
public class ValuesAnalysisResult extends AnalysisResultWithBuckets<ValuesAnalysisResult.Bucket>
        implements Serializable {

    @Override
    public ValuesAnalysisResult setBuckets(final List<ValuesAnalysisResult.Bucket> buckets) {
        super.setBuckets(buckets);
        return this;
    }

    @Override
    public ValuesAnalysisResult addBuckets(final List<ValuesAnalysisResult.Bucket> buckets) {
        super.addBuckets(buckets);
        return this;
    }

    @Override
    public ValuesAnalysisResult addBuckets(final ValuesAnalysisResult.Bucket buckets) {
        super.addBuckets(buckets);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof ValuesAnalysisResult)) {
            return false;
        }
        final ValuesAnalysisResult rhsResult = (ValuesAnalysisResult) rhs;
        return super.equals(rhsResult);
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

    private static final long serialVersionUID = 9192683258833156981L;

    /**
     * Bucket to store information from a set of values.
     *
     * @author Kyle Michel
     */
    public class Bucket extends AnalysisResultWithBuckets.Bucket implements Serializable {

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
         * Set the value of the bucket.
         *
         * @param value String with the value of the bucket.
         * @return This object.
         */
        public Bucket setValue(final String value) {
            this.value = value;
            return this;
        }

        /**
         * Get the value of the bucket.
         *
         * @return String with the value of the bucket.
         */
        public String getValue() {
            return this.value;
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
                    && Optional.ofNullable(this.value).equals(Optional.ofNullable(rhsBucket.value));
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

        private static final long serialVersionUID = -2223328087845209600L;

        /** The value of the bucket. */
        private String value;
    }
}