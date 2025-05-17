package com.MovieBookingApplication.user;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.MovieBookingApplication.config.BookingAppConfig;
import com.MovieBookingApplication.implementation.MovieBookingApplication;

public class MovieUser {

	public static void main(String[] args) {
		 
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(BookingAppConfig.class);
	MovieBookingApplication app = ctx.getBean(MovieBookingApplication.class);
	Scanner sc = new Scanner(System.in);
	while(true) {
		
	}
	
	
	}

}
