package com.edu.homework7.task1;

import java.util.LinkedHashSet;

public class UnionAndIntersection {

	public static void main(String[] args) {
		
		LinkedHashSet <String> things1 = new LinkedHashSet <String> ();
		things1.add("sun");
		things1.add("beach");
		things1.add("sky");
		things1.add("sand");
		things1.add("palms");
		System.out.println("Set 1:\n" + things1);
		
		LinkedHashSet <String> things2 = new LinkedHashSet <String> ();
		things2.add("palms");
		things2.add("wind");
		things2.add("sun");
		things2.add("clouds");
		things2.add("beach");
		System.out.println("\nSet 2:\n" + things2);
		
		
		System.out.println("\nUnion:\n" + union(things1, things2));
		System.out.println("\nIntersection:\n" + intersect(things1, things2));
		
	}
	
	private static LinkedHashSet <String> union(LinkedHashSet <String> stringSetOne, 
			LinkedHashSet <String> stringSetTwo) {
		LinkedHashSet <String> union = new LinkedHashSet <String> ();
		for (String str : stringSetOne) {
			union.add(str);
        }
		for (String element : stringSetTwo) {
			union.add(element);
        }
		return union;
	}
	
	private static LinkedHashSet <String> intersect(
								LinkedHashSet <String> stringSetOne, 
								LinkedHashSet <String> stringSetTwo) {
		LinkedHashSet <String> intersection = new LinkedHashSet <String> ();
		for (String str1 : stringSetOne) {
            for (String str2 : stringSetTwo) {
                if (str1.equals(str2)) {
                	intersection.add(str2);
                }
            }
        }
		return intersection;
	}

}
