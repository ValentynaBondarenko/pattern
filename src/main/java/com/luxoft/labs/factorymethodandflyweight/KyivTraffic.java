package com.luxoft.labs.factorymethodandflyweight;

public class KyivTraffic {
    /**
     * Фабричний меторд: Створює об'єкти транспорту
     * типу ["bike", "scooter", "car"]
     * та кольорів ["Red", "Orange", "Blue", "Yellow", "Pink"]
     * Флайвей: під час створення цих об'єктів уміє покласти їх в кеш
     */
    private static final String colors[] = {"Red", "Orange", "Blue", "Yellow", "Pink"};
    private static final String typesOfTransport[] = {"bike", "scooter", "car"};

    public static void main(String[] args) {

        //your code...


    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static String getRandomTransport() {
        return typesOfTransport[(int) (Math.random() * typesOfTransport.length)];
    }
}
