package task2;

public class ContractEmployee extends Employee implements Pay {

	private String federalTaxIdmember;
	private int hourlyRate;
	private int hoursWorked;
	
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(String employeeId,String name, String federalTaxIdmember, int hourlyRate, int hoursWorked) {
		super(employeeId,name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public int calculatePay() {
		return hourlyRate*hoursWorked;
	}

}
