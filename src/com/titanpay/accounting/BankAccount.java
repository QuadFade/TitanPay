package com.titanpay.accounting;

/*
 * bankName
 * routingNumber
 * accountid
 * 
 * deposit(amt) 
 */
	
	
public abstract class BankAccount {
	
	private String bankName;
	private double routingNumber;
	private String accountid;

	public BankAccount(String bankName, double routingNumber, String accountID){
		this.bankName = bankName;
		this.routingNumber = routingNumber;
		this.accountid = accountID;
		
	}
	
	public BankAccount() {
		this.bankName = "";
		this.routingNumber = 0;
		this.accountid = "";
		
	}
	
	public abstract void deposit(double amt);
		
		
		
		
	
}

