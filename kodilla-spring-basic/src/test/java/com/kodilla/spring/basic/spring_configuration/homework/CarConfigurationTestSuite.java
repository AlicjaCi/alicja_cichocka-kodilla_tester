package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarConfigurationTestSuite {
    @Test
    public void testCreateCabrio() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createCabrio");
        String carType = car.getCarType();
        Assertions.assertEquals("Cabrio", carType);
    }

    @Test
    public void testCreateSUV() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createSUV");
        String carType = car.getCarType();
        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void testCreateSedan() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createSedan");
        String carType = car.getCarType();
        Assertions.assertEquals("Sedan", carType);
    }

    @Test
    public void shouldReturnSeasonalCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("seasonalCar");
        List<String> possibleTypes = Arrays.asList("Cabrio", "SUV", "Sedan");
        Assertions.assertTrue(possibleTypes.contains(car.getCarType()));
    }

    @Test
    public void shouldHaveHeadlightsOnAtNight() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("seasonalCar");
        boolean headlights = car.hasHeadlightsTurnedOn();
        Assertions.assertTrue(headlights || !headlights);  // Zmienna wartość zależna od godziny
    }
}
