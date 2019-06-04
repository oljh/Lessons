package by.bsu.data.main;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class SimpleJDBCRunner {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/testphones";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "pass");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        Connection cn = null;
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try {// 1 блок
            cn = DriverManager.getConnection(url, prop);
            Statement st = null;
            try {// блок 2
                st = cn.createStatement();
                Resultset rs = null;
                try {// блок 3
                    rs = st.executeQuery("SELECT * FROM phonebook");
                    ArrayList<Abonent> lst = new ArrayList<>();
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        int phone = rs.getInt(3);
                        String name = rs.getString(2);
                        lst.add(new Abonent(id, phone, name));
                    }
                    if (lst.size() > 0) {
                        System.out.println(lst);
                    } else {
                        System.out.println("Not found");
                    }
                } finally {//для 3-го блока try
/*
                 закрыть Statment, если он был открыт или ошибка
                 произошла во время создания Statment
*/              if(rs !=null){//был ли создан ResultSet
                    rs.close();

                    } else {
                    System.out.println("ошибка во время чтения из БД");
                    }

                }

            } finally {
                /*закрыть Statment, если он был открыт или ошибка
                произощла во время создания Statment*/
                if (st != null) { //для 2 го блока try
                    st.close();
                }else {
                    System.out.println("Statment не создан");
                }
            }

        } catch (SQLException e) { //для 1-го блока try
            System.out.println("DB connection error" + e);
            // вывод сообщения о всех SQLException

    }finally {
            /*
            * закрыть Connection, если от был открыт
            * */
            if (cn !=null){
                try{
                    cn.close();
                }catch (SQLException e){
                    System.out.println("connection close error:" +e);
                }
            }
        }
        }
}
