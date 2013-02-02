package com.twu.refactor;

import java.util.HashMap;

public enum MovieType {
    regular(2, 2, 1.5, 0),
    new_release(0, 0, 3, 1),
    children(3, 1.5, 1.5, 0);
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;
    public static final int  CHILDRENS = 2;

    private final int baseDays;
    private final double basePrice;
    private final double unitPrice;
    private int rentalPoints;

    private static HashMap<Integer, MovieType> map = new HashMap<Integer, MovieType>();

    private MovieType(int baseDays, double basePrice, double unitPrice, int rentalPoints) {
        this.baseDays = baseDays;
        this.basePrice = basePrice;
        this.unitPrice = unitPrice;
        this.rentalPoints = rentalPoints;
    }

    static {
        map.put(0, MovieType.regular);
        map.put(1, MovieType.new_release);
        map.put(2, MovieType.children);
    }

    public static MovieType getMovieType(int priceCode) {
        return map.get(priceCode);
    }

    public double getMovieTypePrice(int daysRented) {
        double rentalPrice = this.basePrice;
        if (daysRented > this.baseDays) {
            rentalPrice += (daysRented - this.baseDays) * this.unitPrice;
        }
        return rentalPrice;
    }

    int getMovieTypeRentalPoints(int daysRented) {
        return (daysRented > 1) ? rentalPoints : 0;
    }
}
