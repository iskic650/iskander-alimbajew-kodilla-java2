package com.kodilla.good.patterns.challenges;


public class OrderDto {

    private final User user;
    private final boolean isOrdered;

    public OrderDto(final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() { return user; }

    public boolean isRented() { return isOrdered; }

}
