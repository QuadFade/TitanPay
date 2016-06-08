package com.titanpay.accounting;



public class WagedEmployee extends Employee {
	
	private double hourlyRate;
	private int hoursWorked;

	public WagedEmployee(double hourlyRate, int hoursWorked,double weeklyDues, String lastName, String firstName, String employeeid) {
		super(weeklyDues, lastName, employeeid, firstName);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		
	
	}
	
	
	

}
