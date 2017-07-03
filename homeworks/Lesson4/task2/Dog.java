package homework.task2;

public class Dog {
	private String name;
	private Breed breed;
	private int age;
	
	public Dog() {}
	public Dog(String name) {
		this.name = name;
	}
	public Dog(String name, Breed breed) {
		this.name = name;
		this.breed = breed;
	}
	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Breed getBreed() {
		return breed;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
	
	public boolean sameName(Object obj) {
		Dog other = (Dog)obj; 
		return this.name.equals(other.name);
	}
	public String nameAndBreed() {
		return "name is " + this.name + ", and his breed is the " + this.breed;
	}
	public boolean older(Object obj){
		Dog other = (Dog)obj;
		return this.age > other.age;
	}
}
