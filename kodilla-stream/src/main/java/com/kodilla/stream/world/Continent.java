package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Continent {
    private final List<Country> continent = new ArrayList<>();

    public Continent(){
        continent.add(new Country(BigDecimal.valueOf(1111000011110000L)));
        continent.add(new Country(BigDecimal.valueOf(1111000011110001L)));
        continent.add(new Country(BigDecimal.valueOf(1111000011110002L)));
    }

    public List<Country> getContinent() {
        return new ArrayList<>(continent);
    }
}
