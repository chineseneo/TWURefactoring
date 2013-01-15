package com.twu.refactor;

public class Movie {
	public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;
    public static final int  CHILDRENS = 2;

	private String title;
	private int priceCode;

    private double[] basePrice = {2.0, 0.0, 1.5};
    private int[] baseDays = {2, 0, 3};
    private double[] unitPrice = {1.5, 3.0, 1.5};


	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

    public void setPriceCode(int arg) {
    	priceCode = arg;
	}

    double getMoviePrice(int daysRented) {
        double rentalPrice = basePrice[priceCode];
        if (daysRented > baseDays[priceCode]) {
            rentalPrice += (daysRented - baseDays[priceCode]) * unitPrice[priceCode];
        }
        return rentalPrice;
    }

    String formattedTitle() {
        return "\t" + title + "\t";
    }

    int rentalPoints(int daysRented) {
        return ((priceCode == NEW_RELEASE) && daysRented > 1)? 1 : 0;
    }

    String info(double thisAmount) {
        String result = formattedTitle();
        result += String.valueOf(thisAmount) + "\n";
        return result;
    }
}