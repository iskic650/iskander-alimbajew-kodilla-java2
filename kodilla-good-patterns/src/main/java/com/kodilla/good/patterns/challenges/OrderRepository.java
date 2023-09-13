package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrderRepository {
    public OrderRequest createOrder(User user, List<Product> order){
        return new OrderRequest(user, order);
    }
}
