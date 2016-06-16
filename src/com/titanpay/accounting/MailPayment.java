package com.titanpay.accounting;

public class MailPayment extends Employee {
	
	private String firstName;
	private String lastName;
 	private double amt;
 	private Address address;
 	
	

	public MailPayment(double weeklyDues, String lastName, String firstName, String employeeid,
			com.titanpay.accounting.PaymentMethod PaymentMethod) {
		super(weeklyDues, lastName, firstName, employeeid, PaymentMethod, employeeid);
		// TODO Auto-generated constructor stub
	}
		
		

	@Override
	public void pay() {
		System.out.println("Mailing a check to" + firstName + lastName + "for" + amt + "to" + address.getAddress());
		
	}


}
