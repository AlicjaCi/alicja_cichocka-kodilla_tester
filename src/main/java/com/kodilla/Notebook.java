package com.kodilla;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 700 && this.weight <1700) {
            System.out.println("This notebook is not so heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (this.year < 2020 && this.price < 600) {
            System.out.println("This notebook is too cheap.");
        } else if (this.year > 2020 && this.year < 2023 && this.price > 600 && this.price < 1000) {
            System.out.println("This notebook is worth to buy.");
        } else if  (this.year > 2023 && this.price > 1700) {
            System.out.println("This notebook is brand new and expensive.");
        } else {
            System.out.println("There is no data");
        }
    }

}
