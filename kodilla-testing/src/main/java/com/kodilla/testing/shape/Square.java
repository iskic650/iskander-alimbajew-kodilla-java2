package com.kodilla.testing.shape;

public class Square implements Shape{
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public String getShapeName(){
        return "Square";
    }

    @Override
    public double getField(){
        return edge*edge;
    }
}
