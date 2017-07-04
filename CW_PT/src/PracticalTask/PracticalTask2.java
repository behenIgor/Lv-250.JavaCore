package PracticalTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PracticalTask2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Map<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(0, "SomeName");
		hashMap.put(1, "SomeName1");
		hashMap.put(2, "SomeName2");
		hashMap.put(3, "SomeName3");
		hashMap.put(4, "SomeName4");
		hashMap.put(5, "SomeName5");
		hashMap.put(6, "SomeName6");
		hashMap.put(7, "SomeName7");

		for (Entry entry : hashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

		System.out.println("Enter ID");
		int key = input.nextInt();

		if (hashMap.containsKey(key)) {
			System.out.println("Name " + hashMap.get(key));
		} else {
			System.out.println("You Entered wrong ID");
		}

		System.out.println("Enter Name");
		String name = input.nextLine();

		for (Entry<Integer, String> entry : hashMap.entrySet()) {
			if (entry.getValue().equals(name)) {
				System.out.println("Name " + name + " ID " + entry.getKey());
			} 
		}

		input.close();

	}

}
