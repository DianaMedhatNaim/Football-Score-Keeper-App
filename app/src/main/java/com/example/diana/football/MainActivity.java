package com.example.diana.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA =0;
    int scoreTeamb =0;
    int scoreTeamAfouls =0;
    int scoreTeambfouls =0;
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
    public void displayForTeamb(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamAfouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeambfouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }
    public void button1(View V) {
        int score=scoreTeamA+1;
        scoreTeamA=score;
        displayForTeamA(scoreTeamA);
    }
    public void button2(View V) {
        int score=scoreTeamAfouls+1;
        scoreTeamAfouls=score;
        displayForTeamAfouls(scoreTeamAfouls);
    }
    public void button3(View V) {
        int score=scoreTeamb+1;
        scoreTeamb=score;
        displayForTeamb(score);
    }
    public void button4(View V) {
        int score=scoreTeambfouls+1;
        scoreTeambfouls=score;
        displayForTeambfouls(scoreTeambfouls);
    }
    public void reset (View V) {
        int score=0;
         scoreTeamA =score;
         scoreTeamb =score;
         scoreTeamAfouls =score;
         scoreTeambfouls =score;
        displayForTeamb(score);
        displayForTeamA(score);
        displayForTeamAfouls(score);
        displayForTeambfouls(score);
    }
}
