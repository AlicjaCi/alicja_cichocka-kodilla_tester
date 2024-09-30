package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Góry", 2.0,3.0,true));
        stamps.add(new Stamp("Góry", 2.0,3.0,true));
        stamps.add(new Stamp("Morze", 2.5,3.5,false));
        stamps.add(new Stamp("Jezioro", 2,3.0,true));

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
        System.out.println(stamps.size());

    }
}
