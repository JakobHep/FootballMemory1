package com.example.soccermemory;

public class Singleton {

    private static Players thePlayers;

    public static Players thePlayers(){
        if (thePlayers==null)
            thePlayers = new Players();
        return thePlayers;
    }

    public static Players getthePlayers(){
        return thePlayers();
    }

}
