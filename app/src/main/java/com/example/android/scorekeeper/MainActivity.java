package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //keys for saving the activity data

    private final static String PLAYER_ONE_SCORE = "player_one_score";
    private final static String PLAYER_TWO_SCORE = "player_two_score";

    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;
    int roadTilesPlayerOne = 0;
    int cityTilesPlayerOne = 0;
    int cloisterTilesPlayerOne = 0;
    int roadTilesPlayerTwo = 0;
    int cityTilesPlayerTwo = 0;
    int cloisterTilesPlayerTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            scorePlayerOne = savedInstanceState.getInt(PLAYER_ONE_SCORE);
            scorePlayerTwo = savedInstanceState.getInt(PLAYER_TWO_SCORE);
            displayForPlayerOne(scorePlayerOne);
            displayForPlayerTwo(scorePlayerTwo);

        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(PLAYER_ONE_SCORE, scorePlayerOne);
        savedInstanceState.putInt(PLAYER_TWO_SCORE, scorePlayerTwo);

        super.onSaveInstanceState(savedInstanceState);

    }
    
    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_one_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player 2.
     */
    public void displayForPlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_two_score);
        scoreView.setText(String.valueOf(score));
    }

    //PLAYER ONE BEGINS

    /**
     * Displays the roadP1_text_view score for Player 1.
     */

    public void displayRoadPlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.roadP1_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the + road tile for Player 1 button is clicked.
     * increases roadP1_text_view
     */
    public void plusRoadTilesPOne(View view) {
        roadTilesPlayerOne += 1;
        displayRoadPlayerOne(roadTilesPlayerOne);
    }

    /**
     * This method is called when the - road tile for Player 1 button is clicked.
     * decreases roadP1_text_view
     */
    public void minusRoadTilesPOne(View view) {
        if (roadTilesPlayerOne >= 1) {
            roadTilesPlayerOne -= 1;
            displayRoadPlayerOne(roadTilesPlayerOne);
        } else {
            displayRoadPlayerOne(roadTilesPlayerOne);
        }
    }

    /**
     * Displays the cityP1_text_view score for Player 1.
     */

    public void displayCityPlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cityP1_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the + city tile for Player 1 button is clicked.
     * increases cityP1_text_view
     */
    public void plusCityTilesPOne(View view) {
        cityTilesPlayerOne += 1;
        displayCityPlayerOne(cityTilesPlayerOne);
    }

    /**
     * This method is called when the - city tile for Player 1 button is clicked.
     * decreases cityP1_text_view
     */
    public void minusCityTilesPOne(View view) {
        if (cityTilesPlayerOne >= 1) {
            cityTilesPlayerOne -= 1;
            displayCityPlayerOne(cityTilesPlayerOne);
        } else {
            displayCityPlayerOne(cityTilesPlayerOne);
        }
    }

    public void displayCloisterPlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cloisterP1_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the + city tile for Player 1 button is clicked.
     * increases cloisterP1_text_view
     */
    public void plusCloisterTilesPOne(View view) {
        cloisterTilesPlayerOne += 1;
        displayCloisterPlayerOne(cloisterTilesPlayerOne);
    }

    /**
     * This method is called when the - city tile for Player 1 button is clicked.
     * decreases cloisterP1_text_view
     */
    public void minusCloisterTilesPOne(View view) {
        if (cloisterTilesPlayerOne >= 1) {
            cloisterTilesPlayerOne -= 1;
            displayCloisterPlayerOne(cloisterTilesPlayerOne);
        } else {
            displayCloisterPlayerOne(cloisterTilesPlayerOne);
        }
    }

    /**
     * This method is called when the end turn button is clicked.
     * adds road, city, and cloister values to player one score.
     */
    public void endTurnPOne(View view) {
        scorePlayerOne += roadTilesPlayerOne;
        roadTilesPlayerOne = 0;
        scorePlayerOne += cityTilesPlayerOne * 2;
        cityTilesPlayerOne = 0;
        scorePlayerOne += cloisterTilesPlayerOne * 9;
        cloisterTilesPlayerOne = 0;
        displayForPlayerOne(scorePlayerOne);
        displayRoadPlayerOne(roadTilesPlayerOne);
        displayCityPlayerOne(cityTilesPlayerOne);
        displayCloisterPlayerOne(cloisterTilesPlayerOne);
    }
    //PLAYER ONE ENDS

    //PLAYER TWO BEGINS

    /**
     * Displays the roadP2_text_view score for Player 2.
     */

    public void displayRoadPlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.roadP2_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the + road tile for Player 2 button is clicked.
     * increases roadP2_text_view
     */
    public void plusRoadTilesPTwo(View view) {
        roadTilesPlayerTwo += 1;
        displayRoadPlayerTwo(roadTilesPlayerTwo);
    }

    /**
     * This method is called when the - road tile for Player 2 button is clicked.
     * decreases roadP2_text_view
     */
    public void minusRoadTilesPTwo(View view) {
        if (roadTilesPlayerTwo >= 1) {
            roadTilesPlayerTwo -= 1;
            displayRoadPlayerTwo(roadTilesPlayerTwo);
        } else {
            displayRoadPlayerTwo(roadTilesPlayerTwo);
        }
    }

    /**
     * Displays the cityP2_text_view score for Player 2.
     */

    public void displayCityPlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cityP2_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the + city tile for Player 2 button is clicked.
     * increases cityP2_text_view
     */

    public void plusCityTilesPTwo(View view) {
        cityTilesPlayerTwo += 1;
        displayCityPlayerTwo(cityTilesPlayerTwo);
    }

    /**
     * This method is called when the - city tile for Player 2 button is clicked.
     * decreases cityP2_text_view
     */

    public void minusCityTilesPTwo(View view) {
        if (cityTilesPlayerTwo >= 1) {
            cityTilesPlayerTwo -= 1;
            displayCityPlayerTwo(cityTilesPlayerTwo);
        } else {
            displayCityPlayerTwo(cityTilesPlayerTwo);
        }
    }

    public void displayCloisterPlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cloisterP2_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the + city tile for Player 2 button is clicked.
     * increases cloisterP2_text_view
     */

    public void plusCloisterTilesPTwo(View view) {
        cloisterTilesPlayerTwo += 1;
        displayCloisterPlayerTwo(cloisterTilesPlayerTwo);
    }

    /**
     * This method is called when the - city tile for Player 2 button is clicked.
     * decreases cloisterP2_text_view
     */

    public void minusCloisterTilesPTwo(View view) {
        if (cloisterTilesPlayerTwo >= 1) {
            cloisterTilesPlayerTwo -= 1;
            displayCloisterPlayerTwo(cloisterTilesPlayerTwo);
        } else {
            displayCloisterPlayerTwo(cloisterTilesPlayerTwo);
        }
    }

    /**
     * This method is called when the end turn button is clicked.
     * adds road, city, and cloister values to player two score.
     */
    public void endTurnPTwo(View view) {
        scorePlayerTwo += roadTilesPlayerTwo;
        roadTilesPlayerTwo = 0;
        scorePlayerTwo += cityTilesPlayerTwo * 2;
        cityTilesPlayerTwo = 0;
        scorePlayerTwo += cloisterTilesPlayerTwo * 9;
        cloisterTilesPlayerTwo = 0;
        displayForPlayerTwo(scorePlayerTwo);
        displayRoadPlayerTwo(roadTilesPlayerTwo);
        displayCityPlayerTwo(cityTilesPlayerTwo);
        displayCloisterPlayerTwo(cloisterTilesPlayerTwo);
    }

    //PLAYER TWO ENDS

    /**
     * This method is called when the reset button is clicked.
     * sets all score values to 0 and displays updated values.
     */

    public void resetPlayerScores(View view) {
        scorePlayerOne = 0;
        roadTilesPlayerOne = 0;
        cityTilesPlayerOne = 0;
        cloisterTilesPlayerOne = 0;
        scorePlayerTwo = 0;
        roadTilesPlayerTwo = 0;
        cityTilesPlayerTwo = 0;
        cloisterTilesPlayerTwo = 0;
        displayForPlayerOne(scorePlayerOne);
        displayRoadPlayerOne(roadTilesPlayerOne);
        displayCityPlayerOne(cityTilesPlayerOne);
        displayCloisterPlayerOne(cloisterTilesPlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
        displayRoadPlayerTwo(roadTilesPlayerTwo);
        displayCityPlayerTwo(cityTilesPlayerTwo);
        displayCloisterPlayerTwo(cloisterTilesPlayerTwo);
    }
}