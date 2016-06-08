package com.titanpay.accounting;

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

	
	public SalariedEmployee(double salary, double commissionRate, double weeklyDues, String lastName, String firstName, String employeeid){		
		super(weeklyDues, lastName, firstName, employeeid); 
		this.salary = salary;
		this.commissionRate = commissionRate;
	
		

	}
	
}
		
		
		

	
	

	


