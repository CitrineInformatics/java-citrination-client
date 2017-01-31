package io.citrine.jcc.predict;

import java.util.List;
import java.util.Map;

/**
 * Object to hold prediction input information
 * Created by maxhutch on 1/31/17.
 */
public class PredictionRequest {

    /**
     * Getter for usePriors.
     * @return usePriors
     */
    public Boolean getUsePriors() {
        return usePriors;
    }

    /**
     * Setter for usePriors.
     * @param usePriors do we use priors?
     * @return calling object
     */
    public PredictionRequest setUsePriors(Boolean usePriors) {
        this.usePriors = usePriors;
        return this;
    }

    /**
     * Getter for candidates.
     * @return candidates
     */
    public List<Map<String, Object>> getCandidates() {
        return candidates;
    }

    /**
     * Setter for candidates.
     * @param candidates to set
     * @return calling object
     */
    public PredictionRequest setCandidates(List<Map<String, Object>> candidates) {
        this.candidates = candidates;
        return this;
    }

    /**
     * Getter for predictionSource, which sets which type of propagator to use.
     * @return predictionSource
     */
    public String getPredictionSource() {
        return predictionSource;
    }

    /**
     * Setter for predictionSource, which sets which type of propagator to use.
     * @param predictionSource to set
     * @return calling object
     */
    public PredictionRequest setPredictionSource(String predictionSource) {
        this.predictionSource = predictionSource;
        return this;
    }

    /** Should we use priors when returning results?. */
    Boolean usePriors = true;

    /** Which propagator to use?. */
    String predictionSource = "scalar";

    /** Candidates to make predictions on. */
    List<Map<String, Object>> candidates;
}
