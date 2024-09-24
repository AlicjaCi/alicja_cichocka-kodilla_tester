package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities(){
        System.out.println(firstName + "responsibilities is: " + job.getResponsibilities());
    }

    public static void main(String[] args) {
        Person person1 = new Person("Katarzyna", 25, new Actor(5000));
        Person person2 = new Person("Konrad", 38, new Driver(3200));

        person1.displayResponsibilities();
        person2.displayResponsibilities();
    }
}
