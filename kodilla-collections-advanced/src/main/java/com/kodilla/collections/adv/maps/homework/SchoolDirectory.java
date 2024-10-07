package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> schoolPrincipal = new HashMap<>();

        Principal principal1 = new Principal("Jan", "Kowalski");
        Principal principal2 = new Principal("Kazimierz", "Nowak");

        School school1 = new School("Szkoła Podstawowa nr 5", new ArrayList<>(Arrays.asList(25,30,27)));
        School school2 = new School("Szkoła Podstawowa nr 2", new ArrayList<>(Arrays.asList(22,31,28)));

        schoolPrincipal.put(principal1,school1);
        schoolPrincipal.put(principal2,school2);

        for (Map.Entry<Principal, School> principalSchoolEntry : schoolPrincipal.entrySet()) {
            System.out.println("Dyrektor: " + principalSchoolEntry.getKey().getName() + " " + principalSchoolEntry.getKey().getSurname() +
                    ", Szkoła: " + principalSchoolEntry.getValue().getName() + ", liczba uczniów: " + principalSchoolEntry.getValue().getTotalStudents());
        }

    }
}
