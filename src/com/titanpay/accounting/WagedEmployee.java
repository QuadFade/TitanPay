package com.titanpay.accounting;

public class WagedEmployee extends Employee {
	
	private double hourlyRate;
	private int hoursWorked;

	public WagedEmployee(double salary, double commissionRate, double weeklyDues, String firstName, String lastName,
			String employeeid, double hourlyRate, int hoursWorked) {
		super(hourlyRate, hoursWorked, hourlyRate, employeeid, employeeid, employeeid, hoursWorked);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		
	
	}
	
	
	

}
