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

//    public List<VideoGame> showFreeGames() {
//        return gameCollection.selectGames(new Predicate<VideoGame>() {
//            @Override
//            public boolean test(VideoGame videoGame) {
//                if (videoGame.getPrice() == 0.0) {
//                    return true;
//                }
//                return false;
//            }
//        });
//    }


//    public List<VideoGame> showFreeGames() {
//        return gameCollection.selectGames(videoGame -> {
//            if (videoGame.getPrice() == 0.0) {
//                return true;
//            }
//            return false;
//        });
//    }

//    public List<VideoGame> showFreeGames() {
//        return gameCollection.selectGames(videoGame -> {
//            return videoGame.getPrice() == 0.0;
//        });
//    }

    public List<VideoGame> showFreeGames() {
        return gameCollection.selectGames(videoGame -> videoGame.getPrice() == 0.0);
    }

}
