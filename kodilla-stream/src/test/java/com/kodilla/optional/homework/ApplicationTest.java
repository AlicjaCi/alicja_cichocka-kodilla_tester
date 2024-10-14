package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;


public class ApplicationTest {
    @Test
    public void testStudentsWithTeacher() {
        Student student = new Student("Jan Nowak", new Teacher("Adam Kowalski"));
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");
        assertEquals("Adam Kowalski", teacherName);
    }
    @Test
    public void testStudentsWithoutTeacher() {
        Student student = new Student("Jan Nowak", new Teacher(null));
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");
        assertEquals("<undefined>", teacherName);
    }

    @Test
    public void testStudents() {
        List<Student> studentsList = List.of(
                new Student("Jan Nowak", new Teacher("Adam Kowalski")),
                new Student("Wiktor Czerwiński", new Teacher(null)),
                new Student("Anna Lewandowska", new Teacher("Marek Twardowski")),
                new Student("Karolina Wojciechowska", new Teacher(null)));
        List<String> expectedList = List.of("uczeń: Jan Nowak, nauczyciel: Adam Kowalski",
        "uczeń: Wiktor Czerwiński, nauczyciel: <undefined>",
                "uczeń: Anna Lewandowska, nauczyciel: Marek Twardowski",
        "uczeń: Karolina Wojciechowska, nauczyciel: <undefined>");
        List<String> actualList = new ArrayList<>();
        for (Student student : studentsList) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            actualList.add("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
        assertEquals(expectedList, actualList);
    }
}
