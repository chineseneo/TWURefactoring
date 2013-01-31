package com.twu.refactor;

public enum MovieType {
    regular(0, 2, 2, 1.5),
    new_release(1, 0, 0, 3),
    children(2, 3, 1.5, 1.5);

    private final int typeCode;
    private final int baseDays;
    private final double basePrice;
    private final double unitPrice;

    private MovieType(int typeCode, int baseDays, double basePrice, double unitPrice) {
        this.typeCode = typeCode;
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
