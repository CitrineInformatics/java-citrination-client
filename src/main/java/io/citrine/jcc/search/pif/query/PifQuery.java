package io.citrine.jcc.search.pif.query;

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
     * Whether to return the actual record that was matched. If extractions are being made in the query, then it may
     * not be necessary to actually return the system. Defaults to true.
     *
     * @param returnSystem True to return systems in the results.
     * @return This object.
     */
    @JsonSetter("returnSystem")
    public PifQuery returnSystem(final Boolean returnSystem) {
        this.returnSystem = returnSystem;
        return this;
    }

    /**
     * Get whether systems should be return in the results set.
     *
     * @return True if systems should be returned in the results or a null pointer if it is not set.
     */
    @JsonGetter("returnSystem")
    public Boolean returnSystem() {
        return this.returnSystem;
    }

    /**
     * Set whether Latex formatting should be added.
     *
     * @param addLatex True to add latex.
     * @return This object.
     */
    @JsonSetter("addLatex")
    public PifQuery addLatex(final Boolean addLatex) {
        this.addLatex = addLatex;
        return this;
    }

    /**
     * Get whether latex formatting should be added to results.
     *
     * @return True if Latex should be added to results.
     */
    @JsonGetter("addLatex")
    public Boolean addLatex() {
        return this.addLatex;
    }

    /**
     * Set information about a field to sort on. This works on fields that have been marked with an extractAs value.
     *
     * @param sortExtracted {@link SortExtracted} with information about the extracted field to sort on.
     * @return This object.
     */
    @JsonSetter("sortExtracted")
    public PifQuery sortExtracted(final SortExtracted sortExtracted) {
        this.sortExtracted = sortExtracted;
        return this;
    }

    /**
     * Get information about an extracted field to sort on.
     *
     * @return {@link SortExtracted} object or a null pointer if it has not been set.
     */
    @JsonGetter("sortExtracted")
    public SortExtracted sortExtracted() {
        return this.sortExtracted;
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

    /** Whether to include the system in the results. */
    private Boolean returnSystem;

    /** Whether to add latex formatting to results. */
    private Boolean addLatex;

    /** Information about an extracted field to sort on. */
    private SortExtracted sortExtracted;

    /** System query to apply. */
    private SystemQuery system;
}