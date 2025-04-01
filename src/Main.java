import titles.calcs.TimeCalcs;
import titles.model.Movies;
import titles.model.Series;

public class Main {
    public static void main(String[] args){
        Movies hatsuneMiku = new Movies();
        hatsuneMiku.setTitle("Project Sekai: Kowareta Sekai to Utaenai Miku") ;
        hatsuneMiku.setReleaseYear(2025);
        hatsuneMiku.setLength(130);
        hatsuneMiku.setIncludedInPlan(true);

        Movies megamind = new Movies();
        megamind.setTitle("Megamind");
        megamind.setLength(130);

        hatsuneMiku.showTechnicalInfos();
        hatsuneMiku.rateMovie(8);
        //hatsuneMiku.rateMovie(10);

        System.out.println(hatsuneMiku.averageRating());
        System.out.println(hatsuneMiku.getNumOfRatings());

        Series siliconValley = new Series();

        siliconValley.setTitle("Silicon Valley");
        siliconValley.setReleaseYear(2014);
        siliconValley.setIncludedInPlan(true);
        siliconValley.setLength(1800);
        siliconValley.setNumOfSeasons(6);
        siliconValley.setActiveAiring(false);
        siliconValley.setEpisodesPerSeason(10);
        siliconValley.setEpisodeLength(30);

        siliconValley.showTechnicalInfos();
        siliconValley.showSpecificInfos();

        TimeCalcs calcs = new TimeCalcs();

        calcs.include(hatsuneMiku);
        calcs.include(megamind);
        calcs.include(siliconValley);
        System.out.println(calcs.getTotalTime());


    }
}
