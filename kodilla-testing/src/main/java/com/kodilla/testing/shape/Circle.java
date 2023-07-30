package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName(){
        return "Circle";
    }

    @Override
    public double getField() {
        return 3.14*radius*radius;
    }

}