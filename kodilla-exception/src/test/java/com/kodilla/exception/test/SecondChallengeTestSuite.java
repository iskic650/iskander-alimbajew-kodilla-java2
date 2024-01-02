package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowExceptionBoundaryValuesForX(){
        // given
        SecondChallenge sc = new SecondChallenge();
        // when & then

        assertDoesNotThrow(() -> sc.probablyIWillThrowException(1.9,0) );
        assertDoesNotThrow(() -> sc.probablyIWillThrowException(1,0) );
    }

    @Test
    void testProbablyIWillThrowExceptionBoundaryValuesForY(){
        // given
        SecondChallenge sc = new SecondChallenge();
        // when & then
        assertDoesNotThrow(() -> sc.probablyIWillThrowException(1,1.4) );
        assertDoesNotThrow(() -> sc.probablyIWillThrowException(1,1.6) );
    }

    @Test
    void testProbablyIWillThrowExceptionWrongValuesForX(){
        // given
        SecondChallenge sc = new SecondChallenge();
        // when & then

        assertThrows(Exception.class,() -> sc.probablyIWillThrowException(2,0));
        assertThrows(Exception.class,() -> sc.probablyIWillThrowException(0.99,0) );
    }

    @Test
    void testProbablyIWillThrowExceptionWrongValueForY(){
        // given
        SecondChallenge sc = new SecondChallenge();
        // when & then

        assertThrows(Exception.class,() -> sc.probablyIWillThrowException(1,1.5));
    }

}
