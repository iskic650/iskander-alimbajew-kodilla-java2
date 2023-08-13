package com.kodilla.stream.immutable;

public class ForumUser {
    final private String userName;
    final private String realName;

    public ForumUser(final String userName, final String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }
}
