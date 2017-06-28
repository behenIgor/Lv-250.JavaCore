package Dog;
enum Breeds {
	Setter("Setter"), Terrier("Terrier"), Lab("Lab"), GreatDane("Great Dane");
	private String breedName;

	public String getBreedName() {
		return breedName;
	}

	Breeds(String breedName) {
		this.breedName = breedName;
	}

}

public class Dog {
	public Dog(){}
	
	public Dog(int age, String name, String breed) {
		this.age = age;
		this.name = name;
		this.breed = breed;
	}
	
	int age;
	String name;
	String breed;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public boolean sameDog(Dog dogs){
		   return this.name.equals(dogs.name);
	}

	@Override
	public String toString() {
		return  "Name " + name + " Age "+  age + " Breed " + breed;
	}
	


}
