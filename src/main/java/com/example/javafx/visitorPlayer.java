package com.example.javafx;

import java.util.Scanner;

public class visitorPlayer {
    public static int visitorPlayerHand;

    static void makeHand(int a){
        visitorPlayerHand = a;
        System.out.println("あなたの手は"+transfer.henkan(visitorPlayerHand)+"です");
    }
}
