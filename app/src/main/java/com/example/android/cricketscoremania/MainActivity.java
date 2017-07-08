package com.example.android.cricketscoremania;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This activity will do the major works
 * it will updates the score for rps and rcb team
 */
public class MainActivity extends AppCompatActivity {

    //Tracks the score for team Rps
    int ScoreTeamRps = 0;

    //Tracks the score for team Rcb
    int ScoreTeamRcb = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null)
            displayForTeamRPS(0);
    }

    /**
     * increase the score by six for team RPS
     */

    public void addSixForRps(View v) {
        ScoreTeamRps = ScoreTeamRps + 6;
        displayForTeamRPS(ScoreTeamRps);
    }

    /**
     * increase the score by four for team RPS
     */
    public void addFourForRps(View v) {
        ScoreTeamRps = ScoreTeamRps + 4;
        displayForTeamRPS(ScoreTeamRps);
    }

    /**
     * increase the score by two for team RPS
     */
    public void addTwoForRps(View v) {
        ScoreTeamRps = ScoreTeamRps + 2;
        displayForTeamRPS(ScoreTeamRps);
    }

    /**
     * increase the score by one for team RPS
     */
    public void addOneForRps(View v) {
        ScoreTeamRps = ScoreTeamRps + 1;
        displayForTeamRPS(ScoreTeamRps);
    }

    /**
     * increase the score by six for team RCB
     */
    public void addSixForRcb(View v) {
        ScoreTeamRcb = ScoreTeamRcb + 6;
        displayForTeamRCB(ScoreTeamRcb);
    }

    /**
     * increase the score by four for team RCB
     */
    public void addFourForRcb(View v) {
        ScoreTeamRcb = ScoreTeamRcb + 4;
        displayForTeamRCB(ScoreTeamRcb);
    }

    /**
     * increase the score by two for team RCB
     */
    public void addTwoForRcb(View v) {
        ScoreTeamRcb = ScoreTeamRcb + 2;
        displayForTeamRCB(ScoreTeamRcb);
    }

    /**
     * increase the score by one for team RCB
     */
    public void addOneForRcb(View v) {
        ScoreTeamRcb = ScoreTeamRcb + 1;
        displayForTeamRCB(ScoreTeamRcb);
    }

    /**
     * when the reset button is clicked.
     * this method comes into play
     * it will make both team's score update to 0 (zero)
     */

    public void resetScore(View v) {
        ScoreTeamRps = 0;
        ScoreTeamRcb = 0;
        displayForTeamRPS(ScoreTeamRps);
        displayForTeamRCB(ScoreTeamRcb);
    }

    /**
     * Displays the given score for Team Rps.
     */
    public void displayForTeamRPS(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_RPS_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team rcb.
     */
    public void displayForTeamRCB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_RCB_score);
        scoreView.setText(String.valueOf(score));
    }

}
