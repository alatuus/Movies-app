package titles.model;

public class Titles {
    private String title;
    private int releaseYear;
    private boolean includedInPlan;
    private double ratingsTotal; // total sum of movie ratings
    private int numOfRatings; // total number of ratings registered
    private int Length;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        if(releaseYear < 1960 || releaseYear > 2025){
            System.out.println("Invalid year. Please enter a valid year");
        } else {
            this.releaseYear = releaseYear;
        }

    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setLength(int length) {
        this.Length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean getIncludedInPlan() {
        return includedInPlan;
    }

    public int getLength() {
        return Length;
    }

    public int getNumOfRatings() {
        return numOfRatings;
    }


    public void showTechnicalInfos(){
        System.out.println("Title: " + title);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Included in plan: " + includedInPlan);
        System.out.println("Rating: " + averageRating());
        System.out.println("Total ratings: " + numOfRatings);
        System.out.println("Movie length: " + Length);
    }

    public void rateMovie(double rating){
        ratingsTotal += rating;
        numOfRatings++;
    }

    public double averageRating(){
        return ratingsTotal / numOfRatings;
    }
}
