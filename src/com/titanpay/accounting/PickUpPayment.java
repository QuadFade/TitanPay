package com.titanpay.accounting;

public class PickUpPayment extends Employee {
	
	private String firstName;
	private String lastName;
	private int amt;
	
	public PickUpPayment(double weeklyDues, String lastName, String firstName, String employeeid,
			PaymentMethod paymentMethod, String bankName, String accountID ) {
		super(weeklyDues, lastName, firstName, employeeid, paymentMethod, bankName);
		// TODO Auto-generated constructor stub
	}
	public void pay() {
		System.out.println("A check for $800.00 is waiting for" + firstName() + lastName() +  "at the PostMaster");
		
	}

}
