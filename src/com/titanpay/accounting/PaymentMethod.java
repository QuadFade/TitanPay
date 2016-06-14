package com.titanpay.accounting;

public abstract class PaymentMethod extends Employee {
	
	public PaymentMethod(double weeklyDues, String lastName, String firstName, String employeeid) {
		super(weeklyDues, lastName, firstName, employeeid);  
	}

	public abstract void pay();
		
}
