package com.titanpay.accounting;

/*
 * bankName
 * routingNumber
 * accountid
 * 
 * deposit(amt) 
 */
	
	
public class BankAccount {
	
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
	
	public void deposit(double amt) {
		System.out.println("Depositing $" + amt + "In Bank of America Account Number" + accountid + "using Routing Number:" + routingNumber);
	
	}
		
		
		
		
	
}

