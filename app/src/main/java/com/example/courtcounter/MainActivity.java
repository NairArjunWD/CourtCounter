package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        displayForTeamA(7);
    }

    /**
     * Adds 3 to the given score for Team A.
     */
    public void threePoints(View view) {
        displayForTeamA(3);
    }

    /**
     * Adds 3 to the given score for Team A.
     */
    public void twoPoints(View view) {
        displayForTeamA(2);
    }

    /**
     * Adds 3 to the given score for Team A.
     */
    public void freeThrow(View view) {
        displayForTeamA(1);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}