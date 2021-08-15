package com.example.javafx;

public class judge {
    public static String hantei(int handA,int handB){

        int tmp = (handA - handB + 3) % 3;
        if (handA == handB) {
            return "あいこ";
        } else if (tmp == 2) {
            return "勝ち";
        } else {
            return "負け";
        }
    }
}
