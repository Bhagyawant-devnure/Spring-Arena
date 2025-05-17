package com.MovieBookingApplication.requirement;

import com.MovieBookingApplication.exception.InvalidBookingException;
import com.MovieBookingApplication.exception.MovieNotFoundException;

public interface BookingService {
	void bookTicket(String movieName) throws MovieNotFoundException,InvalidBookingException, MovieNotFoundException, InvalidBookingException;
	void cancleTicket(String movieName) throws InvalidBookingException;
	void viewShows();

}
