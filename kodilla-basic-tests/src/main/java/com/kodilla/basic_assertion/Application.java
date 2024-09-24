package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subResult = calculator.subtract(b,a);
        boolean correctSubtraction = ResultChecker.assertEquals(3, subResult);
        if (correctSubtraction){
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int powResult = calculator.raiseToPower( a,  b);
        boolean correctPow = ResultChecker.assertEquals(390625, powResult);
        if (correctPow) {
            System.out.println("Metoda podnosząca liczby całkowite do potęgi działa prawidłowo dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda podnosząca liczby całkowite do potęgi nie działa prawidłowo dla liczb " + a + " i " + b);
        }
    }
}
