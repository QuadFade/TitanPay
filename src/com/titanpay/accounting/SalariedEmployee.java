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

public class SalariedEmployee extends Employee implements Payable {

	private double salary;
	private double commissionRate;
	private ArrayList<Receipt> receipts = new ArrayList<>();

	public SalariedEmployee(double salary, double commissionRate, double weeklyDues, String lastName, String firstName,
			String employeeid, ArrayList<Receipt> receipts) {
		super(weeklyDues, lastName, firstName, employeeid);
		this.salary = salary;
		this.commissionRate = commissionRate;
		this.receipts = receipts;

	}
	public void makeSale(double amt){
		receipts.add(new Receipt(new Date(), amt));
	}

	@Override
	public double pay(Date date, double saleAmt) {
		double sales = 0.0;
		for(Receipt r : receipts) {
			//int recordDate = r.getDate().compareTo(date);
			sales += r.getSalesAmount();
		}
		sales = sales * commissionRate;
		return sales;
		
	
	}
	@Override
	public double pay(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}


}
