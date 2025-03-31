//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Movies hatsuneMiku = new Movies();
        hatsuneMiku.title = "Project Sekai: Kowareta Sekai to Utaenai Miku";
        hatsuneMiku.releaseYear = 2025;
        hatsuneMiku.movieLength = 130;
        hatsuneMiku.ratingsTotal = 0;

        hatsuneMiku.showTechnicalInfos();
        hatsuneMiku.rateMovie(8);
        hatsuneMiku.rateMovie(10);

        System.out.println(hatsuneMiku.averageRating());
    }
}
