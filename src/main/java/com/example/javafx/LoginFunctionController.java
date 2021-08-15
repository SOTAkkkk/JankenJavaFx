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
    private Button loginButton;
    @FXML
    private Label status;
    @FXML
    private Button returnButton;

    @FXML
    void onButtonLoginAction(ActionEvent event) {
        if(IDtext.getText().equals("sota")&&PassWordtext.getText().equals("sota")) {
            status.setText(IDtext.getText() + "さんがログイン！！");
        }
        else{
            status.setText("ログイン失敗");
        }
    }
    @FXML
    void onButtonReturnAction(ActionEvent event) {
        returnButton.getScene().getWindow().hide();           //画面を閉じる
        JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
        screen.transitionScreen("Start.fxml", "画面1");   //画面を開く
    }
}
