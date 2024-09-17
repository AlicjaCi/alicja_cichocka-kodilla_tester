package com.kodilla;

import java.util.Scanner;

public class Color {

    public static String getColorNameByInitialLetter(char letter) {

        switch (letter) {
            case 'b':
                return "Blue";
            case 'g':
                return "Green";
            case 'r':
                return "Red";
            case 'y':
                return "Yellow";
            case 'o':
                return "Orange";
            case 'p':
                return "Pink";
            case 'w':
                return "White";
            default:
                return "Unknown color";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first letter of a color: ");
        char letter = scanner.next().charAt(0);

        String colorName = getColorNameByInitialLetter(letter);
        System.out.println("The color of letter " + letter + " is: " + colorName);

        scanner.close();
    }
}
