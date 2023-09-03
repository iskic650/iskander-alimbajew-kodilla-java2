package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //given
        int array[] = {1, 1, 1, 5};

        //when
        double result = getAverage(array);

        //then
        assertEquals(2, result);
    }
}
