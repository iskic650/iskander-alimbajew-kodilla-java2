package com.kodilla.good.patterns.challenges;

public class User {
    String name;
    String surename;

    public User(String name, String surename) {
        this.name = name;
        this.surename = surename;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }
}
