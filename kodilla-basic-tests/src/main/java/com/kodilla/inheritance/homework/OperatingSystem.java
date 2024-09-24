package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int yearOfRelease;

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public OperatingSystem(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    public void turnOn(){
        System.out.println("System is turning on");
    }

    public void turnOff() {
        System.out.println("System is turning off");
    }
}
