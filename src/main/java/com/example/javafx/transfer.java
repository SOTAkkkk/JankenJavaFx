package com.example.javafx;

public class transfer {
    public static String henkan(int hand) {

        switch (hand) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
        }
        return null;
    }
}
