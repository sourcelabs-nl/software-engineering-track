package com.capgemini.se.week2.soda.se.boat;

import com.capgemini.se.boat.BoatTripException;
import com.capgemini.se.boat.BoatTripRepository;
import com.capgemini.se.boat.BoatTripService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

public class BoatTripServiceTest {

    private BoatTripService service;

    @Before
    public void before() {
        service = new BoatTripService(3, new BoatTripRepository());
    }

    @Test
    public void startBoatTrip() throws Exception {
        String boatTrip = service.startBoatTrip();
        Assert.assertNotNull(boatTrip);
        Assert.assertTrue(service.isBoatTripActive(boatTrip));
    }

    @Test(expected = BoatTripException.class)
    public void startExceedsNumberOfBoatsShouldThrowException() throws Exception {
        service.startBoatTrip();
        service.startBoatTrip();
        service.startBoatTrip();
        service.startBoatTrip();
    }

    @Test
    public void stopBoatTrip() throws Exception {
        String boatTrip = service.startBoatTrip();
        Assert.assertNotNull(boatTrip);
        service.stopBoatTrip(boatTrip);
        Assert.assertFalse(service.isBoatTripActive(boatTrip));
    }

    @Test(expected = BoatTripException.class)
    public void stopNotExistingBoatTripShouldThrowException() throws Exception {
        service.stopBoatTrip(UUID.randomUUID().toString());
    }

    @Test
    public void getDurationInSeconds() throws Exception {
        String boatTrip = service.startBoatTrip();
        Assert.assertTrue(service.getDurationInSeconds(boatTrip) >= 0);
    }

    @Test(expected = BoatTripException.class)
    public void getNonExistingBoatTripDurationInSecondsShouldThrowException() throws Exception {
        service.getDurationInSeconds(UUID.randomUUID().toString());
    }

    @Test
    public void getTripsFromToday() throws Exception {
        service.startBoatTrip();
        service.startBoatTrip();
        Assert.assertEquals(2, service.getTripsFromToday().size());
    }

}