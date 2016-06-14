package com.titanpay.accounting;

public class MailPayment extends PaymentMethod {

	public MailPayment(double weeklyDues, String lastName, String firstName, String employeeid) {
		super(weeklyDues, lastName, firstName, employeeid);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		System.out.println("Mailing a check to Adrian Tillman for $800.00 to 504 College Drive Albany, GA. 31705");
	}

}
