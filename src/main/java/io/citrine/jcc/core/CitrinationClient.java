package io.citrine.jcc.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.citrine.jcc.search.core.query.MultiQuery;
import io.citrine.jcc.search.core.result.MultiSearchResult;
import io.citrine.jcc.search.pif.query.PifSystemReturningQuery;
import io.citrine.jcc.search.pif.result.PifSearchResult;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;

import java.io.IOException;
import java.util.Optional;

/**
 * Client for working with a Citrination.com site.
 *
 * @author Kyle Michel
 */
public class CitrinationClient {

    /**
     * Run a search using the input query.
     *
     * @param pifQuery {@link PifSystemReturningQuery} to make against the site.
     * @return {@link PifSearchResult} with the result of the query.
     * @throws IOException      if thrown from within this function.
     * @throws RuntimeException if a non-200 response is received.
     */
    public PifSearchResult search(final PifSystemReturningQuery pifQuery) throws IOException {
        final HttpPost post = buildSearchRequest(pifQuery);
        try (final CloseableHttpClient client = buildHttpClient()) {
            try (final CloseableHttpResponse response = client.execute(post)) {
                return buildSearchResult(response);
            }
        }
    }

    /**
     * Execute a multi-search request.
     *
     * @param multiQuery {@link MultiQuery} to run.
     * @return {@link MultiSearchResult} with all of the results.
     * @throws IOException if thrown from within this function.
     * @throws RuntimeException if a non-200 response is received.
     */
    public MultiSearchResult<PifSearchResult> search(
            final MultiQuery<PifSystemReturningQuery> multiQuery) throws IOException {
        final HttpPost post = buildMultiSearchRequest(multiQuery);
        try (final CloseableHttpClient client = buildHttpClient()) {
            try (final CloseableHttpResponse response = client.execute(post)) {
                return buildMultiSearchResult(response);
            }
        }
    }

    /**
     * Get an HTTP client to use.
     *
     * @return {@link CloseableHttpClient} to use.
     */
    CloseableHttpClient buildHttpClient() {
        return createDefaultHttpClientBuilder().build();
    }

    /**
     * Get the default HTTP client to use.
     *
     * @return {@link HttpClientBuilder} to use.
     */
    HttpClientBuilder createDefaultHttpClientBuilder() {
        return HttpClientBuilder.create().setRedirectStrategy(new LaxRedirectStrategy());
    }

    /**
     * Build the POST request with the query to execute.
     *
     * @param pifQuery {@link PifSystemReturningQuery} to run.
     * @return {@link HttpPost} object with the POST request to make.
     * @throws IOException if thrown from within this function.
     */
    HttpPost buildSearchRequest(final PifSystemReturningQuery pifQuery) throws IOException {
        return createCommonSearchRequest(pifQuery);
    }

    /**
     * Build the POST request with the query to execute.
     *
     * @param pifQuery {@link PifSystemReturningQuery} to run.
     * @return {@link HttpPost} object with the POST request to make.
     * @throws IOException if thrown from within this function.
     */
    HttpPost createCommonSearchRequest(final PifSystemReturningQuery pifQuery) throws IOException {
        final HttpPost post = new HttpPost(this.host + "/api/search/pif_search");
        post.addHeader("X-API-Key", this.apiKey);
        post.addHeader("Content-type", "application/json");
        post.setEntity(new ByteArrayEntity(OBJECT_MAPPER.writeValueAsBytes(pifQuery)));
        return post;
    }

    /**
     * Build the POST request with the multi-query to execute.
     *
     * @param multiQuery {@link MultiQuery} to run.
     * @return {@link HttpPost} object with the POST request to make.
     * @throws IOException if thrown from within this function.
     */
    HttpPost buildMultiSearchRequest(final MultiQuery<PifSystemReturningQuery> multiQuery) throws IOException {
        return createCommonMultiSearchRequest(multiQuery);
    }

    /**
     * Build the POST request with the multi-query to execute.
     *
     * @param multiQuery {@link MultiQuery} to run.
     * @return {@link HttpPost} object with the POST request to make.
     * @throws IOException if thrown from within this function.
     */
    HttpPost createCommonMultiSearchRequest(final MultiQuery<PifSystemReturningQuery> multiQuery) throws IOException {
        final HttpPost post = new HttpPost(this.host + "/api/search/pif/multi_pif_search");
        post.addHeader("X-API-Key", this.apiKey);
        post.addHeader("Content-type", "application/json");
        post.setEntity(new ByteArrayEntity(OBJECT_MAPPER.writeValueAsBytes(multiQuery)));
        return post;
    }

    /**
     * Convert the response from a search result to a {@link PifSearchResult} object.
     *
     * @param response {@link HttpResponse} with the result of the query.
     * @return {@link PifSearchResult} with the result of the query.
     * @throws IOException      if thrown from within this function.
     * @throws RuntimeException if a non-200 response is received.
     */
    private PifSearchResult buildSearchResult(final HttpResponse response) throws IOException {
        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            throw new RuntimeException("Received " + response.getStatusLine().getStatusCode() + " response: "
                    + response.getStatusLine().getReasonPhrase());
        }
        return OBJECT_MAPPER.readValue(response.getEntity().getContent(), PifSearchResponseWrapper.class)
                .pifSearchResult;
    }

    /**
     * Convert the response from a search result to a {@link MultiSearchResult} object.
     *
     * @param response {@link HttpResponse} with the result of the query.
     * @return {@link MultiSearchResult} with the result of the query.
     * @throws IOException      if thrown from within this function.
     * @throws RuntimeException if a non-200 response is received.
     */
    private MultiSearchResult<PifSearchResult> buildMultiSearchResult(final HttpResponse response) throws IOException {
        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            throw new RuntimeException("Received " + response.getStatusLine().getStatusCode() + " response: "
                    + response.getStatusLine().getReasonPhrase());
        }
        return OBJECT_MAPPER.readValue(response.getEntity().getContent(), PifMultiSearchResponseWrapper.class)
                .pifMultiSearchResult;
    }

    /**
     * Constructor.
     *
     * @param project String with the project to connect to.
     * @param host    String with the full host to connect to.
     * @param apiKey  String with the api key to use.
     * @throws IllegalArgumentException if project and host are both set.
     * @throws IllegalArgumentException if apiKey is not set.
     */
    CitrinationClient(final String project, final String host, final String apiKey) {
        if ((project != null) && (host != null)) {
            throw new IllegalArgumentException("Cannot set both 'project' and 'host'");
        }
        if (apiKey == null) {
            throw new IllegalArgumentException("Must set 'apiKey'");
        }
        if (host != null) {
            this.host = host;
        } else if (project != null) {
            this.host = "https://" + project + ".citrination.com";
        } else {
            this.host = "https://citrination.com";
        }
        this.apiKey = apiKey;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof CitrinationClient)) {
            return false;
        }
        final CitrinationClient rhsClient = (CitrinationClient) rhs;
        return Optional.ofNullable(this.host).equals(Optional.ofNullable(rhsClient.host))
                && Optional.ofNullable(this.apiKey).equals(Optional.ofNullable(rhsClient.apiKey));
    }

    /** Host to connect to. */
    final String host;

    /** API key for making the connection. */
    final String apiKey;

    /** ObjectMapper for serializing queries. */
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
            .configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);

    /**
     * Builder class to generate a new client.
     *
     * @author Kyle Michel
     */
    public static class Builder {

        /**
         * Generate a new {@link CitrinationClient} object from the content of this object.
         *
         * @return New {@link CitrinationClient} object.
         */
        public CitrinationClient build() {
            return new CitrinationClient(this.project, this.host, this.apiKey);
        }

        /**
         * Set the host. This should contain the entire url for the connection.
         *
         * @param host String with the host to connect to.
         * @return This object.
         */
        public Builder setHost(final String host) {
            this.host = host;
            return this;
        }

        /**
         * Set the project. This is "project" in "https://project.citrination.com".
         *
         * @param project String with the project to connect to.
         * @return This object.
         */
        public Builder setProject(final String project) {
            this.project = project;
            return this;
        }

        /**
         * Set the API key for your account.
         *
         * @param apiKey String with the API key to use.
         * @return This object.
         */
        public Builder setApiKey(final String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /** Host to connect to. */
        private String host;

        /** Project to connect to. */
        private String project;

        /** API key for making the connection. */
        private String apiKey;
    }

    /**
     * Object that wraps the response received from an API request.
     *
     * @author Kyle Michel
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class PifSearchResponseWrapper {

        /** Results field. */
        @JsonProperty("results")
        public PifSearchResult pifSearchResult;
    }

    /**
     * Object that wraps the response received from an API request.
     *
     * @author Kyle Michel
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class PifMultiSearchResponseWrapper {

        /** Results field. */
        @JsonProperty("results")
        public MultiSearchResult<PifSearchResult> pifMultiSearchResult;
    }
}