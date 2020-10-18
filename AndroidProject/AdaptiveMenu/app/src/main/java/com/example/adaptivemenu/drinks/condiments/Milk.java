package com.example.adaptivemenu.drinks.condiments;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Descriptions;
import com.example.adaptivemenu.drinks.PriceList;

public class Milk extends CondimentDecorator {

    public Milk() {
    }

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", " + Descriptions.MILK_DESCRIPTION;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        switch (this.beverage.getSize()) {
            case SMALL: {
                cost += PriceList.SMALL_MILK_PRICE;
                break;
            }

            case MEDIUM: {
                cost += PriceList.MEDIUM_MILK_PRICE;
                break;
            }

            case LARGE: {
                cost += PriceList.LARGE_MILK_PRICE;
                break;
            }
        }

        return cost;
    }
}
