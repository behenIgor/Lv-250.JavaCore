package Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new SalariedEmployee("Some Employee Id", 2.8, 
				6, "Social Security Number" );
		Employee emp2 = new ContractEmployee("Some Employee Id 2", 3.9, 
				8, "Federal Tax Id member");
		emp.displayInfo();
		emp2.displayInfo();
	}

}
