package com.MovieBookingApplication.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.MovieBookingApplication.beans.BookMyShowService;
import com.MovieBookingApplication.beans.InoxService;

@Configuration
@ComponentScan(basePackages = "com.MovieBookingApplication.implementation")
public class BookingAppConfig {
	
	
	@Bean(name="bookmyshow")
	public BookMyShowService getBookMyShowService() {
		BookMyShowService bookMyShowService = new BookMyShowService();
		bookMyShowService.setCinemaName("PVR CINEMA");
		bookMyShowService.setLocation("Hyderabad");
		bookMyShowService.setPartnerCode("PVR12");
		bookMyShowService.setAvailableShows(Arrays.asList("RRR","3 IDIOTS","WELCOME"));
		return bookMyShowService ;
	}
	@Bean(name="inoxservice")
	public InoxService getInoxService() {
		InoxService in=new InoxService();
		in.setCinemaName("PVR CINEMA");
		in.setLocation("PunjaGutta");
		in.setPartnerCode("PVR123");
		in.setAvailableShows(Arrays.asList("RRR","PK","PUSHPA"));
		return in;
	}
	//@Bean
//	public MovieBookingApplication getInstance(@Qualifier("inoxservice") BookingService service)
//	{
//		return new MovieBookingApplication(service);
//	}
}
