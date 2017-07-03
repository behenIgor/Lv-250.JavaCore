package homework.task2;

public class Main {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Brovko", Breed.Streetdog,6);
		Dog dog2 = new Dog("Bim", Breed.Sheepdog,3);
		Dog dog3 = new Dog("Sharik", Breed.Poodle,1);
		
		if(dog1.sameName(dog2)){
			System.out.println("Same names of dog1 and dog2");
		}
		else {
			if(dog1.sameName(dog3)){
				System.out.println("Same names of dog1 and dog3");
			}
			else {
				if(dog2.sameName(dog3)) {
					System.out.println("Same names of dog2 and dog3");
				}
				else {
					System.out.println("All dogs have a differents names");
				}
			}
		}
		
		
		if(dog1.older(dog2) && dog1.older(dog3)) {
			System.out.println("The oldest dog " + dog1.nameAndBreed());
		}
		else {
			if(dog2.older(dog1) && dog2.older(dog3)) {
				System.out.println("The oldest dog " + dog2.nameAndBreed());
			}
			else {
				System.out.println("The oldest dog " + dog3.nameAndBreed());
			}
		}
		
	}

}
