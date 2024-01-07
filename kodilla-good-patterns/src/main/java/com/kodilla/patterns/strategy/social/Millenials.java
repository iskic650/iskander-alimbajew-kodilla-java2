package com.kodilla.patterns.strategy.social;

public class Millenials extends User {
    String name;
    SocialPublisher socialPublisher;

    public Millenials() {
        this.name = "Mill";
        this.socialPublisher = new FacebookPublisher();
    }

    @Override
    public String getSocialPublisher() {
        return socialPublisher.share();
    }

    @Override
    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
