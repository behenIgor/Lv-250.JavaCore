package Employee;

public class ContractEmployee extends Employee {

	private String federalTaxIdmember;
	double fixedMonthlyPayment;
	
	public ContractEmployee(String employeeld, String federalTaxIdmember, double fixedMonthlyPayment) {
		super(employeeld);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
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
				+ super.getEmployeeld() + ", \nFixed Monthly Payment = " + fixedMonthlyPayment);
	}

}
