package titles.model;

public class Movies extends Titles {
    private String movieDirector;

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieDirector() {
        return movieDirector;
    }
}
