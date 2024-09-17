package com.kodilla;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2021);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2023);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + notebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1600, 500, 2019);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + notebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
    }
}
