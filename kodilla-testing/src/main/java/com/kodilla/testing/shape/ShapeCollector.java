package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public Shape getFigure(int i){
        return shapes.get(i);
    }

    public void showFigures(){
        shapes.toString();
    }
}
