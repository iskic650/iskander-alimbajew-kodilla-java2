package com.kodilla.patterns.strategy.social;

public class GenerationZ extends User {
    SocialPublisher socialPublisher;

    public GenerationZ() {
        this.socialPublisher = new SnapchatPublisher();
    }

    @Override
    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
