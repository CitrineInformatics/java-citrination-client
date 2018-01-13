package io.citrine.jcc.search.core.result;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Class to store the information in a single search result as a part of a multi-query.
 *
 * @param <T> Type of the result being returned.
 * @author Max Hutchinson
 */
public class MultiSearchResultElement<T> implements Serializable {

    /**
     * Get the result that was returned.
     *
     * @return Result for this query.
     */
    public T getResult() {
        return result;
    }

    /**
     * Set the result for this query.
     *
     * @param result Object with the result of the query.
     * @return This object.
     */
    public MultiSearchResultElement<T> setResult(final T result) {
        this.result = result;
        return this;
    }

    /**
     * Get the status of the query.
     *
     * @return {@link Status} of the query.
     */
    public Status getStatus() {
        return this.status;
    }

    /**
     * Set the status of the query.
     *
     * @param status {@link Status} with for the query execution.
     * @return This object.
     */
    public MultiSearchResultElement<T> setStatus(final Status status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof MultiSearchResultElement)) {
            return false;
        }
        final MultiSearchResultElement rhsResult = (MultiSearchResultElement) rhs;
        return Optional.ofNullable(this.result).equals(Optional.ofNullable(rhsResult.result))
                && Optional.ofNullable(this.status).equals(Optional.ofNullable(rhsResult.status));
    }

    /**
     * Write this object to the output output stream.
     *
     * @param out {@link ObjectOutputStream} to write to.
     * @throws IOException if this object cannot be written.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        PifSerializationUtil.write(out, this);
    }

    /**
     * Read into this object from the input stream.
     *
     * @param in {@link ObjectInputStream} to read from.
     * @throws IOException if thrown while reading the stream.
     * @throws ClassNotFoundException if thrown while reading the stream.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        PifSerializationUtil.read(in, this);
    }

    /**
     * Read an object with no data.
     *
     * @throws ObjectStreamException if thrown while reading the stream.
     */
    private void readObjectNoData() throws ObjectStreamException {}

    private static final long serialVersionUID = 6942793526329691061L;

    /** Query result that was generated. */
    private T result;

    /** Status for the query. */
    private Status status;

    /**
     * Enumeration of the statuses of a search result.
     *
     * @author Kyle Michel
     */
    public enum Status {

        /** Query succeeded. */
        SUCCESS,

        /** There was an error in the query. */
        ERROR,

        /** The query was not run. */
        NOT_EXECUTED;

        /**
         * Get a {@link Status} object from its name.
         *
         * @param status String with the name of the status.
         * @return {@link Status} for the input name or a null pointer if not valid.
         */
        @JsonCreator
        public static Status get(final String status) {
            return STATUS_MAP.get(status);
        }

        /**
         * Write this value to a string.
         *
         * @return String with the name for this value.
         */
        @Override
        @JsonValue
        public String toString() {
            return name();
        }

        /**
         * Generate the map of status names to objects.
         *
         * @return Map with the names of statuses to their objects.
         */
        private static Map<String, Status> buildStatusNameLookupMap() {
            final Map<String, Status> result = new HashMap<>(values().length);
            for (Status i : values()) {
                result.put(i.name(), i);
            }
            return result;
        }

        /**
         * Lookup map for names to {@link Status} objects.
         */
        private static final Map<String, Status> STATUS_MAP = buildStatusNameLookupMap();
    }
}
