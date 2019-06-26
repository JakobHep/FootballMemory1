package com.example.soccermemory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatchField extends AppCompatActivity {

    public static Singleton theSingleton = new Singleton();
    Players thePlayer = null;

   // int[] CardArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};
    ImageView card_11, card_12, card_13, card_14, card_21, card_22, card_23, card_24, card_31, card_32, card_33, card_34;
    TextView playerOne, playerTwo;
    Button showResult;
    String namePlayerOne;
    String namePlayerTwo;

    ArrayList<ImageView> CardOne = new ArrayList<>();
    ArrayList<ImageView> CardTwo = new ArrayList<>();
    ImageView [] [] ListArray = new ImageView[3][4];


    Cards theCards = new Cards();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_field);

        CardOne = theCards.gettheCards();
        CardTwo = theCards.gettheCards();

        fillArray();


        playerOne = (TextView) findViewById(R.id.playerOne);
        playerTwo = (TextView) findViewById(R.id.playerTwo);
        showResult = (Button) findViewById(R.id.showResult);

        card_11 = (ImageView) findViewById(R.id.card_11);
        card_12 = (ImageView) findViewById(R.id.card_12);
        card_13 = (ImageView) findViewById(R.id.card_13);
        card_14 = (ImageView) findViewById(R.id.card_14);
        card_21 = (ImageView) findViewById(R.id.card_21);
        card_22 = (ImageView) findViewById(R.id.card_22);
        card_23 = (ImageView) findViewById(R.id.card_23);
        card_24 = (ImageView) findViewById(R.id.card_24);
        card_31 = (ImageView) findViewById(R.id.card_31);
        card_32 = (ImageView) findViewById(R.id.card_32);
        card_33 = (ImageView) findViewById(R.id.card_33);
        card_34 = (ImageView) findViewById(R.id.card_34);

        card_11.setTag("0");
        card_12.setTag("1");
        card_13.setTag("2");
        card_14.setTag("3");
        card_21.setTag("4");
        card_22.setTag("5");
        card_23.setTag("6");
        card_24.setTag("7");
        card_31.setTag("8");
        card_32.setTag("9");
        card_33.setTag("10");
        card_34.setTag("11");

        thePlayer = theSingleton.thePlayers();
        names();

        Cards.frontOfCardsResources();

        Cards y = new Cards();
        y.shuffle();

        final Cards x = new Cards();
        card_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_11, memoryCard);
            }
        });
        card_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_12, memoryCard);
            }
        });
        card_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_13, memoryCard);
            }
        });
        card_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_14, memoryCard);
            }
        });
        card_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_21, memoryCard);
            }
        });
        card_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_22, memoryCard);
            }
        });
        card_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_23, memoryCard);
            }
        });
        card_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_24, memoryCard);
            }
        });
        card_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_31, memoryCard);
            }
        });
        card_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_32, theCard);
            }
        });
        card_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_33, memoryCard);
            }
        });
        card_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int memoryCard = Integer.parseInt((String) view.getTag());
                x.Choice(card_34, memoryCard);
            }
        });

        showResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MatchField.this, EndNavi.class);
                startActivity(myIntent);
            }
        });

    }

    public void names(){
        namePlayerOne = thePlayer.getPlayerOne();
        playerOne.setText(namePlayerOne);
        playerOne.setTextSize(30);

        namePlayerTwo = thePlayer.getPlayerTwo();
        playerTwo.setText(namePlayerTwo);
        playerTwo.setTextSize(30);
    }
    private void FillArray() {
        ListArray[0] [0] = CardOne.get(0);
        ListArray[0] [1] = CardTwo.get(0);

    }

    /* public ImageView[] setCards () {



        return Array_ImageViews;
        for (int i = 0; i < Array_ImageViews.length; i++) {
            Array_ImageViews[i].setTag(i);
        }*/
}




