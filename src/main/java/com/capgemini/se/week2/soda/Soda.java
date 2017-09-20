package com.capgemini.se.week2.soda;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class Soda extends Product {

    private int sugar;

    public Soda(double price, String name, int sugar) {
        super(price, name);
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }
}
