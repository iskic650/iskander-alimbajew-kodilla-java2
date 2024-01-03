package com.kodilla.good.patterns.challenges;

import java.util.List;

public interface Order {
    boolean order(User user, List<Product> order, boolean payment);
}
