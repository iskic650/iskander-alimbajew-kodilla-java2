package com.kodilla.patterns.strategy.social;

public class GenerationY extends User {
    SocialPublisher socialPublisher;

    public GenerationY() {
        this.socialPublisher = new TweeterPublisher();
    }

    @Override
    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
