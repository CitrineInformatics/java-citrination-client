package io.citrine.jcc.search.dataset.query;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.citrine.jcc.search.core.query.BasicBooleanFieldQuery;
import io.citrine.jcc.search.core.query.BasicFieldQuery;
import io.citrine.jcc.search.core.query.ConvertsToBasicBooleanFieldQuery;
import io.citrine.jcc.search.core.query.ConvertsToBasicFieldQuery;
import io.citrine.jcc.search.core.query.HasLogic;
import io.citrine.jcc.search.core.query.HasSimple;
import io.citrine.jcc.search.core.query.HasWeight;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;
import io.citrine.jcc.util.MapUtil;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Class for defining a query against dataset metadata on Citrination.
 *
 * @author Kyle Michel
 */
public class DatasetQuery implements Serializable, HasLogic, HasWeight, HasSimple {

    @Override
    public DatasetQuery setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    @Override
    public DatasetQuery setWeight(final Double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public DatasetQuery setSimple(final String simple) {
        this.simple = simple;
        return this;
    }

    @Override
    public String getSimple() {
        return this.simple;
    }

    @Override
    public DatasetQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        this.simpleWeight = simpleWeight;
        return this;
    }

    @Override
    public DatasetQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        this.simpleWeight = MapUtil.add(simpleWeight, this.simpleWeight);
        return this;
    }

    @Override
    public DatasetQuery addSimpleWeight(final String field, final Double weight) {
        this.simpleWeight = MapUtil.add(field, weight, this.simpleWeight);
        return this;
    }

    @Override
    public Map<String, Double> getSimpleWeight() {
        return this.simpleWeight;
    }

    /**
     * Set the list of dataset ID queries. This replaces any queries that are already present.
     *
     * @param id List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicFieldQuery.Deserializer.class)
    public DatasetQuery setId(final List<? extends ConvertsToBasicFieldQuery> id) {
        this.id = BasicFieldQuery.fromList(id);
        return this;
    }

    /**
     * Add to the list of dataset ID queries.
     *
     * @param id List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    public DatasetQuery addId(final List<? extends ConvertsToBasicFieldQuery> id) {
        this.id = ListUtil.add(BasicFieldQuery.fromList(id), this.id);
        return this;
    }

    /**
     * Add to the list of dataset ID queries.
     *
     * @param id {@link ConvertsToBasicFieldQuery} object to add.
     * @return This object.
     */
    public DatasetQuery addId(final ConvertsToBasicFieldQuery id) {
        this.id = ListUtil.add(BasicFieldQuery.fromObject(id), this.id);
        return this;
    }

    /**
     * Get the number of dataset ID queries.
     *
     * @return Number of queries against the dataset ID field.
     */
    public int idLength() {
        return ListUtil.length(this.id);
    }

    /**
     * Get an iterable over the dataset ID queries.
     *
     * @return {@link Iterable} of {@link BasicFieldQuery} objects.
     */
    public Iterable<BasicFieldQuery> id() {
        return ListUtil.iterable(this.id);
    }

    /**
     * Get the dataset ID filter object at the input index.
     *
     * @param index Index of the dataset ID filter to get.
     * @return {@link BasicFieldQuery} at the input index.
     */
    public BasicFieldQuery getId(final int index) {
        return ListUtil.get(this.id, index);
    }

    /**
     * Get the list of dataset ID queries.
     *
     * @return List of {@link BasicFieldQuery} objects.
     */
    public List<BasicFieldQuery> getId() {
        return this.id;
    }

    /**
     * Set the list of isFeatured queries. This replaces any queries that are already present.
     *
     * @param isFeatured List of {@link ConvertsToBasicBooleanFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicBooleanFieldQuery.Deserializer.class)
    public DatasetQuery setIsFeatured(final List<? extends ConvertsToBasicBooleanFieldQuery> isFeatured) {
        this.isFeatured = BasicBooleanFieldQuery.fromList(isFeatured);
        return this;
    }

    /**
     * Add to the list of isFeatured queries.
     *
     * @param isFeatured List of {@link ConvertsToBasicBooleanFieldQuery} objects.
     * @return This object.
     */
    public DatasetQuery addIsFeatured(final List<? extends ConvertsToBasicBooleanFieldQuery> isFeatured) {
        this.isFeatured = ListUtil.add(BasicBooleanFieldQuery.fromList(isFeatured), this.isFeatured);
        return this;
    }

    /**
     * Add to the list of isFeatured queries.
     * 
     * @param isFeatured {@link ConvertsToBasicBooleanFieldQuery} object to add.
     * @return This object.
     */
    public DatasetQuery addIsFeatured(final ConvertsToBasicBooleanFieldQuery isFeatured) {
        this.isFeatured = ListUtil.add(BasicBooleanFieldQuery.fromObject(isFeatured), this.isFeatured);
        return this;
    }

    /**
     * Get the length of the isFeatured queries.
     * 
     * @return Number of isFeatured queries.
     */
    public int isFeaturedLength() {
        return ListUtil.length(this.isFeatured);
    }

    /**
     * Get an iterable over the isFeatured queries.
     * 
     * @return {@link Iterable} of {@link BasicBooleanFieldQuery} objects.
     */
    public Iterable<BasicBooleanFieldQuery> isFeatured() {
        return ListUtil.iterable(this.isFeatured);
    }

    /**
     * Get one in the list of isFeatured queries.
     *
     * @param index Index of the filter to get.
     * @return {@link BasicBooleanFieldQuery} object.
     */
    public BasicBooleanFieldQuery getIsFeatured(final int index) {
        return ListUtil.get(this.isFeatured, index);
    }
    
    /**
     * Get the list of isFeatured queries.
     * 
     * @return List of {@link BasicBooleanFieldQuery} objects.
     */
    public List<BasicBooleanFieldQuery> getIsFeatured() {
        return this.isFeatured;
    }

    /**
     * Set the list of name queries. This replaces any queries that are already present.
     *
     * @param name List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicFieldQuery.Deserializer.class)
    public DatasetQuery setName(final List<? extends ConvertsToBasicFieldQuery> name) {
        this.name = BasicFieldQuery.fromList(name);
        return this;
    }

    /**
     * Add to the list of name queries.
     *
     * @param name List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    public DatasetQuery addName(final List<? extends ConvertsToBasicFieldQuery> name) {
        this.name = ListUtil.add(BasicFieldQuery.fromList(name), this.name);
        return this;
    }

    /**
     * Add to the list of name queries.
     *
     * @param name {@link ConvertsToBasicFieldQuery} object to add.
     * @return This object.
     */
    public DatasetQuery addName(final ConvertsToBasicFieldQuery name) {
        this.name = ListUtil.add(BasicFieldQuery.fromObject(name), this.name);
        return this;
    }

    /**
     * Get the number of name queries.
     *
     * @return Number of queries against the name field.
     */
    public int nameLength() {
        return ListUtil.length(this.name);
    }

    /**
     * Get an iterable over the name queries.
     *
     * @return {@link Iterable} of {@link BasicFieldQuery} objects.
     */
    public Iterable<BasicFieldQuery> name() {
        return ListUtil.iterable(this.name);
    }

    /**
     * Get one in the list of name queries.
     *
     * @param index Index of the filter to get.
     * @return {@link BasicFieldQuery} object.
     */
    public BasicFieldQuery getName(final int index) {
        return ListUtil.get(this.name, index);
    }

    /**
     * Get the list of name queries.
     *
     * @return List of {@link BasicFieldQuery} objects.
     */
    public List<BasicFieldQuery> getName() {
        return this.name;
    }

    /**
     * Set the list of description queries. This replaces any queries that are already present.
     *
     * @param description List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicFieldQuery.Deserializer.class)
    public DatasetQuery setDescription(final List<? extends ConvertsToBasicFieldQuery> description) {
        this.description = BasicFieldQuery.fromList(description);
        return this;
    }

    /**
     * Add to the list of description queries.
     *
     * @param description List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    public DatasetQuery addDescription(final List<? extends ConvertsToBasicFieldQuery> description) {
        this.description = ListUtil.add(BasicFieldQuery.fromList(description), this.description);
        return this;
    }

    /**
     * Add to the list of description queries.
     *
     * @param description {@link ConvertsToBasicFieldQuery} object to add.
     * @return This object.
     */
    public DatasetQuery addDescription(final ConvertsToBasicFieldQuery description) {
        this.description = ListUtil.add(BasicFieldQuery.fromObject(description), this.description);
        return this;
    }

    /**
     * Get the length of the description queries.
     *
     * @return Number of queries against the description field.
     */
    public int descriptionLength() {
        return ListUtil.length(this.description);
    }

    /**
     * Get an iterable over the description queries.
     *
     * @return {@link Iterable} of {@link BasicFieldQuery} objects.
     */
    public Iterable<BasicFieldQuery> description() {
        return ListUtil.iterable(this.description);
    }

    /**
     * Get one in the list of description queries.
     *
     * @param index Index of the filter to get.
     * @return {@link BasicFieldQuery} object.
     */
    public BasicFieldQuery getDescription(final int index) {
        return ListUtil.get(this.description, index);
    }

    /**
     * Get the list of description queries.
     *
     * @return List of {@link BasicFieldQuery} objects.
     */
    public List<BasicFieldQuery> getDescription() {
        return this.description;
    }

    /**
     * Set the list of owner queries. This replaces any queries that are already present.
     *
     * @param owner List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicFieldQuery.Deserializer.class)
    public DatasetQuery setOwner(final List<? extends ConvertsToBasicFieldQuery> owner) {
        this.owner = BasicFieldQuery.fromList(owner);
        return this;
    }

    /**
     * Add to the list of owner queries.
     *
     * @param owner List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    public DatasetQuery addOwner(final List<? extends ConvertsToBasicFieldQuery> owner) {
        this.owner = ListUtil.add(BasicFieldQuery.fromList(owner), this.owner);
        return this;
    }

    /**
     * Add to the list of owner queries.
     *
     * @param owner {@link ConvertsToBasicFieldQuery} object to add.
     * @return This object.
     */
    public DatasetQuery addOwner(final ConvertsToBasicFieldQuery owner) {
        this.owner = ListUtil.add(BasicFieldQuery.fromObject(owner), this.owner);
        return this;
    }

    /**
     * Get the number of owner queries.
     *
     * @return Number of queries against the owner field.
     */
    public int ownerLength() {
        return ListUtil.length(this.owner);
    }

    /**
     * Get an iterable over the owner queries.
     *
     * @return {@link Iterable} of {@link BasicFieldQuery} objects.
     */
    public Iterable<BasicFieldQuery> owner() {
        return ListUtil.iterable(this.owner);
    }

    /**
     * Get one in the list of owner queries.
     *
     * @param index Index of the owner query to get.
     * @return {@link BasicFieldQuery} object.
     */
    public BasicFieldQuery getOwner(final int index) {
        return ListUtil.get(this.owner, index);
    }

    /**
     * Get the list of owner queries.
     *
     * @return List of {@link BasicFieldQuery} objects.
     */
    public List<BasicFieldQuery> getOwner() {
        return this.owner;
    }

    /**
     * Set the list of email queries. This replaces any queries that are already present.
     *
     * @param email List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicFieldQuery.Deserializer.class)
    public DatasetQuery setEmail(final List<? extends ConvertsToBasicFieldQuery> email) {
        this.email = BasicFieldQuery.fromList(email);
        return this;
    }

    /**
     * Add to the list of email queries.
     *
     * @param email List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    public DatasetQuery addEmail(final List<? extends ConvertsToBasicFieldQuery> email) {
        this.email = ListUtil.add(BasicFieldQuery.fromList(email), this.email);
        return this;
    }

    /**
     * Add to the list of email queries.
     *
     * @param email {@link ConvertsToBasicFieldQuery} object to add.
     * @return This object.
     */
    public DatasetQuery addEmail(final ConvertsToBasicFieldQuery email) {
        this.email = ListUtil.add(BasicFieldQuery.fromObject(email), this.email);
        return this;
    }

    /**
     * Get the number of email queries.
     *
     * @return Number of queries against the email field.
     */
    public int emailLength() {
        return ListUtil.length(this.email);
    }

    /**
     * Get an iterable over the email queries.
     *
     * @return {@link Iterable} of {@link BasicFieldQuery} objects.
     */
    public Iterable<BasicFieldQuery> email() {
        return ListUtil.iterable(this.email);
    }

    /**
     * Get one in the list of email queries.
     *
     * @param index Index of the email query to get.
     * @return {@link BasicFieldQuery} object.
     */
    public BasicFieldQuery getEmail(final int index) {
        return ListUtil.get(this.email, index);
    }

    /**
     * Get the list of email queries.
     *
     * @return List of {@link BasicFieldQuery} objects.
     */
    public List<BasicFieldQuery> getEmail() {
        return this.email;
    }

    /**
     * Set the list of updatedAt queries. This replaces any queries that are already present.
     *
     * @param updatedAt List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    @JsonDeserialize(contentUsing = BasicFieldQuery.Deserializer.class)
    public DatasetQuery setUpdatedAt(final List<? extends ConvertsToBasicFieldQuery> updatedAt) {
        this.updatedAt = BasicFieldQuery.fromList(updatedAt);
        return this;
    }

    /**
     * Add to the list of updatedAt queries.
     *
     * @param updatedAt List of {@link ConvertsToBasicFieldQuery} objects.
     * @return This object.
     */
    public DatasetQuery addUpdatedAt(final List<? extends ConvertsToBasicFieldQuery> updatedAt) {
        this.updatedAt = ListUtil.add(BasicFieldQuery.fromList(updatedAt), this.updatedAt);
        return this;
    }

    /**
     * Add to the list of updatedAt queries.
     *
     * @param updatedAt {@link ConvertsToBasicFieldQuery} object to add.
     * @return This object.
     */
    public DatasetQuery addUpdatedAt(final ConvertsToBasicFieldQuery updatedAt) {
        this.updatedAt = ListUtil.add(BasicFieldQuery.fromObject(updatedAt), this.updatedAt);
        return this;
    }

    /**
     * Get the number of updatedAt queries.
     *
     * @return Number of queries against the updatedAt field.
     */
    public int updatedAtLength() {
        return ListUtil.length(this.updatedAt);
    }

    /**
     * Get an iterable over the updatedAt queries.
     *
     * @return {@link Iterable} of {@link BasicFieldQuery} objects.
     */
    public Iterable<BasicFieldQuery> updatedAt() {
        return ListUtil.iterable(this.updatedAt);
    }

    /**
     * Get one in the list of updatedAt queries.
     *
     * @param index Index of the updatedAt query to get.
     * @return {@link BasicFieldQuery} object.
     */
    public BasicFieldQuery getUpdatedAt(final int index) {
        return ListUtil.get(this.updatedAt, index);
    }

    /**
     * Get the list of updatedAt queries.
     *
     * @return List of {@link BasicFieldQuery} objects.
     */
    public List<BasicFieldQuery> getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link DatasetQuery} objects.
     * @return This object.
     */
    public DatasetQuery setQuery(final List<DatasetQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link DatasetQuery} objects.
     * @return This object.
     */
    public DatasetQuery addQuery(final List<DatasetQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link DatasetQuery} object to add.
     * @return This object.
     */
    public DatasetQuery addQuery(final DatasetQuery query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Get the number of nested queries.
     *
     * @return Number of nested queries.
     */
    public int queryLength() {
        return ListUtil.length(this.query);
    }

    /**
     * Get an iterable over the nested queries.
     *
     * @return {@link Iterable} of {@link DatasetQuery} objects.
     */
    public Iterable<DatasetQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link DatasetQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link DatasetQuery} at the input index.
     */
    public DatasetQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link DatasetQuery} objects.
     */
    public List<DatasetQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof DatasetQuery)) {
            return false;
        }
        final DatasetQuery rhsQuery = (DatasetQuery) rhs;
        return Optional.ofNullable(this.logic).equals(Optional.ofNullable(rhsQuery.logic))
                && Optional.ofNullable(this.weight).equals(Optional.ofNullable(rhsQuery.weight))
                && Optional.ofNullable(this.simple).equals(Optional.ofNullable(rhsQuery.simple))
                && Optional.ofNullable(this.simpleWeight).equals(Optional.ofNullable(rhsQuery.simpleWeight))
                && Optional.ofNullable(this.id).equals(Optional.ofNullable(rhsQuery.id))
                && Optional.ofNullable(this.isFeatured).equals(Optional.ofNullable(rhsQuery.isFeatured))
                && Optional.ofNullable(this.name).equals(Optional.ofNullable(rhsQuery.name))
                && Optional.ofNullable(this.description).equals(Optional.ofNullable(rhsQuery.description))
                && Optional.ofNullable(this.owner).equals(Optional.ofNullable(rhsQuery.owner))
                && Optional.ofNullable(this.email).equals(Optional.ofNullable(rhsQuery.email))
                && Optional.ofNullable(this.updatedAt).equals(Optional.ofNullable(rhsQuery.updatedAt))
                && Optional.ofNullable(this.query).equals(Optional.ofNullable(rhsQuery.query));
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

    private static final long serialVersionUID = 1926112709578116680L;

    /** Logic for the query. */
    private Logic logic;

    /** Weight of the query. */
    private Double weight;

    /** String with the simple search to run against all fields. */
    private String simple;

    /** Map of field names to weights for the simple search string. */
    private Map<String, Double> simpleWeight;

    /** List of filters against the dataset ID. */
    private List<BasicFieldQuery> id;

    /** Whether the dataset is featured. */
    private List<BasicBooleanFieldQuery> isFeatured;
    
    /** Name of the dataset. */
    private List<BasicFieldQuery> name;

    /** Description of the dataset. */
    private List<BasicFieldQuery> description;

    /** Owner of the dataset. */
    private List<BasicFieldQuery> owner;

    /** Email address of the owner of the dataset. */
    private List<BasicFieldQuery> email;
    
    /** The time that the dataset was last updated. */
    private List<BasicFieldQuery> updatedAt;
    
    /** Nested list of queries. */
    private List<DatasetQuery> query;
}