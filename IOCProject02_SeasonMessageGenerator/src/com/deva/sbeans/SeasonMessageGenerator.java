package com.deva.sbeans;
import java.time.LocalDateTime;

public class SeasonMessageGenerator {
private LocalDateTime time;

public  SeasonMessageGenerator(){
	System.out.println("SeasonMessageGenerator::0-param constructor");
	
}
public void setTime(LocalDateTime time) {
	System.out.println("SeasonMessageGenerator :setMonth()");
	this.time=time;
	
}
public String showSeasonMessage(String user) {
	int month=time.getMonthValue();
	String season="";
	if(month ==1 || month == 2 || month ==3) {
		season="Winter season " +user;
		
	}else if(month>=3 && month<=5) {
		season="Summer season "+ user;
	
}else if(month>=6 && month<=9) {
season ="Monsoon season " + user;
}else {
	season="Rainy season " + user;
}
	return season;

}
}