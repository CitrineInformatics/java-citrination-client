package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Query against a reference.
 *
 * @author Kyle Michel
 */
public class ReferenceQuery extends BaseObjectQuery {

    @Override
    public ReferenceQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public ReferenceQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public ReferenceQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public ReferenceQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public ReferenceQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        super.addSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public ReferenceQuery addSimpleWeight(final String field, final Double weight) {
        super.addSimpleWeight(field, weight);
        return this;
    }

    @Override
    public ReferenceQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public ReferenceQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public ReferenceQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public ReferenceQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public ReferenceQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public ReferenceQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public ReferenceQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public ReferenceQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public ReferenceQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public ReferenceQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public ReferenceQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public ReferenceQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the doi operations. This adds to any operations that are already saved.
     *
     * @param doi List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setDoi(final List<FieldQuery> doi) {
        this.doi = doi;
        return this;
    }

    /**
     * Add to the list of doi operations.
     *
     * @param doi {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addDoi(final List<FieldQuery> doi) {
        this.doi = ListUtil.add(doi, this.doi);
        return this;
    }

    /**
     * Add to the list of doi operations.
     *
     * @param doi {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addDoi(final FieldQuery doi) {
        this.doi = ListUtil.add(doi, this.doi);
        return this;
    }

    /**
     * Get the length of the doi queries.
     *
     * @return Number of doi queries.
     */
    public int doiLength() {
        return ListUtil.length(this.doi);
    }

    /**
     * Get an iterable over doi operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> doi() {
        return ListUtil.iterable(this.doi);
    }

    /**
     * Get the doi query at the input index.
     *
     * @param index Index of the doi query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getDoi(final int index) {
        return ListUtil.get(this.doi, index);
    }

    /**
     * Get the doi field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getDoi() {
        return this.doi;
    }

    /**
     * Set the isbn operations. This adds to any operations that are already saved.
     *
     * @param isbn List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setIsbn(final List<FieldQuery> isbn) {
        this.isbn = isbn;
        return this;
    }

    /**
     * Add to the list of isbn operations.
     *
     * @param isbn {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addIsbn(final List<FieldQuery> isbn) {
        this.isbn = ListUtil.add(isbn, this.isbn);
        return this;
    }

    /**
     * Add to the list of isbn operations.
     *
     * @param isbn {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addIsbn(final FieldQuery isbn) {
        this.isbn = ListUtil.add(isbn, this.isbn);
        return this;
    }

    /**
     * Get the length of the isbn queries.
     *
     * @return Number of isbn queries.
     */
    public int isbnLength() {
        return ListUtil.length(this.isbn);
    }

    /**
     * Get an iterable over isbn operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> isbn() {
        return ListUtil.iterable(this.isbn);
    }

    /**
     * Get the isbn query at the input index.
     *
     * @param index Index of the isbn query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getIsbn(final int index) {
        return ListUtil.get(this.isbn, index);
    }

    /**
     * Get the isbn field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getIsbn() {
        return this.isbn;
    }

    /**
     * Set the issn operations. This adds to any operations that are already saved.
     *
     * @param issn List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setIssn(final List<FieldQuery> issn) {
        this.issn = issn;
        return this;
    }

    /**
     * Add to the list of issn operations.
     *
     * @param issn {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addIssn(final List<FieldQuery> issn) {
        this.issn = ListUtil.add(issn, this.issn);
        return this;
    }

    /**
     * Add to the list of issn operations.
     *
     * @param issn {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addIssn(final FieldQuery issn) {
        this.issn = ListUtil.add(issn, this.issn);
        return this;
    }

    /**
     * Get the length of the issn queries.
     *
     * @return Number of issn queries.
     */
    public int issnLength() {
        return ListUtil.length(this.issn);
    }

    /**
     * Get an iterable over issn operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> issn() {
        return ListUtil.iterable(this.issn);
    }

    /**
     * Get the issn query at the input index.
     *
     * @param index Index of the issn query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getIssn(final int index) {
        return ListUtil.get(this.issn, index);
    }

    /**
     * Get the issn field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getIssn() {
        return this.issn;
    }

    /**
     * Set the url operations. This adds to any operations that are already saved.
     *
     * @param url List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setUrl(final List<FieldQuery> url) {
        this.url = url;
        return this;
    }

    /**
     * Add to the list of url operations.
     *
     * @param url {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addUrl(final List<FieldQuery> url) {
        this.url = ListUtil.add(url, this.url);
        return this;
    }

    /**
     * Add to the list of url operations.
     *
     * @param url {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addUrl(final FieldQuery url) {
        this.url = ListUtil.add(url, this.url);
        return this;
    }

    /**
     * Get the length of the url queries.
     *
     * @return Number of url queries.
     */
    public int urlLength() {
        return ListUtil.length(this.url);
    }

    /**
     * Get an iterable over url operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> url() {
        return ListUtil.iterable(this.url);
    }

    /**
     * Get the url query at the input index.
     *
     * @param index Index of the url query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getUrl(final int index) {
        return ListUtil.get(this.url, index);
    }

    /**
     * Get the url field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getUrl() {
        return this.url;
    }

    /**
     * Set the title operations. This adds to any operations that are already saved.
     *
     * @param title List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setTitle(final List<FieldQuery> title) {
        this.title = title;
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param title {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addTitle(final List<FieldQuery> title) {
        this.title = ListUtil.add(title, this.title);
        return this;
    }

    /**
     * Add to the list of title operations.
     *
     * @param title {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addTitle(final FieldQuery title) {
        this.title = ListUtil.add(title, this.title);
        return this;
    }

    /**
     * Get the length of the title queries.
     *
     * @return Number of title queries.
     */
    public int titleLength() {
        return ListUtil.length(this.title);
    }

    /**
     * Get an iterable over title operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> title() {
        return ListUtil.iterable(this.title);
    }

    /**
     * Get the title query at the input index.
     *
     * @param index Index of the title query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getTitle(final int index) {
        return ListUtil.get(this.title, index);
    }

    /**
     * Get the title field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getTitle() {
        return this.title;
    }

    /**
     * Set the publisher operations. This adds to any operations that are already saved.
     *
     * @param publisher List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setPublisher(final List<FieldQuery> publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Add to the list of publisher operations.
     *
     * @param publisher {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addPublisher(final List<FieldQuery> publisher) {
        this.publisher = ListUtil.add(publisher, this.publisher);
        return this;
    }

    /**
     * Add to the list of publisher operations.
     *
     * @param publisher {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addPublisher(final FieldQuery publisher) {
        this.publisher = ListUtil.add(publisher, this.publisher);
        return this;
    }

    /**
     * Get the length of the publisher queries.
     *
     * @return Number of publisher queries.
     */
    public int publisherLength() {
        return ListUtil.length(this.publisher);
    }

    /**
     * Get an iterable over publisher operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> publisher() {
        return ListUtil.iterable(this.publisher);
    }

    /**
     * Get the publisher query at the input index.
     *
     * @param index Index of the publisher query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getPublisher(final int index) {
        return ListUtil.get(this.publisher, index);
    }

    /**
     * Get the publisher field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getPublisher() {
        return this.publisher;
    }

    /**
     * Set the journal operations. This adds to any operations that are already saved.
     *
     * @param journal List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setJournal(final List<FieldQuery> journal) {
        this.journal = journal;
        return this;
    }

    /**
     * Add to the list of journal operations.
     *
     * @param journal {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addJournal(final List<FieldQuery> journal) {
        this.journal = ListUtil.add(journal, this.journal);
        return this;
    }

    /**
     * Add to the list of journal operations.
     *
     * @param journal {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addJournal(final FieldQuery journal) {
        this.journal = ListUtil.add(journal, this.journal);
        return this;
    }

    /**
     * Get the length of the journal queries.
     *
     * @return Number of journal queries.
     */
    public int journalLength() {
        return ListUtil.length(this.journal);
    }

    /**
     * Get an iterable over journal operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> journal() {
        return ListUtil.iterable(this.journal);
    }

    /**
     * Get the journal query at the input index.
     *
     * @param index Index of the journal query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getJournal(final int index) {
        return ListUtil.get(this.journal, index);
    }

    /**
     * Get the journal field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getJournal() {
        return this.journal;
    }

    /**
     * Set the volume operations. This adds to any operations that are already saved.
     *
     * @param volume List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setVolume(final List<FieldQuery> volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Add to the list of volume operations.
     *
     * @param volume {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addVolume(final List<FieldQuery> volume) {
        this.volume = ListUtil.add(volume, this.volume);
        return this;
    }

    /**
     * Add to the list of volume operations.
     *
     * @param volume {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addVolume(final FieldQuery volume) {
        this.volume = ListUtil.add(volume, this.volume);
        return this;
    }

    /**
     * Get the length of the volume queries.
     *
     * @return Number of volume queries.
     */
    public int volumeLength() {
        return ListUtil.length(this.volume);
    }

    /**
     * Get an iterable over volume operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> volume() {
        return ListUtil.iterable(this.volume);
    }

    /**
     * Get the volume query at the input index.
     *
     * @param index Index of the volume query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getVolume(final int index) {
        return ListUtil.get(this.volume, index);
    }

    /**
     * Get the volume field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getVolume() {
        return this.volume;
    }

    /**
     * Set the issue operations. This adds to any operations that are already saved.
     *
     * @param issue List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setIssue(final List<FieldQuery> issue) {
        this.issue = issue;
        return this;
    }

    /**
     * Add to the list of issue operations.
     *
     * @param issue {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addIssue(final List<FieldQuery> issue) {
        this.issue = ListUtil.add(issue, this.issue);
        return this;
    }

    /**
     * Add to the list of issue operations.
     *
     * @param issue {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addIssue(final FieldQuery issue) {
        this.issue = ListUtil.add(issue, this.issue);
        return this;
    }

    /**
     * Get the length of the issue queries.
     *
     * @return Number of issue queries.
     */
    public int issueLength() {
        return ListUtil.length(this.issue);
    }

    /**
     * Get an iterable over issue operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> issue() {
        return ListUtil.iterable(this.issue);
    }

    /**
     * Get the issue query at the input index.
     *
     * @param index Index of the issue query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getIssue(final int index) {
        return ListUtil.get(this.issue, index);
    }

    /**
     * Get the issue field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getIssue() {
        return this.issue;
    }

    /**
     * Set the year operations. This adds to any operations that are already saved.
     *
     * @param year List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setYear(final List<FieldQuery> year) {
        this.year = year;
        return this;
    }

    /**
     * Add to the list of year operations.
     *
     * @param year {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addYear(final List<FieldQuery> year) {
        this.year = ListUtil.add(year, this.year);
        return this;
    }

    /**
     * Add to the list of year operations.
     *
     * @param year {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addYear(final FieldQuery year) {
        this.year = ListUtil.add(year, this.year);
        return this;
    }

    /**
     * Get the length of the year queries.
     *
     * @return Number of year queries.
     */
    public int yearLength() {
        return ListUtil.length(this.year);
    }

    /**
     * Get an iterable over year operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> year() {
        return ListUtil.iterable(this.year);
    }

    /**
     * Get the year query at the input index.
     *
     * @param index Index of the year query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getYear(final int index) {
        return ListUtil.get(this.year, index);
    }

    /**
     * Get the year field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getYear() {
        return this.year;
    }

    /**
     * Set the figure operations. This adds to any operations that are already saved.
     *
     * @param figure List of {@link DisplayItemQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setFigure(final List<DisplayItemQuery> figure) {
        this.figure = figure;
        return this;
    }

    /**
     * Add to the list of figure operations.
     *
     * @param figure {@link DisplayItemQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addFigure(final List<DisplayItemQuery> figure) {
        this.figure = ListUtil.add(figure, this.figure);
        return this;
    }

    /**
     * Add to the list of figure operations.
     *
     * @param figure {@link DisplayItemQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addFigure(final DisplayItemQuery figure) {
        this.figure = ListUtil.add(figure, this.figure);
        return this;
    }

    /**
     * Get the length of the figure queries.
     *
     * @return Number of figure queries.
     */
    public int figureLength() {
        return ListUtil.length(this.figure);
    }

    /**
     * Get an iterable over figure operations.
     *
     * @return Iterable of {@link DisplayItemQuery} objects.
     */
    public Iterable<DisplayItemQuery> figure() {
        return ListUtil.iterable(this.figure);
    }

    /**
     * Get the figure query at the input index.
     *
     * @param index Index of the figure query to get.
     * @return {@link DisplayItemQuery} at the input index.
     */
    public DisplayItemQuery getFigure(final int index) {
        return ListUtil.get(this.figure, index);
    }

    /**
     * Get the figure field queries.
     *
     * @return List of {@link DisplayItemQuery} objects.
     */
    public List<DisplayItemQuery> getFigure() {
        return this.figure;
    }

    /**
     * Set the table operations. This adds to any operations that are already saved.
     *
     * @param table List of {@link DisplayItemQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setTable(final List<DisplayItemQuery> table) {
        this.table = table;
        return this;
    }

    /**
     * Add to the list of table operations.
     *
     * @param table {@link DisplayItemQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addTable(final List<DisplayItemQuery> table) {
        this.table = ListUtil.add(table, this.table);
        return this;
    }

    /**
     * Add to the list of table operations.
     *
     * @param table {@link DisplayItemQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addTable(final DisplayItemQuery table) {
        this.table = ListUtil.add(table, this.table);
        return this;
    }

    /**
     * Get the length of the table queries.
     *
     * @return Number of table queries.
     */
    public int tableLength() {
        return ListUtil.length(this.table);
    }

    /**
     * Get an iterable over table operations.
     *
     * @return Iterable of {@link DisplayItemQuery} objects.
     */
    public Iterable<DisplayItemQuery> table() {
        return ListUtil.iterable(this.table);
    }

    /**
     * Get the table query at the input index.
     *
     * @param index Index of the table query to get.
     * @return {@link DisplayItemQuery} at the input index.
     */
    public DisplayItemQuery getTable(final int index) {
        return ListUtil.get(this.table, index);
    }

    /**
     * Get the table field queries.
     *
     * @return List of {@link DisplayItemQuery} objects.
     */
    public List<DisplayItemQuery> getTable() {
        return this.table;
    }

    /**
     * Set the pages operations. This adds to any operations that are already saved.
     *
     * @param pages List of {@link PagesQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setPages(final List<PagesQuery> pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Add to the list of pages operations.
     *
     * @param pages {@link PagesQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addPages(final List<PagesQuery> pages) {
        this.pages = ListUtil.add(pages, this.pages);
        return this;
    }

    /**
     * Add to the list of pages operations.
     *
     * @param pages {@link PagesQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addPages(final PagesQuery pages) {
        this.pages = ListUtil.add(pages, this.pages);
        return this;
    }

    /**
     * Get the length of the pages queries.
     *
     * @return Number of pages queries.
     */
    public int pagesLength() {
        return ListUtil.length(this.pages);
    }

    /**
     * Get an iterable over pages operations.
     *
     * @return Iterable of {@link PagesQuery} objects.
     */
    public Iterable<PagesQuery> pages() {
        return ListUtil.iterable(this.pages);
    }

    /**
     * Get the pages query at the input index.
     *
     * @param index Index of the pages query to get.
     * @return {@link PagesQuery} at the input index.
     */
    public PagesQuery getPages(final int index) {
        return ListUtil.get(this.pages, index);
    }

    /**
     * Get the pages field queries.
     *
     * @return List of {@link PagesQuery} objects.
     */
    public List<PagesQuery> getPages() {
        return this.pages;
    }

    /**
     * Set the authors operations. This adds to any operations that are already saved.
     *
     * @param authors List of {@link NameQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setAuthors(final List<NameQuery> authors) {
        this.authors = authors;
        return this;
    }

    /**
     * Add to the list of authors operations.
     *
     * @param authors {@link NameQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addAuthors(final List<NameQuery> authors) {
        this.authors = ListUtil.add(authors, this.authors);
        return this;
    }

    /**
     * Add to the list of authors operations.
     *
     * @param authors {@link NameQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addAuthors(final NameQuery authors) {
        this.authors = ListUtil.add(authors, this.authors);
        return this;
    }

    /**
     * Get the length of the authors queries.
     *
     * @return Number of authors queries.
     */
    public int authorsLength() {
        return ListUtil.length(this.authors);
    }

    /**
     * Get an iterable over authors operations.
     *
     * @return Iterable of {@link NameQuery} objects.
     */
    public Iterable<NameQuery> authors() {
        return ListUtil.iterable(this.authors);
    }

    /**
     * Get the authors query at the input index.
     *
     * @param index Index of the authors query to get.
     * @return {@link NameQuery} at the input index.
     */
    public NameQuery getAuthors(final int index) {
        return ListUtil.get(this.authors, index);
    }

    /**
     * Get the authors field queries.
     *
     * @return List of {@link NameQuery} objects.
     */
    public List<NameQuery> getAuthors() {
        return this.authors;
    }

    /**
     * Set the editors operations. This adds to any operations that are already saved.
     *
     * @param editors List of {@link NameQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setEditors(final List<NameQuery> editors) {
        this.editors = editors;
        return this;
    }

    /**
     * Add to the list of editors operations.
     *
     * @param editors {@link NameQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addEditors(final List<NameQuery> editors) {
        this.editors = ListUtil.add(editors, this.editors);
        return this;
    }

    /**
     * Add to the list of editors operations.
     *
     * @param editors {@link NameQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addEditors(final NameQuery editors) {
        this.editors = ListUtil.add(editors, this.editors);
        return this;
    }

    /**
     * Get the length of the editors queries.
     *
     * @return Number of editors queries.
     */
    public int editorsLength() {
        return ListUtil.length(this.editors);
    }

    /**
     * Get an iterable over editors operations.
     *
     * @return Iterable of {@link NameQuery} objects.
     */
    public Iterable<NameQuery> editors() {
        return ListUtil.iterable(this.editors);
    }

    /**
     * Get the editors query at the input index.
     *
     * @param index Index of the editors query to get.
     * @return {@link NameQuery} at the input index.
     */
    public NameQuery getEditors(final int index) {
        return ListUtil.get(this.editors, index);
    }

    /**
     * Get the editors field queries.
     *
     * @return List of {@link NameQuery} objects.
     */
    public List<NameQuery> getEditors() {
        return this.editors;
    }

    /**
     * Set the affiliations operations. This adds to any operations that are already saved.
     *
     * @param affiliations List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setAffiliations(final List<FieldQuery> affiliations) {
        this.affiliations = affiliations;
        return this;
    }

    /**
     * Add to the list of affiliations operations.
     *
     * @param affiliations {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addAffiliations(final List<FieldQuery> affiliations) {
        this.affiliations = ListUtil.add(affiliations, this.affiliations);
        return this;
    }

    /**
     * Add to the list of affiliations operations.
     *
     * @param affiliations {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addAffiliations(final FieldQuery affiliations) {
        this.affiliations = ListUtil.add(affiliations, this.affiliations);
        return this;
    }

    /**
     * Get the length of the affiliations queries.
     *
     * @return Number of affiliations queries.
     */
    public int affiliationsLength() {
        return ListUtil.length(this.affiliations);
    }

    /**
     * Get an iterable over affiliations operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> affiliations() {
        return ListUtil.iterable(this.affiliations);
    }

    /**
     * Get the affiliations query at the input index.
     *
     * @param index Index of the affiliations query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getAffiliations(final int index) {
        return ListUtil.get(this.affiliations, index);
    }

    /**
     * Get the affiliations field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getAffiliations() {
        return this.affiliations;
    }

    /**
     * Set the acknowledgements operations. This adds to any operations that are already saved.
     *
     * @param acknowledgements List of {@link FieldQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setAcknowledgements(final List<FieldQuery> acknowledgements) {
        this.acknowledgements = acknowledgements;
        return this;
    }

    /**
     * Add to the list of acknowledgements operations.
     *
     * @param acknowledgements {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addAcknowledgements(final List<FieldQuery> acknowledgements) {
        this.acknowledgements = ListUtil.add(acknowledgements, this.acknowledgements);
        return this;
    }

    /**
     * Add to the list of acknowledgements operations.
     *
     * @param acknowledgements {@link FieldQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addAcknowledgements(final FieldQuery acknowledgements) {
        this.acknowledgements = ListUtil.add(acknowledgements, this.acknowledgements);
        return this;
    }

    /**
     * Get the length of the acknowledgements queries.
     *
     * @return Number of acknowledgements queries.
     */
    public int acknowledgementsLength() {
        return ListUtil.length(this.acknowledgements);
    }

    /**
     * Get an iterable over acknowledgements operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> acknowledgements() {
        return ListUtil.iterable(this.acknowledgements);
    }

    /**
     * Get the acknowledgements query at the input index.
     *
     * @param index Index of the acknowledgements query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getAcknowledgements(final int index) {
        return ListUtil.get(this.acknowledgements, index);
    }

    /**
     * Get the acknowledgements field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getAcknowledgements() {
        return this.acknowledgements;
    }

    /**
     * Set the references operations. This adds to any operations that are already saved.
     *
     * @param references List of {@link ReferenceQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setReferences(final List<ReferenceQuery> references) {
        this.references = references;
        return this;
    }

    /**
     * Add to the list of references operations.
     *
     * @param references {@link ReferenceQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addReferences(final List<ReferenceQuery> references) {
        this.references = ListUtil.add(references, this.references);
        return this;
    }

    /**
     * Add to the list of references operations.
     *
     * @param references {@link ReferenceQuery} to add.
     * @return This object.
     */
    public ReferenceQuery addReferences(final ReferenceQuery references) {
        this.references = ListUtil.add(references, this.references);
        return this;
    }

    /**
     * Get the length of the references queries.
     *
     * @return Number of references queries.
     */
    public int referencesLength() {
        return ListUtil.length(this.references);
    }

    /**
     * Get an iterable over references operations.
     *
     * @return Iterable of {@link ReferenceQuery} objects.
     */
    public Iterable<ReferenceQuery> references() {
        return ListUtil.iterable(this.references);
    }

    /**
     * Get the references query at the input index.
     *
     * @param index Index of the references query to get.
     * @return {@link ReferenceQuery} at the input index.
     */
    public ReferenceQuery getReferences(final int index) {
        return ListUtil.get(this.references, index);
    }

    /**
     * Get the references field queries.
     *
     * @return List of {@link ReferenceQuery} objects.
     */
    public List<ReferenceQuery> getReferences() {
        return this.references;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link ReferenceQuery} objects.
     * @return This object.
     */
    public ReferenceQuery setQuery(final List<ReferenceQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link ReferenceQuery} objects.
     * @return This object.
     */
    public ReferenceQuery addQuery(final List<ReferenceQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link ReferenceQuery} object to add.
     * @return This object.
     */
    public ReferenceQuery addQuery(final ReferenceQuery query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Get the number of nested queries.
     *
     * @return Number of nested queries.
     */
    public int queryLength() {
        return ListUtil.length(this.query);
    }

    /**
     * Get an iterable over the nested queries.
     *
     * @return {@link Iterable} of {@link ReferenceQuery} objects.
     */
    public Iterable<ReferenceQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link ReferenceQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link ReferenceQuery} at the input index.
     */
    public ReferenceQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link ReferenceQuery} objects.
     */
    public List<ReferenceQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof ReferenceQuery)) {
            return false;
        }
        final ReferenceQuery rhsQuery = (ReferenceQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.doi).equals(Optional.ofNullable(rhsQuery.doi))
                && Optional.ofNullable(this.isbn).equals(Optional.ofNullable(rhsQuery.isbn))
                && Optional.ofNullable(this.issn).equals(Optional.ofNullable(rhsQuery.issn))
                && Optional.ofNullable(this.url).equals(Optional.ofNullable(rhsQuery.url))
                && Optional.ofNullable(this.title).equals(Optional.ofNullable(rhsQuery.title))
                && Optional.ofNullable(this.publisher).equals(Optional.ofNullable(rhsQuery.publisher))
                && Optional.ofNullable(this.journal).equals(Optional.ofNullable(rhsQuery.journal))
                && Optional.ofNullable(this.volume).equals(Optional.ofNullable(rhsQuery.volume))
                && Optional.ofNullable(this.issue).equals(Optional.ofNullable(rhsQuery.issue))
                && Optional.ofNullable(this.year).equals(Optional.ofNullable(rhsQuery.year))
                && Optional.ofNullable(this.figure).equals(Optional.ofNullable(rhsQuery.figure))
                && Optional.ofNullable(this.table).equals(Optional.ofNullable(rhsQuery.table))
                && Optional.ofNullable(this.pages).equals(Optional.ofNullable(rhsQuery.pages))
                && Optional.ofNullable(this.authors).equals(Optional.ofNullable(rhsQuery.authors))
                && Optional.ofNullable(this.editors).equals(Optional.ofNullable(rhsQuery.editors))
                && Optional.ofNullable(this.affiliations).equals(Optional.ofNullable(rhsQuery.affiliations))
                && Optional.ofNullable(this.acknowledgements).equals(Optional.ofNullable(rhsQuery.acknowledgements))
                && Optional.ofNullable(this.references).equals(Optional.ofNullable(rhsQuery.references))
                && Optional.ofNullable(this.query).equals(Optional.ofNullable(rhsQuery.query));
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
    
    /** Figure for the reference. */
    private List<DisplayItemQuery> figure;

    /** Table for the reference. */
    private List<DisplayItemQuery> table;

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
    
    /** Nested list of queries. */
    private List<ReferenceQuery> query;
}