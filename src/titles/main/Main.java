package titles.main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import titles.calcs.Recommendations;
import titles.calcs.TimeCalcs;
import titles.exception.YearConversionErrorException;
import titles.model.Episodes;
import titles.model.Movies;
import titles.model.Series;
import titles.model.Titles;
import titles.model.TitlesOmdb;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Titles testMovie = new Titles("Megamind", 2016, 130);
        testMovie.setTitle("Megamind");
        testMovie.setReleaseYear(2017);
        testMovie.setLength(130);

        Scanner scanner = new Scanner(System.in);
        String search = "";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        List<Titles> titles = new ArrayList<>();


        while (!search.equalsIgnoreCase("exit")) {
            System.out.println("Please enter the title: ");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("exit")) {
                break;
            }

            String address = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=";

            try {
                // api key
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                //System.out.println(response.body());

                // Titles title = gson.fromJson(response.body(), Titles.class);
                TitlesOmdb omdbTitle = gson.fromJson(response.body(), TitlesOmdb.class);
                Titles testTitle = new Titles(omdbTitle);
                System.out.println(omdbTitle);

                titles.add(testTitle);

            } catch (NumberFormatException e) {
                System.out.println("Error occurred: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error occurred: ");
                System.out.println(e.getMessage());
            } catch (YearConversionErrorException e) {
                System.out.println("Error occurred: ");
                System.out.println(e.getMessage());
            }

        }

        System.out.println(titles);

        FileWriter write = new FileWriter("titles.json");
        write.write(gson.toJson(titles));
        write.close();

        System.out.println("Program finished correctly.");





    }
}
