package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Honda(30));
        cars.add(new Opel(20));
        cars.add(new Ford(10));
        Car car1 = new Ford(15);
        cars.add(car1);

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        cars.remove(1);
        cars.remove(car1);
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("Rozmiar kolekcji: " + cars.size());
    }
}
