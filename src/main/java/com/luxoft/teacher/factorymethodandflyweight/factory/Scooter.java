package com.luxoft.teacher.factorymethodandflyweight.factory;

public class Scooter implements Transport {
    private String color;

    public Scooter(String color) {
        this.color = color;
    }

    @Override
    public void driveTransport() {
        System.out.println(" I am driving by " + color + " scooter");
    }

}
