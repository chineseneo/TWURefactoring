package com.twu.refactor;

public class Rental {

    Movie movie;

    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    double getRentalPrice() {
        return movie.getMoviePrice(daysRented);
    }

    int getRentalFrequency() {
        return movie.rentalPoints(daysRented) + 1;
    }

    String rentalInfo(double thisAmount) {
        return movie.info(thisAmount);
    }
}