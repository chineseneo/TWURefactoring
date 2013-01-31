package com.twu.refactor;

import java.util.HashMap;

public enum MovieType {
    regular(2, 2, 1.5),
    new_release(0, 0, 3),
    children(3, 1.5, 1.5);

    private final int baseDays;
    private final double basePrice;
    private final double unitPrice;

    private static HashMap<Integer, MovieType> map = new HashMap<Integer, MovieType>();

    static {
        map.put(0, MovieType.regular);
        map.put(1, MovieType.new_release);
        map.put(2, MovieType.children);
    }

    private MovieType(int baseDays, double basePrice, double unitPrice) {
        this.baseDays = baseDays;
        this.basePrice = basePrice;
        this.unitPrice = unitPrice;
    }

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
