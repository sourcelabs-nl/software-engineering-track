package com.capgemini.se.week2.soda;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public abstract class Product {
    
    private double price;
    private String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
