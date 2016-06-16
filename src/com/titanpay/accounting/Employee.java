package com.titanpay.accounting;

import java.util.ArrayList;
import java.util.Date;

public abstract class Employee implements Payable {
	private String employeeid;
	private String firstName;
	private String lastName;
	private double weeklyDues;
	private PaymentMethod paymentMethod;
	
	public Employee(double weeklyDues, String lastName, String firstName, String employeeid, PaymentMethod PaymentMethod, String bankName){		
		this.employeeid = employeeid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.weeklyDues = weeklyDues;
		this.paymentMethod = PaymentMethod;
	}

	
	

	public abstract void pay();

	public String lastName() {
		return lastName;
	}
	public void getLastName(String lastName) {
		this.lastName = lastName;
	}

	public String firstName(){
		return firstName;
		
	}
	
	public void setFirstName(String firstName){
		this.setFirstName(firstName);
	}
	
	
	public double setWeeklyDues() {
		return weeklyDues;
	
	}
	public double getWeeklyDues() {
		return weeklyDues;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	
	public String getFullName(){
		return  firstName + "," + lastName;




	}


	public void pay(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		
	}

	public void pay(Date date, double saleAmt) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
	

