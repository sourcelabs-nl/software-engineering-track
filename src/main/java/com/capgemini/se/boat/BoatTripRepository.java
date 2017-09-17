package com.capgemini.se.boat;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class BoatTripRepository {

    private Map<String, BoatTrip> map = new ConcurrentHashMap<>();

    public void add(BoatTrip bt) {
        map.put(bt.getBoatTripId(), bt);
    }

    public BoatTrip get(String id) {
        return map.get(id);
    }

    public List<BoatTrip> getTripsOnDate(LocalDate localDate) {
        return map.values().stream().filter(it -> it.getStartTime().toLocalDate().isEqual(localDate)).collect(Collectors.toList());
    }

    public long getNumberOfActiveBoatTrips() {
        return map.values().stream().filter(BoatTrip::isActive).count();
    }
}
