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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Product product = (Product) o;

        if (name != null ? !name.equals(product.name) : product.name != null)
            return false;

        return true;
    }
}
