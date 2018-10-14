package be.pxl.ja.week4.oefening2;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FreeGamesTest {
	@Test
	public void onlyFreeGamesRemain() {
		GameCollection collection = new GameCollection();
		collection.addGame(new VideoGame("game1", 9.99, 3.0, new String[]{"shooter"}));
		collection.addGame(new VideoGame("game2", 0.0, 3.0, new String[]{"shooter"}));
		collection.addGame(new VideoGame("game3", 0.0, 3.0, new String[]{"shooter"}));
		collection.addGame(new VideoGame("game4", 20.99, 3.0, new String[]{"shooter"}));
		GameBrowser browser = new GameBrowser(collection);

		assertEquals(2, browser.showFreeGames().size());
	}

	@Test
	public void emptyIfNoGamesAreFree() {
		GameCollection collection = new GameCollection();
		collection.addGame(new VideoGame("game1", 9.99, 3.0, new String[]{"shooter"}));
		collection.addGame(new VideoGame("game2", 0.1, 3.0, new String[]{"shooter"}));
		collection.addGame(new VideoGame("game3", 10.99, 3.0, new String[]{"shooter"}));
		collection.addGame(new VideoGame("game4", 20.99, 3.0, new String[]{"shooter"}));
		GameBrowser browser = new GameBrowser(collection);

		assertEquals(0, browser.showFreeGames().size());
	}
}
