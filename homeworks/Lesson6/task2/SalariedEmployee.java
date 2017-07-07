package task2;

public class SalariedEmployee extends Employee implements Pay {

	private String socialSecurityNumber;
	private int fixedMonthlyPayment;

	public SalariedEmployee() {
		super();
	}
	public SalariedEmployee(String employeeId,String name,String socialSecurityNumber, int fixedMonthlyPayment) {
		super(employeeId,name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		
	}
	
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
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
}
