package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //given
        int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //when
        double result = getAverage(array);

        //then
        assertEquals(4.5, result);
    }
}
