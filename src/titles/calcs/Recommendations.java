package titles.calcs;

public class Recommendations {
    private String recommendation;

    public void filterRecommendations(Classification classification) {
        if(classification.getClassification() >= 4) {
            System.out.println("Highly recommended.");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Well rated.");
        } else {
            System.out.println("Not very recommended.");
        }
    }
}
