package com.luxoft.teacher.factorymethodandflyweight;


import com.luxoft.teacher.factorymethodandflyweight.factory.Transport;
import com.luxoft.teacher.factorymethodandflyweight.flyweight.TransportFactory;

public class KyivTraffic {
    /**
     * Фабричний меторд: Створює об'єкти транспорту
     * типу ["bike", "scooter", "car"]
     * та кольорів ["Red", "Orange", "Blue", "Yellow", "Pink"]
     *
     * Флайвей: під час створення цих об'єктів application уміє покласти їх в кеш
     */
    private static final String colors[] = {"Red", "Orange", "Blue", "Yellow", "Pink"};
    private static final String typesOfTransport[] = {"bike", "scooter", "car"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Transport transport = TransportFactory.getTransport(getRandomTransport(), getRandomColor());
            transport.driveTransport();
        }

    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static String getRandomTransport() {
        return typesOfTransport[(int) (Math.random() * typesOfTransport.length)];
    }
}
