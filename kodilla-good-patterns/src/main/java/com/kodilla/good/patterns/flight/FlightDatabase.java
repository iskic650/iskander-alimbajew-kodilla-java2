package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {
    List<City> citylist = new CityDatabase().makeCityList();

    List<Flight> makeFlightList() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight(0, citylist.get(0), citylist.get(1)));
        flightList.add(new Flight(1, citylist.get(0), citylist.get(2)));
        flightList.add(new Flight(2, citylist.get(0), citylist.get(4)));
        flightList.add(new Flight(3, citylist.get(1), citylist.get(0)));
        flightList.add(new Flight(4, citylist.get(1), citylist.get(3)));
        flightList.add(new Flight(5, citylist.get(1), citylist.get(6)));
        flightList.add(new Flight(6, citylist.get(2), citylist.get(0)));
        flightList.add(new Flight(7, citylist.get(2), citylist.get(5)));
        flightList.add(new Flight(8, citylist.get(3), citylist.get(0)));
        flightList.add(new Flight(9, citylist.get(4), citylist.get(1)));
        flightList.add(new Flight(10, citylist.get(4), citylist.get(4)));
        flightList.add(new Flight(11, citylist.get(4), citylist.get(6)));
        flightList.add(new Flight(12, citylist.get(5), citylist.get(0)));
        flightList.add(new Flight(13, citylist.get(5), citylist.get(2)));

        return new ArrayList(flightList);
    }
}
