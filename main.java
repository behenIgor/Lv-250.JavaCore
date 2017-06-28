
public class main {
	String breed;
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public static void main(final String[] args) {
		Dog dog1 = new Dog();
		dog1.setName("Spike");
		dog1.setAge(2);
		
		
		Dog dog2 = new Dog();
		dog2.setName("Pumpkin");
		dog2.setAge(3);
		
		Dog dog3 = new Dog();
		dog3.setName("Sweety");
		dog3.setAge(9);
		
		System.out.println(dog1.equals(dog2));

		if ((dog1.getAge() > dog2.getAge()) && (dog1.getAge() > dog3.getAge()))
			System.out.println("The oldest dog  is " + dog1.getName() + ", its breed is Boston_Terrier");
		else 	if ((dog2.getAge() > dog1.getAge()) && (dog2.getAge() > dog3.getAge()))
			System.out.println("The oldest dog  is " + dog2.getName()  + ", its breed is French_Bulldog");
		else 	if ((dog3.getAge() > dog1.getAge()) && (dog3.getAge() > dog2.getAge()))
			System.out.println("The oldest dog  is " + dog3.getName()  + ", its breed is Pug");
		
	
}
}
