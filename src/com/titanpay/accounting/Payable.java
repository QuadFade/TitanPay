package com.titanpay.accounting;

import java.util.Date;

/*
 * create a single method called pay
 * pay takes a start date and an end date
 * HourlyEmployee and SalariedEmployee both implement this interface
 * 
 */
public interface Payable {

	void pay(Date date, double saleAmt);

	void pay(Date startDate, Date endDate);
	
		
}
