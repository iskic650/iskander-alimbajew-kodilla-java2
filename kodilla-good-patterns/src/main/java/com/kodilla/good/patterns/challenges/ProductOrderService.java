package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new OrderService(), new OrderRepository());
        orderProcessor.process(new OrderRequestRetriever().retrieve());
    }
}
