package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Hello", "1234bbb")
                .firstName("Something")
                .lastName("Something")
                .age(30)
                .phone("1234567")
                .gender("gender")
                .build();

        System.out.println(user1);
    }
}
