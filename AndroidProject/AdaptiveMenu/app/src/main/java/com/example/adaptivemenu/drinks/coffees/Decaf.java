package com.example.adaptivemenu.drinks.coffees;

import com.example.adaptivemenu.drinks.Beverage;

public class Decaf extends Coffee {
    private double cost = 1.99;

    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return cost;
    }
}
