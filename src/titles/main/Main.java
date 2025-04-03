package titles.main;

import com.google.gson.Gson;
import titles.calcs.Recommendations;
import titles.calcs.TimeCalcs;
import titles.model.Episodes;
import titles.model.Movies;
import titles.model.Series;
import titles.model.Titles;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title: ");
        var search = scanner.nextLine();

        String address = "https://www.omdbapi.com/?t=" + search + "&apikey=";

        // api key
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //System.out.println(response.body());

        Gson gson = new Gson();
        Titles title = gson.fromJson(response.body(), Titles.class);
        System.out.println(title);



    }
}
