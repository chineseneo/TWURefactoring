package com.twu.refactor;

public class Movie {

    private String title;
    private MovieType movieType;

    public Movie(String title, int priceCode) {
		this.title = title;
        movieType = MovieType.getMovieType(priceCode);
	}

    public void setPriceCode(int priceCode) {
        movieType = MovieType.getMovieType(priceCode);
	}

    double getMoviePrice(int daysRented) {
        return movieType.getMovieTypePrice(daysRented);
    }

    String formattedTitle() {
        return "\t" + title + "\t";
    }

    int rentalPoints(int daysRented) {
        return movieType.getMovieTypeRentalPoints(daysRented);
    }

    String info(double thisAmount) {
        String result = formattedTitle();
        result += String.valueOf(thisAmount) + "\n";
        return result;
    }
}