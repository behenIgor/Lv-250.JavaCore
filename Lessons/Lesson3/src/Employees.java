
public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee emp1 = new Employee();
          emp1.setName("Oleg");
          emp1.setRate(7);
          emp1.setHours(10);
          Employee emp2 = new Employee("Nazar",6);
          emp2.setHours(11);
          Employee emp3 = new Employee("Vasia",5,12);
         double salary1 = emp1.salary();
         double salary2 = emp2.salary();
         double salary3 = emp2.salary();
         
         double bonus1 = emp1.bonuses(salary1);
         double bonus2 = emp2.bonuses(salary2);
         double bonus3 = emp2.bonuses(salary3);
         
          System.out.println(emp1 + " salary=" + salary1 + " bonus=" + bonus1);
          System.out.println(emp2 + " salary=" + salary2 + " bonus=" + bonus2);
          System.out.println(emp3+ " salary=" + salary3 + " bonus=" + bonus3);
          
          
          Employee.setTotalSum(emp1.getHours() +  emp2.getHours() +  emp3.getHours());
         System.out.println("total hours of all workers= "+ Employee.getTotalSum());
          
          
	}

}
