package com.example.android.newsapp;


/**
 * An {@link Article} object contains information related to a single article.
 */
public class Article {

    /** Title of the news article */
    private String articleTitle;

    /** Title of the section */
    private String sectionTitle;

    /** Article author's name */
    private String authorName;

    /** Article publication date*/
    private String publicationDate;

    /** Website URL of the article */
    private String url;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param articleTitle is the title of the news article
     * @param sectionTitle is the title of the section
     * @param authorName is the article author's name
     * @param publicationDate is the article publication date
     */
    public Article(String articleTitle, String sectionTitle, String authorName, String publicationDate, String url) {
        this.articleTitle = articleTitle;
        this.sectionTitle = sectionTitle;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
        this.url = url;
    }

    /**
     * Returns the title of the news article.
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * Returns the title of the section.
     */
    public String getSectionTitle() {
        return sectionTitle;
    }

    /**
     * Returns the time article author's name.
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Returns the article's publication date.
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() { return url; }
}
