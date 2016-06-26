package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by arora on 26/6/16.
 */

public class WordAdapter extends ArrayAdapter<word> {

    public WordAdapter(Activity context, ArrayList<word> words) {

        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {




        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Version Name from the current AndroidFlavor object and set this text on the vNameTextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the Version Number from the current AndroidFlavor object and set this text on the vNumberTextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in the ListView
        return listItemView;
    }
    }
