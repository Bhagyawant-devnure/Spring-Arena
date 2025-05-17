package com.customeException.exception;

public class FoodNotFoundException extends Exception
{
public  FoodNotFoundException(String mesg){
	super(mesg);
}
}

//Custom exception for unavailable food items