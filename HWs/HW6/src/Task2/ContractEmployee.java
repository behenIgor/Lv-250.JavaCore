package Task2;

public class ContractEmployee extends Employee implements CalcPay {

	
	private double fixedmonthlypayment;
	private String federalTaxIdmember;

	

	public double getFixedmonthlypayment() {
		return fixedmonthlypayment;
	}

	public void setFixedmonthlypayment(double fixedmonthlypayment) {
		this.fixedmonthlypayment = fixedmonthlypayment;
	}

	public  double calculatePay() {
		 return fixedmonthlypayment;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public ContractEmployee(String employeeld, String name,double fixedmonthlypayment, String federalTaxIdmember) {
		super(employeeld, name);
		this.fixedmonthlypayment = fixedmonthlypayment;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public String toString() {
		return "Employee ID " + getEmployeeld() + ", name " + getName() +  ", average monthly wage " + calculatePay() ;
	}
	
	


}
