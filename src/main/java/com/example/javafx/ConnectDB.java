package com.example.javafx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectDB {

    public static void DB() {
        //DB接続用定数
        String DATABASE_NAME = "test_db";
        String URL = "jdbc:mySQL://localhost/" + DATABASE_NAME;
        //DB接続用・ユーザ定数
        String USER = "root";
        String PASS = "sota";

        PreparedStatement SendSQL = null;
        ResultSet GetData = null;


        try {
            //MySQL に接続する
            Class.forName("com.mysql.cj.jdbc.Driver");
            //データベースに接続
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            // データベースに対する処理
            System.out.println("データベースに接続に成功");

            // パラメータ付きSQL文をDBに送るためのオブジェクト生成
            String looksql = "SELECT * FROM test;";
            SendSQL = conn.prepareStatement(looksql);
            // SQL文の実行(データ取得)
            GetData = SendSQL.executeQuery();

            // データ取得したレコードの表示
            while (GetData.next()) {

                System.out.println(GetData.getString("id"));
            }
            String addsql = "insert into test(id,name,pass) values('2','sota','sota');";
            int num = conn.createStatement().executeUpdate(addsql);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}