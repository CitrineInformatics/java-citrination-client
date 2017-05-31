package io.citrine.jcc.search.dataset.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jcc.search.core.query.BooleanFilter;
import io.citrine.jcc.search.core.query.Filter;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Class for defining a query against dataset metadata on Citrination.
 *
 * @author Kyle Michel
 */
public class DatasetQuery {

    /**
     * Set the list of isFeatured queries. This replaces any filters that are already present.
     *
     * @param isFeatured List of {@link BooleanFilter} objects.
     * @return This object.
     */
    public DatasetQuery setIsFeatured(final List<BooleanFilter> isFeatured) {
        this.isFeatured = isFeatured;
        return this;
    }

    /**
     * Add to the list of isFeatured queries.
     *
     * @param isFeatured List of {@link BooleanFilter} objects.
     * @return This object.
     */
    @JsonIgnore
    public DatasetQuery addIsFeatured(final List<BooleanFilter> isFeatured) {
        this.isFeatured = ListUtil.add(isFeatured, this.isFeatured);
        return this;
    }

    /**
     * Add to the list of isFeatured queries.
     * 
     * @param isFeatured {@link BooleanFilter} object to add.
     * @return This object.
     */
    @JsonIgnore
    public DatasetQuery addIsFeatured(final BooleanFilter isFeatured) {
        this.isFeatured = ListUtil.add(isFeatured, this.isFeatured);
        return this;
    }

    /**
     * Get the length of the isFeatured queries.
     * 
     * @return Number of isFeatured queries.
     */
    @JsonIgnore
    public int isFeaturedLength() {
        return ListUtil.length(this.isFeatured);
    }

    /**
     * Get an iterable over the isFeatured queries.
     * 
     * @return {@link Iterable} of {@link BooleanFilter} objects.
     */
    @JsonIgnore
    public Iterable<BooleanFilter> isFeatured() {
        return ListUtil.iterable(this.isFeatured);
    }

    /**
     * Get one in the list of isFeatured queries.
     *
     * @param index Index of the filter to get.
     * @return {@link BooleanFilter} object.
     */
    @JsonIgnore
    public BooleanFilter getIsFeatured(final int index) {
        return ListUtil.get(this.isFeatured, index);
    }
    
    /**
     * Get the list of isFeatured queries.
     * 
     * @return List of {@link BooleanFilter} objects.
     */
    public List<BooleanFilter> getIsFeatured() {
        return this.isFeatured;
    }

    /**
     * Set the list of name queries. This replaces any filters that are already present.
     *
     * @param name List of {@link Filter} objects.
     * @return This object.
     */
    public DatasetQuery setName(final List<Filter> name) {
        this.name = name;
        return this;
    }

    /**
     * Add to the list of name queries.
     *
     * @param name List of {@link Filter} objects.
     * @return This object.
     */
    @JsonIgnore
    public DatasetQuery addName(final List<Filter> name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Add to the list of name queries.
     *
     * @param name {@link Filter} object to add.
     * @return This object.
     */
    @JsonIgnore
    public DatasetQuery addName(final Filter name) {
        this.name = ListUtil.add(name, this.name);
        return this;
    }

    /**
     * Get the number of name queries.
     *
     * @return Number of queries against the name field.
     */
    @JsonIgnore
    public int nameLength() {
        return ListUtil.length(this.name);
    }

    /**
     * Get an iterable over the name queries.
     *
     * @return {@link Iterable} of {@link Filter} objects.
     */
    @JsonIgnore
    public Iterable<Filter> name() {
        return ListUtil.iterable(this.name);
    }

    /**
     * Get one in the list of name queries.
     *
     * @param index Index of the filter to get.
     * @return {@link Filter} object.
     */
    @JsonIgnore
    public Filter getName(final int index) {
        return ListUtil.get(this.name, index);
    }

    /**
     * Get the list of name queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getName() {
        return this.name;
    }

    /**
     * Set the list of description queries. This replaces any filters that are already present.
     *
     * @param description List of {@link Filter} objects.
     * @return This object.
     */
    public DatasetQuery setDescription(final List<Filter> description) {
        this.description = description;
        return this;
    }

    /**
     * Add to the list of description queries.
     *
     * @param description List of {@link Filter} objects.
     * @return This object.
     */
    @JsonIgnore
    public DatasetQuery addDescription(final List<Filter> description) {
        this.description = ListUtil.add(description, this.description);
        return this;
    }

    /**
     * Add to the list of description queries.
     *
     * @param description {@link Filter} object to add.
     * @return This object.
     */
    @JsonIgnore
    public DatasetQuery addDescription(final Filter description) {
        this.description = ListUtil.add(description, this.description);
        return this;
    }

    /**
     * Get the length of the description queries.
     *
     * @return Number of queries against the description field.
     */
    @JsonIgnore
    public int descriptionLength() {
        return ListUtil.length(this.description);
    }

    /**
     * Get an iterable over the description queries.
     *
     * @return {@link Iterable} of {@link Filter} objects.
     */
    @JsonIgnore
    public Iterable<Filter> description() {
        return ListUtil.iterable(this.description);
    }

    /**
     * Get one in the list of description queries.
     *
     * @param index Index of the filter to get.
     * @return {@link Filter} object.
     */
    @JsonIgnore
    public Filter getDescription(final int index) {
        return ListUtil.get(this.description, index);
    }

    /**
     * Get the list of description queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getDescription() {
        return this.description;
    }

    /**
     * Set the list of owner queries. This replaces any filters that are already present.
     *
     * @param owner List of {@link Filter} objects.
     * @return This object.
     */
    public DatasetQuery setOwner(final List<Filter> owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Add to the list of owner queries.
     *
     * @param owner List of {@link Filter} objects.
     * @return This object.
     */
    @JsonIgnore
    public DatasetQuery addOwner(final List<Filter> owner) {
        this.owner = ListUtil.add(owner, this.owner);
        return this;
    }

    /**
     * Add to the list of owner queries.
     *
     * @param owner {@link Filter} object to add.
     * @return This object.
     */
    @JsonIgnore
    public DatasetQuery addOwner(final Filter owner) {
        this.owner = ListUtil.add(owner, this.owner);
        return this;
    }

    /**
     * Get the number of owner queries.
     *
     * @return Number of queries against the owner field.
     */
    @JsonIgnore
    public int ownerLength() {
        return ListUtil.length(this.owner);
    }

    /**
     * Get an iterable over the owner queries.
     *
     * @return {@link Iterable} of {@link Filter} objects.
     */
    @JsonIgnore
    public Iterable<Filter> owner() {
        return ListUtil.iterable(this.owner);
    }

    /**
     * Get one in the list of owner queries.
     *
     * @param index Index of the owner query to get.
     * @return {@link Filter} object.
     */
    @JsonIgnore
    public Filter getOwner(final int index) {
        return ListUtil.get(this.owner, index);
    }

    /**
     * Get the list of owner queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getOwner() {
        return this.owner;
    }

    /**
     * Set the list of email queries. This replaces any filters that are already present.
     *
     * @param email List of {@link Filter} objects.
     * @return This object.
     */
    public DatasetQuery setEmail(final List<Filter> email) {
        this.email = email;
        return this;
    }

    /**
     * Add to the list of email queries.
     *
     * @param email List of {@link Filter} objects.
     * @return This object.
     */
    @JsonIgnore
    public DatasetQuery addEmail(final List<Filter> email) {
        this.email = ListUtil.add(email, this.email);
        return this;
    }

    /**
     * Add to the list of email queries.
     *
     * @param email {@link Filter} object to add.
     * @return This object.
     */
    @JsonIgnore
    public DatasetQuery addEmail(final Filter email) {
        this.email = ListUtil.add(email, this.email);
        return this;
    }

    /**
     * Get the number of email queries.
     *
     * @return Number of queries against the email field.
     */
    @JsonIgnore
    public int emailLength() {
        return ListUtil.length(this.email);
    }

    /**
     * Get an iterable over the email queries.
     *
     * @return {@link Iterable} of {@link Filter} objects.
     */
    @JsonIgnore
    public Iterable<Filter> email() {
        return ListUtil.iterable(this.email);
    }

    /**
     * Get one in the list of email queries.
     *
     * @param index Index of the email query to get.
     * @return {@link Filter} object.
     */
    @JsonIgnore
    public Filter getEmail(final int index) {
        return ListUtil.get(this.email, index);
    }

    /**
     * Get the list of email queries.
     *
     * @return List of {@link Filter} objects.
     */
    public List<Filter> getEmail() {
        return this.email;
    }

    /** Whether the dataset is featured. */
    private List<BooleanFilter> isFeatured;
    
    /** Name of the dataset. */
    private List<Filter> name;

    /** Description of the dataset. */
    private List<Filter> description;

    /** Owner of the dataset. */
    private List<Filter> owner;

    /** Email address of the owner of the dataset. */
    private List<Filter> email;
}