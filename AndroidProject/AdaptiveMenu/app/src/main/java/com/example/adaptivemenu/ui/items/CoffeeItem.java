package com.example.adaptivemenu.ui.items;

public class CoffeeItem {

    private int imageResource;
    private String title;
    private int weight;
    private double price;

    public CoffeeItem(int imageResource, String title, int weight, double price) {
        this.imageResource = imageResource;
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
