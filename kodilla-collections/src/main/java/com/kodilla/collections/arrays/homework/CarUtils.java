package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Brand of the car: " + getCarName(car));
        System.out.println("Speed of the car: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Honda)
            return "Honda";
        else
            return "Unknown car name";
    }
}
