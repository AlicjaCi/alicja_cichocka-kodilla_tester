package com.kodilla;

public class Application {

    String name;
    double height;
    double age;

    public Application(String name, double height, double age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
        public void checkYearAndHeight() {
            if (name != null) {
                if (age > 30 && height > 160) {
                    System.out.println("User is older than 30 and taller than 160cm");
                } else {
                    System.out.println("User is 30 (or younger) or 160cm (or shorter)");
                }
            }


        }
}
