package io.citrine.jcc.search.analysis.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.util.MapUtil;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Base for all classes that contain a map of analysis results.
 *
 * @author Kyle Michel
 */
public abstract class HasAnalysisResult {

    /**
     * Set the map of analysis results.
     *
     * @param analysis Map of analysis results.
     * @return This object.
     */
    public HasAnalysisResult setAnalysis(final Map<String, AnalysisResult> analysis) {
        this.analysis = analysis;
        return this;
    }

    /**
     * Add to the map of analysis results.
     *
     * @param analysis Map of analysis results.
     * @return This object.
     */
    public HasAnalysisResult addAnalysis(final Map<String, AnalysisResult> analysis) {
        this.analysis = MapUtil.add(analysis, this.analysis);
        return this;
    }

    /**
     * Add to the map of analysis results.
     *
     * @param name Name of the analysis.
     * @param analysis {@link AnalysisResult} for the analysis.
     * @return This object.
     */
    public HasAnalysisResult addAnalysis(final String name, final AnalysisResult analysis) {
        this.analysis = MapUtil.add(name, analysis, this.analysis);
        return this;
    }

    /**
     * Get the map of analysis results.
     *
     * @return Map of analysis results.
     */
    protected Map<String, AnalysisResult> getAnalysis() {
        return this.analysis;
    }

    /**
     * Get an analysis result by its name.
     *
     * @param name String with the name of the analysis.
     * @return {@link AnalysisResult} or a null pointer if that name is not available.
     */
    @JsonIgnore
    public AnalysisResult getAnalysis(final String name) {
        return (this.analysis == null) ? null : this.analysis.get(name);
    }

    /**
     * Get the list of analysis results names.
     *
     * @return Set with the analysis results names.
     */
    @JsonIgnore
    public Set<String> getAnalysisNames() {
        return (this.analysis == null) ? Collections.emptySet() : this.analysis.keySet();
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof HasAnalysisResult)) {
            return false;
        }
        final HasAnalysisResult rhsHasAnalysis = (HasAnalysisResult) rhs;
        return Optional.ofNullable(this.analysis).equals(Optional.ofNullable(rhsHasAnalysis.analysis));
    }

    /** The map of analysis results. */
    private Map<String, AnalysisResult> analysis;
}