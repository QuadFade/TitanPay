package com.titanpay.accounting;

import java.util.ArrayList;
import java.util.Date;

/*
 * bankName
 * routingNumber
 * accountid
 * 
 * deposit(amt) 
 */
	
	
public class BankAccount extends PaymentMethod implements Payable {
	
	private String bankName;
	private double routingNumber;
	private String accountid; 

	public BankAccount(String bankName, double routingNumber, String accountID){
		this.bankName = bankName;
		this.routingNumber = routingNumber;
		this.accountid = accountID;;
	}
	
	public BankAccount() {
		this.bankName = " ";
		this.routingNumber = 0;
		this.accountid = " ";
		
	}
	
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
	
	public void deposit(double amt){
		System.out.println("Depositing" + amt + " in" + bankName + "Account Number" + accountid + "using Routing Number" + routingNumber);
		}

	@Override
	public double pay(Date date, double saleAmt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pay(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return 0;
	}


		
	
}

