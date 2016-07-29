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
     * @param from {@link Units} to run the query against.
     * @return This object.
     */
    @JsonSetter("from")
    public UnitsNormalization from(final Units from) {
        this.from = from;
        return this;
    }

    /**
     * Get the {@link Units} that the query is going to be run against.
     *
     * @return {@link Units} for the query.
     */
    @JsonGetter("from")
    public Units from() {
        return this.from;
    }

    /**
     * Return whether this object has units being converted from.
     *
     * @return True if this object has units being converted from.
     */
    @JsonIgnore
    public boolean hasFrom() {
        return this.from != null;
    }

    /**
     * Set the units that should be converted to.
     *
     * @param extractTo {@link Units} to normalize extractions to.
     * @return This object.
     */
    @JsonSetter("extractTo")
    public UnitsNormalization extractTo(final Units extractTo) {
        this.extractTo = extractTo;
        return this;
    }

    /**
     * Get the units to normalize to.
     *
     * @return {@link Units} to convert extractions to.
     */
    @JsonGetter("extractTo")
    public Units extractTo() {
        return this.extractTo;
    }

    /**
     * Return whether this object has units being converted to.
     *
     * @return True if this object has units being converted to.
     */
    @JsonIgnore
    public boolean hasExtractTo() {
        return this.extractTo != null;
    }

    /**
     * Set the label under which units should be extracted.
     *
     * @param extractAs String with the label under which units should be extracted.
     * @return This object.
     */
    @JsonSetter("extractAs")
    public UnitsNormalization extractAs(final String extractAs) {
        this.extractAs = extractAs;
        return this;
    }

    /**
     * Label under which unit extractions should appear.
     *
     * @return String for unit extraction labels.
     */
    @JsonGetter("extractAs")
    public String extractAs() {
        return this.extractAs;
    }

    /**
     * Get whether an extraction label has been set.
     *
     * @return True if a label has been set for unit extractions.
     */
    @JsonIgnore
    public boolean hasExtractAs() {
        return this.extractAs != null;
    }

    /** Set of units that the query is being run against. */
    private Units from;

    /** Set of units to normalize to. */
    private Units extractTo;

    /** Label to apply to extracted units. */
    private String extractAs;
}