package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFlightFindFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFromWarsaw = flightFinder.findFlightsFrom("Warsaw");
        assertEquals(1, flightsFromWarsaw.size());

    }
    @Test
    public void testFlightFindTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsToWarsaw = flightFinder.findFlightsTo("Warsaw");
        assertEquals(1, flightsToWarsaw.size());
    }

}