package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(b,a);
        assertEquals(3,subResult);
    }

    @Test
    public void testRaiseToPowerPositiveNumbers(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int powResult = calculator.raiseToPower(a,b);
        assertEquals(390625, powResult);
    }

    @Test
    public void testRaiseToPowerZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 5;
        int powResult = calculator.raiseToPower(a, b);
        assertEquals(0, powResult);
    }

    @Test
    public void testRaiseToPowerNegative() {
        double a = 5.0;
        double b = -2.0;
        double powResult = Math.pow(a, b);
        assertEquals(0.04, powResult, 0.0001);
    }
}
