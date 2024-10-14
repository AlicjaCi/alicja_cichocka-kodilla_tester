package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static List<User> filterUsersOlderThan(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public static List<User> filterUsersMorePostThan(int numberOfPost) {
        List<User> filterList = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > numberOfPost)
                .collect(Collectors.toList());
        return filterList;
    }
}

