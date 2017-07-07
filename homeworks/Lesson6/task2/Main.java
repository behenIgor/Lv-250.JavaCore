package task2;

public class Main {

	public static void main(String[] args) {
		Employee[] arrOfEmployees = new Employee[4];
		arrOfEmployees[0] = new SalariedEmployee("1452","Ivan Shushko","752334",4320);
		arrOfEmployees[1] = new ContractEmployee("8563","Oksana Mychka","856334",40,150);
		arrOfEmployees[2] = new SalariedEmployee("7526","Anatoliy Beloshevych","745325",5240);
		arrOfEmployees[3] = new ContractEmployee("5854","Sofiya Cheryba","756966",30,120);
		
		Employee temp;
		for (int i = 0; i < arrOfEmployees.length; i++) {
			for (int j = 0; j < arrOfEmployees.length-i-1; j++) {
				if(arrOfEmployees[j].calculatePay()<arrOfEmployees[j+1].calculatePay()) {
					temp = arrOfEmployees[j];
					arrOfEmployees[j] = arrOfEmployees[j+1];
					arrOfEmployees[j+1] = temp;
				}
			}	
		}
		
		for (Employee e : arrOfEmployees) {
			System.out.println(e);
		}
	}

}
