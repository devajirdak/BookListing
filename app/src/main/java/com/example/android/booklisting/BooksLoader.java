package com.example.android.booklisting;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by javedkadri99 on 11/4/16.
 */

public class BooksLoader extends AsyncTaskLoader<List<Books>> {

    private static final String LOG_TAG = BooksLoader.class.getName();

    /** Query URL */
    private String mUrl;
    public BooksLoader(Context context, String url) {
        super(context);
        // TODO: Finish implementing this constructor
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Books> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Books> books = BooksUtils.fetchBookData(mUrl);
        return books;
    }
}
