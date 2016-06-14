package com.titanpay.accounting;

import java.util.ArrayList;

public abstract class Employee {
	private String employeeid;
	private String firstName;
	private String lastName;
	private double weeklyDues;
    
	
	public Employee(double weeklyDues, String lastName, String firstName, String employeeid){		
		this.employeeid = employeeid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.weeklyDues = weeklyDues;
		
	}

	
	



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
	
	public void makeSale(double amt){
		
		
	}
	
	
}
	

