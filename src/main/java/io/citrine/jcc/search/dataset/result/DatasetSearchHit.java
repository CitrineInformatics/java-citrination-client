package io.citrine.jcc.search.dataset.result;

import io.citrine.jcc.search.pif.query.PifSystemQuery;
import io.citrine.jcc.util.SerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Optional;

/**
 * Class to store information about a single search hit with dataset information.
 *
 * @author Kyle Michel
 */
public class DatasetSearchHit implements Serializable {

    /**
     * Set the id of the dataset.
     *
     * @param id ID of the dataset
     * @return This object.
     */
    public DatasetSearchHit setId(final String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the id of the dataset.
     *
     * @return ID of the dataset.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the score of the hit.
     *
     * @param score Double with the score of the hit.
     * @return This object.
     */
    public DatasetSearchHit setScore(final Double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the score of the hit.
     *
     * @return Double with the score of the hit.
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * Set whether the dataset is featured.
     *
     * @param isFeatured True if the dataset is featured.
     * @return This object.
     */
    public DatasetSearchHit setIsFeatured(final Boolean isFeatured) {
        this.isFeatured = isFeatured;
        return this;
    }

    /**
     * Get whether the dataset is featured.
     *
     * @return True if the dataset is featured.
     */
    public Boolean getIsFeatured() {
        return this.isFeatured;
    }

    /**
     * Set the name of the dataset.
     *
     * @param name String with the name of the dataset.
     * @return This object.
     */
    public DatasetSearchHit setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the name of the dataset.
     *
     * @return String with the name of the dataset.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the description of the dataset.
     *
     * @param description String with the description of the dataset.
     * @return This object.
     */
    public DatasetSearchHit setDescription(final String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the description of the dataset.
     *
     * @return String with the description of the dataset.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the name of the owner of the dataset.
     *
     * @param owner String with the name of the owner of the dataset.
     * @return This object.
     */
    public DatasetSearchHit setOwner(final String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the name of the owner of the dataset.
     *
     * @return String with the name of the owner of the dataset.
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * Set the email address of the owner of the dataset.
     *
     * @param email String with the email address of the owner of the dataset.
     * @return This object.
     */
    public DatasetSearchHit setEmail(final String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the email address of the owner of the dataset.
     *
     * @return String with the email address of the owner of the dataset.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set the number of PIFs in the dataset.
     *
     * @param numPifs Number of PIFs in the dataset.
     * @return This object.
     */
    public DatasetSearchHit setNumPifs(final Long numPifs) {
        this.numPifs = numPifs;
        return this;
    }

    /**
     * Get the number of PIFs in the dataset. If one or more {@link PifSystemQuery}
     * queries were passed into the search request, then this value is the number of PIFs that matched those queries.
     *
     * @return Number of PIFs in the dataset.
     */
    public Long getNumPifs() {
        return this.numPifs;
    }

    /**
     * Set the time that the record was updated.
     *
     * @param updatedAt String with the time that the record was updated.
     * @return This object.
     */
    public DatasetSearchHit setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get the time that the record was updated.
     *
     * @return String with the time that the record was updated.
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof DatasetSearchHit)) {
            return false;
        }
        final DatasetSearchHit rhsHit = (DatasetSearchHit) rhs;
        return Optional.ofNullable(this.id).equals(Optional.ofNullable(rhsHit.id))
                && Optional.ofNullable(this.score).equals(Optional.ofNullable(rhsHit.score))
                && Optional.ofNullable(this.isFeatured).equals(Optional.ofNullable(rhsHit.isFeatured))
                && Optional.ofNullable(this.name).equals(Optional.ofNullable(rhsHit.name))
                && Optional.ofNullable(this.description).equals(Optional.ofNullable(rhsHit.description))
                && Optional.ofNullable(this.owner).equals(Optional.ofNullable(rhsHit.owner))
                && Optional.ofNullable(this.email).equals(Optional.ofNullable(rhsHit.email))
                && Optional.ofNullable(this.numPifs).equals(Optional.ofNullable(rhsHit.numPifs))
                && Optional.ofNullable(this.updatedAt).equals(Optional.ofNullable(rhsHit.updatedAt));
    }

    /**
     * Write this object to the output output stream.
     *
     * @param out {@link ObjectOutputStream} to write to.
     * @throws IOException if this object cannot be written.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        SerializationUtil.write(out, this);
    }

    /**
     * Read into this object from the input stream.
     *
     * @param in {@link ObjectInputStream} to read from.
     * @throws IOException if thrown while reading the stream.
     * @throws ClassNotFoundException if thrown while reading the stream.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        SerializationUtil.read(in, this);
    }

    /**
     * Read an object with no data.
     *
     * @throws ObjectStreamException if thrown while reading the stream.
     */
    private void readObjectNoData() throws ObjectStreamException {}

    private static final long serialVersionUID = -2397738366466524853L;

    /** ID of the dataset. */
    private String id;

    /** Version of the dataset. */
    private Double score;

    /** Whether the dataset is featured. */
    private Boolean isFeatured;

    /** Name of the dataset. */
    private String name;

    /** Description of the dataset. */
    private String description;

    /** Name of the owner of the dataset. */
    private String owner;

    /** Email address of the owner of the dataset. */
    private String email;

    /** Number of PIFs in the dataset. */
    private Long numPifs;

    /** The time that the record was updated. */
    private String updatedAt;
}