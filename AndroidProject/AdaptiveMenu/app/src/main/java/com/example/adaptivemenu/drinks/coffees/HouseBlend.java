package com.example.adaptivemenu.drinks.coffees;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Descriptions;
import com.example.adaptivemenu.drinks.PriceList;
import com.example.adaptivemenu.drinks.Size;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.size = Size.MEDIUM;
    }

    public HouseBlend(Size size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return Descriptions.HOUSE_BLEND_DESCRIPTION;
    }

    @Override
    public double cost() {
        switch (this.size) {
            case SMALL:
                return PriceList.SMALL_HOUSE_BLEND_PRICE;
            case MEDIUM:
                return PriceList.MEDIUM_HOUSE_BLEND_PRICE;
            case LARGE:
                return PriceList.LARGE_HOUSE_BLEND_PRICE;
            default:
                return 0;
        }
    }
}
