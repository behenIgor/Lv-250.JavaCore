package Employee;

public class ContractEmployee extends Employee {

	private String federalTaxIdmember;

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public ContractEmployee(String employeeld, double hourlyRate, 
			int numberOfHours, String federalTaxIdmember) {
		super(employeeld, hourlyRate, numberOfHours);
		this.federalTaxIdmember = federalTaxIdmember;
	}
	@Override
	public void displayInfo() {
		System.out.println("Federal Tax Id member: " + federalTaxIdmember + ", Employee Id =  "
				+ super.getEmployeeld() + ", \nHourly Rate = " + super.getHourlyRate() + ", Number Of Hours = "
				+ super.getNumberOfHours() + ", Calculate Pay = " + super.calculatePay());
	}

}
