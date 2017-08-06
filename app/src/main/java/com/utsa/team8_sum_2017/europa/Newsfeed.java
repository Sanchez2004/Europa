package com.utsa.team8_sum_2017.europa;


import java.util.Stack;

public class Newsfeed {
    private Stack<NewsArticle> articles = new Stack<>();


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


}
