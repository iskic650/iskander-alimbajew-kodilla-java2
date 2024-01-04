package com.kodilla.good.patterns.food2door2;

public class ExtraFood implements  Suplier{
    @Override
    public void process(String product, int quantity) {
        System.out.println("Preparing order: " + product + " x" + quantity);
    }
}
