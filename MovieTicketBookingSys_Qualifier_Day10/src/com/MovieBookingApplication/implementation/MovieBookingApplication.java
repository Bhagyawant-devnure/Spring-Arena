package com.MovieBookingApplication.implementation;

import com.MovieBookingApplication.exception.InvalidBookingException;
import com.MovieBookingApplication.exception.MovieNotFoundException;
import com.MovieBookingApplication.requirement.BookingService;

public class MovieBookingApplication {
	BookingService service;
	
	public MovieBookingApplication(BookingService service)
	{
		this.service=service;
	}
	
	public void book(String movieName)throws MovieNotFoundException,InvalidBookingException
	{
	service.bookTicket(movieName);	
	}
	public void cancle(String moviName) throws InvalidBookingException{
		service.cancleTicket(moviName);
	}
	public void shows()
	{
		service.viewShows();
	}
}
