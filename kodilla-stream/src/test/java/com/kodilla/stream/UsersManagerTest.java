package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames(){
        List<String> expectedUsernames = List.of("Walter White", "Gale Boetticher");
        List<String> actualUsernames = UsersManager.filterChemistGroupUsernames();
        assertEquals(expectedUsernames, actualUsernames);
    }
    @Test
    public void testAgeOlderThan() {
        List<User> expectedList = List.of(
                new User("Walter White", 50, 7, "Chemists"),
                new User("Gus Firing", 49, 0, "Board"),
                new User("Gale Boetticher", 44, 2, "Chemists"),
                new User("Mike Ehrmantraut", 57, 0, "Security"));
        List<User> usersOlderThan40List = UsersManager.filterUsersOlderThan(35);
        assertEquals(expectedList, usersOlderThan40List);
    }
    @Test
    public void testNumberOfPostMoreThan() {
        List<User> expectedList = List.of(new User("Jessie Pinkman", 25, 4648, "Sales"),
                new User("Tuco Salamanca", 34, 116, "Manager"));
        List<User> usersWithMorePostThan10 = UsersManager.filterUsersMorePostThan(10);
        assertEquals(expectedList, usersWithMorePostThan10);
    }

}