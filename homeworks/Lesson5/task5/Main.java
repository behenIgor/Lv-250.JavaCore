package task5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Car[] arrOfCars = new Car[5];
		arrOfCars[0] = new Car("pickup",1995,1000.0);
		arrOfCars[1] = new Car("pickup",1994,1100.0);
		arrOfCars[2] = new Car("tank",1995,5000.0);
		arrOfCars[3] = new Car("jeep",2004,2000.0);
		arrOfCars[4] = new Car("hatchback",1994,1300.0);
		
		for(int i=0; i<arrOfCars.length; i++) { 
			System.out.print(+arrOfCars[i].getYearOfProd()+" ");
		}
		
		System.out.println("\nInput year of product ");       
		Scanner in = new Scanner(System.in);
		int yearOfProd = in.nextInt();
		in.close();						
		for(int i=0; i<arrOfCars.length; i++) {                 	//Виведення всіх машин заданого року
			if(arrOfCars[i].getYearOfProd()==yearOfProd) {      
				System.out.println(arrOfCars[i]);
			}
		}
		
		Car temp;
		for(int i=0; i<arrOfCars.length; i++) {						//Сортування за роком випуску
			for(int j=0; j<arrOfCars.length-i-1; j++){
				if(arrOfCars[j].olderThan(arrOfCars[j+1])) {
					temp = arrOfCars[j];
					arrOfCars[j] = arrOfCars[j+1];
					arrOfCars[j+1] = temp;
				}
			}
		}
		
		System.out.println("");
		for(int i=0; i<arrOfCars.length; i++) {						//Виведення відсортованого масиву		
			System.out.print(+arrOfCars[i].getYearOfProd()+" ");
		}
	}
}
