package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;

public class CityDatabase {
    List<City> makeCityList() {
        List<City> cityList = new ArrayList<>();
        cityList.add(new City("Warszawa"));
        cityList.add(new City("Olsztyn"));
        cityList.add(new City("Lublin"));
        cityList.add(new City("Kraków"));
        cityList.add(new City("Katowice"));
        cityList.add(new City("Wrocław"));
        cityList.add(new City("Poznań"));

        return new ArrayList(cityList);
    }
}
