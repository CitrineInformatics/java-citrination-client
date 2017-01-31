package io.citrine.jcc.predict;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.List;

/**
 * Created by maxhutch on 1/31/17.
 */
public class PredictedValue {

    String value;
    Double loss;

    @JsonCreator
    public PredictedValue(List<String> args) {
        value = args.get(0);
        loss = Double.parseDouble(args.get(1));
    }

    public String getValue() {
        return value;
    }

    public Double getLoss() {
        return loss;
    }
}
