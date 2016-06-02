package com.titanpay.accounting;

/*
 * date
 * startTime
 * endTime
 * 
 * calculateDailyPay(rate)
 * 
 */
	

public class TimeCard {
	private String date;
	private double startTime;
	private double endTime;

	public TimeCard(String date, double startTime, double endTime) {
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	} 

	public double calculateDailyPay(double rate) {
		double hours = endTime - startTime;
		if (hours > 8) {
			return hours * rate * 1.5;
		} else {
			return hours * rate;
		}
	}
	
}
