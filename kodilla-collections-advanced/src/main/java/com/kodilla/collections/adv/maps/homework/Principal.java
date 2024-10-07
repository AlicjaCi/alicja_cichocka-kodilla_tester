package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String name;
    private String surname;

    public Principal(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Principal principal)) return false;
        return Objects.equals(getName(), principal.getName()) && Objects.equals(getSurname(), principal.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
