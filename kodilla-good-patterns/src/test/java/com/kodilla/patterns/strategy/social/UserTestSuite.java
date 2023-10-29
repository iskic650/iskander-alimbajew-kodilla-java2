package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenial = new Millenials();
        User generationY = new GenerationY();
        User generationZ = new GenerationZ();

        //When & Then
        millenial.sharePost();
        generationY.sharePost();
        generationZ.sharePost();
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenial = new Millenials();
        User generationY = new GenerationY();
        User generationZ = new GenerationZ();

        //When
        millenial.setSocialPublisher(new TweeterPublisher());
        generationY.setSocialPublisher(new SnapchatPublisher());
        generationZ.setSocialPublisher(new FacebookPublisher());

        // Then
        millenial.sharePost();
        generationY.sharePost();
        generationZ.sharePost();
    }
}
