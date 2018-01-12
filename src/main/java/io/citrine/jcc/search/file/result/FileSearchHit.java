package io.citrine.jcc.search.file.result;

import io.citrine.jcc.util.ListUtil;
import io.citrine.jcc.util.SerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * A single search hit for a file.
 *
 * @author Kyle Michel
 */
public class FileSearchHit implements Serializable {

    /**
     * Set the dataset ID of the file.
     *
     * @param datasetId String with the ID of the dataset.
     * @return This object.
     */
    public FileSearchHit setDatasetId(final String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * Get the dataset ID of the file.
     *
     * @return String with the ID of the dataset.
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * Set the dataset version of the file.
     *
     * @param datasetVersion Long with the dataset version.
     * @return This object.
     */
    public FileSearchHit setDatasetVersion(final Long datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }

    /**
     * Get the dataset version of the file.
     *
     * @return Long with the dataset version.
     */
    public Long getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * Set the ID of the file.
     *
     * @param id String with the ID of the file.
     * @return This object.
     */
    public FileSearchHit setId(final String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the ID of the file.
     *
     * @return String with the ID of the file.
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
    public FileSearchHit setScore(final Double score) {
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
     * Set the name of the file.
     *
     * @param name String with the name of the file.
     * @return This object.
     */
    public FileSearchHit setName(final String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the name of the file.
     *
     * @return String with the name of the file.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the date and time that the file was last updated.
     *
     * @param updatedAt String with the last date and time that the file was updated.
     * @return This object.
     */
    public FileSearchHit setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get the date and time that the file was last updated.
     *
     * @return String with the date and time that the file was last updated.
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the list of highlights that were matched. This overwrites any highlights that are already saved.
     *
     * @param highlights List of strings with the highlighted text.
     * @return This object.
     */
    public FileSearchHit setHighlights(final List<String> highlights) {
        this.highlights = highlights;
        return this;
    }

    /**
     * Add all highlights in a list.
     *
     * @param highlights List of highlights to add.
     * @return This object.
     */
    public FileSearchHit addHighlights(final List<String> highlights) {
        this.highlights = ListUtil.add(highlights, this.highlights);
        return this;
    }

    /**
     * Add a single hit that was matched.
     *
     * @param hit Hit to add to the results set.
     * @return This object.
     */
    public FileSearchHit addHighlights(final String hit) {
        this.highlights = ListUtil.add(hit, this.highlights);
        return this;
    }

    /**
     * Get the number of highlights that were matched.
     *
     * @return Number of highlights in the result set.
     */
    public int getNumHighlights() {
        return ListUtil.length(this.highlights);
    }

    /**
     * Get a hit at the set index.
     *
     * @param index Index of the hit to return.
     * @return Hit at the input index.
     * @throws IllegalArgumentException if the index is out of bounds.
     */
    public String getHighlights(final int index) {
        return ListUtil.get(this.highlights, index);
    }

    /**
     * Get the list of highlights that were matched.
     *
     * @return List of hit objects.
     */
    public List<String> getHighlights() {
        return this.highlights;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof FileSearchHit)) {
            return false;
        }
        final FileSearchHit rhsHit = (FileSearchHit) rhs;
        return Optional.ofNullable(this.datasetId).equals(Optional.ofNullable(rhsHit.datasetId))
                && Optional.ofNullable(this.datasetVersion).equals(Optional.ofNullable(rhsHit.datasetVersion))
                && Optional.ofNullable(this.id).equals(Optional.ofNullable(rhsHit.id))
                && Optional.ofNullable(this.score).equals(Optional.ofNullable(rhsHit.score))
                && Optional.ofNullable(this.name).equals(Optional.ofNullable(rhsHit.name))
                && Optional.ofNullable(this.updatedAt).equals(Optional.ofNullable(rhsHit.updatedAt))
                && Optional.ofNullable(this.highlights).equals(Optional.ofNullable(rhsHit.highlights));
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

    private static final long serialVersionUID = 4740183385859730122L;

    /** Id of the dataset. */
    private String datasetId;

    /** Version of the dataset. */
    private Long datasetVersion;

    /** Id of the file. */
    private String id;

    /** Version of the dataset. */
    private Double score;

    /** Name of the file. */
    private String name;

    /** The time that the record was updated. */
    private String updatedAt;

    /** The list of highlights in the file. */
    private List<String> highlights;
}