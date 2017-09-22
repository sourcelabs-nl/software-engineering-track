package com.capgemini.se.week2.hotel;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public abstract class Person {
    
    private final String firstName;
    private final String lastName;
    private final String email;

    public Person(final String firstName, final String lastName, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
