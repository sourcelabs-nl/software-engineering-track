package com.capgemini.se.week2.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jarno Walgemoed (Sourcelabs.nl)
 */
public class Hotel {

    private final List<HotelRoom> hotelRooms = new ArrayList<>();
    private final List<Booking> bookings = new ArrayList<>();

    public List<HotelRoom> getHotelRooms() {
        return hotelRooms;
    }

    public List<HotelRoom> findAvailableRooms(final LocalDate start, final LocalDate end) {
        // .. implement
        return new ArrayList<HotelRoom>();
    }

    public List<Booking> findAllBookings() {
        return bookings;
    }

    public List<Booking> findBookings(final LocalDate localDate) {
        // .. implement
        return new ArrayList<Booking>();
    }

    public void bookRoom(final Guest guest, final HotelRoom hotelRoom, final LocalDate start, final LocalDate end) {
        final Booking booking = new Booking(guest, hotelRoom, start, end);
        bookings.add(booking);
    }
}
