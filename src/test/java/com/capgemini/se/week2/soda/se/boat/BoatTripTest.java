package com.capgemini.se.week2.soda.se.boat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoatTripTest {

    private BoatTrip boatTrip;

    @Before
    public void before() {
        boatTrip = new BoatTrip();
    }

    @Test
    public void start() throws Exception {
        String start = boatTrip.start();
        Assert.assertNotNull(start);
        Assert.assertTrue(boatTrip.isActive());
    }

    @Test(expected = BoatTripException.class)
    public void startTwiceShouldThrowException() throws Exception {
        boatTrip.start();
        boatTrip.start(); // should fail
    }

    @Test(expected = BoatTripException.class)
    public void startWhenStoppedShouldThrowException() throws Exception {
        boatTrip.start();
        boatTrip.stop();
        boatTrip.start();
    }

    @Test
    public void stop() throws Exception {
        boatTrip.start();
        Thread.sleep(1);
        boatTrip.stop();
        Assert.assertFalse(boatTrip.isActive());
        Assert.assertNotEquals(0L, boatTrip.getDuration().getNano());
    }

    @Test(expected = BoatTripException.class)
    public void stopTwiceShouldThrowException() throws Exception {
        boatTrip.start();
        boatTrip.stop();
        boatTrip.stop();
    }

    @Test(expected = BoatTripException.class)
    public void stopWhenNotStartedShouldThrowException() throws Exception {
        boatTrip.stop();
    }
}