package com.titanpay.accounting;

import java.util.ArrayList;
import java.util.Date;

/*
 * attributes
 * employeeid
 * firstname
 * lastname
 * hourlyRate
 * weeklyDues
 * 
 *getFullName()
*/

public class SalariedEmployee extends Employee {

	private double salary;
	private double commissionRate;
	private ArrayList<Receipt> receipts = new ArrayList<Receipt>();

	public SalariedEmployee(double salary, double commissionRate, double weeklyDues, String lastName, String firstName,
			String employeeid, ArrayList<Receipt> receipts, PaymentMethod PaymentMethod, String bankName) {
		super(weeklyDues, lastName, firstName, employeeid, PaymentMethod, bankName);
		this.salary = salary;
		this.commissionRate = commissionRate;
		this.receipts = receipts;
		

	}
	public void makeSale(double amt){
		receipts.add(new Receipt(new Date(), amt));
	}

	@Override
	public void pay(Date date, double saleAmt) {
		double sales = 0.0;
		for(Receipt r : receipts) {
			//int recordDate = r.getDate().compareTo(date);
			sales += r.getSalesAmount();
		}
		sales = sales * commissionRate;
		this.PaymentMethod.pay();
		
	}
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}


}
