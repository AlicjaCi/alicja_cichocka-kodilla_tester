package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem{
    public MacOs(int yearOfRelease) {
        super(yearOfRelease);
    }

    @Override
    public void turnOn() {
        System.out.println("MacOs " + getYearOfRelease() + " is turning on");;
    }

    @Override
    public void turnOff() {
        System.out.println("MacOs " + getYearOfRelease() + " is turning off");
    }
}
