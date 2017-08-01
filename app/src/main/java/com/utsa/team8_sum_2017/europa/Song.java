package com.utsa.team8_sum_2017.europa;


public class Song {
    private String artist;
    private String title;
    private String publisher;
    private int year;
    private Rating rating; //could change to int, but assuming its there for a reason
    //private artwork artwork; needs some form of artwork keeping class

    public void updateRating(int num){rating.updateRating(num);}
    public void getInfo(){
        //not sure what is supposed to be done here
    }


    public void setArtist(String name){artist = name;}
    public void setTitle(String t){title = t;}
    public void setPublisher(String p){publisher = p;}
    public void setYear(int y){year = y;}
    public void setRating(int r){rating.updateRating(r);}

    public String getArtist(){return artist;}
    public String getTitle(){return title;}
    public String getPublisher(){return publisher;}
    public int getYear(){return year;}
    public int getRating(){return rating.getRating();}

}
