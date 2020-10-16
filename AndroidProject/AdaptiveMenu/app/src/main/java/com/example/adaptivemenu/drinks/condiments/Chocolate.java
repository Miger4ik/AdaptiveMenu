package com.example.adaptivemenu.drinks.condiments;

import com.example.adaptivemenu.drinks.Beverage;

public class Chocolate extends CondimentDecorator {
    private Beverage beverage;
    private double cost = 0.99;

    public Chocolate() {
        this.description = "Mocha";
    }

    public Chocolate(Beverage beverage) {
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
