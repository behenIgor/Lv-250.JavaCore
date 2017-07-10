
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog("Rex", Breed.Bull_Terrier, 5);
		Dog dog2 = new Dog("Marly", Breed.Pekingese, 6);
		Dog dog3 = new Dog("Lesy", Breed.Pincher, 7);

		if ((dog1.getName() != dog2.getName()) && (dog1.getName() != dog3.getName())
				&& (dog2.getName() != dog3.getName())) {
			System.out.println("There is no two or more dogs with the same name");
		}

		else {
			System.out.println("There is two or more dogs with the same name");
		}
		
		
		
		
		

		if ((dog1.getAge() > dog2.getAge()) && (dog1.getAge() > dog3.getAge())) {

			System.out.println("Name " + dog1.getName() + " Breed " + dog1.getBreed());

		}

		else if ((dog2.getAge() > dog1.getAge()) && (dog2.getAge() > dog3.getAge())) {
			System.out.println(" Name " + dog2.getName() + " Breed " + dog2.getBreed());
		}

		else if ((dog3.getAge() > dog1.getAge()) && (dog3.getAge() > dog2.getAge())) {
			System.out.println(" Name " + dog3.getName() + " Breed " + dog3.getBreed());
		}

	}

}
