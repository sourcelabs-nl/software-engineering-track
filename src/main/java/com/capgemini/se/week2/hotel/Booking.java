package com.capgemini.se.week2.hotel;

import java.time.LocalDate;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class Booking {

    private final Guest guest;
    private final HotelRoom hotelRoom;
    private final LocalDate startDate;
    private final LocalDate endDate;

    public Booking(final Guest guest, final HotelRoom hotelRoom, final LocalDate startDate, final LocalDate endDate) {
        this.guest = guest;
        this.hotelRoom = hotelRoom;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
