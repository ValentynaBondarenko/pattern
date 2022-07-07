package com.luxoft.lections.flyweight.demo;

import java.util.HashMap;

public class BirdFactory {
    //Cache
    private static final HashMap angryBirdMap = new HashMap();

    public static Bird getAngryBird(String color) {
        AngryBird angrybird = (AngryBird) angryBirdMap.get(color);

        if (angrybird == null) {
            angrybird = new AngryBird(color);
            angryBirdMap.put(color, angrybird);
            System.out.println("Creating Angry Bird of color : " + color);
            System.out.println("Cache size:" + angryBirdMap.size());
        }
        return angrybird;
    }
}
