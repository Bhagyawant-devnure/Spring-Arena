package com.BankApplication.requirement;

import com.deva.exception.InsufficientBalanceException;
import com.deva.exception.InvalidInputException;

public interface BankMainBranch {
	void deposite(double amount)throws InvalidInputException;
	 void withdraw (double amount) throws InsufficientBalanceException,InvalidInputException;
 
	 void viewBalance()throws InsufficientBalanceException;
}
