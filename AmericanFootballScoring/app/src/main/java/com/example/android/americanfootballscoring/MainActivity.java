package com.example.android.americanfootballscoring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamOneScore = 0;
    int teamTwoScore = 0;
    private static ImageView imageToggel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayTeamOneScore(int s) {
        TextView displayScore = (TextView) findViewById(R.id.TeamOneScore);
        displayScore.setText(String.valueOf(s));
    }

    public void displayTeamTwoScore(int s) {
        TextView displayScore = (TextView) findViewById(R.id.TeamTwoScore);
        displayScore.setText(String.valueOf(s));

    }

    public void increamntTeamOne(View view) {
        teamOneScore++;
        displayTeamOneScore(teamOneScore);
    }

    public void increamntTeamTwo(View view) {
        teamTwoScore++;
        displayTeamTwoScore(teamTwoScore);
    }

    public void ResettingScore(View view) {
        teamOneScore = 0;
        teamTwoScore = 0;
        displayTeamOneScore(teamOneScore);
        displayTeamTwoScore(teamTwoScore);
        imageToggel = (ImageView) findViewById(R.id.imageSwap);
        imageToggel.setImageResource(0);
    }

    public void teamOneFoul(View view) {
        imageToggel = (ImageView) findViewById(R.id.imageSwap);
        imageToggel.setImageResource(R.drawable.foul);
    }

    public void teamOnePenalty(View view) {
        imageToggel = (ImageView) findViewById(R.id.imageSwap);
        imageToggel.setImageResource(R.drawable.penalty);
    }

    public void teamOneOut(View view) {
        imageToggel = (ImageView) findViewById(R.id.imageSwap);
        imageToggel.setImageResource(R.drawable.out);
    }

    public void teamTwoFoul(View view) {
        imageToggel = (ImageView) findViewById(R.id.imageSwap);
        imageToggel.setImageResource(R.drawable.foul);
    }

    public void teamTwoPenalty(View view) {
        imageToggel = (ImageView) findViewById(R.id.imageSwap);
        imageToggel.setImageResource(R.drawable.penalty);
    }

    public void teamTwoOut(View view) {
        imageToggel = (ImageView) findViewById(R.id.imageSwap);
        imageToggel.setImageResource(R.drawable.out);
    }
}
