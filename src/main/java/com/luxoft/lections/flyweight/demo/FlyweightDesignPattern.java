package com.luxoft.lections.flyweight.demo;

public class FlyweightDesignPattern {
    private static final String colors[] = {"Red", "Orange", "Blue", "Yellow", "Pink"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            AngryBird angrybird = (AngryBird) BirdFactory.getAngryBird(getRandomColor());
            angrybird.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
