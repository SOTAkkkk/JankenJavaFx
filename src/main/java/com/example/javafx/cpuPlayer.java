package com.example.javafx;

import java.util.Random;

public class cpuPlayer {
    public static int cpuPlayerHand;

    static void makeHand(){
        cpuPlayerHand = new Random().nextInt(3);
    }
}
