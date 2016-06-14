package com.titanpay.accounting;

import java.util.Date;


/*
 * date
 * startTime
 * endTime
 * 
 * calculateDailyPay(rate)
 * 
 */
	

public class TimeCard {
	private Date date;
	private long startTime;
	private long endTime;

	public TimeCard(Date date, long startTime, long endTime) {
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	} 
	
	public TimeCard(Date date, long startTime){
		this.date = date;
		this.startTime = startTime;
		
	}

	public double calculateDailyPay(double rate) {
		double hours = (endTime - startTime) / 3600000;
		if (hours > 8) {
			return hours * rate * 1.5;
		} else {
			return hours * rate;
		}
	}
	
	public long getStartTime() {
		return startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setStartTime(long millis) {
		this.startTime = millis;
	}
	
	public void setEndTime(long millis) {
		this.endTime = millis;
	}
	
}
