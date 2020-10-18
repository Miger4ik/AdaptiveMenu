package com.example.adaptivemenu.drinks.coffees;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Descriptions;
import com.example.adaptivemenu.drinks.PriceList;
import com.example.adaptivemenu.drinks.Size;

public class Decaf extends Beverage {
    public Decaf() {
        this.size = Size.MEDIUM;
    }

    public Decaf(Size size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return Descriptions.DECAF_DESCRIPTION;
    }

    @Override
    public double cost() {
        switch (this.size) {
            case SMALL:
                return PriceList.SMALL_DECAF_PRICE;
            case MEDIUM:
                return PriceList.MEDIUM_DECAF_PRICE;
            case LARGE:
                return PriceList.LARGE_DECAF_PRICE;
            default:
                return 0;
        }
    }
}
