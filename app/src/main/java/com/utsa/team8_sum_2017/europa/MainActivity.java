package com.utsa.team8_sum_2017.europa;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Model model = new Model();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_page);

        TextView textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setText(model.getNews().getMessage());
        TextView textView20 = (TextView) findViewById(R.id.textView20);
        textView20.setText(model.getNews().getMessage());
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setText(model.getNews().getMessage());
        TextView textView22 = (TextView) findViewById(R.id.textView22);
        textView22.setText(model.getNews().getMessage());
        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setText(model.getNews().getMessage());
        TextView textView24 = (TextView) findViewById(R.id.textView24);
        textView24.setText(model.getNews().getMessage());
        TextView textView25 = (TextView) findViewById(R.id.textView25);
        textView25.setText(model.getNews().getMessage());



    }
}
