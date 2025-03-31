import titles.model.Movies;
import titles.model.Series;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Movies hatsuneMiku = new Movies();
        hatsuneMiku.setTitle("Project Sekai: Kowareta Sekai to Utaenai Miku") ;
        hatsuneMiku.setReleaseYear(2025);
        hatsuneMiku.setLength(130);
        hatsuneMiku.setIncludedInPlan(true);

        hatsuneMiku.showTechnicalInfos();
        hatsuneMiku.rateMovie(8);
        //hatsuneMiku.rateMovie(10);

        System.out.println(hatsuneMiku.averageRating());
        System.out.println(hatsuneMiku.getNumOfRatings());

        Series siliconValley = new Series();
        siliconValley.setTitle("Silicon Valley");
        siliconValley.setReleaseYear(2014);
        siliconValley.setIncludedInPlan(true);
        siliconValley.setLength(30);
        siliconValley.setNumOfSeasons(6);
        siliconValley.setActiveAiring(false);
        siliconValley.showTechnicalInfos();

    }
}
