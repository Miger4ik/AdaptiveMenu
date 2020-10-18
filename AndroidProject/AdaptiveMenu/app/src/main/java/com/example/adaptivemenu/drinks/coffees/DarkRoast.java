package com.example.adaptivemenu.drinks.coffees;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Descriptions;
import com.example.adaptivemenu.drinks.PriceList;
import com.example.adaptivemenu.drinks.Size;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.size = Size.MEDIUM;
    }

    public DarkRoast(Size size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return Descriptions.DARK_ROAST_DESCRIPTION;
    }

    @Override
    public double cost() {
        switch (this.size) {
            case SMALL:
                return PriceList.SMALL_DARK_ROAST_PRICE;
            case MEDIUM:
                return PriceList.MEDIUM_DARK_ROAST_PRICE;
            case LARGE:
                return PriceList.LARGE_DARK_ROAST_PRICE;
            default:
                return 0;
        }
    }
}
