package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> world = new ArrayList<>();

    public World(final int continentNumber) {
        for (int i = 0; i < continentNumber; i++)
            world.add(new Continent(3));
    }

    public void addContinents(final int continentNumber, final int countryNumberInContinent) {
        for (int i = 0; i < continentNumber; i++) {
            world.add(new Continent(countryNumberInContinent));
        }
    }

    public List<Continent> getWorld() {
        return new ArrayList<>(world);
    }

    public final BigDecimal getPeopleQuantity() {
        BigDecimal result = BigDecimal.ZERO;
        result = world.stream()
                .flatMap(continent -> continent.getContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (allPeople, peopleInCountry) -> allPeople = allPeople.add(peopleInCountry));
        return result;
    }
}


