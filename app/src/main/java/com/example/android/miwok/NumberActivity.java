package com.example.android.miwok;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    private MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //lista de palavras
        final ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");
        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));
        //looping
        //for (int i = 0; i < words.size() ; i++) {
        //LinearLayout rootView  = (LinearLayout) findViewById(R.id.rootView);
        //TextView wordView = new TextView(this);
         //   wordView.setText(words.get(i));
            //rootView.addView(wordView);
            //Log.v("NumbersActivity","Index: " + i + " Value: " +words.get(i));
        //}

        //utilizando arrayAdapter

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(NumberActivity.this, "List item clicked", Toast.LENGTH_LONG).show();

                //pegando a posição quando o usuario clicar
                Word word = words.get(position);

               //criando o objeto com o audio relacionado com o item clicado
                mPlayer = MediaPlayer.create(NumberActivity.this, word.getmAudioResourceId());

                mPlayer.start();
            }
        });
    }
}
