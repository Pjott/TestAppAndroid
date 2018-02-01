package com.example.piotr.testappandroid;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    GameCreator gameCreator = new GameCreator();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findingGame(View view) {
        TextView games = (TextView) findViewById(R.id.gameID);
        Spinner gameGenres = (Spinner) findViewById(R.id.gameGenresID);
        String selectedGameGenre = String
                                    .valueOf(gameGenres.getSelectedItem());

        List<String> gameList = gameCreator.getGame(selectedGameGenre);
        StringBuilder gameStringBuilder = new StringBuilder();

        for (String game : gameList) {
            gameStringBuilder.append(game).append('\n');
        }

        games.setText(gameStringBuilder);
    }
}
