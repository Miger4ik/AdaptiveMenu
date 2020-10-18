package com.example.adaptivemenu.drinks.condiments;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Descriptions;
import com.example.adaptivemenu.drinks.PriceList;
import com.example.adaptivemenu.drinks.Size;

public class Chocolate extends CondimentDecorator {

    public Chocolate() {
    }

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", " + Descriptions.CHOCOLATE_DESCRIPTION;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        switch (this.beverage.getSize()) {
            case SMALL: {
                cost += PriceList.SMALL_CHOCOLATE_PRICE;
                break;
            }

            case MEDIUM: {
                cost += PriceList.MEDIUM_CHOCOLATE_PRICE;
                break;
            }

            case LARGE: {
                cost += PriceList.LARGE_CHOCOLATE_PRICE;
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
