package com.example.models;

import java.util.ArrayList;

/**
 * Created by Nick Martellaro on 3/22/2017.
 */
public class CheeseData {

    static ArrayList<Cheese> cheeses = new ArrayList<>();

    // getAll
    public static ArrayList<Cheese> getAll() {
        return cheeses;
    }

    // add
    public static void add(Cheese newCheese) {
        cheeses.add(newCheese);
    }

    //remove
    public static void remove(int id) {
        Cheese  cheeseToRemove = getById(id);
        cheeses.remove(cheeseToRemove);
    }

    //getId
    public static Cheese getById(int id) {
        Cheese theCheese = null;

        for (Cheese candidateCheese : cheeses){
            if (candidateCheese.getCheeseId() == id) {
                theCheese = candidateCheese;
            }
        }

        return theCheese;
    }
}
