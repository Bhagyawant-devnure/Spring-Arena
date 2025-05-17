package com.deva.beans;

public class Address {
	private String city;
	private String country;
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
public String getcity(){
	return city;
}

public String getcountry() {
	return country;
}
}
