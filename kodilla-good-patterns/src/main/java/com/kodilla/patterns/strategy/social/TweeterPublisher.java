package com.kodilla.patterns.strategy.social;

public final class TweeterPublisher implements SocialPublisher {
    @Override
    public String share() {
        System.out.println("Tweeter");
        return "Tweeter";
    }
}
