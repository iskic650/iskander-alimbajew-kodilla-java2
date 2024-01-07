package com.kodilla.patterns.strategy.social;

public class User {
    private SocialPublisher socialPublisher;

    public User() {
    }

    public String getSocialPublisher() {
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String sharePost() {
        return getSocialPublisher();
    }
}
