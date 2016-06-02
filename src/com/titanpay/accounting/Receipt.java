package com.titanpay.accounting;

/*
 * date
 * saleAmt
 */ 
	
	
public class Receipt{
	
	//create exception for date when 1-12 
	public int date;
	public double salesAmt;
	
	public Receipt(int date, double salesAmt){
		this.date = date;
		this.salesAmt = salesAmt;
		
	}
	
	
	
}