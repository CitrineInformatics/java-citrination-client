package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.citrine.jcc.search.analysis.query.Analysis;
import io.citrine.jcc.util.ListUtil;
import io.citrine.jcc.util.SerializationUtil;
import io.citrine.jpif.util.PifObjectMapper;

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
 * Query against a boolean field.
 *
 * @author Kyle Michel
 */
public class BasicBooleanFieldQuery extends AbstractFieldQuery
        implements Serializable, HasBooleanFilter, ConvertsToBasicBooleanFieldQuery {

    @Override
    public BasicBooleanFieldQuery setFilter(final List<BooleanFilter> filter) {
        this.filter = filter;
        return this;
    }

    @Override
    public BasicBooleanFieldQuery addFilter(final List<BooleanFilter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    public BasicBooleanFieldQuery addFilter(final BooleanFilter filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    public int filterLength() {
        return ListUtil.length(this.filter);
    }

    @Override
    public Iterable<BooleanFilter> filter() {
        return ListUtil.iterable(this.filter);
    }

    @Override
    public BooleanFilter getFilter(final int index) {
        return ListUtil.get(this.filter, index);
    }

    @Override
    public List<BooleanFilter> getFilter() {
        return this.filter;
    }

    @Override
    public BasicBooleanFieldQuery setAnalysis(final List<Analysis> analysis) {
        super.setAnalysis(analysis);
        return this;
    }

    @Override
    public BasicBooleanFieldQuery addAnalysis(final List<Analysis> analysis) {
        super.addAnalysis(analysis);
        return this;
    }

    @Override
    public BasicBooleanFieldQuery addAnalysis(final Analysis analysis) {
        super.addAnalysis(analysis);
        return this;
    }

    @Override
    public BasicBooleanFieldQuery toBasicBooleanFieldQuery() {
        return this;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof BasicBooleanFieldQuery)) {
            return false;
        }
        final BasicBooleanFieldQuery rhsQuery = (BasicBooleanFieldQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.filter).equals(Optional.ofNullable(rhsQuery.filter));
    }

    /**
     * Convert the input list of objects to a list of {@link BasicBooleanFieldQuery} objects.
     *
     * @param list List of {@link ConvertsToBasicBooleanFieldQuery} objects to convert.
     * @return List of {@link BasicBooleanFieldQuery} objects.
     */
    public static List<BasicBooleanFieldQuery> fromList(
            final List<? extends ConvertsToBasicBooleanFieldQuery> list) {
        if (list == null) {
            return null;
        }
        return list.stream()
                .map(BasicBooleanFieldQuery::fromObject)
                .collect(Collectors.toList());
    }

    /**
     * Convert the input object to a {@link BasicBooleanFieldQuery} object.
     *
     * @param object Object to convert.
     * @return {@link BasicBooleanFieldQuery} object.
     */
    public static BasicBooleanFieldQuery fromObject(final ConvertsToBasicBooleanFieldQuery object) {
        return (object == null)
                ? null
                : object.toBasicBooleanFieldQuery();
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

    private static final long serialVersionUID = -2426084546394350520L;

    /** List of filters. */
    private List<BooleanFilter> filter;

    /**
     * Helper class for deserializing objects that could be {@link BooleanFilter} or {@link BasicBooleanFieldQuery}
     * types.
     *
     * @author Kyle Michel
     */
    public static class Deserializer extends JsonDeserializer<ConvertsToBasicBooleanFieldQuery> {

        @Override
        public ConvertsToBasicBooleanFieldQuery deserialize(
                JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            final JsonToken jsonToken = jsonParser.getCurrentToken();
            if (jsonToken == JsonToken.START_OBJECT) {
                return readObject(jsonParser);
            }
            else {
                throw deserializationContext.mappingException(BasicBooleanFieldQuery.class, jsonToken);
            }
        }

        /**
         * Read from the input parser and convert to a {@link ConvertsToBasicBooleanFieldQuery} object. This checks
         * the keys in the input map to determine if they represent a {@link BooleanFilter} or
         * {@link BasicBooleanFieldQuery}.
         *
         * @param jsonParser {@link JsonParser} to read from.
         * @return {@link ConvertsToBasicBooleanFieldQuery} with the information from the map.
         * @throws IOException if thrown while processing the
         */
        private ConvertsToBasicBooleanFieldQuery readObject(final JsonParser jsonParser) throws IOException {

            // If the map contains any of the fields that are unique to a Filter object then deserialize as that type
            // and wrap inside of a new BasicFieldQuery object
            final Map<String, Object> map = PifObjectMapper.getInstance().readValue(jsonParser, MAP_TYPE_REFERENCE);
            return (map.containsKey("equal") || map.containsKey("exists"))
                    ? PifObjectMapper.deepCopy(map, BooleanFilter.class)
                    : PifObjectMapper.deepCopy(map, BasicBooleanFieldQuery.class);
        }

        /** Type reference for a map of objects. */
        private static final TypeReference<Map<String, Object>> MAP_TYPE_REFERENCE =
                new TypeReference<Map<String, Object>>() {};
    }
}