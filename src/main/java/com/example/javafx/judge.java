package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class judge {

    public static String hantei(int handA,int handB){

        int tmp = (handA - handB + 3) % 3;
        if (handA == handB) {
            visitorPlayer.nowwin=0;
            ConnectDB.DB_Reflesh();
            return "あいこ";
        } else if (tmp == 2) {
            visitorPlayer.nowwin++;
            visitorPlayer.maxwin=Math.max(visitorPlayer.maxwin,visitorPlayer.nowwin);
            ConnectDB.DB_Reflesh();
            return "勝ち";
        } else {
            visitorPlayer.nowwin=0;
            ConnectDB.DB_Reflesh();
            return "負け";
        }
    }
}
