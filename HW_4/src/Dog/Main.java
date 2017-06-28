package Dog;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		ArrayList<Dog> dogs = new ArrayList<Dog>();

		Breeds breed = Breeds.Lab;
		Breeds breedT = Breeds.Terrier;
		Breeds breedG = Breeds.GreatDane;
		Breeds breedS = Breeds.Setter;
		

		dogs.add(new Dog(6, "Nick", breedT.getBreedName()));
		dogs.add(new Dog(8, "Mike", breed.getBreedName()));
		dogs.add(new Dog(9, "Bob", breedG.getBreedName()));
		dogs.add(new Dog(2, "Mike", breedS.getBreedName()));

		int max = 0;
		String name = "";
		
		//oldest dog
		for (Dog dog : dogs) {
			if(dog.age > max) 
				max = dog.age;
			
			//The same name
			if(name.equals(dog.name))
				name = dog.name;
			else 
				name = dog.name;			
		}	
		
		System.out.println("The same name " + name);
		
		for (Dog dog : dogs) {
			if(dog.age == max) 
				System.out.println("Oldest dog " + dog);
		}		
	}
}
