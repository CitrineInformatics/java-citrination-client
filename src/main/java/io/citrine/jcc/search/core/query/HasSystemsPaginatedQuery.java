package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.pif.query.core.SystemQuery;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Base class for queries that contain both pagination information as well as a list of PIF system queries.
 *
 * @author Kyle Michel
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class HasSystemsPaginatedQuery extends PaginatedQuery {

    /**
     * Set the system queries.
     *
     * @param system List of {@link SystemQuery} objects to search on.
     */
    @JsonSetter("system")
    private void system(final List<SystemQuery> system) {  // Private since only Jackson should use it
        this.system = ListUtil.add(system, this.system);
    }

    /**
     * Add to the list of system queries.
     *
     * @param system {@link SystemQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public HasSystemsPaginatedQuery system(final SystemQuery system) {
        this.system = ListUtil.add(system, this.system);
        return this;
    }

    /**
     * Get the system queries.
     *
     * @return Iterable over {@link SystemQuery} object.
     */
    @JsonGetter("system")
    public Iterable<SystemQuery> system() {
        return ListUtil.iterable(this.system);
    }

    /**
     * Return whether this object contains any system queries.
     *
     * @return True if this object contains any system queries.
     */
    @JsonIgnore
    public boolean hasSystem() {
        return ListUtil.hasContent(this.system);
    }

    /** PIF system queries to apply. */
    private List<SystemQuery> system;
}