package com.capgemini.se.week2.soda;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class Chips extends Product {

    private int calories;

    public Chips(double price, String name, int calories) {
        super(price, name);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }
}
