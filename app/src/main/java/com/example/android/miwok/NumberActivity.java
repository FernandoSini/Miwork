package com.example.android.miwok;


import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //lista de palavras
        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");
       words.add(new Word("one", "lutti"));

        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine", "wo'e"));
        words.add(new Word("ten","na aacha"));

        //looping
        //for (int i = 0; i < words.size() ; i++) {
        //LinearLayout rootView  = (LinearLayout) findViewById(R.id.rootView);
        //TextView wordView = new TextView(this);
         //   wordView.setText(words.get(i));
            //rootView.addView(wordView);
            //Log.v("NumbersActivity","Index: " + i + " Value: " +words.get(i));
        //}

        //utilizando arrayAdapter

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
