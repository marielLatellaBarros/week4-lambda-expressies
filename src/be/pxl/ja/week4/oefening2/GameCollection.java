package be.pxl.ja.week4.oefening2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GameCollection {
    private ArrayList<VideoGame> videoGames = new ArrayList<>();


    public void addGame(VideoGame videogame) {
        videoGames.add(videogame);
    }

    //it's better to use a List as a return type instead of ArrayList because the scope is bigger.
    public List<VideoGame> selectGames(Predicate<VideoGame> gameChecker) {
        List<VideoGame> result = new ArrayList<>();
        for (VideoGame videoGame : videoGames) {
            if (gameChecker.test(videoGame)) {
                result.add(videoGame);
            }
        }
        return result;
    }
}
