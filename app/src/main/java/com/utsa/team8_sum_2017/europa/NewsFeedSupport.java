package com.utsa.team8_sum_2017.europa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Daivd. on 8/9/2017.
 */

//Made to get the news_page into the manifest. -David.
public class NewsFeedSupport extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_page);
    }

    public void go_home(View v){
        Intent temp_intent = new Intent(this, MusicPlayer.class);
        startActivity( temp_intent );
    }
}
