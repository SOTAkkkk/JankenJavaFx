package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class StartApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //hello-view.fxmlの読み込み
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("Entrance.fxml"));
        //Sceneの作成・登録
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("ようこそ!");
        stage.setScene(scene);
        //表示
        stage.show();
        ConnectDB.DB();
    }

    public static void main(String[] args) {
        launch();
    }   //javaFXアプリの起動
}