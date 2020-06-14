package io.javabrains.ratingsdataservice.models;

public class RatingModel {

    String movieid;
    Integer rating;

    public RatingModel(String movieid, Integer rating) {
        this.movieid = movieid;
        this.rating = rating;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
