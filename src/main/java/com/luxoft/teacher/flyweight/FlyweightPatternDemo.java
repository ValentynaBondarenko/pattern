package com.luxoft.teacher.flyweight;

public class FlyweightPatternDemo {
    private static final String types[] = { "Basic Credit", "Interest-Bearing Credit", "Silver Credit",
            "Golden Credit", "Platinum Credit" };

    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            AbstractCreditOffer creditOffer = OfferFactory.getCreditOffer(getRandomType());
            creditOffer.setAmount(getRandomAmount());
            creditOffer.verifyOffer();
        }
    }

    private static String getRandomType() {
        return types[(int)(Math.random() * types.length)];
    }

    private static int getRandomAmount() {
        return (int)(Math.random() * 1000);
    }


}
