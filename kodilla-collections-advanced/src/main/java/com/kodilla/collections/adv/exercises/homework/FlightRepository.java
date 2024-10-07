package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "New York"));
        flights.add(new Flight("London", "Warsaw"));
        flights.add(new Flight("New York", "Berlin"));
        return flights;
    }
}
