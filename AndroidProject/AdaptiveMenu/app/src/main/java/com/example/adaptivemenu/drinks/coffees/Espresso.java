package com.example.adaptivemenu.drinks.coffees;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Descriptions;
import com.example.adaptivemenu.drinks.PriceList;
import com.example.adaptivemenu.drinks.Size;

public class Espresso extends Beverage {
    public Espresso() {
        this.size = Size.MEDIUM;
    }

    public Espresso(Size size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return Descriptions.ESPRESSO_DESCRIPTION;
    }

    @Override
    public double cost() {
        switch (this.size) {
            case SMALL:
                return PriceList.SMALL_ESPRESSO_PRICE;
            case MEDIUM:
                return PriceList.MEDIUM_ESPRESSO_PRICE;
            case LARGE:
                return PriceList.LARGE_ESPRESSO_PRICE;
            default:
                return 0;
        }
    }
}
