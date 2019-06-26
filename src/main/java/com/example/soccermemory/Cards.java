package com.example.soccermemory;

import android.graphics.Color;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.os.Handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Cards extends MatchField {

    private static int image101, image102, image103, image104, image105, image106, image201, image202, image203, image204, image205, image206;



    private ImageView theImageView;

    ArrayList <ImageView> theCardList = new ArrayList<>();


    public void settheCards (){
        theImageView.setImageResource(R.drawable.ic_image101);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image102);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image103);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image104);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image105);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image106);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image201);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image202);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image203);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image204);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image205);
        theCardList.add(theImageView);
        theImageView.setImageResource(R.drawable.ic_image206);

        theCardList.add(theImageView);
    }
    public ArrayList <ImageView> gettheCards(){
        settheCards();
        return theCardList;
    }

    /*
    int[] CardArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};
    private static int image101, image102, image103, image104, image105, image106, image201, image202, image203, image204, image205, image206;
    int CardNumber;
    int FirstCard;
    int SecondCard;
    int FirstClick;
    int SecondClick;
    int turn;


    public void Choice(ImageView iv, int card) {

        switch (CardArray[card]) {
            case 101:
                iv.setImageResource(image101);
                break;
            case 102:
                iv.setImageResource(image102);
                break;
            case 103:
                iv.setImageResource(image103);
                break;
            case 104:
                iv.setImageResource(image104);
                break;
            case 105:
                iv.setImageResource(image105);
                break;
            case 106:
                iv.setImageResource(image106);
                break;
            case 201:
                iv.setImageResource(image201);
                break;
            case 202:
                iv.setImageResource(image202);
                break;
            case 203:
                iv.setImageResource(image203);
                break;
            case 204:
                iv.setImageResource(image204);
                break;
            case 205:
                iv.setImageResource(image205);
                break;
            case 206:
                iv.setImageResource(image206);
                break;
        }
        if (CardNumber == 1) {
            FirstCard = CardArray[card];
            if (FirstCard > 200) {
                FirstCard = FirstCard - 100;
            }
            CardNumber = 2;
            FirstClick = card;

            iv.setEnabled(false);
        } else if (CardNumber == 2) {
            SecondCard = CardArray[card];
            if (SecondCard > 200) {
                SecondCard = SecondCard - 100;
            }
            CardNumber = 1;
            SecondClick = card;
            card_11.setEnabled(false);
            card_12.setEnabled(false);
            card_13.setEnabled(false);
            card_14.setEnabled(false);
            card_21.setEnabled(false);
            card_22.setEnabled(false);
            card_23.setEnabled(false);
            card_24.setEnabled(false);
            card_31.setEnabled(false);
            card_32.setEnabled(false);
            card_33.setEnabled(false);
            card_34.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Comparisson();
                }
            }, 1000);
        }
    }

    public void Comparisson() {
        if (FirstCard == SecondCard) {
            switch (FirstClick) {
                case 0:
                    card_11.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    card_12.setVisibility(View.INVISIBLE);
                    break;
                case 2:
                    card_13.setVisibility(View.INVISIBLE);
                    break;
                case 3:
                    card_14.setVisibility(View.INVISIBLE);
                    break;
                case 4:
                    card_21.setVisibility(View.INVISIBLE);
                    break;
                case 5:
                    card_22.setVisibility(View.INVISIBLE);
                    break;
                case 6:
                    card_23.setVisibility(View.INVISIBLE);
                    break;
                case 7:
                    card_24.setVisibility(View.INVISIBLE);
                    break;
                case 8:
                    card_31.setVisibility(View.INVISIBLE);
                    break;
                case 9:
                    card_32.setVisibility(View.INVISIBLE);
                    break;
                case 10:
                    card_33.setVisibility(View.INVISIBLE);
                    break;
                case 11:
                    card_34.setVisibility(View.INVISIBLE);
                    break;
            }
            switch (SecondClick) {
                case 0:
                    card_11.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    card_12.setVisibility(View.INVISIBLE);
                    break;
                case 2:
                    card_13.setVisibility(View.INVISIBLE);
                    break;
                case 3:
                    card_14.setVisibility(View.INVISIBLE);
                    break;
                case 4:
                    card_21.setVisibility(View.INVISIBLE);
                    break;
                case 5:
                    card_22.setVisibility(View.INVISIBLE);
                    break;
                case 6:
                    card_23.setVisibility(View.INVISIBLE);
                    break;
                case 7:
                    card_24.setVisibility(View.INVISIBLE);
                    break;
                case 8:
                    card_31.setVisibility(View.INVISIBLE);
                    break;
                case 9:
                    card_32.setVisibility(View.INVISIBLE);
                    break;
                case 10:
                    card_33.setVisibility(View.INVISIBLE);
                    break;
                case 11:
                    card_34.setVisibility(View.INVISIBLE);
                    break;
            }
        } else {
            card_11.setImageResource(R.drawable.ic_back);
            card_12.setImageResource(R.drawable.ic_back);
            card_13.setImageResource(R.drawable.ic_back);
            card_14.setImageResource(R.drawable.ic_back);
            card_21.setImageResource(R.drawable.ic_back);
            card_22.setImageResource(R.drawable.ic_back);
            card_23.setImageResource(R.drawable.ic_back);
            card_24.setImageResource(R.drawable.ic_back);
            card_31.setImageResource(R.drawable.ic_back);
            card_32.setImageResource(R.drawable.ic_back);
            card_33.setImageResource(R.drawable.ic_back);
            card_34.setImageResource(R.drawable.ic_back);

            if (turn == 1) {
                turn = 2;
                playerOne.setTextColor(Color.GRAY);
                playerTwo.setTextColor(Color.GREEN);
            } else if (turn == 2) {
                turn = 1;
                playerTwo.setTextColor(Color.GRAY);
                playerOne.setTextColor(Color.GREEN);
            }
        }
        card_11.setEnabled(true);
        card_12.setEnabled(true);
        card_13.setEnabled(true);
        card_14.setEnabled(true);
        card_21.setEnabled(true);
        card_22.setEnabled(true);
        card_23.setEnabled(true);
        card_24.setEnabled(true);
        card_31.setEnabled(true);
        card_32.setEnabled(true);
        card_33.setEnabled(true);
        card_34.setEnabled(true);
    }

    public static void frontOfCardsResources(){
        image101 = R.drawable.ic_image101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_image103;
        image104 = R.drawable.ic_image104;
        image105 = R.drawable.ic_image105;
        image106 = R.drawable.ic_image106;
        image201 = R.drawable.ic_image201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_image203;
        image204 = R.drawable.ic_image204;
        image205 = R.drawable.ic_image205;
        image206 = R.drawable.ic_image206;
    }

    public void shuffle(){

        Collections.shuffle(Arrays.asList(CardArray));
    }*/
}
