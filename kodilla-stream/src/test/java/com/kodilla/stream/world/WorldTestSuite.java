package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        world.addContinent("Europe");
        world.getWorld().get(0).addCountry("Polska");
        world.getWorld().get(0).addCountry("Czechy");

        world.addContinent("Afryka");
        world.getWorld().get(0).addCountry("Tunezja");
        world.getWorld().get(0).addCountry("RPA");

        world.addContinent("Ameryka Północna");
        world.getWorld().get(0).addCountry("USA");
        world.getWorld().get(0).addCountry("Kanada");

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("6000000000");

        //Then
        assertEquals(expectedResult, peopleQuantity);
    }

}
