package com.kodilla.patterns.strategy.social;

public sealed interface SocialPublisher permits FacebookPublisher, SnapchatPublisher, TweeterPublisher {
    String share();
}
