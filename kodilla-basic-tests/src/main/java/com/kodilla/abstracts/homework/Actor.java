package com.kodilla.abstracts.homework;

public class Actor extends Job{
    public Actor(double salary) {
        super(salary, "playing the role");
    }

    @Override
    public String getResponsibilities() {
        return responsibility;
    }
}
