package be.pxl.ja.week4.oefening2;

import java.util.ArrayList;

public class GameCollection {
    private ArrayList<VideoGame> videoGames = new ArrayList<>();


    public void addGame (VideoGame videogame) {
        videoGames.add(videogame);
    }
}
