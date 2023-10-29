package com.kodilla.patterns.strategy.social;

public class Millenials extends User {
    SocialPublisher socialPublisher;

    public Millenials() {
        this.socialPublisher = new FacebookPublisher();
    }

    @Override
    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
