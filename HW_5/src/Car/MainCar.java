package Car;

import java.util.*;

public class MainCar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		 Car []cars = new Car[4];
		 cars[0] = new Car("Renault",1.4, 2005);
		 cars[1] = new Car("Ford",2.4, 2006);
		 cars[2] = new Car("BMW",2.0, 2012);
		 cars[3] = new Car("Audi",1.9, 2015);
		 cars[0] = new Car("Hren",1.4, 2017);

		System.out.println("Input year of production");
		int year = input.nextInt();
		for (Car car : cars) {
			if (car.yearOfProduction == year)
				System.out.println(car);
		}

		System.out.println("Sorting in decreasing order Year");
		
        Arrays.sort(cars, new Comparator<Car> () {
            public int compare(Car a, Car b) {
                double dif = a.getYearOfProduction() - b.getYearOfProduction();
                return ( dif > 0.0 ) ? -1 : ( dif < 0.0 ) ? 1 : 0;
            }
        });

		for (Car car : cars) {
			System.out.println(car);
		}

		input.close();
	}

}
