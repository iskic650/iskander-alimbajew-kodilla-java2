package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("first text", t -> "ABC" + t + "ABC");
        poemBeautifier.beautify("first text", t -> t.toUpperCase());
        poemBeautifier.beautify("first text", t -> "---" + t + "---");
        poemBeautifier.beautify("first text", t -> t + " -NOT!");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }


}