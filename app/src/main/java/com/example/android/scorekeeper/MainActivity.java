package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int foulsTeamA = 0;
    private int foulsTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * TEAM A METHODS
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }
    // Adds point for Team A
    public void goalsA (View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }
    // Adds foul for Team A
    public void foulsA (View v) {
        foulsTeamA++;
        displayFoulsA(foulsTeamA);
    }
    /**
     *  TEAM B METHODS
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }
    // Adds point for Team B
    public void goalsB (View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }
    // Adds foul for Team B
    public void foulsB (View v) {
        foulsTeamB++;
        displayFoulsB(foulsTeamB);
    }
    // Resets the score for both teams
    public void resetScore (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayForTeamA (scoreTeamA);
        displayForTeamB (scoreTeamB);
        displayFoulsA (foulsTeamA);
        displayFoulsB (foulsTeamB);
    }
}
