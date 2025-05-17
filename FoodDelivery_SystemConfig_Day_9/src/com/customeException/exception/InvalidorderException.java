package com.customeException.exception;

public class InvalidorderException extends Exception{
	public InvalidorderException(String mesg) {
		super(mesg);
	}

}
//Custom exception for invalid or blank orders