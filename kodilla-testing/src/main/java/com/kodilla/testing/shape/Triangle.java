package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double edge;
    private double height;

    public Triangle(double edge, double height) {
        this.edge = edge;
        this.height = height;
    }

    @Override
    public String getShapeName(){
        return "Triangle";
    }

    @Override
    public double getField(){
        return edge*height/2;
    }
}