package com.edu.homework7.task2;

import java.util.HashMap;
import java.util.Map;

public class Person {

	public static void main(String[] args) {
		HashMap <String, String> personMap = new HashMap <String, String>();
		personMap.put("Bernoulli", "Daniel");
		personMap.put("Lionehearth", "Richard");
		personMap.put("Obama", "Barack");
		personMap.put("Luther", "Martin");
		personMap.put("Galvani", "Luigi");
		personMap.put("Maxwell", "James");
		personMap.put("Dawkins", "Richard");
		personMap.put("Castaneda", "Carlos");
		personMap.put("Heidegger ", "Martin");
		personMap.put("Mandela", "Nelson");
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getValue() + " " + entry.getKey());
		}
		
		int i = 0;
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
				if (entry.getValue() == entry1.getValue() && i == 0) {
					System.out.println("\nThere are at least two persons "
							+ "with the same first name\n");
					i++;
				}
			}
		}
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (entry.getValue() == "Carlos") {
				personMap.remove(entry.getKey());
				break;
			}
		}
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getValue() + " " + entry.getKey());
		}
		
	}

}
