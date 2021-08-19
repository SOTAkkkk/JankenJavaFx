package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StartController {

    @FXML
    private Button CloseButton;
    @FXML
    private Button NextButton;

    @FXML
    void onCloseButtonAction(ActionEvent event) {
        CloseButton.getScene().getWindow().hide();          //画面を閉じる
    }
    @FXML
    void onNextButtonAction(ActionEvent event) {
        NextButton.getScene().getWindow().hide();           //画面を閉じる
        JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
        screen.transitionScreen("JankenScreen.fxml", "画面2");   //画面を開く
    }

}