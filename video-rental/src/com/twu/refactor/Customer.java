package com.twu.refactor;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {

	private String name;
	private ArrayList<Rental> rentalList = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		rentalList.add(arg);
	}

    public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Iterator<Rental> rentals = rentalList.iterator();
        String result = "Rental Record for " + name + "\n";
		while (rentals.hasNext()) {
			Rental rental = rentals.next();
            double thisAmount = rental.getRentalPrice();
            frequentRenterPoints += rental.getRentalFrequency();

            result += rental.rentalInfo(thisAmount);
            totalAmount += thisAmount;
		}
        return result + getResultString(totalAmount, frequentRenterPoints);
	}

    private String getResultString(double totalAmount, int frequentRenterPoints) {
        String result = String.format("Amount owed is %.1f\n" +
                "You earned %d frequent renter points",
                totalAmount,
                frequentRenterPoints);
        return result;
    }

}
