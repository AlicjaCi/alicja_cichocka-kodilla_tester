package com.kodilla.optional.homework;

import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Jan Nowak", new Teacher("Adam Kowalski")),
                new Student("Wiktor Czerwiński", new Teacher(null)),
                new Student("Anna Lewandowska", new Teacher("Marek Twardowski")),
                new Student("Karolina Wojciechowska", new Teacher(null)));

        for (Student student : studentList) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }

    }
}
