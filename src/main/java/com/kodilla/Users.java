package com.kodilla;

public class Users {

    String name;
    double height;
    double age;

    public Users(String name, double height, double age) {
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

    public static void main(String[] args) {
        Users user1 = new Users("Rafał", 1.85, 30);
        user1.checkYearAndHeight();

    }
}
