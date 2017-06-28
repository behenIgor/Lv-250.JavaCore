import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dog {
	String name;
		int age;

	public enum breed {
		Boston_Terrier, French_Bulldog, Pug
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Hi, enter the name of dog, please!");
		String dogName = br.readLine();
		breed dogbreed = b(dogName);
		System.out.println(dogbreed);
			}

	public static breed b(String dogName) {
		breed dogbreed;
		dogbreed = breed.Boston_Terrier;
		dogbreed = breed.French_Bulldog;
		dogbreed = breed.Pug;

		switch (dogName) {
		case "Spike":
			dogbreed = breed.Boston_Terrier;
			break;
		case "Pumpkin":
			dogbreed = breed.French_Bulldog;
			break;
		case "Sweety":
			dogbreed = breed.Pug;
			break;

		default:
			System.out.println("There is no dog with this name");
			System.exit(0);

		}
		return dogbreed;

	}
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
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Dog other = (Dog) obj;
				if (name == null) {
			if (other.name != null) return false;
		} else if (!name.equals(other.name)) return false;
		return true;

}
}