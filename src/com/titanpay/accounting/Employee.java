package com.titanpay.accounting; 

/*
 * employeeid
 * firstName
 * lastName
 * salary
 * commisionRate
 * weeklyDues
 * 
 * getFullName()
 */


public class Employee {
	private String employeeid;
	private String firstName;
	private String lastName;
	private double hourlyRate;
	private double weeklyDues;
	
	public Employee(String employeeid, String firstName, String lastName, double hourlyRate,double weeklyDues){		
		this.employeeid = employeeid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
		this.weeklyDues = weeklyDues;	
	}
	
	public String getFullName(){
		return lastName + ", " + firstName;
	}
	
	
	
}
