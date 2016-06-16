package com.titanpay.accounting;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class HourlyEmployee extends Employee {
	//
	private double hourlyRate;
	private int hoursWorked;
	private ArrayList<TimeCard> timeCards = new ArrayList<TimeCard>();

	public HourlyEmployee(double weeklyDues, String lastName, String firstName, String employeeid, double hourlyRate,
			int hoursWorked, ArrayList<TimeCard> timecards, PaymentMethod PaymentMethod, String bankName) {
		super(weeklyDues, lastName, firstName, employeeid, PaymentMethod,bankName);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.timeCards = timecards;
	}

	public void clockIn() {
		Date date = new Date();
		timeCards.add(new TimeCard(date, date.getTime()));

	}

	public void clockOut() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("MMddyyyy");
		for (TimeCard tc : timeCards) {
			if (format.format(date).equals(format.format(tc.getDate()))) {
				tc.setEndTime(date.getTime());
			}
		}
	}

	@Override
	public void pay(Date startDate, Date endDate) {

		double sum = 0;
		for (TimeCard tc : timeCards) {
			int startCompare = tc.getDate().compareTo(startDate);
			int endCompare = tc.getDate().compareTo(endDate);

			if ((startCompare == 0 || startCompare > 0) && (endCompare == 0 || endCompare < 0)) {
				sum += tc.calculateDailyPay(hourlyRate);
				
			}
		
		}
		
		this.pay();
		

	}

	@Override
	public void pay(Date date, double saleAmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
}




