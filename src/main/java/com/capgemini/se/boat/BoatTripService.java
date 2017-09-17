package com.capgemini.se.boat;

import java.time.LocalDate;
import java.util.List;

public class BoatTripService {

    private BoatTripRepository repository;
    private long numberOfBoats = 10;

    public BoatTripService(long numberOfBoats, BoatTripRepository repository) {
        this.numberOfBoats = numberOfBoats;
        this.repository = repository;
    }

    public String startBoatTrip() {
        if(!hasBoatsAvailable() ) {
            throw new BoatTripException("No more boats available!");
        }
        BoatTrip bt = new BoatTrip();
        bt.start();
        repository.add(bt);
        return bt.getBoatTripId();
    }

    public boolean isBoatTripActive(String boatTripId) {
        return repository.get(boatTripId).isActive();
    }

    public boolean hasBoatsAvailable() {
        return repository.getNumberOfActiveBoatTrips() < numberOfBoats;
    }

    public void stopBoatTrip(String boatTripId) {
        BoatTrip bt = repository.get(boatTripId);
        if (bt == null) {
            throw new BoatTripException("BoatTrip not found for boatTripId: " + boatTripId);
        }
        bt.stop();
    }

    public Long getDurationInSeconds(String boatTripId) {
        BoatTrip bt = repository.get(boatTripId);
        if (bt == null) {
            throw new BoatTripException("BoatTrip not found for boatTripId: " + boatTripId);
        }
        return bt.getDuration().getSeconds();
    }


    public List<BoatTrip> getTripsFromToday() {
        return repository.getTripsOnDate(LocalDate.now());
    }
}
