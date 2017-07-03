package task2;

public class main {
	public static void main(String[] args) {
		Employee [] em = new Employee[4]; 
		em[0] = new ContractEmployee("Oleg", 1243 , 1000);
		em[1] =new ContractEmployee("Danylo", 1278, 800);
		em[2] = new SalariedEmployee("Olena", "ks1234", 28, 6){};
		em[3] = new SalariedEmployee("Mykyta", "bn2145", 15, 8){};
	
		for (int i=0; i < em.length; i++){
		System.out.println(em[i]);
		}
	}

}
