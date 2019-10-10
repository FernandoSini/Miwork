package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context,   ArrayList<Word> words) {
        super(context, 0, words);
    }



    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View  listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //pegando a objeto palavra na posição
        Word currentWord = getItem(position);

        android.widget.TextView miwokTextView = (android.widget.TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView.setText(currentWord.getMiwokTranslation());

        android.widget.TextView defaultTextView = (android.widget.TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
