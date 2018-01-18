package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.citrine.jcc.search.analysis.query.Analysis;
import io.citrine.jcc.util.ListUtil;
import io.citrine.jpif.util.PifObjectMapper;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Query against a field.
 *
 * @author Kyle Michel
 */
public class BasicFieldQuery extends AbstractFieldQuery implements Serializable, HasFilter, ConvertsToBasicFieldQuery {

    @Override
    public BasicFieldQuery setFilter(final List<Filter> filter) {
        this.filter = filter;
        return this;
    }

    @Override
    public BasicFieldQuery addFilter(final List<Filter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    public BasicFieldQuery addFilter(final Filter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    public int filterLength() {
        return ListUtil.length(this.filter);
    }

    @Override
    public Iterable<Filter> filter() {
        return ListUtil.iterable(this.filter);
    }

    @Override
    public Filter getFilter(final int index) {
        return ListUtil.get(this.filter, index);
    }

    @Override
    public List<Filter> getFilter() {
        return this.filter;
    }

    @Override
    public BasicFieldQuery setAnalysis(final List<Analysis> analysis) {
        super.setAnalysis(analysis);
        return this;
    }

    @Override
    public BasicFieldQuery addAnalysis(final List<Analysis> analysis) {
        super.addAnalysis(analysis);
        return this;
    }

    @Override
    public BasicFieldQuery addAnalysis(final Analysis analysis) {
        super.addAnalysis(analysis);
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof BasicFieldQuery)) {
            return false;
        }
        final BasicFieldQuery rhsQuery = (BasicFieldQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.filter).equals(Optional.ofNullable(rhsQuery.filter));
    }

    @Override
    public BasicFieldQuery toBasicFieldQuery() {
        return this;
    }

    /**
     * Convert the input list of objects to a list of {@link BasicFieldQuery} objects.
     *
     * @param list List of {@link ConvertsToBasicFieldQuery} objects to convert.
     * @return List of {@link BasicFieldQuery} objects.
     */
    public static List<BasicFieldQuery> fromList(final List<? extends ConvertsToBasicFieldQuery> list) {
        if (list == null) {
            return null;
        }
        return list.stream()
                .map(BasicFieldQuery::fromObject)
                .collect(Collectors.toList());
    }

    /**
     * Convert the input object to a {@link BasicFieldQuery} object.
     *
     * @param object ConvertsToBasicFieldQuery to convert.
     * @return {@link BasicFieldQuery} object.
     */
    public static BasicFieldQuery fromObject(final ConvertsToBasicFieldQuery object) {
        return (object == null)
                ? null
                : object.toBasicFieldQuery();
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

    private static final long serialVersionUID = 4856879199144049428L;

    /** List of filters. */
    private List<Filter> filter;

    /**
     * Helper class for deserializing objects that could be {@link Filter} or {@link BasicFieldQuery} types.
     *
     * @author Kyle Michel
     */
    public static class Deserializer extends JsonDeserializer<ConvertsToBasicFieldQuery> {

        @Override
        public ConvertsToBasicFieldQuery deserialize(
                JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            final JsonToken jsonToken = jsonParser.getCurrentToken();
            if (jsonToken == JsonToken.START_OBJECT) {
                return readObject(jsonParser);
            }
            else {
                throw deserializationContext.mappingException(BasicFieldQuery.class, jsonToken);
            }
        }

        /**
         * Read from the input parser and convert to a {@link ConvertsToBasicFieldQuery} object. This checks the keys
         * in the input map to determine if they represent a {@link Filter} or {@link BasicFieldQuery}.
         *
         * @param jsonParser {@link JsonParser} to read from.
         * @return {@link ConvertsToBasicFieldQuery} with the information from the map.
         * @throws IOException if thrown while processing the
         */
        private ConvertsToBasicFieldQuery readObject(final JsonParser jsonParser) throws IOException {

            // If the map contains any of the fields that are unique to a Filter object then deserialize as that type
            // and wrap inside of a new BasicFieldQuery object
            final Map<String, Object> map = PifObjectMapper.getInstance().readValue(jsonParser, MAP_TYPE_REFERENCE);
            return (map.containsKey("equal") || map.containsKey("min")
                        || map.containsKey("max") || map.containsKey("exists"))
                    ? PifObjectMapper.deepCopy(map, Filter.class)
                    : PifObjectMapper.deepCopy(map, BasicFieldQuery.class);
        }

        /** Type reference for a map of objects. */
        private static final TypeReference<Map<String, Object>> MAP_TYPE_REFERENCE =
                new TypeReference<Map<String, Object>>() {};
    }
}