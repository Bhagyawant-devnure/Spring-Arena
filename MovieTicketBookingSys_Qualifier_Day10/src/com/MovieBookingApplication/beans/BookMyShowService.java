package com.MovieBookingApplication.beans;

import java.util.List;

import com.MovieBookingApplication.exception.InvalidBookingException;
import com.MovieBookingApplication.exception.MovieNotFoundException;
import com.MovieBookingApplication.requirement.BookingService;

public class BookMyShowService implements BookingService{
	private static String cinemaName;
	private static String location;
	private static String partnerCode;
	

	public static void setCinemaName(String cinemaName) {
		BookMyShowService.cinemaName = cinemaName;
	}

	public static void setLocation(String location) {
		BookMyShowService.location = location;
	}

	public static void setPartnerCode(String partnerCode) {
		BookMyShowService.partnerCode = partnerCode;
	}
	
	
	
	private List <String> availableShows;
	private List <String> bookedTickets;
	
	

	public void setAvailableShows(List<String> availableShows) {
		this.availableShows = availableShows;
	}

	public void setBookedTickets(List<String> bookedTickets) {
		this.bookedTickets = bookedTickets;
	}

	
	
	public void bookTicket(String movieName) throws MovieNotFoundException, InvalidBookingException {
		if(availableShows.contains(movieName)) {
			bookedTickets.add(movieName);
			System.out.println("Ticket Booked Successfully");
			
		}
		else {
			throw new MovieNotFoundException("This Show Not Available");
		}
		
	}

	public void cancleTicket(String movieName) throws InvalidBookingException {
		
		if(bookedTickets.contains(movieName)) {
			bookedTickets.remove(movieName);
			System.out.println("Movie Ticket cancle sucessfully");
			
			
		}
		else {
			throw new InvalidBookingException("Invalid Booking process");
		}
	}

	public void viewShows() {
		System.out.println("Movie Available");
		availableShows.forEach(System.out::println);
		
	}

}
