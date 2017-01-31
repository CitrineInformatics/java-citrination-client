package io.citrine.jcc.predict;

import java.util.List;
import java.util.Map;

/**
 * Class used to direct deserialization of results from the predict API.
 *
 * Created by maxhutch on 1/30/17.
 */
public class PredictionResult {

    /**
     * Setter for candidates.
     * @param candidates as a list of Map from property names to [value, loss]
     * @return calling object
     */
    public PredictionResult setCandidates(List<Map<String, List<String>>> candidates) {
        this.candidates = candidates;
        return this;
    }

    /**
     * Getter for candidates.
     * @return the candidates as a list of Map from property names to [value, loss]
     */
    public List<Map<String, List<String>>> getCandidates() {
        return this.candidates;
    }

    /** The candidates. */
    List<Map<String, List<String>>> candidates;
}
