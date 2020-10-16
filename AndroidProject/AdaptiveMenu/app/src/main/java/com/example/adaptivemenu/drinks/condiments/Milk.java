package com.example.adaptivemenu.drinks.condiments;

import com.example.adaptivemenu.drinks.Beverage;

public class Milk extends CondimentDecorator {
    private Beverage beverage;
    private double cost = 0.99;

    public Milk() {
        this.description = "Milk";
    }

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", " + this.description;
    }

    @Override
    public double cost() {
        return cost + this.beverage.cost();
    }
}
