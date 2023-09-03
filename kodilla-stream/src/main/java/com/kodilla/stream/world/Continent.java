package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Continent {
    private List<Country> continent = new ArrayList<>();

    public Continent(int countryNumber){
        for(int i=0; i<countryNumber; i++)
        continent.add(new Country(BigDecimal.valueOf(1111000011110000L)));
    }

    public void addCountrys(int countryNumber){
        for(int i=0; i<countryNumber; i++)
            continent.add(new Country(BigDecimal.valueOf(1111000011110000L)));
    }

    public List<Country> getContinent() {
        return new ArrayList<>(continent);
    }
}
