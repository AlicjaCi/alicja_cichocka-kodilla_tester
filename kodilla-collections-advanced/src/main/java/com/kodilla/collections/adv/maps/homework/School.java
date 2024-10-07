package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> students = new ArrayList<>();

    public School(String name, List<Integer> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }
    public int getTotalStudents() {
        int total = 0;
        for (int students : students) {
            total += students;
        }
        return total;
    }
}
