package com.example.javafx;

import com.sun.javafx.collections.ElementObservableListDecorator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConnectDB {

    public static String name;
    public static String password;
    public static int maxwin;

    //DB接続用定数
    static String DATABASE_NAME = "test_db";
    static String URL = "jdbc:mySQL://localhost/" + DATABASE_NAME;
    //DB接続用・ユーザ定数
    static String USER = "root";
    static String PASS = "sota";

    public static void DB_ref() {

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
                System.out.println(GetData.getString("NAME"));
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void DB_Signin() {

        try {
            //MySQL に接続する
            Class.forName("com.mysql.cj.jdbc.Driver");
            //データベースに接続
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            // データベースに対する処理
            System.out.println("データベースに接続に成功");

                        // パラメータ付きSQL文をDBに送るためのオブジェクト生成
            //String Signinsql = "insert into test values(name,password,maxwin);";
            //conn.createStatement().execute(Signinsql);

            String Signsql = "INSERT INTO test (NAME,PASSWORD,MAXWIN) VALUES(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(Signsql);
            stmt.setString(1,name);
            stmt.setString(2,password);
            stmt.setInt(3,maxwin);
            int num = stmt.executeUpdate();


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static int DB_Exists(String tmp_name, String tmp_pass) {//存在したら1を返す
        ResultSet st ;
        int count=0;
        try {
            //MySQL に接続する
            Class.forName("com.mysql.cj.jdbc.Driver");
            //データベースに接続
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            // データベースに対する処理
            System.out.println("データベースに接続に成功");

            // パラメータ付きSQL文をDBに送るためのオブジェクト生成
            //String Signinsql = "insert into test values(name,password,maxwin);";
            //conn.createStatement().execute(Signinsql);

            String Existssql = "(SELECT COUNT(*) FROM test WHERE NAME = ? AND PASSWORD = ?) ";
            //String Existssql = "SELECT EXISTS(SELECT 1 FROM test WHERE NAME = ?);";
            PreparedStatement stmt = conn.prepareStatement(Existssql);
            stmt.setString(1,tmp_name);
            stmt.setString(2,tmp_pass);
            st=stmt.executeQuery();
            while(st.next())
                count=st.getInt(1);

            System.out.println("ConnectDB"+st);
            System.out.println(count);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }
}