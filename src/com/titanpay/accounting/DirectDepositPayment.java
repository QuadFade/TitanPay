package com.titanpay.accounting;

public class DirectDepositPayment extends PaymentMethod{

	public DirectDepositPayment(double weeklyDues, String lastName, String firstName, String employeeid) {
		super(weeklyDues, lastName, firstName, employeeid);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		
	}

}
