package com.luxoft.labs.flyweight;

public class FlyweightPatternDemo {
    /**
     * Флайвей: Створити кредити різного типу і при створенні 10 рандомних кридитів вони повинні потріпляти в кеш
     */
    private static final String types[] = {"Basic Credit", "Interest-Bearing Credit", "Silver Credit",
            "Golden Credit", "Platinum Credit"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            //your code
        }
    }

    private static String getRandomType() {
        return types[(int) (Math.random() * types.length)];
    }

    private static int getRandomAmount() {
        return (int) (Math.random() * 1000);
    }

}
