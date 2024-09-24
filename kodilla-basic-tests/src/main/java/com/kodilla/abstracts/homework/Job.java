package com.kodilla.abstracts.homework;

public abstract class Job {
    public double salary;
    public String responsibility;

    public Job(double salary, String responsibility) {
        this.salary = salary;
        this.responsibility = responsibility;
    }

    public abstract String getResponsibilities();
}
