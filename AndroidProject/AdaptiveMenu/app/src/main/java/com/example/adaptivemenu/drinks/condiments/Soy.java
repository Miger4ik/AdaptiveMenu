package com.example.adaptivemenu.drinks.condiments;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Descriptions;
import com.example.adaptivemenu.drinks.PriceList;

public class Soy extends CondimentDecorator {

    public Soy() {
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", " + Descriptions.SOY_DESCRIPTION;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        switch (this.beverage.getSize()) {
            case SMALL: {
                cost += PriceList.SMALL_SOY_PRICE;
                break;
            }

            case MEDIUM: {
                cost += PriceList.MEDIUM_SOY_PRICE;
                break;
            }

            case LARGE: {
                cost += PriceList.LARGE_SOY_PRICE;
                break;
            }
        }

        return cost;
    }
}
