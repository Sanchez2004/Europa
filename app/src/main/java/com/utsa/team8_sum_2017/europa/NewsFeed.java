package com.utsa.team8_sum_2017.europa;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Stack;

/*
//Added extends and onCrate so it can be added to manifest, should be changed later. -Daivd.
//
 */
public class NewsFeed extends AppCompatActivity {

    private Stack<NewsArticle> articles = new Stack<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_player);
    }


    public NewsFeed(){

    }

    //This should pull the new newsarticles off the server somehow
    public void addNews(String message, String title){
        NewsArticle news = new NewsArticle();
        news.setMessage(message);
        news.setTitle(title);
        articles.push(news);
    }



    public NewsArticle getNews(){
        if(!articles.empty()) {
            return articles.pop();
        }
        else{
            //return some type of error message "no more news articles" or something
            return new NewsArticle();
        }

    }

    public void createTest(){
        NewsArticle news = new NewsArticle();
        news.setMessage("message 1");
        news.setTitle("Title 1");
        news.setHyperlink("hyperlink 1");
        articles.push(news);
        news.setMessage("message 2");
        news.setTitle("Title 2");
        news.setHyperlink("hyperlink 2");
        articles.push(news);
        news.setMessage("message 3");
        news.setTitle("Title 3");
        news.setHyperlink("hyperlink 3");
        articles.push(news);
        news.setMessage("message 4");
        news.setTitle("Title 4");
        news.setHyperlink("hyperlink 4");
        articles.push(news);




    }


}
