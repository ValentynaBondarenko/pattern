package com.luxoft.teacher.factorymethodandflyweight.factory;

public class Bike implements Transport {
    private String color;

    public Bike(String color) {
        this.color = color;
    }

    @Override
    public void driveTransport() {
        System.out.println(" I am driving by " + color + " bike");
    }
}
