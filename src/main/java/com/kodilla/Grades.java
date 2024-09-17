package com.kodilla;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public Double getLastGrade() {
        if (size > 0) {
            return (double) grades[this.size - 1];
        } else {
            return null;
        }
    }

    public double getAverageGrade() {
        if (size == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum += grades[i];
        }
        return sum / size;
    }


}
