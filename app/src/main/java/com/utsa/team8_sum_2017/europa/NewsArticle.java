package com.utsa.team8_sum_2017.europa;


//the singular news article, newsfeed should contain a stack of these
public class NewsArticle {
    private String title;
    private String message;
    private String hyperlink;

    private int i;

    public void setTitle(String t){title=t;}
    public void setMessage(String m){message=m;}
    public void setHyperlink(String h){hyperlink = h;}

    public String getTitle(){return title;}
    public String getMessage(){return message;}
    public String getHyperlink(){return hyperlink;}

    public void NewsArticle(String mess, String title2){
        message = mess;
        title = title2;
    }

}


