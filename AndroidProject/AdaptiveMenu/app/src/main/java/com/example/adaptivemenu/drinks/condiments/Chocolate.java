package com.example.adaptivemenu.drinks.condiments;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Size;

public class Chocolate extends CondimentDecorator {

    public Chocolate() {
        this.description = "Chocolate";
    }

    public Chocolate(Beverage beverage) {
        this.description = "Chocolate";
        this.beverage = beverage;
    }

    public Chocolate(Beverage beverage, double cost) {
        this.description = "Chocolate";
        this.beverage = beverage;
        this.smallCost = cost;
        this.mediumCost = cost;
        this.largeCost = cost;
    }

    public Chocolate(Beverage beverage, double smallCost, double mediumCost, double largeCost) {
        this.description = "Chocolate";
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

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
