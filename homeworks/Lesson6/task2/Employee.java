package task2;

public abstract class Employee implements Pay {
	private String name;
	private String employeeId;

	public Employee() {}
	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeld(String employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", employeeId=" + employeeId + ", salary=" + calculatePay() + "]";
	}
	
	
	
	
	
}
