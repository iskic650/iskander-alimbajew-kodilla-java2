package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightSearchService {

    public List<Flight> flightsFrom(final City flightFrom) {
        List<Flight> flights = new FlightDatabase().getFlightList();
        List<Flight> flightsFromList = new ArrayList<>();
        flights.stream().filter(f -> f.flightFrom().equals(flightFrom)).
                         filter(f -> f.flightFrom().hashCode() == flightFrom.hashCode()).
                         forEach(flightsFromList::add);
        return new ArrayList<>(flightsFromList);
    }

    public List<Flight> flightsTo(final City flightTo) {
        List<Flight> flights = new FlightDatabase().getFlightList();
        List<Flight> flightsToList = new ArrayList<>();
        flights.stream().filter(f -> f.flightTo().equals(flightTo)).
                filter(f -> f.flightTo().hashCode() == flightTo.hashCode()).
                forEach(flightsToList::add);
        return new ArrayList<>(flightsToList);
    }

    public List<List<Flight>> connectedFlight(final City flightFrom, final City flightTo) {
        FlightSearchService flightSearchService = new FlightSearchService();
        List<Flight> flightsFromList = flightSearchService.flightsFrom(flightFrom);
        List<Flight> flightsToList = flightSearchService.flightsTo(flightTo);

        List<List<Flight>> connectedFlightsList = new ArrayList<>();
        int i = 0;
        for (Flight value : flightsFromList) {
            for (Flight flight : flightsToList) {
                if (value.flightTo().equals(flight.flightFrom())) {
                    connectedFlightsList.add(new ArrayList<>());
                    connectedFlightsList.get(i).add(value);
                    connectedFlightsList.get(i).add(flight);
                    i++;
                }
            }
        }

        return new ArrayList<>(connectedFlightsList);
    }
}
