package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query against the quantity of a system.
 * 
 * @author Kyle Michel
 */
public class QuantityQuery extends BaseObjectQuery {

    /**
     * Set the list of actual mass percent operations. This adds to any operations that already exist.
     *
     * @param actualMassPercent List of {@link FieldOperation} objects.
     */
    @JsonSetter("actualMassPercent")
    private void actualMassPercent(final List<FieldOperation> actualMassPercent) {
        this.actualMassPercent = ListUtil.add(actualMassPercent, this.actualMassPercent);
    }

    /**
     * Add a single actual mass percent operation.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery actualMassPercent(final FieldOperation fieldOperation) {
        this.actualMassPercent = ListUtil.add(fieldOperation, this.actualMassPercent);
        return this;
    }

    /**
     * Add a single actual mass percent operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery actualMassPercent(final String extractAs) {
        this.actualMassPercent = ListUtil.add(new FieldOperation().extractAs(extractAs), this.actualMassPercent);
        return this;
    }

    /**
     * Add a single actual mass percent operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery actualMassPercent(final Filter filter) {
        this.actualMassPercent = ListUtil.add(new FieldOperation().filter(filter), this.actualMassPercent);
        return this;
    }

    /**
     * Get an iterable object over the actual mass percent fields.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("actualMassPercent")
    public Iterable<FieldOperation> actualMassPercent() {
        return ListUtil.iterable(this.actualMassPercent);
    }

    /**
     * Return whether any actual mass percent operations exist.
     *
     * @return True if any actual mass percent operations exist.
     */
    @JsonIgnore
    public boolean hasActualMassPercent() {
        return ListUtil.hasContent(this.actualMassPercent);
    }

    /**
     * Set the list of actual volume percent operations. This adds to any operations that already exist.
     *
     * @param actualVolumePercent List of {@link FieldOperation} objects.
     */
    @JsonSetter("actualVolumePercent")
    private void actualVolumePercent(final List<FieldOperation> actualVolumePercent) {
        this.actualVolumePercent = ListUtil.add(actualVolumePercent, this.actualVolumePercent);
    }

    /**
     * Add a single actual volume percent operation.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery actualVolumePercent(final FieldOperation fieldOperation) {
        this.actualVolumePercent = ListUtil.add(fieldOperation, this.actualVolumePercent);
        return this;
    }

    /**
     * Add a single actual volume percent operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery actualVolumePercent(final String extractAs) {
        this.actualVolumePercent = ListUtil.add(new FieldOperation().extractAs(extractAs), this.actualVolumePercent);
        return this;
    }

    /**
     * Add a single actual volume percent operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery actualVolumePercent(final Filter filter) {
        this.actualVolumePercent = ListUtil.add(new FieldOperation().filter(filter), this.actualVolumePercent);
        return this;
    }

    /**
     * Get an iterable object over the actual volume percent fields.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("actualVolumePercent")
    public Iterable<FieldOperation> actualVolumePercent() {
        return ListUtil.iterable(this.actualVolumePercent);
    }

    /**
     * Return whether any actual volume percent operations exist.
     *
     * @return True if any actual volume percent operations exist.
     */
    @JsonIgnore
    public boolean hasActualVolumePercent() {
        return ListUtil.hasContent(this.actualVolumePercent);
    }

    /**
     * Set the list of actual number percent operations. This adds to any operations that already exist.
     *
     * @param actualNumberPercent List of {@link FieldOperation} objects.
     */
    @JsonSetter("actualNumberPercent")
    private void actualNumberPercent(final List<FieldOperation> actualNumberPercent) {
        this.actualNumberPercent = ListUtil.add(actualNumberPercent, this.actualNumberPercent);
    }

    /**
     * Add a single actual number percent operation.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery actualNumberPercent(final FieldOperation fieldOperation) {
        this.actualNumberPercent = ListUtil.add(fieldOperation, this.actualNumberPercent);
        return this;
    }

    /**
     * Add a single actual number percent operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery actualNumberPercent(final String extractAs) {
        this.actualNumberPercent = ListUtil.add(new FieldOperation().extractAs(extractAs), this.actualNumberPercent);
        return this;
    }

    /**
     * Add a single actual number percent operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery actualNumberPercent(final Filter filter) {
        this.actualNumberPercent = ListUtil.add(new FieldOperation().filter(filter), this.actualNumberPercent);
        return this;
    }

    /**
     * Get an iterable object over the actual number percent fields.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("actualNumberPercent")
    public Iterable<FieldOperation> actualNumberPercent() {
        return ListUtil.iterable(this.actualNumberPercent);
    }

    /**
     * Return whether any actual number percent operations exist.
     *
     * @return True if any actual number percent operations exist.
     */
    @JsonIgnore
    public boolean hasActualNumberPercent() {
        return ListUtil.hasContent(this.actualNumberPercent);
    }

    /**
     * Set the list of ideal mass percent operations. This adds to any operations that already exist.
     *
     * @param idealMassPercent List of {@link FieldOperation} objects.
     */
    @JsonSetter("idealMassPercent")
    private void idealMassPercent(final List<FieldOperation> idealMassPercent) {
        this.idealMassPercent = ListUtil.add(idealMassPercent, this.idealMassPercent);
    }

    /**
     * Add a single ideal mass percent operation.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery idealMassPercent(final FieldOperation fieldOperation) {
        this.idealMassPercent = ListUtil.add(fieldOperation, this.idealMassPercent);
        return this;
    }

    /**
     * Add a single ideal mass percent operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery idealMassPercent(final String extractAs) {
        this.idealMassPercent = ListUtil.add(new FieldOperation().extractAs(extractAs), this.idealMassPercent);
        return this;
    }

    /**
     * Add a single ideal mass percent operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery idealMassPercent(final Filter filter) {
        this.idealMassPercent = ListUtil.add(new FieldOperation().filter(filter), this.idealMassPercent);
        return this;
    }

    /**
     * Get an iterable object over the ideal mass percent fields.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("idealMassPercent")
    public Iterable<FieldOperation> idealMassPercent() {
        return ListUtil.iterable(this.idealMassPercent);
    }

    /**
     * Return whether any ideal mass percent operations exist.
     *
     * @return True if any ideal mass percent operations exist.
     */
    @JsonIgnore
    public boolean hasIdealMassPercent() {
        return ListUtil.hasContent(this.idealMassPercent);
    }

    /**
     * Set the list of ideal volume percent operations. This adds to any operations that already exist.
     *
     * @param idealVolumePercent List of {@link FieldOperation} objects.
     */
    @JsonSetter("idealVolumePercent")
    private void idealVolumePercent(final List<FieldOperation> idealVolumePercent) {
        this.idealVolumePercent = ListUtil.add(idealVolumePercent, this.idealVolumePercent);
    }

    /**
     * Add a single ideal volume percent operation.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery idealVolumePercent(final FieldOperation fieldOperation) {
        this.idealVolumePercent = ListUtil.add(fieldOperation, this.idealVolumePercent);
        return this;
    }

    /**
     * Add a single ideal volume percent operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery idealVolumePercent(final String extractAs) {
        this.idealVolumePercent = ListUtil.add(new FieldOperation().extractAs(extractAs), this.idealVolumePercent);
        return this;
    }

    /**
     * Add a single ideal volume percent operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery idealVolumePercent(final Filter filter) {
        this.idealVolumePercent = ListUtil.add(new FieldOperation().filter(filter), this.idealVolumePercent);
        return this;
    }

    /**
     * Get an iterable object over the ideal volume percent fields.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("idealVolumePercent")
    public Iterable<FieldOperation> idealVolumePercent() {
        return ListUtil.iterable(this.idealVolumePercent);
    }

    /**
     * Return whether any ideal volume percent operations exist.
     *
     * @return True if any ideal volume percent operations exist.
     */
    @JsonIgnore
    public boolean hasIdealVolumePercent() {
        return ListUtil.hasContent(this.idealVolumePercent);
    }

    /**
     * Set the list of ideal number percent operations. This adds to any operations that already exist.
     *
     * @param idealNumberPercent List of {@link FieldOperation} objects.
     */
    @JsonSetter("idealNumberPercent")
    private void idealNumberPercent(final List<FieldOperation> idealNumberPercent) {
        this.idealNumberPercent = ListUtil.add(idealNumberPercent, this.idealNumberPercent);
    }

    /**
     * Add a single ideal number percent operation.
     *
     * @param fieldOperation {@link FieldOperation} to add.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery idealNumberPercent(final FieldOperation fieldOperation) {
        this.idealNumberPercent = ListUtil.add(fieldOperation, this.idealNumberPercent);
        return this;
    }

    /**
     * Add a single ideal number percent operation.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery idealNumberPercent(final String extractAs) {
        this.idealNumberPercent = ListUtil.add(new FieldOperation().extractAs(extractAs), this.idealNumberPercent);
        return this;
    }

    /**
     * Add a single ideal number percent operation.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public QuantityQuery idealNumberPercent(final Filter filter) {
        this.idealNumberPercent = ListUtil.add(new FieldOperation().filter(filter), this.idealNumberPercent);
        return this;
    }

    /**
     * Get an iterable object over the ideal number percent fields.
     *
     * @return Iterable of {@link FieldOperation} objects.
     */
    @JsonGetter("idealNumberPercent")
    public Iterable<FieldOperation> idealNumberPercent() {
        return ListUtil.iterable(this.idealNumberPercent);
    }

    /**
     * Return whether any ideal number percent operations exist.
     *
     * @return True if any ideal number percent operations exist.
     */
    @JsonIgnore
    public boolean hasIdealNumberPercent() {
        return ListUtil.hasContent(this.idealNumberPercent);
    }

    @Override
    @JsonSetter("logic")
    public QuantityQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonSetter("extractAs")
    public QuantityQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public QuantityQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public QuantityQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public QuantityQuery tags(final FieldOperation fieldOperation) {
        super.tags(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public QuantityQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public QuantityQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public QuantityQuery length(final FieldOperation fieldOperation) {
        super.length(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public QuantityQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public QuantityQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public QuantityQuery offset(final FieldOperation fieldOperation) {
        super.offset(fieldOperation);
        return this;
    }

    @Override
    @JsonIgnore
    public QuantityQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public QuantityQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** Actual percent of the total mass. */
    private List<FieldOperation> actualMassPercent;

    /** Actual percent of the total volume. */
    private List<FieldOperation> actualVolumePercent;

    /** Actual percent of the total number. */
    private List<FieldOperation> actualNumberPercent;

    /** Ideal percent of the total mass. */
    private List<FieldOperation> idealMassPercent;

    /** Ideal percent of the total volume. */
    private List<FieldOperation> idealVolumePercent;

    /** Ideal percent of the total number. */
    private List<FieldOperation> idealNumberPercent;
}