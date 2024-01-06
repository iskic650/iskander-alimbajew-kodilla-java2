package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;

public class CityDatabase {

     private final List<City> cityList;

    public CityDatabase() {
        this.cityList = new ArrayList<>();
        cityList.add(new City("Warszawa"));
        cityList.add(new City("Olsztyn"));
        cityList.add(new City("Lublin"));
        cityList.add(new City("Kraków"));
        cityList.add(new City("Katowice"));
        cityList.add(new City("Wrocław"));
        cityList.add(new City("Poznań"));
    }

    public List<City> getCityList() {
        return new ArrayList<>(cityList);
    }
}
