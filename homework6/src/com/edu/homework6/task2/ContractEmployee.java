package com.edu.homework6.task2;

public class ContractEmployee extends Employee implements Pay {

	private int federalTaxIdNumber;
	private int hourlyRate;
	private int numberOfHoursWorked;
	
	@Override
	public int calculatePay() {
		return hourlyRate * numberOfHoursWorked;
	}

	public int getFederalTaxIdNumber() {
		return federalTaxIdNumber;
	}

	public void setFederalTaxIdNumber(int federalTaxIdNumber) {
		this.federalTaxIdNumber = federalTaxIdNumber;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public ContractEmployee(String name, String employeeId, int federalTaxIdNumber, 
			int hourlyRate, int numberOfHoursWorked) {
		super(name, employeeId);
		this.federalTaxIdNumber = federalTaxIdNumber;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	
}
