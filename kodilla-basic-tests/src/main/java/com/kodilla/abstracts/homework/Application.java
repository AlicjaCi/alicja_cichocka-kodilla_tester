package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(10,5);
        Square square = new Square(12);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());
    }
}
