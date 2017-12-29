package io.citrine.jcc.search.analysis.result;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Base class for all results of analysis operations.
 *
 * @author Kyle Michel
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "histogram", value = HistogramAnalysisResult.class),
        @JsonSubTypes.Type(name = "ranges", value = RangesAnalysisResult.class),
        @JsonSubTypes.Type(name = "statistics", value = StatisticsAnalysisResult.class),
        @JsonSubTypes.Type(name = "values", value = ValuesAnalysisResult.class)})
public abstract class AnalysisResult {

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof AnalysisResult)) {
            return false;
        }
        return true;
    }
}