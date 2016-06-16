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
	
	
public class BankAccount extends Employee implements Payable {
	
	private String bankName;
	private double routingNumber;
	private String accountid;
	private double amt;

	public BankAccount(String bankName, double routingNumber, String accountID, double amt,
			String firstName, String lastName, double weeklyDues, PaymentMethod PaymentMethod, String employeeid){
		super(weeklyDues, lastName, firstName, employeeid, PaymentMethod, bankName);
		this.bankName = bankName;
		this.routingNumber = routingNumber;
		this.accountid = accountID;
		this.amt = amt;
	}
	
//	public BankAccount() {
//		this.bankName = " ";
//		this.routingNumber = 0;
//		this.accountid = " ";
//		this.amt = 0.0;
//	}
	
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
	
	public void deposit(double amt){
		
		}

	@Override
	public void pay(Date date, double saleAmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		
	}


		
	
}

