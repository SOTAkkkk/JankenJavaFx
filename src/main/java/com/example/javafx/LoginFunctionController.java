package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginFunctionController {

    @FXML
    private TextField IDtext;
    @FXML
    private PasswordField PassWordtext;
    @FXML
    private Button LoginButton;
    @FXML
    private Label StatusLabel;
    @FXML
    private Button ReturnButton;

    @FXML
    void onLoginButtonAction(ActionEvent event) {

        if(IDtext.getText().equals("sota")&&PassWordtext.getText().equals("sota")) {
            StatusLabel.setText(IDtext.getText() + "さんがログイン！！");
            LoginButton.getScene().getWindow().hide();           //画面を閉じる
            JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
            screen.transitionScreen("Start.fxml", "さんがログイン");   //画面を開く
        }
        else{
            StatusLabel.setText("IDかPassWordが間違っています");
        }
    }
    @FXML
    void onReturnButtonAction(ActionEvent event) {
        ReturnButton.getScene().getWindow().hide();           //画面を閉じる
        JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
        screen.transitionScreen("Start.fxml", "画面1");   //画面を開く
    }

}
