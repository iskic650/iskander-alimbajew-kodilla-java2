package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        OptionalDouble result = IntStream.range(0, numbers.length).average();
        return result.getAsDouble();
    }
}
