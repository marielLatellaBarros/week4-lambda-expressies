package be.pxl.ja.week4.oefening2;

import java.util.List;
import java.util.function.Predicate;

public class GameBrowser {
    private GameCollection gameCollection;

    public GameBrowser(GameCollection gameCollection) {
        this.gameCollection = gameCollection;
    }

    public List<VideoGame> showGamesForSearch(String search) {
        return gameCollection.selectGames(videoGame -> videoGame.getName().toLowerCase().contains(search.toLowerCase()));
    }
}
