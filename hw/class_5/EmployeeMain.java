package new29;

import java.util.Scanner;

/**
 * Created by Вождь on 29.06.2017.
 */
public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jon",3,3500);
        employees[1] = new Employee("Jek",5,4500);
        employees[2] = new Employee("Ian",3,8500);
        employees[3] = new Employee("Fedir",5,4500);
        employees[4] = new Employee("Len",6,9500);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input department that you want: ");
        int inpunDepartment = Integer.parseInt(scanner.nextLine());
        for (Employee employee: employees){
            if(employee.department_number == inpunDepartment)
                System.out.println(employee);
        }


        Employee em = null;
        for(int i=0; i < employees.length-1 ; i++){

            for(int j=i+1 ; j < employees.length ; j++){

                if(employees[i].getSalary() < employees[j].getSalary()) {
                    em = employees[i];
                    employees[i] = employees[j];
                    employees[j] = em;
                }
            }
        }
        scanner.close();
        for(Employee e: employees){
            System.out.println(e);
        }

    }
}
