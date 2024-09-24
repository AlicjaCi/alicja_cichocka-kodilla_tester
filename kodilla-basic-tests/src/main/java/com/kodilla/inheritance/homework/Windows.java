package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem{

    public Windows(int yearOfRelease) {
        super(yearOfRelease);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows " + getYearOfRelease() + " is turning on");;
    }

    @Override
    public void turnOff() {
        System.out.println("Windows " + getYearOfRelease() + " is turning off");;
    }
}
