package com.example.soccermemory;

import android.widget.TextView;

public class Players extends MainActivity{



    private int playerOnePoints = 0;
    private int playerTwoPoints = 0;
    private String playerOne;
    private String playerTwo;
    private int turn = 0;


   public String Count(boolean Übergabe) {
        String Rückgabe;
        if (Übergabe == true) {
            playerOnePoints++;
            Rückgabe = ("Player 1: " + playerOnePoints);
        } else if (Übergabe == false) {
            playerTwoPoints++;
            Rückgabe = ("Player 2:  " + playerTwoPoints);
        }
        else Rückgabe = "Fehler";
        return Rückgabe;
    }

    public void setPlayerOne (String nameOne){
       playerOne = nameOne;
    }

    public String getPlayerOne()
    {
       return playerOne;
    }

    public void setPlayerTwo (String nameTwo){
        playerTwo = nameTwo;
    }

    public String getPlayerTwo(){
        return playerTwo;
   }



    public int getPlayerOnePoints()
    {
        return playerOnePoints;
    }

    public int getPlayerTwoPoints(){
        return playerTwoPoints;
    }


     public void setPlayerOnePoints (int nameOnePoints){
        playerOnePoints = nameOnePoints;
    }

    public void setPlayerTwo (int nameTwoPoints){
        playerTwoPoints = nameTwoPoints;
    }
}
