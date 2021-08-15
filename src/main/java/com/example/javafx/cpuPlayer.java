package com.example.javafx;

import java.util.Random;

public class cpuPlayer {
    public static int cpuPlayerHand;

    static void makeHand(){
        Random rand = new Random(); //cpuの手作成
        cpuPlayerHand = rand.nextInt(3);
        System.out.println("cpuの手は"+transfer.henkan(cpuPlayerHand)+"です");

    }
}
