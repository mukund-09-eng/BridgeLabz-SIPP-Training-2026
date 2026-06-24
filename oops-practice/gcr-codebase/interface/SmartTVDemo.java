interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming Movies...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing Games...");
    }

    // Resolving Default Method Conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class SmartTVDemo {

    public static void main(String[] args) {

        String[] movies = {
                "Avengers",
                "Interstellar",
                "Inception"
        };

        String[] games = {
                "FIFA",
                "GTA V",
                "Minecraft"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies Available:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nGames Available:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}
