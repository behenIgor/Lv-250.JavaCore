package com.edu.classwork6;

public class Main {

	public static void main(String[] args) {
		Animal animal[] = new Animal[6];
		animal[0] = new Cat();
		animal[1] = new Dog();
		animal[2] = new Cat();
		animal[3] = new Cat();
		animal[4] = new Dog();
		animal[5] = new Dog();
		
		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i].getClass().getSimpleName() + " goes '" +
		animal[i].voice() + "' and eats " + animal[i].feed());
		}
		
		System.out.println();
		
		Person person[] = new Person[6];
		person[0] = new Teacher("Volodymyr");
		person[1] = new Student("Andrii");
		person[2] = new Teacher("Olena");
		person[3] = new Cleaner("Petro");
		person[4] = new Student("Anna");
		person[5] = new Cleaner("Maria");
		
		System.out.println();
		
		for (int i = 0; i < person.length; i++) {
			if (person[i] instanceof Staff) {
				System.out.println();
				person[i].print();
				System.out.println("My salary is " + ((Staff)person[i]).salary());
			} else {
				System.out.println();
				person[i].print();
			}
		}
		
	}

}
