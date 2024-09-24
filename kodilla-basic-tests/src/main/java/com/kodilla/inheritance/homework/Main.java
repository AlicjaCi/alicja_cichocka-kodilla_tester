package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {

        Windows windows10 = new Windows(2023);
        windows10.turnOn();
        windows10.turnOff();

        MacOs macOs15 = new MacOs(2024);
        macOs15.turnOn();
        macOs15.turnOff();
    }
}
