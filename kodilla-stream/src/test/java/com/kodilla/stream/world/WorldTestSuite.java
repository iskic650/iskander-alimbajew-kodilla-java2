package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("9999000099990009");

        //Then
        assertEquals(expectedResult, peopleQuantity);
    }

}
