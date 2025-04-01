package titles.model;

import titles.calcs.Classification;

public class Movies extends Titles implements Classification {
    private String movieDirector;

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    @Override
    public int getClassification() {
        return (int) averageRating() / 2;
    }
}
