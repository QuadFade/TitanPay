package com.titanpay.accounting;

import java.util.Date;

/*
 * date
 * saleAmt
 */ 
	
	
public class Receipt{
	
	//create exception for date when 1-12 
	private Date date;
	private double salesAmt;
	
	public Receipt(Date date, double salesAmt){
		this.date = date;
		this.salesAmt = salesAmt;
		
	}

	public Date getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public double getSalesAmount() {
		return salesAmt;
	}
	
}