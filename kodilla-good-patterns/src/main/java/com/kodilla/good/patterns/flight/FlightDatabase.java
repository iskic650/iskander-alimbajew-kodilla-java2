package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {
    List<Flight> flightList;

    public FlightDatabase() {
        CityDatabase cityDatabase = new CityDatabase();
        List<City> cityList = cityDatabase.getCityList();
        this.flightList = new ArrayList<>(){{
                add(new Flight(0, cityList.get(0), cityList.get(1)));
                add(new Flight(1, cityList.get(0), cityList.get(2)));
                add(new Flight(2, cityList.get(0), cityList.get(4)));
                add(new Flight(3, cityList.get(1), cityList.get(0)));
                add(new Flight(4, cityList.get(1), cityList.get(3)));
                add(new Flight(5, cityList.get(1), cityList.get(6)));
                add(new Flight(6, cityList.get(2), cityList.get(0)));
                add(new Flight(7, cityList.get(2), cityList.get(5)));
                add(new Flight(8, cityList.get(3), cityList.get(0)));
                add(new Flight(9, cityList.get(4), cityList.get(1)));
                add(new Flight(10, cityList.get(4), cityList.get(4)));
                add(new Flight(11, cityList.get(4), cityList.get(6)));
                add(new Flight(12, cityList.get(5), cityList.get(0)));
                add(new Flight(13, cityList.get(5), cityList.get(2)));
            }};
    }

    public List<Flight> getFlightList() {
              return new ArrayList<>(flightList);
    }
}
