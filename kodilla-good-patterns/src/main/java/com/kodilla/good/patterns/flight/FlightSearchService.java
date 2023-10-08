package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightSearchService {

    public List<Flight> flightsFrom(final City flightFrom) {
        List<Flight> flights = new FlightDatabase().makeFlightList();
        List<Flight> flightsFromList = new ArrayList<>();
        flights.stream().filter(f -> f.flightFrom().equals(flightFrom)).
                         filter(f -> f.flightFrom().hashCode() == flightFrom.hashCode()).
                         forEach(flightsFromList::add);
        return new ArrayList<>(flightsFromList);
    }

    public List<Flight> flightsTo(final City flightTo) {
        List<Flight> flights = new FlightDatabase().makeFlightList();
        List<Flight> flightsToList = new ArrayList<>();
        flights.stream().filter(f -> f.flightTo().equals(flightTo)).
                filter(f -> f.flightTo().hashCode() == flightTo.hashCode()).
                forEach(flightsToList::add);
        return new ArrayList<>(flightsToList);
    }

    public List<List<Flight>> connectedFlight(final City flightFrom, final City flightTo) {
        List<Flight> flightsFromList = flightsFrom(flightFrom);
        List<Flight> flightsToList = flightsTo(flightTo);

        List<List<Flight>> connectedFlightsList = new ArrayList<>();
        for (int i=0; i<flightsFromList.size(); i++){
            connectedFlightsList.add(new ArrayList<>());
            for (int j=0; j<flightsToList.size(); j++){
                if(flightsFromList.get(i).flightTo() == flightsToList.get(j).flightFrom()){
                    connectedFlightsList.get(i).add(flightsFromList.get(i));
                    connectedFlightsList.get(i).add(flightsToList.get(j));
                }
            }
        }

        return new ArrayList<List<Flight>>(connectedFlightsList);
    }
}
