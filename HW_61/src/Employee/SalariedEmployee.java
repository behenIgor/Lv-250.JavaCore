package Employee;

public class SalariedEmployee extends Employee {

	private String socialSecurityNumber;

	public SalariedEmployee(String employeeld, double hourlyRate, int numberOfHours, 
			String socialSecurityNumber) {
		super(employeeld, hourlyRate, numberOfHours);
		this.socialSecurityNumber = socialSecurityNumber;
		super.setAverageSalary(super.calculatePay());
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public void displayInfo() {
		System.out.println("Social Security Number: " + socialSecurityNumber + ", Employee Id =  "
				+ super.getEmployeeld() + ", \nHourly Rate = " + super.getHourlyRate() + ", Number Of Hours = "
				+ super.getNumberOfHours() + ", Calculate Pay = " + super.getAverageSalary());
	}

}
