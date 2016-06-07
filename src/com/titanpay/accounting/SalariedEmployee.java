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
	private String employeeid;
	private String firstName;
	private String lastName;
	private double salary;
	private double commissionRate;
	private double weeklyDues;
	
	public SalariedEmployee(String employeeid, String firstName, String lastName, double salary,double weeklyDues, double commissionRate){		
		super(salary, commissionRate, weeklyDues, firstName, lastName, employeeid, 0); 
		this.employeeid = employeeid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.commissionRate = commissionRate;
		this.weeklyDues = weeklyDues;
	
		
		
	}

	public String getFullName(){
		return getLastName() + ", " + getFirstName();
	}

	public String getLastName() {
		return getFirstName();
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return getLastName();
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;


		}
	
}
		
		
		

	
	

	


