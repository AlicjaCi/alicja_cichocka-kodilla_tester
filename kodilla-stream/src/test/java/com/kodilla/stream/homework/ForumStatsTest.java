package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ForumStatsTest {
    @Test
    public void testGetAveragePostsForUsersAbove40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        double averagePosts = ForumStats.getAveragePostsForUsersAbove40(users);
        assertEquals(2.25, averagePosts, 0.01);
    }

    @Test
    public void testGetAveragePostsForUsersBelow40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        double averagePosts = ForumStats.getAveragePostsForUsersBelow40(users);
        assertEquals(2382, averagePosts, 0.01);
    }
    @Test
    public void testGetAveragePostsForUsersAbove40NoUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        double averagePosts = ForumStats.getAveragePostsForUsersAbove40(users);
        assertEquals(0.0, averagePosts);
    }
    @Test
    public void testGetAveragePostsForUsersBelow40NoUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        double averagePosts = ForumStats.getAveragePostsForUsersBelow40(users);
        assertEquals(0.0, averagePosts);
    }

}