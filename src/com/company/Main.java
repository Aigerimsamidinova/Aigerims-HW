package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       Aigerim aigerim = new Aigerim();

        hw43 hw43=new hw43();
        ArrayList<City> listCity1= new ArrayList<>();
        listCity1.add(new City(1, "Bishkek"));
        listCity1.add(new City(2, "Osh"));
        listCity1.add(new City(3, "Berlin"));
        for (City c: listCity1) {
            System.out.println(hw43.insertCity(c));
        }

         ArrayList<City> listCity2=new ArrayList<>();
        listCity2.add(new City ( 1,"Osh"));
        listCity2.add(new City (2,"Kant"));
        listCity2.add( new City(4,"Talas" ));
        listCity2.add( new City(5,"Tokmok"));
        for (City c: listCity2) {
            hw43.addToCity(c);
        }

        for (int i = 0; i <listCity1.size(); i++) {
            if (listCity1.get(i)==listCity2.get(i)){
                hw43.addToCity(listCity2.get(i));
            }


        }

    }
}

