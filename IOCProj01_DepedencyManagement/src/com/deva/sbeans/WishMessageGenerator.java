//WishMessageGenerator.java (Target spring bean class)

package com.deva.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
      private LocalTime time;//Has-a property
      
      public WishMessageGenerator() {
    	  System.out.println("WishMessageGenerator::0-param constructor");
    	  
      }
      //Setter method for setter injection
      public void setTime(LocalTime time) {
    	  System.out.println("WishMessageGenerator.setTime");
    	  this.time=time;
      }
      
      //Business method having b.logic
      public String showWishMessage(String user) {
    	  System.out.println("WishMessageGenerator.showWishMessage()");
    	  
    	  
    	  //get current hour of the day
    	  int hour=time.getHour();//gives in 24 hours format
    	  //generate wish message
    	  if(hour<12) 
    	  return "Good Morning:" + user;
    	  else if(hour<16)
    		  return "Good Afternoon" + user;
    	  else if(hour<20)
    		  return "Good Evening:" + user;
    	  else
    		  return "Good Night:"+user;
      }//method
	
}//class
