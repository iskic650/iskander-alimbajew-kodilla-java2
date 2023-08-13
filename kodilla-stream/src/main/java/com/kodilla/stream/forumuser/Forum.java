package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1, "Julia123", 'F', 1990, 1, 1, 34));
        forumUserList.add(new ForumUser(2, "Julia124", 'F', 1970, 1, 1, 0));
        forumUserList.add(new ForumUser(3, "Julia125", 'F', 1950, 1, 1, 3));
        forumUserList.add(new ForumUser(4, "Julia126", 'F', 1920, 1, 1, 10));
        forumUserList.add(new ForumUser(5, "Julia127", 'F', 2011, 1, 1, 4));
        forumUserList.add(new ForumUser(6, "Julian123", 'M', 2020, 1, 1, 20));
        forumUserList.add(new ForumUser(7, "Julian124", 'M', 1999, 1, 1, 14));
        forumUserList.add(new ForumUser(8, "Julian125", 'M', 1991, 1, 1, 1));
        forumUserList.add(new ForumUser(9, "Julian126", 'M', 1960, 1, 1, 0));
        forumUserList.add(new ForumUser(10, "Julian127", 'M', 1970, 1, 1, 0));
        forumUserList.add(new ForumUser(11, "Julian128", 'M', 1980, 1, 1, 35));
    }

    public List<ForumUser> getList(){
        return new ArrayList<>(forumUserList);
    }
}
