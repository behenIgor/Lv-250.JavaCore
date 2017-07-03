package com.edu.homework4;

public class Dog {
	
	public static void main(String[] args) {

		Dog dog1 = new Dog("Athos", "Bulldog", 7);
		Dog dog2 = new Dog("Porthos", "Dalmatian", 10);
		Dog dog3 = new Dog("Aramis", "Doberman", 5);
		
		if (dog1.equals(dog2) || dog1.equals(dog3) || dog2.equals(dog3)) {
			System.out.println("There are two dogs with the same name.");
		}
		
		int maxAge = Math.max((Math.max(dog1.getAge(), dog2.getAge())), dog3.getAge());
		
		dog1.printBreedIfAgeEqualToArg(maxAge);
		dog2.printBreedIfAgeEqualToArg(maxAge);
		dog3.printBreedIfAgeEqualToArg(maxAge);
		
	}
	
	public enum Breed {
		
		Bulldog, Dalmatian, Doberman, Unidentified
		
	}

	private String name;
	private String breed;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.age = age;
		setBreed(breed);
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Dog() {
	}
	public String getBreed() {
		return this.breed;
	}
	
	public void setBreed(String breed) {
		switch(breed.toLowerCase()) {
		
		case "bulldog":
			this.breed = Breed.Bulldog.name();
			break;
			
		case "dalmatian":
			this.breed = Breed.Dalmatian.name();
			break;
			
		case "doberman":
			this.breed = Breed.Doberman.name();
			break;
			
		default: this.breed = Breed.Unidentified.name();
		} 
		
	}
	
	private void printBreedIfAgeEqualToArg(int age) {
		if (this.age == age) {
			System.out.println(this.name + " is the oldest dog. It is a " + this.breed + ".");
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Dog other = (Dog) obj;
		if (age != other.age) return false;
		if (name == null) {
			if (other.name != null) return false;
		} else if (!name.equals(other.name)) return false;
		return true;
	}
	
}
