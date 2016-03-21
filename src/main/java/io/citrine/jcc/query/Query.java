package io.citrine.jcc.query;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Class for defining queries against Citrination.
 *
 * @author Kyle Michel
 */
public class Query {


    public static void main(String[] args) {
        Query query = new Query().from(0).size(25).system(new SystemQuery()
                .chemicalFormula(new FieldOperation().extractAs("chemicalFormula")
                        .filter(new Filter().equal("oxide"))
                        .filter(new Filter().equal("hydride"))
                        .filter(new Filter().equal("binary").logic(Logic.MUST))
                        .filter(new Filter().equal("Li2O2").logic(Logic.NOT).exact(true)))
                .properties(new PropertiesQuery()
                        .name(new FieldOperation()
                                .filter(new Filter().equal("band gap"))
                                .filter(new Filter().equal("bandgap")))));


        try {
            System.out.println(new ObjectMapper()
                    .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                    .configure(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, true)
                    .writerWithDefaultPrettyPrinter().writeValueAsString(query));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * Index of the first hit that should be returned.
     *
     * @param from Index of the first hit (inclusive of zero) that should be returned.
     * @return This object.
     */
    @JsonSetter("from")
    public Query from(final Integer from) {
        this.from = from;
        return this;
    }

    /**
     * Get the index of the first hit that should be returned.
     *
     * @return Index of the first hit that should be returned or a null pointer if not set.
     */
    @JsonGetter("from")
    public Integer from() {
        return this.from;
    }

    /**
     * Set the maximum number of records that should be returned.
     *
     * @param size Maximum number of records to return.
     * @return This object.
     */
    @JsonSetter("size")
    public Query size(final Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get the maximum number of records that should be returned.
     *
     * @return Maximum number of records that should be returned or a null pointer if not set.
     */
    @JsonGetter("size")
    public Integer size() {
        return this.size;
    }

    /**
     * Set the system query.
     *
     * @param system {@link SystemQuery} object to use.
     * @return This object.
     */
    @JsonSetter("system")
    public Query system(final SystemQuery system) {
        this.system = system;
        return this;
    }

    /**
     * Get the system query to apply.
     *
     * @return {@link SystemQuery} object or a null pointer if one has not been set.
     */
    @JsonGetter("system")
    public SystemQuery system() {
        return this.system;
    }

    /** Index of the first hit that should be returned. */
    private Integer from;

    /** Total number of hits the should be returned. */
    private Integer size;

    /** System query to apply. */
    private SystemQuery system;
}