package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.Year;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        int year = Year.now().getValue();
        Map<Integer, ForumUser> theResultList = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getYearOfBirth() < year - 20)
                .filter(forumUser -> forumUser.getPostQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getIndex, forumUser -> forumUser));

        System.out.println(theResultList);
    }
}