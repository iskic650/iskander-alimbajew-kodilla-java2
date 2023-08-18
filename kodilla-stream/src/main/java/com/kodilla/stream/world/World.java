package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> world = new ArrayList<>();

    public World(){
        world.add(new Continent());
        world.add(new Continent());
        world.add(new Continent());
    }

    public List<Continent> getContinent() {
        return new ArrayList<>(world);
    }

    public final BigDecimal getPeopleQuantity(){
        BigDecimal result = BigDecimal.ZERO;
        result = world.stream()
                .flatMap(continent -> continent.getContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (allPeople, peopleInCountry) -> allPeople = allPeople.add(peopleInCountry));
        return result;
    };
}
