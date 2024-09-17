package com.kodilla;

import java.util.Random;

public class RandomNumbers {

        public int maxNumbers = 10000;
        public int[] numbers;
        public int count;
        public Random random;


        public RandomNumbers() {
            numbers = new int[maxNumbers];
            count = 0;
            random = new Random();
        }


        public void generateNumbers() {
            int sum = 0;
            while (sum <= 5000) {
                if (count >= maxNumbers) {
                    System.out.println("Tablica jest pełna, nie można dodać więcej liczb.");
                    break;
                }
                int number = random.nextInt(31);
                numbers[count] = number;
                count++;
                sum += number;
            }
        }


        public int getMaxValue() {
            int max = numbers[0];
            for (int i = 1; i < count; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            return max;
        }


        public int getMinValue() {

            int min = numbers[0];
            for (int i = 1; i < count; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            return min;
        }
}
