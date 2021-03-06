package com.example.javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JankenScreen {
    public void transitionScreen(String fxmlName, String fxmlTitle) {
        try {
            //FXMLからのシーングラフの読み込み
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlName));
            Parent root = loader.load();

            //シーングラフのルートノードを設定したシーンの作成
            Scene scene = new Scene(root, 700, 500);
            //ステージへのシーンの設定
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.setTitle(fxmlTitle);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
