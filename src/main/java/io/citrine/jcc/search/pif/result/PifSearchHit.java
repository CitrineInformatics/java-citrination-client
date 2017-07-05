package io.citrine.jcc.search.pif.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.citrine.jpif.obj.common.Pio;
import io.citrine.jpif.util.PifObjectMapper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Class to store a single PIF search hit.
 *
 * @author Kyle Michel
 */
public class PifSearchHit {

    /**
     * Set the id of the record that was matched.
     *
     * @param id String with the id of the record.
     * @return This object.
     */
    public PifSearchHit setId(final String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the id of the record that was matched.
     *
     * @return String with the id of the matched record or a null pointer if not set.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the dataset of the record that was matched.
     *
     * @param dataset Dataset of the record.
     * @return This object.
     */
    public PifSearchHit setDataset(final String dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the dataset of the record that was matched.
     *
     * @return String with the dataset of the matched record or a null pointer if not set.
     */
    public String getDataset() {
        return this.dataset;
    }

    /**
     * Set the dataset version of the record that was matched.
     *
     * @param datasetVersion Long with the dataset version of the record.
     * @return This object.
     */
    public PifSearchHit setDatasetVersion(final Long datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }

    /**
     * Get the dataset version of the record that was matched.
     *
     * @return Long with the dataset version of the matched record or a null pointer if not set.
     */
    public Long getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * Set the score for a hit.
     *
     * @param score Double with the score for the hit.
     * @return This object.
     */
    public PifSearchHit setScore(final Double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the score for a hit.
     *
     * @return Double with the score for the hit or a null pointer if not set.
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * Set the system that was matched.
     *
     * @param system {@link System} to save in the result
     * @return This object.
     */
    public PifSearchHit setSystem(final System system) {
        this.system = system;
        return this;
    }

    /**
     * Get the system that was matched.
     *
     * @return {@link System} with the record that was matched or a null pointer if it has not been set.
     */
    public System getSystem() {
        return this.system;
    }

    /**
     * Set the map of extracted values.
     *
     * @param extracted Map of extracted value names to values.
     * @return This object.
     */
    public PifSearchHit setExtracted(final Map<String, Object> extracted) {
        this.extracted = extracted;
        return this;
    }

    /**
     * Add to the map of extracted values.
     *
     * @param extracted Map of extracted value names to values.
     * @return This object.
     */
    @JsonIgnore
    public PifSearchHit addExtracted(final Map<String, Object> extracted) {
        if (extracted != null) {
            if (this.extracted == null) {
                this.extracted = new HashMap<>();
            }
            this.extracted.putAll(extracted);
        }
        return this;
    }

    /**
     * Add to the map of extracted values.
     *
     * @param key Name of the extracted value.
     * @param value Value that was extracted.
     * @return This object.
     */
    @JsonIgnore
    public PifSearchHit addExtracted(final String key, final Object value) {
        if (this.extracted == null) {
            this.extracted = new HashMap<>();
        }
        this.extracted.put(key, value);
        return this;
    }

    /**
     * Get the map of extracted values.
     *
     * @return Map of extracted field keys to values.
     */
    protected Map<String, Object> getExtracted() {
        return this.extracted;
    }

    /**
     * Get the list of extracted value keys.
     *
     * @return Set with the extracted keys.
     */
    @JsonIgnore
    public Set<String> getExtractedKeys() {
        return (this.extracted == null) ? Collections.emptySet() : this.extracted.keySet();
    }

    /**
     * Get an extracted value by its key.
     *
     * @param key String with the key of the extracted value.
     * @return String with the value of the input key or a null pointer if that key is not available.
     */
    @JsonIgnore
    public Object getExtractedValue(final String key) {
        return (this.extracted == null) ? null : this.extracted.get(key);
    }

    /**
     * Get an extracted value an convert it to the type of valueClass. This method assumes that the value can be
     * converted to the specified class by serialized the value to JSON then deserializing to the class type.
     *
     * @param key String with the key of the extracted value.
     * @param valueClass Class to convert the extracted value to.
     * @param <T> Type of the value to extract.
     * @return Instance of the input class type generated from the value at the input key or a null pointer if the
     * key is not available.
     */
    @JsonIgnore
    public <T extends Pio> T getExtractValue(final String key, final Class<T> valueClass) {
        return (this.extracted == null) ? null : convert(this.extracted.get(key), valueClass);
    }

    /**
     * Get an extracted value by its key or return a default value.
     *
     * @param key String with the key of the extracted value.
     * @param defaultValue String with the default value to return if the key does not exist.
     * @return Value with the input key or the input default.
     */
    @JsonIgnore
    public Object getExtractedValueOrDefault(final String key, final Object defaultValue) {
        return (this.extracted == null) ? defaultValue : this.extracted.getOrDefault(key, defaultValue);
    }

    /**
     * Get an extracted value by its key or return a default value.
     *
     * @param key String with the key of the extracted value.
     * @param defaultValue String with the default value to return if the key does not exist.
     * @param valueClass Class to convert the extracted value to.
     * @param <T> Type of the value to extract.
     * @return Value with the input key or the input default.
     */
    @JsonIgnore
    public <T extends Pio> T getExtractedValueOrDefault(
            final String key, final T defaultValue, final Class<T> valueClass) {
        final T converted = (this.extracted == null) ? defaultValue : convert(this.extracted.get(key), valueClass);
        return (converted == null) ? defaultValue : converted;
    }

    /**
     * Convert the input object to an instance of the specified class by serializing it to JSON then deserializing to
     * the requested class.
     *
     * @param object Object to convert.
     * @param objectClass Class to convert the extracted value to.
     * @param <T> Type of the value to convert to.
     * @return Converted value.
     * @throws RuntimeException if the value cannot be converted.
     */
    @JsonIgnore
    private <T extends Pio> T convert(final Object object, final Class<T> objectClass) {
        if (object == null) {
            return null;
        }
        try {
            return PifObjectMapper.deepCopy(object, objectClass);
        }
        catch (Exception e) {
            throw new RuntimeException("Failed to convert value", e);
        }
    }

    /** Id of the record. */
    private String id;

    /** Dataset that the record belongs to. */
    private String dataset;

    /** Version of the dataset. */
    private Long datasetVersion;

    /** Score of the record. */
    private Double score;

    /** Pif system that was matched. */
    private System system;

    /** Map of extracted fields. */
    private Map<String, Object> extracted = new HashMap<>();
}