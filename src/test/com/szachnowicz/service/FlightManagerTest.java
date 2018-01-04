package com.szachnowicz.service;

import com.szachnowicz.entity.Flight;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FlightManagerTest {
    private FlightManager flightManager;

    @Before
    public void setUp() throws Exception {
         flightManager = new FlightManager();

        Flight flight = new Flight();
        flight.setId(99);
        flight.setFlightDateFromString("2018-01-01");
        flight.setDestinationCity("Radom");
        flight.setDockCity("Warszawa");
        flight.setMachnieId(4);

        Flight flight2 = new Flight();
            flight2.setId(100);
        flight2.setFlightDateFromString("2018-01-02");
        flight2.setDestinationCity("Warszawa");
        flight2.setDockCity("Radom");
        flight2.setMachnieId(4);

        flightManager.addNewFlight(flight);
        flightManager.addNewFlight(flight2);

    }

    @Test
    public void getingNextFilightTest() {
        Flight nextFlight = flightManager.getNextFlight();
        assertEquals(nextFlight.getId(), 99);
        assertFalse(nextFlight.getId()==101);
    }

    @Test
    public void testRemove() {
        flightManager.removeOutDatedFlight();
        assertEquals(flightManager.getNextFlight(), null);

    }

    @Test
    public void testRemoveWtihFlightFormFuture() {
        Flight flight2 = new Flight();
        flight2.setId(100);
        flight2.setFlightDateFromString("2018-02-02");
        flight2.setDestinationCity("Warszawa");
        flight2.setDockCity("Radom");
        flight2.setMachnieId(4);

        flightManager.addNewFlight(flight2);
        assertEquals(flightManager.getNextFlight(),flight2);


    }
}