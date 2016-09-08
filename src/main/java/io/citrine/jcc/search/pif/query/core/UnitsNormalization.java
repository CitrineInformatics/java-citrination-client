package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Configuration for normalization of units.
 *
 * @author Kyle Michel
 */
public class UnitsNormalization {

    /**
     * Set the units that the query is being run against.
     *
     * @param search String to run the query against.
     * @return This object.
     */
    @JsonSetter("search")
    public UnitsNormalization search(final String search) {
        this.search = search;
        return this;
    }

    /**
     * Get the units that the query is going to be run against.
     *
     * @return Units for the query.
     */
    @JsonGetter("search")
    public String search() {
        return this.search;
    }

    /**
     * Return whether this object has units being converted search.
     *
     * @return True if this object has units being converted search.
     */
    @JsonIgnore
    public boolean hasSearch() {
        return this.search != null;
    }

    /**
     * Set the units that should be converted to.
     *
     * @param extract Units to normalize extractions to.
     * @return This object.
     */
    @JsonSetter("extract")
    public UnitsNormalization extract(final String extract) {
        this.extract = extract;
        return this;
    }

    /**
     * Get the units to normalize to.
     *
     * @return Units to convert extractions to.
     */
    @JsonGetter("extract")
    public String extract() {
        return this.extract;
    }

    /**
     * Return whether this object has units being converted to.
     *
     * @return True if this object has units being converted to.
     */
    @JsonIgnore
    public boolean hasExtract() {
        return this.extract != null;
    }

    /** Set of units being searched on. */
    private String search;

    /** Set of units to normalize extractions to. */
    private String extract;
}