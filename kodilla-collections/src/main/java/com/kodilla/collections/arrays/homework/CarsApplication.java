package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    private static final Random RANDOM = new Random();


    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        int drawnCar = RANDOM.nextInt(3);

        int a = getRandomSpeed();
        if (drawnCar == 0)
            return new Ford(a);
        else if (drawnCar == 1)
            return new Opel(a);
        else {
            return new Honda(a);
        }

    }

    private static int getRandomSpeed() {
        return RANDOM.nextInt(101);
    }








}
