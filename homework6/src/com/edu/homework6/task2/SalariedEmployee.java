package com.edu.homework6.task2;

public class SalariedEmployee extends Employee implements Pay {

	private int socialSecurityNumber;
	private int fixedMonthlyPayment;
	
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public int calculatePay() {
		return fixedMonthlyPayment;
	}

	public SalariedEmployee(String name, String employeeId, int socialSecurityNumber, 
			int fixedMonthlyPayment) {
		super(name, employeeId);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	
}
