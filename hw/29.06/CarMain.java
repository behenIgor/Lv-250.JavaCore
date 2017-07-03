package new29;

import sun.reflect.generics.tree.TypeArgument;

import java.util.Scanner;

/**
 * Created by Вождь on 01.07.2017.
 */
public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car(Car.TypeCar.Crossover, 2009, 2.3);
        Car car2 = new Car(Car.TypeCar.Hatchback, 2015, 1.8);
        Car car3 = new Car(Car.TypeCar.SUV, 2006, 2);
        Car car4 = new Car(Car.TypeCar.Sedan, 2014, 1.3);

        Car[] cars = new Car[4];
        cars[0] = car;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;

        int year = Integer.parseInt(scanner.nextLine());
        for (Car c: cars){
            if(year == c.getYear())
                System.out.println(c);
        }

        Car tmp = null;
        for (int i = 0; i < cars.length-1 ; i++) {
            for (int j = i+1; j < cars.length ; j++) {
                if(cars[i].getYear()>cars[j].getYear())
                {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }

        }
        for (Car c: cars){
            System.out.println(c);
        }
    }
}
