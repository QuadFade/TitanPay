package com.titanpay.accounting;

public class PickUpPayment extends PaymentMethod {

	public PickUpPayment(double weeklyDues, String lastName, String firstName, String employeeid) {
		super(weeklyDues, lastName, firstName, employeeid);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		System.out.println("A check for $800.00 is waiting for Adrian Tillman at the PostMaster");
		
	}

}
