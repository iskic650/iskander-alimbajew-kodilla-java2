package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int index;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private int postQuantity;

    public ForumUser(final int index, final String userName, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, int postQuantity) {
        this.index = index;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postQuantity = postQuantity;
    }

    public int getIndex() {
        return index;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getYearOfBirth() {
        return birthDate.getYear();
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "index=" + index +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
