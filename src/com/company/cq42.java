package com.company;

import java.sql.*;

/*public class cq42 {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "11111";

    public boolean insertHuman(Human human) {
        String SQL = "insert into humans (id,name) " +
                "values (" + human.id + ", '" + human.name + "')";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(SQL);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

        public boolean insertCountry (Country country){
            String SQL = "insert into countries (id,name) values (?,?);";

            try (Connection conn = connect();
                 PreparedStatement stmt = conn.prepareStatement(SQL)
            ) {
                stmt.setInt(1, country.id);
                stmt.setString(2, country.name);
                stmt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
            return true;
        }
    public boolean insertCity (Country country){
        String SQL = "insert into citie  (id,name, country, human) values (?,?,?,?);";

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)
        ) {
            stmt.setInt(1, country.id);
            stmt.setString(2, country.name);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}

class Human {
    int id;
    String name;

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Country {
    int id;
    String name;

    public Country(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class City{
    Country country;
    Human human;
    int id;
    String name;

    public City(Country country, Human human, int id, String name) {
        this.country = country;
        this.human = human;
        this.id = id;
        this.name = name;
    }
}*/