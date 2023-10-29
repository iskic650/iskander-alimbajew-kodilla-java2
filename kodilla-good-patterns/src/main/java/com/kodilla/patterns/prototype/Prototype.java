package com.kodilla.patterns.prototype;

public class Prototype<Library> implements Cloneable {

    @Override
    public Library clone() throws CloneNotSupportedException {
        return (Library) super.clone();
    }
}