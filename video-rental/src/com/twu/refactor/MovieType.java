package com.twu.refactor;

public enum MovieType {


    static double getBasePrice(double[] basePrice, int priceCode) {
        return basePrice[priceCode];
    }

    static int getBaseDay(int[] baseDays, int priceCode) {
        return baseDays[priceCode];
    }

    static double getUnitPrice(int priceCode, double[] unitPrice) {
        return unitPrice[priceCode];
    }
}
