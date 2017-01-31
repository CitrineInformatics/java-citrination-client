package io.citrine.jcc.core;

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
        CitrinationClient client = new CitrinationClient(null, "https://citrination.com", API_KEY);
        Map<String, Object> input = new HashMap<String, Object>();
        input.put("CHEMICAL_FORMULA", "AlCu");
        List<Map<String, Object>> inputs = new ArrayList();
        inputs.add(input);
        try {
            PredictionResult res = client.predict("betterdensitydemo", inputs);
            Assert.assertEquals(5.786, Double.parseDouble(res.getCandidates().get(0).get("Density").get(0)), 0.1);
        } catch (IOException except) {
            System.out.println("Caught an exception" + except.toString());
            Assert.fail("Exception in processing prediction");
        }


    }
}
