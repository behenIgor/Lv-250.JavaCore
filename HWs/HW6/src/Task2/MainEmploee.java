package Task2;

public class MainEmploee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] aemp = new Employee[3];
		aemp[0] = new SalariedEmployee("001", "Nazar", 12, 248, "57858385");
		aemp[1] = new ContractEmployee("002", "Oleg", 3000, "79584729");
		aemp[2] = new SalariedEmployee("003", "Alex", 30, 310, "57858385");

		

		Employee tmp;
		for (int i = 0; i < aemp.length - 1; i++) {
			for (int j = i + 1; j < aemp.length; j++) {

				if (aemp[i] instanceof SalariedEmployee && aemp[j] instanceof SalariedEmployee) {
					if (((SalariedEmployee) aemp[i]).calculatePay() < ((SalariedEmployee) aemp[j]).calculatePay()) {
						tmp = aemp[i];
						aemp[i] = aemp[j];
						aemp[j] = tmp;
					}
				}

				else if (aemp[i] instanceof SalariedEmployee && aemp[j] instanceof ContractEmployee) {
					if (((SalariedEmployee) aemp[i]).calculatePay() < ((ContractEmployee) aemp[j]).calculatePay()) {
						tmp = aemp[i];
						aemp[i] = aemp[j];
						aemp[j] = tmp;
					}
				}

				else if (aemp[i] instanceof ContractEmployee && aemp[j] instanceof SalariedEmployee) {
					if (((ContractEmployee) aemp[i]).calculatePay() < ((SalariedEmployee) aemp[j]).calculatePay()) {
						tmp = aemp[i];
						aemp[i] = aemp[j];
						aemp[j] = tmp;
					}
				}

				else {
					if (((ContractEmployee) aemp[i]).calculatePay() < ((ContractEmployee) aemp[j]).calculatePay()) {
						tmp = aemp[i];
						aemp[i] = aemp[j];
						aemp[j] = tmp;
					}
				}

			}
		}
		
		System.out.println("Workers arranged by the average monthly wage in descending order");
		System.out.println("");
		for (int i = 0; i < aemp.length; i++) {
			System.out.println(aemp[i]);
		}

	}

}
