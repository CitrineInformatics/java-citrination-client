package io.citrine.jcc;

import io.citrine.jcc.core.CitrinationClient;

/**
 * Base class for tests that use a {@link CitrinationClient} instance.
 *
 * @author Kyle Michel
 */
public abstract class CitrinationClientITBase {

    /** The client instance to use when connecting to Citrination for tests. */
    protected final CitrinationClient client = new CitrinationClient.Builder()
            .setApiKey(System.getenv("TESTS_CITRINATION_API_KEY"))
            .setHost(System.getenv("TESTS_CITRINATION_HOST"))
            .build();
}