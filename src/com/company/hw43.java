package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class hw43 {
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

    public boolean insertCity(City city) {
        String SQL = "insert into city1 (id,name) values (?,?);";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)
        ) {
                stmt.setInt(1, city.id);
                stmt.setString(2, city.name);
                stmt.executeUpdate();
            }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public  boolean addToCity (City city){
        String SQL = "insert into city1  (id,name) values (?,?);";

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)
        ) {
            stmt.setInt(1, city.id);
            stmt.setString(2, city.name);
            stmt.executeUpdate();
            if (city.id == city.id){
                String SQL1 = "Update Town set id"+ city.id+1+"Where id = 1;";
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
}

class City {
    int id;
    String name;

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}