package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SigninFunctionController {

    @FXML
    private TextField IDtext;
    @FXML
    private PasswordField PassWordtext;
    @FXML
    private Button SigninButton;
    @FXML
    private Label StatusLabel;
    @FXML
    private Button ReturnButton;

    @FXML
    void onSigninButtonAction(ActionEvent event) {

        if(IDtext.getText().isEmpty()||PassWordtext.getText().isEmpty()) {
            StatusLabel.setText("IDかPassWordが間違っています");
        }
        else if(ConnectDB.DB_Exists(IDtext.getText())>=1){
            StatusLabel.setText("同じIDが使用されています");
        }
        else{
            visitorPlayer.name = IDtext.getText();
            visitorPlayer.password = PassWordtext.getText();
            //DBにIDとPass追加
            ConnectDB.DB_Signin();

            StatusLabel.setText(IDtext.getText() + "さんがログイン！！");
            SigninButton.getScene().getWindow().hide();           //画面を閉じる
            JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
            screen.transitionScreen("Start.fxml", visitorPlayer.name+"さんがログイン");   //画面を開く

        }
    }
    @FXML
    void onReturnButtonAction(ActionEvent event) {
        ReturnButton.getScene().getWindow().hide();           //画面を閉じる
        JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
        screen.transitionScreen("Entrance.fxml", "ようこそ");   //画面を開く
    }

}
