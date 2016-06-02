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

public class SalariedEmployee {
	private String employeeid;
	private String firstName;
	private String lastName;
	private double salary;
	private double commissionRate;
	private double weeklyDues;
	
	public SalariedEmployee(String employeeid, String firstName, String lastName, double salary, double commisionRate,double weeklyDues){		
		this.employeeid = employeeid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.commissionRate = commisionRate;
		this.weeklyDues = weeklyDues;

		
	}
	
	public String getFullName(){
		return lastName + ", " + firstName;
		
	}
	
	

	

}
