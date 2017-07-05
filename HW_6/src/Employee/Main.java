package Employee;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Employee[] empl = new Employee[4];

		empl[0] = new SalariedEmployee("Id 132", 2.95, 350, "SalariedEmployee");
		empl[1] = new SalariedEmployee("Id 352", 4.2, 366, "SalariedEmployee");
		empl[2] = new ContractEmployee("Id 2", "ContractEmployee", 1358.6);
		empl[3] = new ContractEmployee("Id 125", "ContractEmployee", 1405);

		for (Employee emp : empl) {
			emp.displayInfo();
		}

		System.out.println("----------------------------------------------------------------------");

		Arrays.sort(empl, new Comparator<Employee>() {
			public int compare(Employee a, Employee b) {
				double dif = a.getSalary() - b.getSalary();
				return (dif > 0.0) ? -1 : (dif < 0.0) ? 1 : 0;
			}
		});

		for (Employee emp : empl) {
			emp.displayInfo();
		}
		
		System.out.println("Avarage salary = " + Employee.getAverageSalary() / empl.length);

	}

}
