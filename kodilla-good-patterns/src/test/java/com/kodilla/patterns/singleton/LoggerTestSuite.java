package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testLog(){
        //Given
        Logger logger = Logger.INSTANCE;

        //When
        logger.log("log1");

        //Then
        assertEquals(logger.getLastLog(), "log1");
    }
}
