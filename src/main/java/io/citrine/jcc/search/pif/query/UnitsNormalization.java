package io.citrine.jcc.search.pif.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.Units;

/**
 * Configuration for normalization of units.
 *
 * @author Kyle Michel
 */
public class UnitsNormalization {

    /**
     * Set the units that the query is being run against.
     *
     * @param search {@link Units} to run the query against.
     * @return This object.
     */
    @JsonSetter("search")
    public UnitsNormalization search(final Units search) {
        this.search = search;
        return this;
    }

    /**
     * Get the {@link Units} that the query is going to be run against.
     *
     * @return {@link Units} for the query.
     */
    @JsonGetter("search")
    public Units search() {
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
     * @param extract {@link Units} to normalize extractions to.
     * @return This object.
     */
    @JsonSetter("extract")
    public UnitsNormalization extract(final Units extract) {
        this.extract = extract;
        return this;
    }

    /**
     * Get the units to normalize to.
     *
     * @return {@link Units} to convert extractions to.
     */
    @JsonGetter("extract")
    public Units extract() {
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
    private Units search;

    /** Set of units to normalize extractions to. */
    private Units extract;
}