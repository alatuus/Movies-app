public class Movies {
    String title;
    int releaseYear;
    boolean includedInPlan;
    double ratingsTotal; // total movie rating
    int numOfRatings; // total number of ratings registered
    int movieLength;

    void showTechnicalInfos(){
        System.out.println("Title: " + title);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Included in plan: " + includedInPlan);
        System.out.println("Rating: " + ratingsTotal);
        System.out.println("Total ratings: " + numOfRatings);
        System.out.println("Movie length: " + movieLength);
    }

    void rateMovie(double rating){
        ratingsTotal += rating;
        numOfRatings++;
    }

    double averageRating(){
        return ratingsTotal / numOfRatings;
    }
}
