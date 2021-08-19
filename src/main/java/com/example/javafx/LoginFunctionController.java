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

        int count=ConnectDB.DB_Count(IDtext.getText(),PassWordtext.getText());
        System.out.println("Login");
        if(count>=1) {
            visitorPlayer.name = IDtext.getText();
            visitorPlayer.password = PassWordtext.getText();
            StatusLabel.setText(visitorPlayer.name + "さんがログイン！！");
            LoginButton.getScene().getWindow().hide();           //画面を閉じる
            JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
            screen.transitionScreen("Start.fxml", visitorPlayer.name+"さんがログイン");   //画面を開く
        }
        else{
            StatusLabel.setText("IDかPassWordが間違っています");
        }
    }
    @FXML
    void onReturnButtonAction(ActionEvent event) {
        ReturnButton.getScene().getWindow().hide();           //画面を閉じる
        JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
        screen.transitionScreen("Entrance.fxml", "ようこそ");   //画面を開く
    }

}
