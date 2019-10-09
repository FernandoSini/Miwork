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
        setContentView(R.layout.activity_number);

        //lista de palavras
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        //looping
        //for (int i = 0; i < words.size() ; i++) {
        //LinearLayout rootView  = (LinearLayout) findViewById(R.id.rootView);
        //TextView wordView = new TextView(this);
         //   wordView.setText(words.get(i));
            //rootView.addView(wordView);
            //Log.v("NumbersActivity","Index: " + i + " Value: " +words.get(i));
        //}

        //utilizando arrayAdapter

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.list_item, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
