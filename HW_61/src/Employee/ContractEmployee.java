package Employee;

public class ContractEmployee extends Employee {

	private String federalTaxIdmember;
	
	public ContractEmployee(String employeeld, String federalTaxIdmember, double averageSalary) {
		super(employeeld, averageSalary);
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}


	@Override
	public void displayInfo() {
		System.out.println("Federal Tax Id member: " + federalTaxIdmember + ", Employee Id =  "
				+ super.getEmployeeld() + ", \nFixed Monthly Payment = " + super.getAverageSalary());
	}

}
