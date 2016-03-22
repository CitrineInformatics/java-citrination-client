package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Class for defining queries against PIF records on Citrination.
 *
 * @author Kyle Michel
 */
public class PifQuery {

    /**
     * Index of the first hit that should be returned.
     *
     * @param from Index of the first hit (inclusive of zero) that should be returned.
     * @return This object.
     */
    @JsonSetter("from")
    public PifQuery from(final Integer from) {
        this.from = from;
        return this;
    }

    /**
     * Get the index of the first hit that should be returned.
     *
     * @return Index of the first hit that should be returned or a null pointer if not set.
     */
    @JsonGetter("from")
    public Integer from() {
        return this.from;
    }

    /**
     * Set the maximum number of records that should be returned.
     *
     * @param size Maximum number of records to return.
     * @return This object.
     */
    @JsonSetter("size")
    public PifQuery size(final Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get the maximum number of records that should be returned.
     *
     * @return Maximum number of records that should be returned or a null pointer if not set.
     */
    @JsonGetter("size")
    public Integer size() {
        return this.size;
    }

    /**
     * Set the system query.
     *
     * @param system {@link SystemQuery} object to use.
     * @return This object.
     */
    @JsonSetter("system")
    public PifQuery system(final SystemQuery system) {
        this.system = system;
        return this;
    }

    /**
     * Get the system query to apply.
     *
     * @return {@link SystemQuery} object or a null pointer if one has not been set.
     */
    @JsonGetter("system")
    public SystemQuery system() {
        return this.system;
    }

    /** Index of the first hit that should be returned. */
    private Integer from;

    /** Total number of hits the should be returned. */
    private Integer size;

    /** System query to apply. */
    private SystemQuery system;
}