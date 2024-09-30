package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width;
    private double height;
    private boolean isStamped;

    public Stamp(String name, double width, double height, boolean isStamped) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.isStamped = isStamped;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp stamp)) return false;
        return Double.compare(getWidth(), stamp.getWidth()) == 0 && Double.compare(getHeight(), stamp.getHeight()) == 0 && isStamped() == stamp.isStamped() && Objects.equals(getName(), stamp.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWidth(), getHeight(), isStamped());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", isStamped=" + isStamped +
                '}';
    }
}
