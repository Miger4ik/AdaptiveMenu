package com.example.adaptivemenu.drinks.coffees;

import com.example.adaptivemenu.drinks.Beverage;

public class DarkRoast extends Coffee {
    private double cost = 1.99;

    public DarkRoast() {
        this.description = "Dark Roast";
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
