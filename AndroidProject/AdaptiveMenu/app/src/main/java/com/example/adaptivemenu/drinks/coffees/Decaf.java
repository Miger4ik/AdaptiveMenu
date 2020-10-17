package com.example.adaptivemenu.drinks.coffees;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Size;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Dark Roast";
    }

    public Decaf(double cost) {
        this.description = "Dark Roast";
        this.smallCost = cost;
        this.mediumCost = cost;
        this.largeCost = cost;
    }

    public Decaf(double smallCost, double mediumCost, double largeCost) {
        this.description = "Dark Roast";
        this.smallCost = smallCost;
        this.mediumCost = mediumCost;
        this.largeCost = largeCost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        switch (this.size) {
            case SMALL:
                return smallCost;
            case MEDIUM:
                return mediumCost;
            case LARGE:
                return largeCost;
            default:
                return 0;
        }
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }
}
