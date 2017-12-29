package io.citrine.jcc.search.analysis.result;

import java.util.Optional;

/**
 * Result of a statistics analysis.
 *
 * @author Kyle Michel
 */
public class StatisticsAnalysisResult extends AnalysisResult {

    /**
     * Set the count of values.
     *
     * @param count Long with the count of values.
     * @return This object.
     */
    public StatisticsAnalysisResult setCount(final Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get the count of values.
     *
     * @return Long with the count of values.
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * Set the mimimum of all values.
     *
     * @param min Double with the minimum of all values.
     * @return This object.
     */
    public StatisticsAnalysisResult setMin(final Double min) {
        this.min = min;
        return this;
    }

    /**
     * Get the minimum of all values.
     *
     * @return Double with the minimum of all values.
     */
    public Double getMin() {
        return this.min;
    }

    /**
     * Set the maximum of all values.
     *
     * @param max Double with the maximum of all values.
     * @return This object.
     */
    public StatisticsAnalysisResult setMax(final Double max) {
        this.max = max;
        return this;
    }

    /**
     * Get the maximum of all values.
     *
     * @return Double with the maximum of all values.
     */
    public Double getMax() {
        return this.max;
    }

    /**
     * Set the sum of all values.
     *
     * @param sum Double with the sum of all values.
     * @return This object.
     */
    public StatisticsAnalysisResult setSum(final Double sum) {
        this.sum = sum;
        return this;
    }

    /**
     * Get the sum of all values.
     *
     * @return Double with the sum of all values.
     */
    public Double getSum() {
        return this.sum;
    }

    /**
     * Set the sum of squares of all values.
     *
     * @param sumOfSquares Double with the sum of squares of all values.
     * @return This object.
     */
    public StatisticsAnalysisResult setSumOfSquares(final Double sumOfSquares) {
        this.sumOfSquares = sumOfSquares;
        return this;
    }

    /**
     * Get the sum of squares of all values.
     *
     * @return Double with the sum of squares of all values.
     */
    public Double getSumOfSquares() {
        return this.sumOfSquares;
    }

    /**
     * Set the variance of all values.
     *
     * @param variance Double with the variance of all values assuming a normal distribution.
     * @return This object.
     */
    public StatisticsAnalysisResult setVariance(final Double variance) {
        this.variance = variance;
        return this;
    }

    /**
     * Get the variance of all values.
     *
     * @return Double with the variance of all values assuming a normal distribution.
     */
    public Double getVariance() {
        return this.variance;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof StatisticsAnalysisResult)) {
            return false;
        }
        final StatisticsAnalysisResult rhsResult = (StatisticsAnalysisResult) rhs;
        return super.equals(rhsResult)
                && Optional.ofNullable(this.count).equals(Optional.ofNullable(rhsResult.count))
                && Optional.ofNullable(this.min).equals(Optional.ofNullable(rhsResult.min))
                && Optional.ofNullable(this.max).equals(Optional.ofNullable(rhsResult.max))
                && Optional.ofNullable(this.sum).equals(Optional.ofNullable(rhsResult.sum))
                && Optional.ofNullable(this.sumOfSquares).equals(Optional.ofNullable(rhsResult.sumOfSquares))
                && Optional.ofNullable(this.variance).equals(Optional.ofNullable(rhsResult.variance));
    }

    /** The count of values. */
    private Long count;

    /** The minimum of all values. */
    private Double min;

    /** The maximum of all values. */
    private Double max;

    /** The sum of all values. */
    private Double sum;

    /** The sum of squares of all values. */
    private Double sumOfSquares;

    /** The variance of all values assuming normal distribution. */
    private Double variance;
}