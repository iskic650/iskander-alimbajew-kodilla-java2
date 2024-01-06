package com.kodilla.patterns.flight;

import com.kodilla.good.patterns.flight.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class flightSearchServiceTestSuite {
    @Test
    public void testFlightsFrom(){
        //given
        CityDatabase cityDatabase = new CityDatabase();
        FlightSearchService flightSearchService = new FlightSearchService();
        List<City> cityList = cityDatabase.getCityList();

        List<Flight> flightsFromExpected = new ArrayList<>(){{
            add(new Flight(0, cityList.get(0), cityList.get(1)));
            add(new Flight(1, cityList.get(0), cityList.get(2)));
            add(new Flight(2, cityList.get(0), cityList.get(4)));
        }};

        //when
        List<Flight> flightsFrom = flightSearchService.flightsFrom(cityDatabase.getCityList().get(0));

        //then
        assertEquals(flightsFromExpected, flightsFrom);
    }

    @Test
    public void testFlightsTo(){
        //given
        CityDatabase cityDatabase = new CityDatabase();
        FlightSearchService flightSearchService = new FlightSearchService();
        List<City> cityList = cityDatabase.getCityList();

        List<Flight> flightsToExpected = new ArrayList<>(){{
            add(new Flight(3, cityList.get(1), cityList.get(0)));
            add(new Flight(6, cityList.get(2), cityList.get(0)));
            add(new Flight(8, cityList.get(3), cityList.get(0)));
            add(new Flight(12, cityList.get(5), cityList.get(0)));
        }};

        //when
        List<Flight> flightsFrom = flightSearchService.flightsTo(cityDatabase.getCityList().get(0));

        //then
        assertEquals(flightsToExpected, flightsFrom);
    }

    @Test
    public void testConnectedFlights(){
        //given
        CityDatabase cityDatabase = new CityDatabase();
        FlightSearchService flightSearchService = new FlightSearchService();
        List<City> cityList = cityDatabase.getCityList();

        List<List<Flight>> connectedFlightsExpected = new ArrayList<>(){{
            add(new ArrayList<>());
            get(0).add(new Flight(0, cityList.get(0), cityList.get(1)));
            get(0).add(new Flight(5, cityList.get(1), cityList.get(6)));
            add(new ArrayList<>());
            get(1).add(new Flight(2, cityList.get(0), cityList.get(4)));
            get(1).add(new Flight(11, cityList.get(4), cityList.get(6)));
        }};

        //when
        List<List<Flight>> connectedFlights = flightSearchService.connectedFlight(
                cityDatabase.getCityList().get(0), cityDatabase.getCityList().get(6));

        //then
        assertEquals(connectedFlightsExpected, connectedFlights);
    }
}
