package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {

    @Test
    void testBigMacBuilder() {
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .bun("John")
                .burgers(8)
                .sauce("1000 islands")
                .ingredient("with")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac.toString());

        //When
        List<String> expectedIngredients = new ArrayList<>();
        expectedIngredients.add("with");
        expectedIngredients.add("cheese");

        //Then
        assertEquals(bigmac.getBun(), "John");
        assertEquals(bigmac.getBurgers(), 8);
        assertEquals(bigmac.getSauce(), "1000 islands");
        assertEquals(bigmac.getIngredients(), expectedIngredients);
    }
}
