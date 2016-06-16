package com.titanpay.accounting;

public class DirectDepositPayment extends BankAccount{
	
	private double amt;
	private String bankName;	
	private double routingNumber;
	private String accountID; 
	
	public DirectDepositPayment(String bankName, double routingNumber, String accountID, double amt, String firstName, String lastName,
			PaymentMethod PaymentMethod, double weeklyDues, String employeeid) {
		
		super(bankName, routingNumber, accountID, amt, firstName, lastName, weeklyDues, PaymentMethod, employeeid);
		this.amt = amt;
		this.bankName = bankName;
		this.routingNumber = routingNumber;
		this.accountID = accountID;
	}

	public void pay(){
		System.out.println("Depositing" + amt + " in" + bankName + "Account Number" + accountID + "using Routing Number" + routingNumber);
	}
}
