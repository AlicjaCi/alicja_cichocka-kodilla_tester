package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static double getAveragePostsForUsersAbove40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static double getAveragePostsForUsersBelow40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double avgPostsAbove40 = getAveragePostsForUsersAbove40(users);
        double avgPostsBelow40 = getAveragePostsForUsersBelow40(users);

        System.out.println("Średnia liczba postów dla użytkowników w wieku 40 lat lub więcej: " + avgPostsAbove40);
        System.out.println("Średnia liczba postów dla użytkowników poniżej 40 roku życia: " + avgPostsBelow40);
    }
}
