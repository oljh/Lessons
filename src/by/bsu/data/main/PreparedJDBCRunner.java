package by.bsu.data.main;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import by.bsu.data.connect.DataBaseHelper;

public class PreparedJDBCRunner {
    public static void main(String[] args) {
        ArrayList<Abonent> list = new ArrayList<Abonent>() {
            {
                add(new Abonent(87, 1658468, "Кожух Дмитрий"));
                add(new Abonent(51, 8866711, "Буйкевич Александр"));
            }
        };
        DataBaseHelper helper = null;
        PreparedStatement statement= null;
        try{
            helper = new DataBaseHelper();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            helper.closeStatement(statement);
        }
    }
}
