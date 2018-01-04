package com.szachnowicz.service;

import com.szachnowicz.entity.Flight;

import java.util.*;

public class FlightManager {

    private List<Flight> flightList = new ArrayList<>();

    public void addNewFlight(Flight flight) {
        flightList.add(flight);

    }

    public Flight getNextFlight() {
        Collections.sort(flightList, new Comparator<Flight>() {
            @Override
            public int compare(Flight o1, Flight o2) {
                return o2.getFlightDate().compareTo(o1.getFlightDate());
            }
        });
        Flight flight = null;

        if (!flightList.isEmpty()) {
            flight = flightList.get(flightList.size() - 1);
        }
        return flight;
    }


    public boolean removeOutDatedFlight() {

        boolean b = flightList.removeIf(flight -> flight.getFlightDate().compareTo(new Date()) == -1);

        return b;
    }


}
