package com.kodilla.patterns.strategy.social;

public class User {
    protected SocialPublisher socialPublisher;

    void sharePost() {

    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
