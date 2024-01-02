package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightService {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warszawa", true);
        flights.put("Lublin", true);
        flights.put("Poznań", true);
        flights.put("Kraków", true);
        flights.put("Świdnik", false);
        flights.put("Krasnystaw", false);

        try {
            if (!(flights.get(flight.getDepartureAirport()) != null
                    & flights.get(flight.getArrivalAirport()) )) {
                throw new RouteNotFoundException("Flight unavailable");
            } else System.out.println("Flight found");
        }catch (RouteNotFoundException e){
            System.out.println(e);
        }
    }
}
