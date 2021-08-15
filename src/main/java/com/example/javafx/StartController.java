package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StartController {

    @FXML
    private Button closeButton;
    @FXML
    private Button nextButton;
    @FXML
    private Button loginButton;

    @FXML
    void onButtonCloseAction(ActionEvent event) {
        closeButton.getScene().getWindow().hide();          //画面を閉じる
    }
    @FXML
    void onButtonNextAction(ActionEvent event) {
        nextButton.getScene().getWindow().hide();           //画面を閉じる
        JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
        screen.transitionScreen("JankenScreen.fxml", "画面2");   //画面を開く
    }

    @FXML
    void onButtonLoginAction(ActionEvent event){
        loginButton.getScene().getWindow().hide();
        JankenScreen screen = new JankenScreen();
        screen.transitionScreen("LoginFunction.fxml","login画面");
    }

}