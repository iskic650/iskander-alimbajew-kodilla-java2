package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length).map(i -> numbers[i]).forEach(System.out::println);
        OptionalDouble result = IntStream.range(0, numbers.length).map(i -> numbers[i]).average();
        return result.getAsDouble();
    }//get lista tablica
    //localDate. board. //tasklist.data.isBefore.isAfter  days.beatween(data, data) //do dni

}
