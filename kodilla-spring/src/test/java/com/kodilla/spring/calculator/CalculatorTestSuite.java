package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double sum = calculator.add(1, 3);
        double difference = calculator.sub(5, 1);
        double product = calculator.mul(2, 2);
        double quotient = calculator.div(8, 2);

        //Then
        assertEquals(4, sum);
        assertEquals(4, difference);
        assertEquals(4, product);
        assertEquals(4, quotient);
    }
}
