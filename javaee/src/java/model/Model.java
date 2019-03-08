package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Model {
    public Statement getStmt() {
        Connection conn=null;
        Statement stmt=null;
    try {
            //load driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=Asia/Singapore", "root", "mypwd@kkm123");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "mypwd@kkm123");
            // Create an instance of the Statement object
            stmt = conn.createStatement();
            // Create an SQL query
            
        } catch (Exception e) {
            System.out.println("Berlaku error");      
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return stmt;
    }
}
