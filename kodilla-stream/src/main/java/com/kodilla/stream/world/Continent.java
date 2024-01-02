package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

class Continent {
    private final String continentName;
    private final List<Country> countryList;

    public Continent(String continentName) {
        this.continentName = continentName;
        this.countryList = new ArrayList<>();
    }

    public void addCountry(String countryName){
        countryList.add(new Country(countryName));
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }

    public String getContinentName() {
        return continentName;
    }
}
