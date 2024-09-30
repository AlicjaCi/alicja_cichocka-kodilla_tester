package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(10);
        Car opel = new Opel(20);
        Car honda = new Honda(30);

        doRace(ford);
        doRace(opel);
        doRace(honda);
    }

    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Actual speed of the car: " + car.getSpeed() + "km/h.");
    }
}
