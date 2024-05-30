import java.util.ArrayList;
import java.util.List;

public class GameCollection {
    private List<Game> games;

    public GameCollection() {
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public List<Game> filterGamesByPriceAndYear(double maxPrice, int minYear) {
        List<Game> filteredGames = new ArrayList<>();
        for (Game game : games) {
            if (game.getPrice() <= maxPrice && game.getYear() >= minYear) {
                filteredGames.add(game);
            }
        }
        return filteredGames;
    }

    public void printGames(List<Game> games) {
        for (Game game : games) {
            System.out.println(game);
        }
    }
}