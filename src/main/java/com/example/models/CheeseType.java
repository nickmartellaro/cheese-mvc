package com.example.models;

/**
 * Created by Nick Martellaro on 3/25/2017.
 */
public enum CheeseType {
    HARD ("Hard"),
    SOFT ("Soft"),
    FAKE ("Fake");

    private final String name;

    CheeseType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
