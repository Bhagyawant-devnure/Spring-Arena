package com.deva.Implementation;

import com.BankApplication.requirement.BankMainBranch;
import com.deva.exception.InsufficientBalanceException;
import com.deva.exception.InvalidInputException;

public class SBIBankApplication implements BankMainBranch{
	private static String bankName;
	private static String bankAddress;
	private static String IFSC_Code;
	private int currentBalance;
	
	
	
	public static void setBankName(String bankName) {
		SBIBankApplication.bankName = bankName;
	}
	public static void setBankAddress(String bankAddress) {
		SBIBankApplication.bankAddress = bankAddress;
	}
	public static void setIFSC_Code(String iFSC_Code) {
		IFSC_Code = iFSC_Code;
	}
	
	
	
	@Override
	public void deposite(double amount) throws InvalidInputException {
		if(amount<=0 || amount>50000 ) 
			
		throw new InvalidInputException("deposite must be greater than 0 or less than 50000");
		currentBalance+=amount;
			System.out.println("Amount deposited successfully");
		}
	
		
	
	@Override
	public void withdraw(double amount) throws InsufficientBalanceException, InvalidInputException {
		if(amount<=0) {
			throw new InvalidInputException("amount must be positive or greater than 0");
			
			
		}if(amount>currentBalance) 
			throw new InvalidInputException("Invalid balance");
			currentBalance-=amount;
			System.out.println("Amount withdrawn successfully.");
		}
		
	
	@Override
	public void viewBalance() throws InsufficientBalanceException {
		
		if(currentBalance<0) 
			throw new InsufficientBalanceException("no balnce display");
			 System.out.println("Message from " + bankName);
		        System.out.println("Current Balance: " + currentBalance);
		}
	}
	


