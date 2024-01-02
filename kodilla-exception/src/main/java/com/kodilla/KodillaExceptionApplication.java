package com.kodilla;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightService;
import com.kodilla.exception.test.RouteNotFoundException;

public class KodillaExceptionApplication {

	public static void main(String[] args) {
		FlightService fs = new FlightService();
		Flight flight1 = new Flight("Warszawa", "Lublin");
		Flight flight2 = new Flight("Warszawa", "Świdnik");
		Flight flight3 = new Flight("Berlin", "Świdnik");

		try {
			fs.findFlight(flight1);
			fs.findFlight(flight2);
			fs.findFlight(flight3);
		} catch (RouteNotFoundException e) {
			throw new RuntimeException();
		}
	}

}
