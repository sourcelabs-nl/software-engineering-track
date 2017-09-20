package com.capgemini;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class Stock {

    private int quantity;
    private Product product;

    public Stock(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}
