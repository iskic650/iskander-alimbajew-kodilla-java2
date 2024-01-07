package com.kodilla.patterns.strategy.social;

public class GenerationZ extends User {
    String name;
    SocialPublisher socialPublisher = new SnapchatPublisher();

    public GenerationZ() {
        this.name = "GenZ";
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
