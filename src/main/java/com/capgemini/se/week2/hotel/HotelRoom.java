package com.capgemini.se.week2.hotel;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class HotelRoom {
    
    private final int roomNumber;
    private final RoomType roomType;

    public HotelRoom(final int roomNumber, final RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
