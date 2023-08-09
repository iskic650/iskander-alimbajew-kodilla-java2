package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("first text", t -> "ABC" + t + "ABC");
        poemBeautifier.beautify("first text", t -> t.toUpperCase());
        poemBeautifier.beautify("first text", t -> "---" + t + "---");
        poemBeautifier.beautify("first text", t -> t + " -NOT!");

    }
}