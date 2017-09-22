package com.capgemini.se.week2.hotel;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class Guest extends Person {

    private final String creditCardNumber;

    public Guest(final String firstName, final String lastName, final String email, final String creditCardNumber) {
        super(firstName, lastName, email);
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }
}
