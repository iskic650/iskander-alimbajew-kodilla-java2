package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrderService {
    public boolean order(User user, List<Product> order, boolean payment){
        return user != null && order != null && payment;
    }
}
