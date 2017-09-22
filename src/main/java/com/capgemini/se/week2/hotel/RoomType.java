package com.capgemini.se.week2.hotel;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public enum RoomType {
    
    NORMAL(2, 1),
    DELUXE(2, 1),
    FAMILY(4, 3);
    
    private int capacity;
    private int beds;

    RoomType(final int capacity, final int beds) {
        this.capacity = capacity;
        this.beds = beds;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBeds() {
        return beds;
    }
}
