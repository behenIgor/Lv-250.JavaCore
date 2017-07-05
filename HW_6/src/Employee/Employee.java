package Employee;

public class Employee implements CalculatePay {

	private String employeeld;
	private double hourlyRate;
	private int numberOfHours;
	private double salary;
	private static double averageSalary;

	public Employee(String employeeld, double salary) {
		super();
		this.employeeld = employeeld;
		this.salary = salary;
		averageSalary+=salary;
	}

	public Employee(String employeeld, double hourlyRate, int numberOfHours) {
		super();
		this.employeeld = employeeld;
		this.hourlyRate = hourlyRate;
		this.numberOfHours = numberOfHours;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		averageSalary+=salary;
	}

	public static double getAverageSalary() {
		return averageSalary;
	}

	public double calculatePay() {
		return hourlyRate * numberOfHours;
	}

	void displayInfo() {
	}

}
