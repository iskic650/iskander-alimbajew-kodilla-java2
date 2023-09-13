package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRequest {


    private User user;
    private List<Product> order;

    public OrderRequest(User user, List<Product> order) {
        this.user = user;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getOrder() {
        return new ArrayList<>(order);
    }
}
