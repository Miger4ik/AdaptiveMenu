package com.example.adaptivemenu.drinks.condiments;

import com.example.adaptivemenu.drinks.Beverage;

public class Soy extends CondimentDecorator {

    public Soy() {
        this.description = "Soy";
    }

    public Soy(Beverage beverage) {
        this.description = "Soy";
        this.beverage = beverage;
    }

    public Soy(Beverage beverage, double cost) {
        this.description = "Soy";
        this.beverage = beverage;
        this.smallCost = cost;
        this.mediumCost = cost;
        this.largeCost = cost;
    }

    public Soy(Beverage beverage, double smallCost, double mediumCost, double largeCost) {
        this.description = "Soy";
        this.beverage = beverage;
        this.smallCost = smallCost;
        this.mediumCost = mediumCost;
        this.largeCost = largeCost;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", " + this.description;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        switch (this.beverage.getSize()) {
            case SMALL: {
                cost += smallCost;
                break;
            }

            case MEDIUM: {
                cost += mediumCost;
                break;
            }

            case LARGE: {
                cost += largeCost;
                break;
            }
        }

        return cost;
    }
}
