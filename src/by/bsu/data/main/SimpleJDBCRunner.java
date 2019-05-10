package by.bsu.data.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SimpleJDBCRunner {
    public static void main (String [] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/testphones";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "pass");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        Connection cn = null;
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try{// 1 блок
            cn = DriverManager.getConnection(url, prop);
            Statement st = null;

        }catch(SQLException e){

        };
    }
}
