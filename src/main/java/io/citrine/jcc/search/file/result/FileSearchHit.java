package io.citrine.jcc.search.file.result;

import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * A single search hit for a file.
 *
 * @author Kyle Michel
 */
public class FileSearchHit {

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