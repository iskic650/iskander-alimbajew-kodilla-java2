package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> world;

    public World() {
        this.world = new ArrayList<>();
    }

    public void addContinent(String name) {
            world.add(new Continent(name));
    }

    public List<Continent> getWorld() {
        return new ArrayList<>(world);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal result;
        result = world.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (allPeople, peopleInCountry) -> allPeople.add(peopleInCountry));
        return result;
    }
}


