package com.kodilla.good.patterns.flight;

import java.util.Objects;

public record Flight(int flightNumber, City flightFrom, City flightTo) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightNumber(), flight.flightNumber()) && Objects.equals(flightFrom(), flight.flightFrom()) && Objects.equals(flightTo(), flight.flightTo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber(), flightFrom(), flightTo());
    }
}
