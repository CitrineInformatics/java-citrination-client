package io.citrine.jcc.search.core.query;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Filter that can be applied to boolean-valued fields.
 * 
 * @author Kyle Michel
 */
public class BooleanFilter implements HasLogic {

    @Override
    public BooleanFilter setLogic(final Logic logic) {
        this.logic = logic;
        return this;
    }

    @Override
    public Logic getLogic() {
        return this.logic;
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

    /** Logic for applying the filters. */
    private Logic logic;

    /** Just check for existence. */
    private Boolean exists;
    
    /** State to match against. */
    private Boolean equal;
}