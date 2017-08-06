package com.utsa.team8_sum_2017.europa;


public class Model {

    //Will need to have this updated from the server eventually. using static messages until then
    Newsfeed feed;
  //  feed.addNews("message attempt 1", "title attempt 1");
   // feed.addNews("message attempt 2", "title attempt 2");
   // feed.addNews("message attempt 3", "title attempt 3");
  //  feed.addNews("message attempt 4", "title attempt 4");
  //  feed.addNews("message attempt 5", "title attempt 5");
  //  feed.addNews("message attempt 6", "title attempt 6");
  //  feed.addNews("message attempt 7", "title attempt 7");



    public NewsArticle getNews(){
        return feed.getNews();
    }


}
