package Task2;

public class SalariedEmployee extends Employee implements CalcPay {

	private double hourlyrate;
	private double numberofhoursworked;
	private String socialSecurityNumber;
	

	

	public double getHourlyrate() {
		return hourlyrate;
	}

	public void setHourlyrate(double hourlyrate) {
		this.hourlyrate = hourlyrate;
	}

	public double getNumberofhoursworked() {
		return numberofhoursworked;
	}

	public void setNumberofhoursworked(double numberofhoursworked) {
		this.numberofhoursworked = numberofhoursworked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double calculatePay() {
		 return hourlyrate * numberofhoursworked;
	}

	public SalariedEmployee(String employeeld, String name, double hourlyrate, double numberofhoursworked,
			String socialSecurityNumber) {
		super(employeeld, name);
		this.hourlyrate = hourlyrate;
		this.numberofhoursworked = numberofhoursworked;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	public String toString() {
		return "Employee ID " + getEmployeeld() + ", name " + getName() +  ", average monthly wage " + calculatePay() ;
	}

}
