package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("OddNumberExterminator Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("OddNumberExterminator Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("OddNumberExterminator Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("OddNumberExterminator Test Suite: end");
    }
    @DisplayName("when create empty List, " +
            "then result should return empty"
    )
    @Test
    void testCaseOddNumberExterminatorNullList() {
        //Given
        List<Integer> allNumbers = Arrays.asList();
        //When
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> result = oddNumberExterminator.exterminate(allNumbers);
        List<Integer> evenNumbers = Arrays.asList();
        //Then
        Assertions.assertEquals(evenNumbers, result);
    }
    @DisplayName("when create List with odd and even numbers, " +
            "then result should return even numbers"
    )
    @Test
    void testCaseEvenNumbers() {
        //Given
        List<Integer> allNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //When
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> result = oddNumberExterminator.exterminate(allNumbers);
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);
        //Then
        Assertions.assertEquals(evenNumbers, result);
    }



}
