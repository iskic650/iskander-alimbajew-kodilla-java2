package com.kodilla.good.patterns.food2door2;

public class HealthyFood implements  Suplier{
    @Override
    public void process(String product, int quantity) {
        System.out.println("order: " + product + ", quantity: " + quantity);
        System.out.println("Sending order in progress");
    }
}
