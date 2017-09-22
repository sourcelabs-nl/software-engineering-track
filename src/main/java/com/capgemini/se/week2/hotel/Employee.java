package com.capgemini.se.week2.hotel;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class Employee extends Person {
    
    private final long employeeNumber;

    public Employee(final String firstName, final String lastName, final String email, final long employeeNumber) {
        super(firstName, lastName, email);
        this.employeeNumber = employeeNumber;
    }

    public long getEmployeeNumber() {
        return employeeNumber;
    }
}
