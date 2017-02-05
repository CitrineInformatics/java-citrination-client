package io.citrine.jcc.search.pif.query.core;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;

/**
 * Query against a reference.
 *
 * @author Kyle Michel
 */
public class ReferenceQuery extends BaseObjectQuery {

    /**
     * Set the list of doi operations. This adds to any operations that are already saved.
     *
     * @param doi List of {@link FieldQuery} objects.
     */
    @JsonSetter("doi")
    private void doi(final List<FieldQuery> doi) {
        this.doi = ListUtil.add(doi, this.doi);
    }

    /**
     * Add to the list of doi operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery doi(final FieldQuery fieldQuery) {
        this.doi = ListUtil.add(fieldQuery, this.doi);
        return this;
    }

    /**
     * Add to the list of doi operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery doi(final String extractAs) {
        this.doi = ListUtil.add(new FieldQuery().extractAs(extractAs), this.doi);
        return this;
    }

    /**
     * Add to the list of doi operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery doi(final Filter filter) {
        this.doi = ListUtil.add(new FieldQuery().filter(filter), this.doi);
        return this;
    }

    /**
     * Get an iterable over doi operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("doi")
    public Iterable<FieldQuery> doi() {
        return ListUtil.iterable(this.doi);
    }

    /**
     * Return whether any doi operations exist.
     *
     * @return True if any doi operations exist.
     */
    @JsonIgnore
    public boolean hasDoi() {
        return ListUtil.hasContent(this.doi);
    }

    /**
     * Set the list of isbn operations. This adds to any operations that are already saved.
     *
     * @param isbn List of {@link FieldQuery} objects.
     */
    @JsonSetter("isbn")
    private void isbn(final List<FieldQuery> isbn) {
        this.isbn = ListUtil.add(isbn, this.isbn);
    }

    /**
     * Add to the list of isbn operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery isbn(final FieldQuery fieldQuery) {
        this.isbn = ListUtil.add(fieldQuery, this.isbn);
        return this;
    }

    /**
     * Add to the list of isbn operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery isbn(final String extractAs) {
        this.isbn = ListUtil.add(new FieldQuery().extractAs(extractAs), this.isbn);
        return this;
    }

    /**
     * Add to the list of isbn operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery isbn(final Filter filter) {
        this.isbn = ListUtil.add(new FieldQuery().filter(filter), this.isbn);
        return this;
    }

    /**
     * Get an iterable over isbn operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("isbn")
    public Iterable<FieldQuery> isbn() {
        return ListUtil.iterable(this.isbn);
    }

    /**
     * Return whether any isbn operations exist.
     *
     * @return True if any isbn operations exist.
     */
    @JsonIgnore
    public boolean hasIsbn() {
        return ListUtil.hasContent(this.isbn);
    }

    /**
     * Set the list of issn operations. This adds to any operations that are already saved.
     *
     * @param issn List of {@link FieldQuery} objects.
     */
    @JsonSetter("issn")
    private void issn(final List<FieldQuery> issn) {
        this.issn = ListUtil.add(issn, this.issn);
    }

    /**
     * Add to the list of issn operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery issn(final FieldQuery fieldQuery) {
        this.issn = ListUtil.add(fieldQuery, this.issn);
        return this;
    }

    /**
     * Add to the list of issn operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery issn(final String extractAs) {
        this.issn = ListUtil.add(new FieldQuery().extractAs(extractAs), this.issn);
        return this;
    }

    /**
     * Add to the list of issn operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery issn(final Filter filter) {
        this.issn = ListUtil.add(new FieldQuery().filter(filter), this.issn);
        return this;
    }

    /**
     * Get an iterable over issn operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("issn")
    public Iterable<FieldQuery> issn() {
        return ListUtil.iterable(this.issn);
    }

    /**
     * Return whether any issn operations exist.
     *
     * @return True if any issn operations exist.
     */
    @JsonIgnore
    public boolean hasIssn() {
        return ListUtil.hasContent(this.issn);
    }

    /**
     * Set the list of url operations. This adds to any operations that are already saved.
     *
     * @param url List of {@link FieldQuery} objects.
     */
    @JsonSetter("url")
    private void url(final List<FieldQuery> url) {
        this.url = ListUtil.add(url, this.url);
    }

    /**
     * Add to the list of url operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery url(final FieldQuery fieldQuery) {
        this.url = ListUtil.add(fieldQuery, this.url);
        return this;
    }

    /**
     * Add to the list of url operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery url(final String extractAs) {
        this.url = ListUtil.add(new FieldQuery().extractAs(extractAs), this.url);
        return this;
    }

    /**
     * Add to the list of url operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery url(final Filter filter) {
        this.url = ListUtil.add(new FieldQuery().filter(filter), this.url);
        return this;
    }

    /**
     * Get an iterable over url operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("url")
    public Iterable<FieldQuery> url() {
        return ListUtil.iterable(this.url);
    }

    /**
     * Return whether any url operations exist.
     *
     * @return True if any url operations exist.
     */
    @JsonIgnore
    public boolean hasUrl() {
        return ListUtil.hasContent(this.url);
    }

    /**
     * Set the list of title operations. This adds to any operations that are already saved.
     *
     * @param title List of {@link FieldQuery} objects.
     */
    @JsonSetter("title")
    private void title(final List<FieldQuery> title) {
        this.title = ListUtil.add(title, this.title);
    }

    /**
     * Add to the list of title operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery title(final FieldQuery fieldQuery) {
        this.title = ListUtil.add(fieldQuery, this.title);
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery title(final String extractAs) {
        this.title = ListUtil.add(new FieldQuery().extractAs(extractAs), this.title);
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery title(final Filter filter) {
        this.title = ListUtil.add(new FieldQuery().filter(filter), this.title);
        return this;
    }

    /**
     * Get an iterable over title operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("title")
    public Iterable<FieldQuery> title() {
        return ListUtil.iterable(this.title);
    }

    /**
     * Return whether any title operations exist.
     *
     * @return True if any title operations exist.
     */
    @JsonIgnore
    public boolean hasTitle() {
        return ListUtil.hasContent(this.title);
    }

    /**
     * Set the list of publisher operations. This adds to any operations that are already saved.
     *
     * @param publisher List of {@link FieldQuery} objects.
     */
    @JsonSetter("publisher")
    private void publisher(final List<FieldQuery> publisher) {
        this.publisher = ListUtil.add(publisher, this.publisher);
    }

    /**
     * Add to the list of publisher operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery publisher(final FieldQuery fieldQuery) {
        this.publisher = ListUtil.add(fieldQuery, this.publisher);
        return this;
    }

    /**
     * Add to the list of publisher operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery publisher(final String extractAs) {
        this.publisher = ListUtil.add(new FieldQuery().extractAs(extractAs), this.publisher);
        return this;
    }

    /**
     * Add to the list of publisher operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery publisher(final Filter filter) {
        this.publisher = ListUtil.add(new FieldQuery().filter(filter), this.publisher);
        return this;
    }

    /**
     * Get an iterable over publisher operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("publisher")
    public Iterable<FieldQuery> publisher() {
        return ListUtil.iterable(this.publisher);
    }

    /**
     * Return whether any publisher operations exist.
     *
     * @return True if any publisher operations exist.
     */
    @JsonIgnore
    public boolean hasPublisher() {
        return ListUtil.hasContent(this.publisher);
    }

    /**
     * Set the list of journal operations. This adds to any operations that are already saved.
     *
     * @param journal List of {@link FieldQuery} objects.
     */
    @JsonSetter("journal")
    private void journal(final List<FieldQuery> journal) {
        this.journal = ListUtil.add(journal, this.journal);
    }

    /**
     * Add to the list of journal operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery journal(final FieldQuery fieldQuery) {
        this.journal = ListUtil.add(fieldQuery, this.journal);
        return this;
    }

    /**
     * Add to the list of journal operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery journal(final String extractAs) {
        this.journal = ListUtil.add(new FieldQuery().extractAs(extractAs), this.journal);
        return this;
    }

    /**
     * Add to the list of journal operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery journal(final Filter filter) {
        this.journal = ListUtil.add(new FieldQuery().filter(filter), this.journal);
        return this;
    }

    /**
     * Get an iterable over journal operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("journal")
    public Iterable<FieldQuery> journal() {
        return ListUtil.iterable(this.journal);
    }

    /**
     * Return whether any journal operations exist.
     *
     * @return True if any journal operations exist.
     */
    @JsonIgnore
    public boolean hasJournal() {
        return ListUtil.hasContent(this.journal);
    }

    /**
     * Set the list of volume operations. This adds to any operations that are already saved.
     *
     * @param volume List of {@link FieldQuery} objects.
     */
    @JsonSetter("volume")
    private void volume(final List<FieldQuery> volume) {
        this.volume = ListUtil.add(volume, this.volume);
    }

    /**
     * Add to the list of volume operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery volume(final FieldQuery fieldQuery) {
        this.volume = ListUtil.add(fieldQuery, this.volume);
        return this;
    }

    /**
     * Add to the list of volume operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery volume(final String extractAs) {
        this.volume = ListUtil.add(new FieldQuery().extractAs(extractAs), this.volume);
        return this;
    }

    /**
     * Add to the list of volume operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery volume(final Filter filter) {
        this.volume = ListUtil.add(new FieldQuery().filter(filter), this.volume);
        return this;
    }

    /**
     * Get an iterable over volume operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("volume")
    public Iterable<FieldQuery> volume() {
        return ListUtil.iterable(this.volume);
    }

    /**
     * Return whether any volume operations exist.
     *
     * @return True if any volume operations exist.
     */
    @JsonIgnore
    public boolean hasVolume() {
        return ListUtil.hasContent(this.volume);
    }

    /**
     * Set the list of issue operations. This adds to any operations that are already saved.
     *
     * @param issue List of {@link FieldQuery} objects.
     */
    @JsonSetter("issue")
    private void issue(final List<FieldQuery> issue) {
        this.issue = ListUtil.add(issue, this.issue);
    }

    /**
     * Add to the list of issue operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery issue(final FieldQuery fieldQuery) {
        this.issue = ListUtil.add(fieldQuery, this.issue);
        return this;
    }

    /**
     * Add to the list of issue operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery issue(final String extractAs) {
        this.issue = ListUtil.add(new FieldQuery().extractAs(extractAs), this.issue);
        return this;
    }

    /**
     * Add to the list of issue operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery issue(final Filter filter) {
        this.issue = ListUtil.add(new FieldQuery().filter(filter), this.issue);
        return this;
    }

    /**
     * Get an iterable over issue operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("issue")
    public Iterable<FieldQuery> issue() {
        return ListUtil.iterable(this.issue);
    }

    /**
     * Return whether any issue operations exist.
     *
     * @return True if any issue operations exist.
     */
    @JsonIgnore
    public boolean hasIssue() {
        return ListUtil.hasContent(this.issue);
    }

    /**
     * Set the list of year operations. This adds to any operations that are already saved.
     *
     * @param year List of {@link FieldQuery} objects.
     */
    @JsonSetter("year")
    private void year(final List<FieldQuery> year) {
        this.year = ListUtil.add(year, this.year);
    }

    /**
     * Add to the list of year operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery year(final FieldQuery fieldQuery) {
        this.year = ListUtil.add(fieldQuery, this.year);
        return this;
    }

    /**
     * Add to the list of year operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery year(final String extractAs) {
        this.year = ListUtil.add(new FieldQuery().extractAs(extractAs), this.year);
        return this;
    }

    /**
     * Add to the list of year operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery year(final Filter filter) {
        this.year = ListUtil.add(new FieldQuery().filter(filter), this.year);
        return this;
    }

    /**
     * Get an iterable over year operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("year")
    public Iterable<FieldQuery> year() {
        return ListUtil.iterable(this.year);
    }

    /**
     * Return whether any year operations exist.
     *
     * @return True if any year operations exist.
     */
    @JsonIgnore
    public boolean hasYear() {
        return ListUtil.hasContent(this.year);
    }

    /**
     * Set the list of page operations. This adds to any operations that are already saved.
     *
     * @param pages List of {@link PagesQuery} objects.
     */
    @JsonSetter("pages")
    private void pages(final List<PagesQuery> pages) {
        this.pages = ListUtil.add(pages, this.pages);
    }

    /**
     * Add to the list of page operations.
     *
     * @param page {@link PagesQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery pages(final PagesQuery page) {
        this.pages = ListUtil.add(page, this.pages);
        return this;
    }

    /**
     * Get an iterable of page operations.
     *
     * @return Iterable of {@link PagesQuery} objects.
     */
    @JsonGetter("pages")
    public Iterable<PagesQuery> pages() {
        return ListUtil.iterable(this.pages);
    }

    /**
     * Get whether an pages queries exist.
     *
     * @return True if any pages queries exist.
     */
    @JsonIgnore
    public boolean hasPages() {
        return ListUtil.hasContent(this.pages);
    }

    /**
     * Set the list of author operations. This adds to any operations that are already saved.
     *
     * @param authors List of {@link NameQuery} objects.
     */
    @JsonSetter("authors")
    private void authors(final List<NameQuery> authors) {
        this.authors = ListUtil.add(authors, this.authors);
    }

    /**
     * Add to the list of author operations.
     *
     * @param author {@link NameQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery authors(final NameQuery author) {
        this.authors = ListUtil.add(author, this.authors);
        return this;
    }

    /**
     * Get an iterable of author operations.
     *
     * @return Iterable of {@link NameQuery} objects.
     */
    @JsonGetter("authors")
    public Iterable<NameQuery> authors() {
        return ListUtil.iterable(this.authors);
    }

    /**
     * Get whether an authors queries exist.
     *
     * @return True if any authors queries exist.
     */
    @JsonIgnore
    public boolean hasAuthors() {
        return ListUtil.hasContent(this.authors);
    }

    /**
     * Set the list of author operations. This adds to any operations that are already saved.
     *
     * @param editors List of {@link NameQuery} objects.
     */
    @JsonSetter("editors")
    private void editors(final List<NameQuery> editors) {
        this.editors = ListUtil.add(editors, this.editors);
    }

    /**
     * Add to the list of author operations.
     *
     * @param author {@link NameQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery editors(final NameQuery author) {
        this.editors = ListUtil.add(author, this.editors);
        return this;
    }

    /**
     * Get an iterable of author operations.
     *
     * @return Iterable of {@link NameQuery} objects.
     */
    @JsonGetter("editors")
    public Iterable<NameQuery> editors() {
        return ListUtil.iterable(this.editors);
    }

    /**
     * Get whether an editors queries exist.
     *
     * @return True if any editors queries exist.
     */
    @JsonIgnore
    public boolean hasEditors() {
        return ListUtil.hasContent(this.editors);
    }

    /**
     * Set the list of affiliations operations. This adds to any operations that are already saved.
     *
     * @param affiliations List of {@link FieldQuery} objects.
     */
    @JsonSetter("affiliations")
    private void affiliations(final List<FieldQuery> affiliations) {
        this.affiliations = ListUtil.add(affiliations, this.affiliations);
    }

    /**
     * Add to the list of affiliations operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery affiliations(final FieldQuery fieldQuery) {
        this.affiliations = ListUtil.add(fieldQuery, this.affiliations);
        return this;
    }

    /**
     * Add to the list of affiliations operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery affiliations(final String extractAs) {
        this.affiliations = ListUtil.add(new FieldQuery().extractAs(extractAs), this.affiliations);
        return this;
    }

    /**
     * Add to the list of affiliations operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery affiliations(final Filter filter) {
        this.affiliations = ListUtil.add(new FieldQuery().filter(filter), this.affiliations);
        return this;
    }

    /**
     * Get an iterable over affiliations operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("affiliations")
    public Iterable<FieldQuery> affiliations() {
        return ListUtil.iterable(this.affiliations);
    }

    /**
     * Return whether any affiliations operations exist.
     *
     * @return True if any affiliations operations exist.
     */
    @JsonIgnore
    public boolean hasAffiliations() {
        return ListUtil.hasContent(this.affiliations);
    }

    /**
     * Set the list of acknowledgements operations. This adds to any operations that are already saved.
     *
     * @param acknowledgements List of {@link FieldQuery} objects.
     */
    @JsonSetter("acknowledgements")
    private void acknowledgements(final List<FieldQuery> acknowledgements) {
        this.acknowledgements = ListUtil.add(acknowledgements, this.acknowledgements);
    }

    /**
     * Add to the list of acknowledgements operations.
     *
     * @param fieldQuery {@link FieldQuery} to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery acknowledgements(final FieldQuery fieldQuery) {
        this.acknowledgements = ListUtil.add(fieldQuery, this.acknowledgements);
        return this;
    }

    /**
     * Add to the list of acknowledgements operations.
     *
     * @param extractAs Alias to extract as.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery acknowledgements(final String extractAs) {
        this.acknowledgements = ListUtil.add(new FieldQuery().extractAs(extractAs), this.acknowledgements);
        return this;
    }

    /**
     * Add to the list of acknowledgements operations.
     *
     * @param filter {@link Filter} to apply.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery acknowledgements(final Filter filter) {
        this.acknowledgements = ListUtil.add(new FieldQuery().filter(filter), this.acknowledgements);
        return this;
    }

    /**
     * Get an iterable over acknowledgements operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    @JsonGetter("acknowledgements")
    public Iterable<FieldQuery> acknowledgements() {
        return ListUtil.iterable(this.acknowledgements);
    }

    /**
     * Return whether any acknowledgements operations exist.
     *
     * @return True if any acknowledgements operations exist.
     */
    @JsonIgnore
    public boolean hasAcknowledgements() {
        return ListUtil.hasContent(this.acknowledgements);
    }

    /**
     * Set the list of reference operations. This adds to any operations that are already saved.
     *
     * @param references List of {@link ReferenceQuery} objects.
     */
    @JsonSetter("references")
    private void references(final List<ReferenceQuery> references) {
        this.references = ListUtil.add(references, this.references);
    }

    /**
     * Add to the list of reference operations.
     *
     * @param reference {@link ReferenceQuery} object to add.
     * @return This object.
     */
    @JsonIgnore
    public ReferenceQuery references(final ReferenceQuery reference) {
        this.references = ListUtil.add(reference, this.references);
        return this;
    }

    /**
     * Get an iterable of reference operations.
     *
     * @return Iterable of {@link ReferenceQuery} objects.
     */
    @JsonGetter("references")
    public Iterable<ReferenceQuery> references() {
        return ListUtil.iterable(this.references);
    }

    /**
     * Get whether an references queries exist.
     *
     * @return True if any references queries exist.
     */
    @JsonIgnore
    public boolean hasReferences() {
        return ListUtil.hasContent(this.references);
    }

    @Override
    @JsonSetter("logic")
    public ReferenceQuery logic(final Logic logic) {
        super.logic(logic);
        return this;
    }

    @Override
    @JsonSetter("extractAs")
    public ReferenceQuery extractAs(final String extractAs) {
        super.extractAs(extractAs);
        return this;
    }

    @Override
    @JsonSetter("extractAll")
    public ReferenceQuery extractAll(final Boolean extractAll) {
        super.extractAll(extractAll);
        return this;
    }

    @Override
    @JsonSetter("extractWhenMissing")
    public ReferenceQuery extractWhenMissing(final Object extractWhenMissing) {
        super.extractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    @JsonIgnore
    public ReferenceQuery tags(final FieldQuery fieldQuery) {
        super.tags(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public ReferenceQuery tags(final String extractAs) {
        super.tags(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ReferenceQuery tags(final Filter filter) {
        super.tags(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public ReferenceQuery length(final FieldQuery fieldQuery) {
        super.length(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public ReferenceQuery length(final String extractAs) {
        super.length(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ReferenceQuery length(final Filter filter) {
        super.length(filter);
        return this;
    }

    @Override
    @JsonIgnore
    public ReferenceQuery offset(final FieldQuery fieldQuery) {
        super.offset(fieldQuery);
        return this;
    }

    @Override
    @JsonIgnore
    public ReferenceQuery offset(final String extractAs) {
        super.offset(extractAs);
        return this;
    }

    @Override
    @JsonIgnore
    public ReferenceQuery offset(final Filter filter) {
        super.offset(filter);
        return this;
    }

    /** DOI of the reference. */
    private List<FieldQuery> doi;

    /** ISBN of the reference. */
    private List<FieldQuery> isbn;

    /** ISSN of the reference. */
    private List<FieldQuery> issn;

    /** URL of the reference. */
    private List<FieldQuery> url;

    /** Title of the reference. */
    private List<FieldQuery> title;

    /** Publisher of the reference. */
    private List<FieldQuery> publisher;

    /** Journal of the reference. */
    private List<FieldQuery> journal;

    /** Volume of the reference. */
    private List<FieldQuery> volume;

    /** Issue of the reference. */
    private List<FieldQuery> issue;

    /** Year of the reference. */
    private List<FieldQuery> year;

    /** Pages of the reference. */
    private List<PagesQuery> pages;

    /** Authors of the reference. */
    private List<NameQuery> authors;

    /** Editors of the reference. */
    private List<NameQuery> editors;

    /** Affiliations of the authors. */
    private List<FieldQuery> affiliations;

    /** Acknowledgements. */
    private List<FieldQuery> acknowledgements;

    /** Nested reference queries. */
    private List<ReferenceQuery> references;
}