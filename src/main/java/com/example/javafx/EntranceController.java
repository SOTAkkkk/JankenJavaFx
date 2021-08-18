package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EntranceController {

    @FXML
    private Button LoginButton;
    @FXML
    void onLoginButtonAction(ActionEvent event) {
        LoginButton.getScene().getWindow().hide();           //画面を閉じる
        JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
        screen.transitionScreen("LoginFunction.fxml", "ログイン画面");   //画面を開く
    }

}
