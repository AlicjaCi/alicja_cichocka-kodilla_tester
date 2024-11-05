package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.Month;

@Configuration
public class CarConfiguration {
    @Bean
    public Car createCabrio() {
        return new Cabrio();
    }

    @Bean
    public Car createSUV() {
        return new SUV();
    }

    @Bean
    public Car createSedan() {
        return new Sedan();
    }

    @Bean
    public Car seasonalCar() {
        LocalDateTime dateTime = LocalDateTime.now();
        int hour = dateTime.getHour();
        Month month = dateTime.getMonth();
        Car car;

        if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
            car = new Cabrio();
        } else if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY) {
            car = new SUV();
        } else {
            car = new Sedan();
        }

        car.setHeadlightsTurnedOn(hour >= 20 || hour < 6);
        return car;
    }
}
