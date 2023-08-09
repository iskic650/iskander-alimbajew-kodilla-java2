package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

    }

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @DisplayName("TestTemperatureAvarageWithMock")
    @Test
    void testTemperatureAvarageWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        //When
        double result = weatherForecast.avarageTemperature();

        //Then
        Assertions.assertEquals(25.56, result);
    }
    @Nested
    @DisplayName("TestTemperatureMedianWithMock")
    class TestTemperatureMedian{
        @Mock
        private Temperatures temperaturesMock;
        @Test
        void testTemperatureMedianOddCollection() {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

            //When
            Double result = weatherForecast.medianTemperature();

            //Then
            Assertions.assertEquals(25.5, result);
        }

        @Test
        void testTemperatureMedianEvenCollection() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);//
            temperaturesMap.put("Wroclaw", 24.8);//
            temperaturesMap.put("Warszawa", 25.2);//
            temperaturesMap.put("Gdansk", 26.1);//
            temperaturesMap.put("Lublin", 25.7);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            Double result = weatherForecast.medianTemperature();

            //Then
            Assertions.assertEquals(25.6, result);
        }
    }
}