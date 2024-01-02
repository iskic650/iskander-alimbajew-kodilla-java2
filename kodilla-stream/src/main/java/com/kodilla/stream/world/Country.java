package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String name;
    BigDecimal peopleQuantity;

    public Country(String name) {
        this.name = name;
        this.peopleQuantity = new BigDecimal("1000000000");
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    public String getName() {
        return name;
    }
}
