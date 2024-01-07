package com.kodilla.patterns.strategy.social;

public class GenerationY extends User {
    String name;
    SocialPublisher socialPublisher;

    public GenerationY() {
        this.name = "GenY";
        this.socialPublisher = new TweeterPublisher();
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
