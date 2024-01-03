package com.kodilla.good.patterns.challenges;

import java.util.List;

public interface Repository {
    OrderRequest createOrder(User user, List<Product> order);
}
