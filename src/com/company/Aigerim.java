package com.company;

import java.sql.*;

public class Aigerim {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "11111";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }



    public int getTrainersInfo() {
        String SQL = "select t.full_name from trainers  t";
        String count = "";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                count = (rs.getString("full_name"));
                if (count.contains(" ")) {
                    count = count.substring(0, count.indexOf(" "));
                    if (count.length() > 3) {
                        System.out.println(rs.getString("full_name") + " " + " Молодец!");
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public int getTrainers() {
        String SQL = "select t.full_name, s.s_salary from trainers t join sport_types s on t.sport_id=s.sport_id";
        int count = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next())
                System.out.println(rs.getString("full_name") + "   " + rs.getString("s_salary"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public int getSumm() {
        String SQL = "SELECT SUM(s_salary) FROM sport_types";
        int count = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next())
                System.out.println("Итоговая заработная плата тренеров: " + rs.getInt("sum"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }
}
