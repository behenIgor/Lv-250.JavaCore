package Employee;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Employee []empl =new Employee[4];
		
		empl[0]= new SalariedEmployee("Some Employee Id 132", 2.95, 
				350, "Social Security Number" );
		empl[1]= new SalariedEmployee("Some Employee Id 352", 2.8, 
				366, "Social Security Number" );
		empl[2] = new ContractEmployee("Some Employee Id 2","Tax Id member", 1358.6);
		
		empl[3] = new ContractEmployee("Some Employee Id 125","Tax Id member", 1458.6);
		
		for(Employee emp :empl){
			emp.displayInfo();
		}
		
		System.out.println("----------------------------------------------------------------------");
		
        Arrays.sort(empl, new Comparator<Employee> () {
            public int compare(Employee a, Employee b) {
                double dif = a.calculatePay() - b.calculatePay();
                return ( dif > 0.0 ) ? -1 : ( dif < 0.0 ) ? 1 : 0;
            }
        });
        
        for(Employee emp :empl){
			emp.displayInfo();
		}
		

	}

}
