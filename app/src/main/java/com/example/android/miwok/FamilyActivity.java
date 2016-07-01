package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("father", "әpә", R.drawable.family_father));
        words.add(new word("mother", "әṭa", R.drawable.family_mother));
        words.add(new word("son", "angsi", R.drawable.family_son));
        words.add(new word("daughter", "tune", R.drawable.family_daughter));
        words.add(new word("older brother", "taachi", R.drawable.family_older_brother));
        words.add(new word("younger brother", "chalitti", R.drawable.family_younger_brother));
        words.add(new word("older sister", "teṭe", R.drawable.family_older_sister));
        words.add(new word("younger sister", "kolliti", R.drawable.family_younger_sister));
        words.add(new word("grandmother ", "ama", R.drawable.family_grandmother));
        words.add(new word("grandfather", "paapa", R.drawable.family_grandfather));


        WordAdapter Adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }
}
