package com.kodilla.abstracts.homework;

public class Driver extends Job {
    public Driver(double salary) {
        super(salary, "driving a car");
    }

    @Override
    public String getResponsibilities() {
        return responsibility;
    }
}
