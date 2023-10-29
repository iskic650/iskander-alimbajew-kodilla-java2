package com.kodilla.patterns.strategy.social;

public class TweeterPublisher implements SocialPublisher {
    @Override
    public void share() {
        System.out.println("Tweeter");
    }
}
