package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    User user = new User("John", "Wekl");
    List<Product> order = new ArrayList<>();

    public OrderRequest retrieve(){
        this.user = user;
        List<Product> order = new ArrayList<>();
        return new OrderRequest(user, order);
    }
}
