package com.example.soccermemory;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Field;

import static java.lang.System.runFinalizersOnExit;

public class MainActivity extends AppCompatActivity {


    TextView playerOne, playerTwo;
    Button startGame, exitGame;


    public static Singleton theSingleton = new Singleton();
    Players thePlayers = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startGame = (Button) findViewById(R.id.startGame);
        startGame.setText("Start Game");
        exitGame = (Button) findViewById(R.id.exitGame);
        exitGame.setText("Exit Game");

        exitGame.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                for (Activity activity : _activities) {
                    activity.finish();
            }


        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thePlayers.setPlayerOne(playerOne.getText().toString());
                thePlayers.setPlayerTwo(playerTwo.getText().toString());
                Intent myIntent = new Intent(MainActivity.this, MatchField.class);
                startActivity(myIntent);
            }
        });
        playerOne = (TextView) findViewById(R.id.playerOne);
        playerTwo = (TextView) findViewById(R.id.playerTwo);
        thePlayers = theSingleton.thePlayers();

    }
 }