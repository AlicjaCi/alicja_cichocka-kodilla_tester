package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car{
    private boolean headlightsOn;

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlightsOn;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
    @Override
    public void setHeadlightsTurnedOn(boolean state) {
        this.headlightsOn = state;
    }
}
