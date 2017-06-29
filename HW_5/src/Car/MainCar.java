package Car;

import java.util.Scanner;

public class MainCar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Car []cars = new Car[4];
		cars[0] = new Car("Renault",1.4, 2005);
		cars[1] = new Car("Ford",2.4, 2006);
		cars[2] = new Car("BMW",2.0, 2012);
		cars[3] = new Car("Audi",1.9, 2015);
		
		System.out.println("Input year of production");
		int year = input.nextInt();
		for(Car car :cars){
			if(car.yearOfProduction == year)
			System.out.println(car);			
		}
		
		System.out.println("Sorting in decreasing order Year");
		int tmp;
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].yearOfProduction < cars[j].yearOfProduction) {
					tmp = cars[i].yearOfProduction;
					cars[i].yearOfProduction = cars[j].yearOfProduction;
					cars[j].yearOfProduction = tmp;
				}
			}
		}		

		for(Car car :cars){
			System.out.println(car);			
		}
		
		
		input.close();
	}

}
