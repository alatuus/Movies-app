import titles.calcs.Recommendations;
import titles.calcs.TimeCalcs;
import titles.model.Episodes;
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

        Series siliconValley = new Series();
        siliconValley.setTitle("Silicon Valley");
        siliconValley.setReleaseYear(2014);
        siliconValley.setIncludedInPlan(true);
        siliconValley.setLength(1800);
        siliconValley.setNumOfSeasons(6);
        siliconValley.setActiveAiring(false);
        siliconValley.setEpisodesPerSeason(10);
        siliconValley.setEpisodeLength(30);

        TimeCalcs calcs = new TimeCalcs();

        calcs.include(hatsuneMiku);
        calcs.include(megamind);
        calcs.include(siliconValley);

        hatsuneMiku.rateMovie(10);
        hatsuneMiku.rateMovie(9);

        Recommendations recommendation = new Recommendations();
        recommendation.filterRecommendations(hatsuneMiku);

        Episodes newEpisode = new Episodes();
        newEpisode.setEpNumber(1);
        newEpisode.setEpTitle("Episode 1");
        newEpisode.setSerie(siliconValley);
        newEpisode.setTotalViews(7000);

        recommendation.filterRecommendations(newEpisode);

    }
}
