package io.citrine.jcc.search.analysis.query;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Optional;

/**
 * Base class for all analysis types.
 *
 * @author Kyle Michel
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "histogram", value = HistogramAnalysis.class),
        @JsonSubTypes.Type(name = "ranges", value = RangesAnalysis.class),
        @JsonSubTypes.Type(name = "statistics", value = StatisticsAnalysis.class),
        @JsonSubTypes.Type(name = "values", value = CategoricalAnalysis.class)})
public abstract class Analysis implements Serializable {

    /**
     * Set the path to the analysis.
     *
     * @param path String with the path.
     * @return This object.
     */
    public Analysis setPath(final String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the path to the analysis.
     *
     * @return String with the path to the analysis.
     */
    public String getPath() {
        return this.path;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof Analysis)) {
            return false;
        }
        final Analysis rhsAnalysis = (Analysis) rhs;
        return Optional.ofNullable(this.path).equals(Optional.ofNullable(rhsAnalysis.path));
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

    private static final long serialVersionUID = 7340058532263396043L;

    /** Path to the analysis. */
    private String path;
}