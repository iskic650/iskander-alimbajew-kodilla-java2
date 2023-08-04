package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

import java.util.List;

/*
    liczbę użytkowników,
    liczbę postów,
    liczbę komentarzy,
    średnią liczbę postów na użytkownika,
    średnią liczbę komentarzy na użytkownika,
    średnią liczbę komentarzy na post.
 */

public class StatisticsCalculator implements Statistics{
    public int userCount(List<String> users){
        return users.size();
    }
    @Override
    public List<String> usersNames() {
        return null;
    }

    @Override
    public int postsCount() {
        // TODO
        // int postcount = ForumUser.getPostsQuantity();
        return 0;
    }

    @Override
    public int commentsCount() {
        return 0;
    }
}
