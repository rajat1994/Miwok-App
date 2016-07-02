package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {


    private MediaPlayer mMediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("one", "lutti", R.drawable.number_one));
        words.add(new word("two", "otiiko", R.drawable.number_two));
        words.add(new word("three", "tolookosu", R.drawable.number_three));
        words.add(new word("four", "oyyisa", R.drawable.number_four));
        words.add(new word("five", "massokka", R.drawable.number_five));
        words.add(new word("six", "temmokka", R.drawable.number_six));
        words.add(new word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new word("eight", "kawinta", R.drawable.number_eight));
        words.add(new word("nine", "wo’e", R.drawable.number_nine));
        words.add(new word("ten", "na’aacha", R.drawable.number_ten));



        WordAdapter Adapter =
                new WordAdapter(this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mMediaplayer = MediaPlayer.create(NumbersActivity.this,R.raw.number_one);
                mMediaplayer.start();
            }
        });








    }
}
