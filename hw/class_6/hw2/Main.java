package task6.home2;

/**
 * Created by User on 08.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[4];
        employee[0] = new SalariedEmployee( "Nata", "45674","2366437657", 7000);
        employee[1] = new SalariedEmployee("Jana", "34576","6566498657", 6500);
        employee[2] = new ContractEmployee("Jura", "34698","2369364957", 26, 200);
        employee[3] = new ContractEmployee("Roma" , "45897","9256437659", 30, 300);


        Employee em = null;
        for (int i = 0; i < employee.length-1; i++) {
            for (int j = i+1; j < employee.length ; j++) {
                if (employee[i].calculatePay() < employee[j].calculatePay()){
                em = employee[i];
                employee[i] = employee[j];
                employee[j] = em;
                }
            }
        }
        for (Employee e: employee){
            System.out.println(e);
        }
    }
}
