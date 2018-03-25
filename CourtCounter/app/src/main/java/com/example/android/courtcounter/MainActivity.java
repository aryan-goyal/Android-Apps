package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int scoreTeamA = 0;
    public int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Click the +3 button for Team A.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Click the +2 button for Team A.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Click the +1 button for Team A.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Click the -1 button for Team A.
     */
    public void subtractOneForTeamA(View v) {
        if (scoreTeamA >= 1)
            scoreTeamA--;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Click the -2 button for Team A.
     */
    public void subtractTwoForTeamA(View v) {
        if (scoreTeamA >= 2)
            scoreTeamA = scoreTeamA - 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Click the -3 button for Team A.
     */
    public void subtractThreeForTeamA(View v) {
        if (scoreTeamA >= 3)
            scoreTeamA = scoreTeamA - 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Click the +3 button for Team B.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Click the +2 button for Team B.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Click the +1 button for Team B.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Click the -1 button for Team B.
     */
    public void subtractOneForTeamB(View v) {
        if (scoreTeamB >= 1)
            scoreTeamB--;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Click the -2 button for Team B.
     */
    public void subtractTwoForTeamB(View v) {
        if (scoreTeamB >= 2)
            scoreTeamB = scoreTeamB - 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Click the -3 button for Team B.
     */
    public void subtractThreeForTeamB(View v) {
        if (scoreTeamB >= 3)
            scoreTeamB = scoreTeamB - 3;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}