package com.deva.main;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Discountcalculator {
	private LocalDate currentDate;
	private Double price;
	
	public Discountcalculator() {
		System.out.println("Discountcalculator::0-para constructor");
	}
	
	public void setTime(LocalDate currentDate) {
		System.out.println("Discountcalculator : setDay()");
		this.currentDate=currentDate;
		
	}
	
	
	public void setPrice(Double price) {
		this.price = price;
	}

	public double calculateDiscount() {
		DayOfWeek day=currentDate.getDayOfWeek();
		if(day==DayOfWeek.SATURDAY || day==DayOfWeek.SUNDAY) {
			return price*0.80;
		}else {
			return price*0.90;
		}
	}

}
