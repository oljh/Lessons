package com.epam.logic;

import com.mysql.cj.Query;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class SingletonEngine {
    private Connection connectionTo;
    private Connection connectionFrom;
    private static SingletonEngine instance = null;

    public synchronized static SingletonEngine getInstance() {
        if (instance == null) {
            instance = new SingletonEngine();
            instance.getConnectionTo();
            instance.getConnectionFrom();
        }
        return instance;
    }

    private Connection getConnectionFrom() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connectionFrom = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testFrom", "root", "pass");
            connectionFrom.setAutoCommit(false);


        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found...");
        } catch (SQLException e) {
            System.err.println("SQLExeption: " + e.getMessage() + "SQLState: " + e.getSQLState());
        }
        return connectionFrom;
    }

    private Connection getConnectionTo() {
        final String connectToAdress = "jdbc:mysql://10.162.4.151:3306/testTo";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connectionTo = DriverManager.getConnection(connectToAdress, "root", "pass");
            connectionTo.setAutoCommit(false);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found...");
        } catch (SQLException e) {
            System.err.println("SQLExeption: " + e.getMessage() + "SQLState: " + e.getSQLState());
        }
        return connectionTo;
    }

    public void transfer(String summa) throws SQLException {
        Statement stFrom = null;
        Statement stTo = null;
        try {
            int sum = Integer.parseInt(summa);
            if (sum <= 0) {
                throw new NumberFormatException("less or equals zero");
            }
            stFrom = connectionFrom.createStatement();
            stTo = connectionTo.createStatement();
            // Транзакция из 4 запросов
            ResultSet rsFrom = stFrom.executeQuery("SELECT balance from table_to");
            ResultSet rsTo = stTo.executeQuery("SELECT balance from table_from");
            int accountFrom = 0;
            while (rsFrom.next()) {
                accountFrom = rsFrom.getInt(1);
            }
            int resultFrom = 0;
            if (accountFrom >= sum) {
                resultFrom = accountFrom - sum;
            } else {
                throw new SQLException("Invalid balannce");
            }
            int accountTo = 0;
            while (rsTo.next()) {
                accountFrom = rsTo.getInt(1);
            }
            int resultTo = accountTo + sum;
            stFrom.executeUpdate("UPDATE table_from set balance=" + resultFrom);
            stTo.executeUpdate("UPDATE table_to SET balance = " + resultTo);
            //завершение транзакции
            connectionFrom.commit();
            connectionTo.commit();
            System.out.println("remaining on :" + resultFrom + " rub");
        } catch (SQLException e) {
            System.out.println("SQLState: " + e.getSQLState() + "Error Message: " + e.getMessage());
            //откат транзакций при ошибке
            connectionFrom.rollback();
            connectionTo.rollback();
        } catch (NumberFormatException e) {
            System.out.println("Invalid summa: " + summa);
        } finally {
            if (stFrom != null) {
                try {
                    stFrom.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stTo != null) {
                try {
                    stTo.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
