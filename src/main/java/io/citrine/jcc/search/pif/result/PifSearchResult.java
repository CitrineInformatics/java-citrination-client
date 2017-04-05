package io.citrine.jcc.search.pif.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.result.BaseSearchResult;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvMapReader;
import org.supercsv.io.CsvMapWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Class to store all of the results that were returned from a query. This class implements {@link Iterable} so that
 * users can iterate over results using:
 *
 * <pre>
 * {@code
 * PifSearchResult searchResult = Query.execute();
 * for (SearchHit i : searchResult) {
 *     // do work on hit
 * }
 * }
 * </pre>
 *
 * @author Kyle Michel
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PifSearchResult extends BaseSearchResult<PifSearchHit> {

    @Override
    @JsonSetter("took")
    public PifSearchResult setTook(final Long took) {
        super.setTook(took);
        return this;
    }

    @Override
    @JsonSetter("totalNumHits")
    public PifSearchResult setTotalNumHits(final Long totalNumHits) {
        super.setTotalNumHits(totalNumHits);
        return this;
    }

    @Override
    @JsonSetter("hits")
    protected PifSearchResult setHits(final List<PifSearchHit> hits) {
        super.setHits(hits);
        return this;
    }

    @Override
    @JsonIgnore
    public PifSearchResult addHit(final PifSearchHit hit) {
        super.addHit(hit);
        return this;
    }

    /**
     * Set the serialization of the CSV with search hits.
     *
     * @param csv String with the serialized CSV.
     * @return This object.
     */
    public PifSearchResult setCsv(final String csv) {
        this.csv = csv;
        return this;
    }

    /**
     * Get the string with the serialized CSV of search hits.
     *
     * @return String with the extracted search hits.
     */
    public String getCsv() {
        return this.csv;
    }

    /**
     * Combine the results in rhs with the content of this object. This method appends the data in rhs to the data
     * contained in this object.
     *
     * @param rhs {@link PifSearchResult} to add to this object.
     * @return This object.
     * @throws IOException if thrown while merging the CSVs.
     */
    public PifSearchResult add(final PifSearchResult rhs) throws IOException {

        // Handle common fields
        super.add(rhs);

        // Merge the CSVs
        if (this.csv == null) {
            this.csv = rhs.csv;
        }
        else if (rhs.csv != null) {
            this.csv = mergeCsv(this.csv, rhs.csv);
        }
        return this;
    }

    /**
     * Merge the input CSVs.
     *
     * @param lhs First CSV to merge.
     * @param rhs Second CSV to merge.
     * @return String with the serialized, merged CSV.
     * @throws IOException if thrown while merging the CSVs.
     */
    protected String mergeCsv(final String lhs, final String rhs) throws IOException {
        try (final CsvMapReader lhsReader =
                     new CsvMapReader(new StringReader(lhs), CsvPreference.STANDARD_PREFERENCE)) {
            try (final CsvMapReader rhsReader =
                         new CsvMapReader(new StringReader(rhs), CsvPreference.STANDARD_PREFERENCE)) {

                // Read the headers
                final String[] lhsHeaders = lhsReader.getHeader(true);
                final String[] rhsHeaders = rhsReader.getHeader(true);
                final String[] allHeaders = mergeHeaders(lhsHeaders, rhsHeaders);

                // Initialize the writer
                final StringWriter stringWriter = new StringWriter();
                final CsvMapWriter csvMapWriter = new CsvMapWriter(stringWriter, CsvPreference.STANDARD_PREFERENCE);
                final CellProcessor[] cellProcessors = new CellProcessor[allHeaders.length];
                Arrays.fill(cellProcessors, new Optional());

                // Save the headers
                csvMapWriter.writeHeader(allHeaders);

                // Iterate over all rows add add values
                addRows(csvMapWriter, allHeaders, cellProcessors, lhsReader, lhsHeaders);
                addRows(csvMapWriter, allHeaders, cellProcessors, rhsReader, rhsHeaders);

                // Return the serialized CSV
                csvMapWriter.flush();
                stringWriter.flush();
                return stringWriter.toString();
            }
        }
    }

    /**
     * Merge the two lists of headers. This method will add headers from rhs into lhs, exception where they are
     * already present.
     *
     * @param lhs First list of headers.
     * @param rhs Second list of headers.
     * @return Merged list of headers.
     */
    protected String[] mergeHeaders(final String[] lhs, final String[] rhs) {
        final Set<String> headers = new LinkedHashSet<>();
        Collections.addAll(headers, lhs);
        Collections.addAll(headers, rhs);
        return headers.toArray(new String[headers.size()]);
    }

    /**
     * Add the rows from the input csv to the output one.
     *
     * @param csvMapWriter {@link CsvMapWriter} to write to.
     * @param allHeaders List of all headers in the CSV being written.
     * @param cellProcessors List of {@link CellProcessor} objects to use.
     * @param csvMapReader {@link CsvMapReader} being read.
     * @param readerHeaders List of headers in the CSV being read.
     * @throws IOException if thrown while reading the CSV.
     */
    protected void addRows(
            final CsvMapWriter csvMapWriter, final String[] allHeaders, final CellProcessor[] cellProcessors,
            final CsvMapReader csvMapReader, final String[] readerHeaders) throws IOException {
        Map<String, String> row;
        while ((row = csvMapReader.read(readerHeaders)) != null) {
            csvMapWriter.write(row, allHeaders, cellProcessors);
        }
    }

    /** String with the serialized CSV of results. */
    private String csv;
}