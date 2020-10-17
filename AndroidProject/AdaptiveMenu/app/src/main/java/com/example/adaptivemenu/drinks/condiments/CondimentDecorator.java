package com.example.adaptivemenu.drinks.condiments;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Size;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();

    @Override
    public double cost() {
        switch (this.getSize()) {
            case SMALL:
                return this.smallCost;
            case MEDIUM:
                return this.mediumCost;
            case LARGE:
                return this.largeCost;
            default:
                return 0;
        }
    }

    @Override
    public Size getSize() {
        return this.beverage.getSize();
    }
}
