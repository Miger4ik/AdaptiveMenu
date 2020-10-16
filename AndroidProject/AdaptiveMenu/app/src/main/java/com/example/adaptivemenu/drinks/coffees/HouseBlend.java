package com.example.adaptivemenu.drinks.coffees;

import com.example.adaptivemenu.drinks.Beverage;

public class HouseBlend extends Coffee {
    private double cost = 1.99;

    public HouseBlend() {
        this.description = "House Blend";
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
