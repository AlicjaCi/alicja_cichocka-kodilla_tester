package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {


@Test
    public void shouldAddTwoNumbersAndDisplayResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator beanCalc = context.getBean(Calculator.class);
        double value = beanCalc.add(2, 2);
        Assertions.assertEquals(4, value);
    }

    @Test
    public void shouldSubtractTwoNumbersAndDisplayResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator beanCalc = context.getBean(Calculator.class);
        double value = beanCalc.subtract(2, 2);
        Assertions.assertEquals(0, value);
    }

    @Test
    public void shouldMultiplyTwoNumbersAndDisplayResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator beanCalc = context.getBean(Calculator.class);
        double value = beanCalc.multiply(2, 2);
        Assertions.assertEquals(4, value);
    }

    @Test
    public void shouldDivideTwoNumbersAndDisplayResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator beanCalc = context.getBean(Calculator.class);
        double value = beanCalc.divide(2, 2);
        Assertions.assertEquals(1, value);
    }



}
