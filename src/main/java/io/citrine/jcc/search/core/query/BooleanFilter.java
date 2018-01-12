package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonSetter;
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
 * Filter that can be applied to boolean-valued fields.
 * 
 * @author Kyle Michel
 */
public class BooleanFilter
        implements Serializable, HasLogic, HasWeight, HasBooleanFilter, ConvertsToBasicBooleanFieldQuery {

    @Override
    public BooleanFilter setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
    }

    @Override
    public BooleanFilter setWeight(final Double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    /**
     * Set whether to check for existence.
     *
     * @param exist True if the field must exist.
     */
    @JsonSetter
    private void setExist(final Boolean exist) {  // Private since only Jackson should use it
        this.setExists(exist);
    }

    /**
     * Set whether to check for existence.
     *
     * @param exists True if the field must exist.
     * @return This object.
     */
    public BooleanFilter setExists(final Boolean exists) {
        this.exists = exists;
        return this;
    }

    /**
     * Get whether to check for existence.
     *
     * @return True if the field must exist or a null pointer if it has not been set.
     */
    public Boolean getExists() {
        return this.exists;
    }

    /**
     * Set the state to match against.
     * 
     * @param equal Boolean value to match against.
     * @return This object.
     */
    public BooleanFilter setEqual(final Boolean equal) {
        this.equal = equal;
        return this;
    }

    /**
     * Get the boolean value to match against.
     *
     * @return Match state or a null pointer if it has not been set.
     */
    public Boolean getEqual() {
        return this.equal;
    }

    @Override
    public BooleanFilter setFilter(final List<BooleanFilter> filter) {
        this.filter = filter;
        return this;
    }

    @Override
    public BooleanFilter addFilter(final List<BooleanFilter> filter) {
        this.filter = ListUtil.add(filter, this.filter);
        return this;
    }

    @Override
    public BooleanFilter addFilter(final BooleanFilter filter) {
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
    public BasicBooleanFieldQuery toBasicBooleanFieldQuery() {
        return new BasicBooleanFieldQuery().addFilter(this);
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof BooleanFilter)) {
            return false;
        }
        final BooleanFilter rhsFilter = (BooleanFilter) rhs;
        return Optional.ofNullable(this.logic).equals(Optional.ofNullable(rhsFilter.logic))
                && Optional.ofNullable(this.exists).equals(Optional.ofNullable(rhsFilter.exists))
                && Optional.ofNullable(this.equal).equals(Optional.ofNullable(rhsFilter.equal))
                && Optional.ofNullable(this.filter).equals(Optional.ofNullable(rhsFilter.filter));
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

    private static final long serialVersionUID = -5230183251281242533L;

    /** Logic for applying the filters. */
    private Logic logic;

    /** Weight of the filter. */
    private Double weight;

    /** Just check for existence. */
    private Boolean exists;
    
    /** State to match against. */
    private Boolean equal;

    /** List of sub-filters. */
    private List<BooleanFilter> filter;
}