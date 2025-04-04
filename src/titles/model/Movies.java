package titles.model;

import titles.calcs.Classification;

public class Movies extends Titles implements Classification {
    private String movieDirector;

    public Movies(String title, int releaseYear, int length) {
        super(title, releaseYear, length);
    }

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

    @Override
    public String toString() {
        return "Movie: " + this.getTitle() + " (" + this.getReleaseYear() + ")";
    }
}
