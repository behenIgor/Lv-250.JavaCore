package homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<Person> people = new ArrayList<Person>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int index = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Write your year of birth and name:");
			people.add(new Person(Integer.parseInt(br.readLine()), br.readLine()));
		}

		for (Person peoples : people) {
			System.out.println("index -> " + index + peoples);
			index++;
		}

		System.out.println("Write index and new name: ");
		people.get(Integer.parseInt(br.readLine())).setName(br.readLine());
		System.out.println(people.toString());
	}

}
