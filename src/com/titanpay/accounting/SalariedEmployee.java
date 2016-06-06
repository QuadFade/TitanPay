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
//	private String employeeid;
//	private String firstName;
//	private String lastName;
	private double salary;
	private double commissionRate;
	private double weeklyDues;
	
	public SalariedEmployee(String employeeid, String firstName, String lastName, double salary, double commisionRate,double weeklyDues, double commissionRate){		
		super(salary, commissionRate, weeklyDues, firstName, lastName, employeeid); 
//		this.employeeid = employeeid;
//		this.firstName = firstName;
//		this.lastName = lastName;
		this.salary = salary;
		this.commissionRate = commissionRate;
		this.weeklyDues = weeklyDues;

		
	}
//	
//	public String getFullName(){
//		return getLastName() + ", " + getFirstName();
		
	}
	
	

	


