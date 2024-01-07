package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenial = new Millenials();
        User generationY = new GenerationY();
        User generationZ = new GenerationZ();

        //When & Then
        assertEquals(millenial.sharePost(), "Facebook");
        assertEquals(generationY.sharePost(), "Tweeter");
        assertEquals(generationZ.sharePost(), "Snapchat");
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials();
        User generationY = new GenerationY();
        User generationZ = new GenerationZ();

        //When
        millenials.setSocialPublisher(new TweeterPublisher());
        generationY.setSocialPublisher(new SnapchatPublisher());
        generationZ.setSocialPublisher(new FacebookPublisher());

        // Then
        assertEquals(millenials.getSocialPublisher(), "Tweeter");
        assertEquals(generationY.getSocialPublisher(), "Snapchat");
        assertEquals(generationZ.getSocialPublisher(), "Facebook");
    }
}
