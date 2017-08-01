package com.utsa.team8_sum_2017.europa;


/*
* not entirely sure why this needs to be here, but was in the case diagram
*
* */
public class Rating {
    private int rating;
    public void updateRating(int rate){
        rating = rate;
    }

    public int getRating(){
        return rating;
    }

    public Rating(int rate){
        rating = rate;
    }
}
