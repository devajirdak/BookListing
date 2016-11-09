package com.example.android.booklisting;

/**
 * Created by javedkadri99 on 11/3/16.
 */

public class Books {

    /** Magnitude of the earthquake */
    private String mTitle;

    /** Location of the earthquake */
    private String mAuthor;

    /** Time of the earthquake */
    private String mPublisher;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link Books} object.
     *
     * @param title is the title of the book
     * @param author is the author of the book
     * @param publisher is the publisher of the book
     */
    public Books(String title, String author, String publisher, String url) {
        mTitle = title;
        mAuthor = author;
        mPublisher = publisher;
        mUrl = url;
    }

    /**
     * Returns the title of the book.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the author of the book.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the time of the earthquake.
     */
    public String getPublisher() {
        return mPublisher;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
