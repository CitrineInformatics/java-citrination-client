package io.citrine.jcc.core;

import io.citrine.jcc.predict.PredictionRequest;
import io.citrine.jcc.predict.PredictionResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by maxhutch on 1/30/17.
 */
public class CitrinationClientTest {

    @Test
    public void testPredict() {
        String API_KEY = System.getenv("CITRINATION_API_KEY");

        CitrinationClient client = new CitrinationClient.Builder()
                .setApiKey(API_KEY)
                .setProject("stage")
                .build();

        Map<String, Object> input = new HashMap<String, Object>();
        input.put("CHEMICAL_FORMULA", "AlCu");
        List<Map<String, Object>> inputs = new ArrayList();
        inputs.add(input);

        PredictionRequest req = new PredictionRequest().setCandidates(inputs);
        try {
            PredictionResult res = client.predict("betterdensitydemo", req);
            Assert.assertEquals(5.786, Double.parseDouble(res.getCandidates().get(0).get("Density").getValue()), 0.1);
        } catch (IOException except) {
            System.out.println("Caught an exception" + except.toString());
            Assert.fail("Exception in processing prediction");
        }


    }
}
