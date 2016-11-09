package com.example.android.booklisting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by javedkadri99 on 11/5/16.
 */

public class BooksAdapter extends ArrayAdapter<Books> {

    private static final String LOCATION_SEPARATOR = " , ";

    public BooksAdapter(Context context, List<Books> books) {
        super(context, 0, books);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.books_list_item, parent, false);
        }

        Books currentBook = getItem(position);

        // Find the TextView with view ID magnitude
        TextView bookView = (TextView) listItemView.findViewById(R.id.book_title);
        String bookTitle = new String(currentBook.getTitle());
        bookView.setText(bookTitle);


        // Find the TextView with view ID location
        TextView authorView = (TextView) listItemView.findViewById(R.id.book_author);
        // Display the location of the current earthquake in that TextView
        String bookAuthor = new String(currentBook.getAuthor());

        String singleAuthor = bookAuthor.split(",")[0];
        String singleAuthor1 = singleAuthor.replace('[', ' ').replace(']', ' ').replace('"',' ');

        authorView.setText(singleAuthor1);

        // Find the TextView with view ID location offset
        TextView publisherView = (TextView) listItemView.findViewById(R.id.book_pub);
        // Display the location offset of the current earthquake in that TextView
        String bookPublisher = new String(currentBook.getPublisher());
        publisherView.setText(bookPublisher);


        // Return the list item view that is now showing the appropriate data
        return listItemView;

    }

}
