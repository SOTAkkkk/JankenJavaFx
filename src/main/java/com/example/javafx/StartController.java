package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class StartController {

    @FXML
    public static Label Status;
    @FXML
    private Button CloseButton;
    @FXML
    private Button NextButton;
    @FXML
    private Button ReturnButton;




    @FXML
    void onCloseButtonAction(ActionEvent event) {
        CloseButton.getScene().getWindow().hide();          //画面を閉じる
    }
    @FXML
    void onNextButtonAction(ActionEvent event) {
        NextButton.getScene().getWindow().hide();           //画面を閉じる
        JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
        screen.transitionScreen("JankenScreen.fxml", visitorPlayer.name+"さんがログイン");   //画面を開く
    }
    @FXML
    void onReturnButtonAction(ActionEvent event) {
        ReturnButton.getScene().getWindow().hide();           //画面を閉じる
        JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
        screen.transitionScreen("Entrance.fxml", "ようこそ");   //画面を開く
    }

}