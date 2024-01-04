package com.kodilla.good.patterns.food2door2;

public class GlutenFreeFood implements  Suplier{
    @Override
    public void process(String product, int quantity) {
        System.out.println(product + " x" + quantity);
        System.out.println("Sending --->");
    }
}
