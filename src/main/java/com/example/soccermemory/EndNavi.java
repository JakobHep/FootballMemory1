package com.example.soccermemory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndNavi extends AppCompatActivity {

    public static Singleton theSingleton = new Singleton();
    Players thePlayer = null;
    private int PlayerOnePoints;
    private int PlayerTwoPoints;
    String namePlayerOne;
    String namePlayerTwo;

    TextView winner;
    TextView result;
    Button menuButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_navi);


        thePlayer = theSingleton.thePlayers();


        winner = (TextView) findViewById(R.id.winner);
        result = (TextView) findViewById(R.id.result);
        menuButton = (Button) findViewById(R.id.menuButton);


        Winner();

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(EndNavi.this, MainActivity.class);
                startActivity(myIntent);
            }
        });


    }

        public void Winner() {

            PlayerOnePoints = thePlayer.getPlayerOnePoints();
            PlayerTwoPoints = thePlayer.getPlayerTwoPoints();
            namePlayerOne = thePlayer.getPlayerOne();
            namePlayerTwo = thePlayer.getPlayerOne();
            setWinner();
        }

        public void setWinner() {
            if (PlayerOnePoints > PlayerTwoPoints) {
                winner.setText(namePlayerOne + "win the Game");
            } else if (PlayerTwoPoints > PlayerOnePoints) {
                winner.setText(namePlayerTwo + "win the Game");
            } else winner.setText("The game ended in a draw");
            result.setText("Result!  \n Player 1: "+PlayerOnePoints + "Player 2: " + PlayerTwoPoints);

        }


}

