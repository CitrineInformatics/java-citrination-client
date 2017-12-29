package io.citrine.jcc.search.analysis.query;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Optional;

/**
 * Base class for all analysis types.
 *
 * @author Kyle Michel
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "histogram", value = HistogramAnalysis.class),
        @JsonSubTypes.Type(name = "ranges", value = RangesAnalysis.class),
        @JsonSubTypes.Type(name = "statistics", value = StatisticsAnalysis.class),
        @JsonSubTypes.Type(name = "values", value = ValuesAnalysis.class)})
public abstract class Analysis {

    /**
     * Set the path to the analysis.
     *
     * @param path String with the path.
     * @return This object.
     */
    public Analysis setPath(final String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the path to the analysis.
     *
     * @return String with the path to the analysis.
     */
    public String getPath() {
        return this.path;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof Analysis)) {
            return false;
        }
        final Analysis rhsAnalysis = (Analysis) rhs;
        return Optional.ofNullable(this.path).equals(Optional.ofNullable(rhsAnalysis.path));
    }

    /** Path to the analysis. */
    private String path;
}