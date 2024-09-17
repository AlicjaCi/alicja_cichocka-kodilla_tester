package com.kodilla;

public class User {
    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);


        User[] users = {anna, betty, carl, david, eva, frankie};

        int totalAge = 0;
        for (User user : users) {
            totalAge += user.getAge();
        }

        double averageAge = (double) totalAge / users.length;


        System.out.println("Użytkownicy poniżej średniego wieku (" + averageAge + "):");
        for (User user : users) {
            if (user.getAge() < averageAge) {
                System.out.println(user.getName());
            }
        }
    }

}


