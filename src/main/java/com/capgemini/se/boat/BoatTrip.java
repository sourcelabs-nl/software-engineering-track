package com.capgemini.se.boat;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Represents a bookable boat trip. The boat trip maintains the trip duration and ticket generation.
 */
public class BoatTrip {

    private LocalDateTime startTime, endTime;
    private String boatTripId;
    private static final AtomicInteger boatIdGenerator = new AtomicInteger();

    public BoatTrip() {
        boatTripId = String.valueOf(boatIdGenerator.incrementAndGet());
    }

    public String start() {
        if (startTime != null) {
            throw new BoatTripException("Cannot start BoatTrip, already started!");
        }
        startTime = LocalDateTime.now();
        return boatTripId;
    }

    public void stop() {
        if (startTime == null) {
            throw new BoatTripException("Cannot stop BoatTrip, not started yet!");
        }
        if (endTime != null) {
            throw new BoatTripException("Cannot stop BoatTrip, already completed!");
        }
        endTime = LocalDateTime.now();
    }

    public Duration getDuration() {
        if (endTime == null) {
            return Duration.between(startTime, LocalDateTime.now());
        }
        return Duration.between(startTime, endTime);
    }

    public boolean isActive() {
        return startTime != null && endTime == null;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getBoatTripId() {
        return boatTripId;
    }
}
