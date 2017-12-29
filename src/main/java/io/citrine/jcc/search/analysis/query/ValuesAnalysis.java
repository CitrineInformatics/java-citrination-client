package io.citrine.jcc.search.analysis.query;

import java.util.Optional;

/**
 * Class for running a values analysis.
 *
 * @author Kyle Michel
 */
public class ValuesAnalysis extends Analysis {

    /**
     * Set the maximum number of buckets to generate.
     *
     * @param size Long with the maximum number of buckets to generate.
     * @return This object.
     */
    public ValuesAnalysis setSize(final Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the maximum number of buckets to generate.
     *
     * @return Long with the maximum number of buckets to generate.
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * Set the minimum count of values needed to create a bucket.
     *
     * @param minCount Long with the minimum count of values needed to create a bucket.
     * @return This object.
     */
    public ValuesAnalysis setMinCount(final Long minCount) {
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
     * Set the value to use when missing.
     *
     * @param missing String with the value to use when missing.
     * @return This object.
     */
    public ValuesAnalysis setMissing(final String missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Get the value to use when missing.
     *
     * @return String with the value to use when missing.
     */
    public String getMissing() {
        return this.missing;
    }

    @Override
    public ValuesAnalysis setPath(final String path) {
        super.setPath(path);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof ValuesAnalysis)) {
            return false;
        }
        final ValuesAnalysis rhsAnalysis = (ValuesAnalysis) rhs;
        return super.equals(rhsAnalysis)
                && Optional.ofNullable(this.size).equals(Optional.ofNullable(rhsAnalysis.size))
                && Optional.ofNullable(this.minCount).equals(Optional.ofNullable(rhsAnalysis.minCount))
                && Optional.ofNullable(this.missing).equals(Optional.ofNullable(rhsAnalysis.missing));
    }

    /** The maximum number of buckets to generate. */
    private Long size;

    /** The minimum number of values needed to create a bucket. */
    private Long minCount;

    /** The value to use when missing. */
    private String missing;
}