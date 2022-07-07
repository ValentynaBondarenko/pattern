package com.luxoft.teacher.factorymethodandflyweight.factory;

public class Car implements Transport {
    private  String color;

    public Car(String color) {
        this.color = color;
    }

    @Override
    public void driveTransport() {
        System.out.println(" I am driving by " + color + " car");
    }
}
