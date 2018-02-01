package com.example.piotr.testappandroid;

import java.util.ArrayList;
import java.util.List;

public class GameCreator {

    List<String> getGame(String gameGenres) {
        List<String> games = new ArrayList<String>();

        if(gameGenres.equals("RTS")) {
            games.add("Age of Empires");
        } else if(gameGenres.equals("FPS")) {
            games.add("Quake");
        } else if(gameGenres.equals("Simulator")) {
            games.add("Microsoft Train Simulator 2");
        } else {
            games.add("Baldur's Gate 2");
        }
        return games;
    }
}
