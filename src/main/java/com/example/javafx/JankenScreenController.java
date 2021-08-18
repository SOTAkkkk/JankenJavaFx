package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class JankenScreenController {

    @FXML
    private TextField IDtext;
    @FXML
    private Button closeButton;
    @FXML
    private Button returnButton;
    @FXML
    private Label kekkaText;
    @FXML
    private Label visitorText;
    @FXML
    private Label cpuText;

    @FXML
    private Label status;

    @FXML
    private Button guButton;

    @FXML
    private Button tyokiButton;

    @FXML
    private Button paButton;

    @FXML
    void main(){
        status.setText(IDtext.getText() + "さんがログイン！！");
    }
    @FXML
    void onButtonCloseAction(ActionEvent event) {
        closeButton.getScene().getWindow().hide();          //画面を閉じる
    }
    @FXML
    void onButtonReturnAction(ActionEvent event) {
        returnButton.getScene().getWindow().hide();           //画面を閉じる
        JankenScreen screen = new JankenScreen();                       //画面を開く(メソッド呼び出し)の準備
        screen.transitionScreen("Start.fxml", "画面1");   //画面を開く
    }
    @FXML
    void onButtonGuAction(ActionEvent event) {

        visitorPlayer.makeHand(0);
        cpuPlayer.makeHand();
        this.visitorText.setText("あなたの手は"+transfer.henkan(visitorPlayer.visitorPlayerHand)+"です");
        this.cpuText.setText("cpuの手は"+transfer.henkan(cpuPlayer.cpuPlayerHand)+"です");
        this.kekkaText.setText(judge.hantei(visitorPlayer.visitorPlayerHand,cpuPlayer.cpuPlayerHand));
    }
    @FXML
    void onButtonTyokiAction(ActionEvent event) {
        visitorPlayer.makeHand(1);
        cpuPlayer.makeHand();
        this.visitorText.setText("あなたの手は"+transfer.henkan(visitorPlayer.visitorPlayerHand)+"です");
        this.cpuText.setText("cpuの手は"+transfer.henkan(cpuPlayer.cpuPlayerHand)+"です");
        this.kekkaText.setText(judge.hantei(visitorPlayer.visitorPlayerHand,cpuPlayer.cpuPlayerHand));
    }
    @FXML
    void onButtonPaAction(ActionEvent event) {
        visitorPlayer.makeHand(2);
        cpuPlayer.makeHand();
        this.visitorText.setText("あなたの手は"+transfer.henkan(visitorPlayer.visitorPlayerHand)+"です");
        this.cpuText.setText("cpuの手は"+transfer.henkan(cpuPlayer.cpuPlayerHand)+"です");
        this.kekkaText.setText(judge.hantei(visitorPlayer.visitorPlayerHand,cpuPlayer.cpuPlayerHand));
    }
}
